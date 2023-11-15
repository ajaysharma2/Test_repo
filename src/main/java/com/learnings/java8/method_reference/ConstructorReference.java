package com.learnings.java8.method_reference;

/**
 * You can refer a constructor by using the new keyword. Here, we are referring constructor with the help of functional interface.
 */
interface Messageable{
    Message getMessage(String msg);
}
class Message{
    Message(String msg){
        System.out.print(msg);
    }
}
public class ConstructorReference {
    public static void main(String[] args) {
        Messageable hello = Message::new;
        hello.getMessage("Hello");
        new Thread();
    }
}
