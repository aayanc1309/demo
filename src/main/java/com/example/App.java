package com.example;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello from Jenkins Maven Build!");

        int a = 5;
        int b = 10;

        int sum = add(a, b);

        System.out.println("Sum: " + sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
