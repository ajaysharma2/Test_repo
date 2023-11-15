package com.learnings.hazelcast;

import com.hazelcast.config.Config;
import com.hazelcast.config.JoinConfig;
import com.hazelcast.config.NetworkConfig;
import com.hazelcast.config.TcpIpConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.impl.querycache.subscriber.QueryCacheFactory;
import com.hazelcast.util.UuidUtil;

public class HazelcastStuff {
    private static final String name = randomString();

    private static final String pw = randomString();

    private static String randomString() {
        return UuidUtil.newUnsecureUuidString();
    }

    public static void main(String[] args) {
        //HazelcastInstance instance = Hazelcast.newHazelcastInstance();

        ConfigCreator configCreator = ConfigCreator.MULTICAST_CONFIG_CREATOR;

        final HazelcastInstance master = Hazelcast.newHazelcastInstance(configCreator.create("node-1", pw, false));
        final HazelcastInstance other = Hazelcast.newHazelcastInstance(configCreator.create("node-1", pw, false));
        //final HazelcastInstance other2 = Hazelcast.newHazelcastInstance(configCreator.create("node-1", pw, true));
    }


    private enum ConfigCreator {

        TCP_CONFIG_CREATOR {
            @Override
            public Config create(String name, String pw, boolean liteMember) {
                Config config = new Config();
                config.getGroupConfig().setName(name);
                config.getGroupConfig().setPassword(pw);

                config.setLiteMember(liteMember);

                NetworkConfig networkConfig = config.getNetworkConfig();
                JoinConfig join = networkConfig.getJoin();
                join.getMulticastConfig().setEnabled(false);
                TcpIpConfig tcpIpConfig = join.getTcpIpConfig();
                tcpIpConfig.setEnabled(true);
                tcpIpConfig.addMember("127.0.0.1");

                return config;
            }
        },

        MULTICAST_CONFIG_CREATOR {
            @Override
            public Config create(String name, String pw, boolean liteMember) {
                Config config = new Config();
                config.getGroupConfig().setName(name);
                config.getGroupConfig().setPassword(pw);

                config.setLiteMember(liteMember);

                NetworkConfig networkConfig = config.getNetworkConfig();
                JoinConfig join = networkConfig.getJoin();
                join.getTcpIpConfig().setEnabled(false);
                join.getMulticastConfig().setEnabled(true);

                return config;
            }
        };

        public abstract Config create(String name, String pw, boolean liteMember);
    }
}
