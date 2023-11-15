package com.learnings.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        int width=10;

        //without lambda, Drawable implementation using anonymous class
        Drawable d=new Drawable(){
            public void draw(){System.out.println("Drawing "+width);}


            public void draw(String s) {
                // TODO document why this method is empty
            }


            public void soethingElse(String s) {
                // TODO document why this method is empty
            }
        };
        d.draw();

        d = ()->{System.out.println("nothing ... this is lambda expression");};
        d.draw();
        d.x();

//Java Lambda Expression Example: Foreach Loop
        List<String> list=new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach(
                (n)->System.out.println(n)
        );


        //Thread Example without lambda
        Runnable r1=new Runnable(){
            public void run(){
                System.out.println("Thread1 is running...");
            }
        };
        Thread t1=new Thread(r1);
        t1.start();
        //Thread Example with lambda
        Runnable r2=()->{
            System.out.println("Thread2 is running... using lambda");
        };
        Thread t2=new Thread(r2);
        t2.start();


    }
}
