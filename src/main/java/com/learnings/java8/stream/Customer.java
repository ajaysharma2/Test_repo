package com.learnings.java8.stream;

import java.util.LinkedList;
import java.util.List;

public class Customer {

    private String name;
    private List<Integer> contactlist;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getContactlist() {
        return contactlist;
    }

    public void setContactlist(List<Integer> contactlist) {
        this.contactlist = contactlist;
    }

    public Customer (String name, List<Integer> numbers) {
        this.name = name;
        this.contactlist = numbers;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", contactlist=" + contactlist +
                '}';
    }
}
