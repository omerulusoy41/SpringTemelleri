package org.example.chp4;

public class HelloWorldGreetingProvider implements Provider{

    @Override
    public String getGreeting() {
        return "Hello world";
    }
}
