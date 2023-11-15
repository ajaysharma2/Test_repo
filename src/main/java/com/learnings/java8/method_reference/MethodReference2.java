package com.learnings.java8.method_reference;

public class MethodReference2 {
    public static void threadStatus(){
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        Thread t2=new Thread(MethodReference2::threadStatus);
        t2.start();
    }
}
