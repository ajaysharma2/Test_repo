package com.learnings.java8.lambda;

import javax.swing.*;

public class LambdaEventListenerExample {
    public static void main(String[] args) {
        JTextField tf=new JTextField();
        JLabel jLabel = new JLabel();
        tf.setBounds(50, 50,150,20);
        JButton b=new JButton("click");
        b.setBounds(80,100,70,30);
        jLabel.setBounds(50, 150, 150, 20);

        // lambda expression implementing here.
        b.addActionListener(e-> {jLabel.setText(tf.getText());});
        tf.addActionListener(e-> {jLabel.setText(tf.getText());});
/*
        JFrame f=new JFrame();
        f.add(tf);f.add(b);
        f.add(jLabel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(300, 200);
        f.setVisible(true);
*/
    }

}
