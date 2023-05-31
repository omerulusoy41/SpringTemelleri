package org.example.chp6;

public class Main {
    public static void main(String[] args) {
        ObjectProviderFramework framework = new ObjectProviderFramework();

        Provider provider = (Provider)framework.getObject("org.example.chp6.HelloWorldGreetingProvider");
        Renderer render = (Renderer) framework.getObject("org.example.chp6.ErrorOutputRenderer");

        render.Render(provider);
    }
}
