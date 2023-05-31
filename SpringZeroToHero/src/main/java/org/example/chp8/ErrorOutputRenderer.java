package org.example.chp8;

public class ErrorOutputRenderer{
    HelloWorldGreetingProvider p;

    public void Render() {
        System.err.println(p.getMesage());
    }

    public void setProvider(HelloWorldGreetingProvider provider) {
        p = provider;
    }
}
