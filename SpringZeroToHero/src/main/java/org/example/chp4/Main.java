package org.example.chp4;

public class Main {
    public static void main(String[] args) {
        Renderer render = new ErrorOutputRenderer();
        Provider provider = new HelloWorldGreetingProvider();

        render.Render(provider);
    }
}
