package com.learnings.java8.design.abstractfactory;

public class EmployeeFactory {

    public static Employee getEmployee(AbstractEmployeeFactory abstractEmployFactory) {
        return abstractEmployFactory.getEmployee();
    }
}
