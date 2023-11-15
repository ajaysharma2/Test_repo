package com.learnings.java8.design.abstractfactory;

public class SoftwareDeveloperFactory extends AbstractEmployeeFactory{
    public Employee getEmployee() {
        return new SoftwareDeveloper();
    }
}
