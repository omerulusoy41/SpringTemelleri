package org.example.chp3;

public class StandartOutputRenderer {
    private HelloWorldGreetingProvider provider;

    public void render(HelloWorldGreetingProvider provider)
    {
        System.out.println(provider.getHello());
    }
}
