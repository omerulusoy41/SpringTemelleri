package org.example.chp9;


import org.springframework.beans.factory.annotation.Value;

public class HelloWorldGreetingProvider{

    @Value("Hello World")
    public String mesage;

    public void setMesage(String mesage) {
        this.mesage = mesage;
    }

    public String getMesage() {
        return mesage;
    }

}
