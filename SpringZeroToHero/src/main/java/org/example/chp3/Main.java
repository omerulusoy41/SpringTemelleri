package org.example.chp3;

// dont depend on concretions, depend on abstractions
// Dependency Inversion Principle
public class Main {
    public static void main(String[] args) {
        StandartOutputRenderer renderer = new StandartOutputRenderer();
        HelloWorldGreetingProvider provider = new HelloWorldGreetingProvider();

        renderer.render(provider);

    }
}
