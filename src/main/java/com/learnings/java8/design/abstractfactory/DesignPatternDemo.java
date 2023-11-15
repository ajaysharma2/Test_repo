package com.learnings.java8.design.abstractfactory;

public class DesignPatternDemo {

    public static void main(String[] args) {
        System.out.println("this is abstract design pattern example.....");

        Employee employee = EmployeeFactory.getEmployee(new ManagerFactory());
        System.out.println(employee.getName());

        Employee employee2 = EmployeeFactory.getEmployee(new SoftwareDeveloperFactory());
        System.out.println(employee2.getName());
    }
}
