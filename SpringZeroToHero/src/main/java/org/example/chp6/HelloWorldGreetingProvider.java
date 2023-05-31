package org.example.chp6;


public class HelloWorldGreetingProvider implements Provider {

    @Override
    public String getGreeting() {
        return "Hello world";
    }
}
