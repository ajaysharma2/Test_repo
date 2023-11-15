package com.learnings.java8.design.abstractfactory;

public class Manager implements Employee{

    private String name = "MANAGER";

    @Override
    public String getName(){
        System.out.println("I am a ... "+ name);
        return "MANAGER";
    }

    @Override
    public int getSalary() {
        return 100000;
    }
}
