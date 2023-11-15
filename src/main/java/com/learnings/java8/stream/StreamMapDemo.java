package com.learnings.java8.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapDemo {
    public static void main(String[] args) {
        //List<String> myList = Stream.of("a", "b")
        //        .map(String::toUpperCase)
         //       .collect(System.out::println);
Customer customer1 = new Customer("testname1", List.of(12341243, 12341234, 21341234, 21341234));

        Customer c2 = new Customer("testname2", List.of(23423, 456456, 6769, 1234124));

        Customer c3 = new Customer("testname3", List.of(24314, 23423, 241243, 5646457));

        Customer c4 = new Customer("testname4", List.of(34534, 4543345, 4535, 21341234));

        Customer c5 = new Customer("testname5", List.of(45, 345, 45567));

        Customer c6 = new Customer("testname6", List.of(322325, 4543, 4567876, 8766));

        Stream.of(customer1,c2, c3, c4, c5, c6).forEach(c->System.out.println(c.toString()));

        Stream.of(customer1,c2, c3, c4, c5, c6).map(c->c.getContactlist()).forEach(System.out::println);
        Stream.of(customer1,c2, c3, c4, c5, c6).flatMap(c->c.getContactlist().stream()).filter(x->x%2==1).reduce((a,b)->a+b).ifPresent(System.out::println);


        Stream.of("a", "b")
                .map(String::toUpperCase).forEach(System.out::println);

        List<List<String>> list = Arrays.asList(
                Arrays.asList("a"),
                Arrays.asList("b"));
        System.out.println(list);

        System.out.println(list
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList()));


        List<Integer> list2 = List.of(1,2,3,46,4);
        System.out.println("--------------------");
        System.out.println("Count "+ list2.stream().count());
        list2.stream().filter(x->x%2==0).forEach(System.out::println);


    }
}
