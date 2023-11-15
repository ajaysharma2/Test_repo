package com.learnings.java8.functionalprogramming;

/**
 * Invalid Functional Interface
 * A functional interface can extends another interface only when it does not have any abstract method.
 */
interface sayable3{
    void say(String msg);   // abstract method
}
//@FunctionalInterface
interface Doable extends sayable3{
    // Invalid '@FunctionalInterface' annotation; Doable is not a functional interface
    void doIt();
}
