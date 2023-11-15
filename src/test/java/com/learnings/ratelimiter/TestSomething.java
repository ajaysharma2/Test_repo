package com.learnings.ratelimiter;

public class TestSomething {

    public static void main(String[] args) {
        System.setProperty("ratelimiter.permits.persecond", "-2");
        System.out.println(Long.getLong("ratelimiter.permits.persecond"));

        long testvar = (long)Math.max(1.5, 14);
        System.out.println(testvar);
    }
}
