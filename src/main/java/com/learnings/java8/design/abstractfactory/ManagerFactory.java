package com.learnings.java8.design.abstractfactory;

public class ManagerFactory extends AbstractEmployeeFactory {

    @Override
    public Employee getEmployee() {
        return new Manager();
    }
}
