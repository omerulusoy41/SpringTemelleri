package org.example.chp10;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("provider")
public class HelloWorldGreetingProvider{

    @Value("Merhaba")
    public String mesage;

    public void setMesage(String mesage) {
        this.mesage = mesage;
    }

    public String getMesage() {
        return mesage;
    }

}
