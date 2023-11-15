package com.learnings.java8.functionalprogramming;

/**
 * Example 3
 * In the following example, a functional interface is extending to a non-functional interface.
 */
interface Doable1{
    default void doIt(){
        System.out.println("Do it now");
    }
}
@FunctionalInterface
interface Sayable1 extends Doable1{
    void say(String msg);   // abstract method
}
public class FunctionalInterfaceExample3 implements Sayable1{
    public void say(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        FunctionalInterfaceExample3 fie = new FunctionalInterfaceExample3();
        fie.say("Hello there");
        fie.doIt();
    }
}
