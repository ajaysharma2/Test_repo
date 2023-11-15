package com.learnings.java8.lambda;

interface Drawable{
    public void draw();
    default void x(){
        System.out.println("default method");
    }
    default void x(String x){
        System.out.println("default method");
    }
    default void x(String v, Integer i){
        System.out.println("default method");
    }
}
