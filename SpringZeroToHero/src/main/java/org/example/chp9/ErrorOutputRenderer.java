package org.example.chp9;

import org.springframework.beans.factory.annotation.Autowired;

public class ErrorOutputRenderer{

    @Autowired
    public HelloWorldGreetingProvider p;

    public void Render() {
        System.err.println(p.getMesage());
    }

    public void setProvider(HelloWorldGreetingProvider provider) {
        p = provider;
    }
}
