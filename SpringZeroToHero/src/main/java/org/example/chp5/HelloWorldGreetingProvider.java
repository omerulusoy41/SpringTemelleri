package org.example.chp5;


public class HelloWorldGreetingProvider implements Provider {

    @Override
    public String getGreeting() {
        return "Hello world";
    }
}
