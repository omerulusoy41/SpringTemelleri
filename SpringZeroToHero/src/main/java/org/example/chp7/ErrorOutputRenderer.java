package org.example.chp7;

public class ErrorOutputRenderer{
    HelloWorldGreetingProvider p;

    public void Render() {
        System.err.println(p.getGreeting());
    }

    public void setProvider(HelloWorldGreetingProvider provider) {
        p = provider;
    }
}
