package org.example.chp2;

// Single responsibility principle
public class Main {
    public static void main(String[] args) {
        if (args.length > 0)
            System.out.println(args[0]);
        else
            System.out.println( "Hello World!" );
    }
}
