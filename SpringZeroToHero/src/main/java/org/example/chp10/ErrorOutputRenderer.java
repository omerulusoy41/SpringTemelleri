package org.example.chp10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component()
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
