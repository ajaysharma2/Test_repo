package com.learnings.java8.design.abstractfactory;

public class SoftwareDeveloper implements Employee{

    private String name = "Software Developer";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSalary() {
        return 200000;
    }
}
