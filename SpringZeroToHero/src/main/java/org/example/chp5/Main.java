package org.example.chp5;

public class Main {
    public static void main(String[] args) {
        Factory factory = GreetingFactory.getInstance();

        Provider provider = factory.getProvider();
        Renderer renderer = factory.getRender();

        renderer.Render(provider);
    }
}
