package com.learnings.java8.method_reference;
public class MethodReference {
    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }
    public static void saySomething2(String x){
        System.out.println("Hello, this is static method2......"+x);
    }
    public static void main(String[] args) {
        // Referring static method
        Sayable sayable = System.out::println;
        // Calling interface method
        sayable.say("string value.....");

        sayable = MethodReference::saySomething2;
        sayable.say("asdfghjkl;");
    }
}
