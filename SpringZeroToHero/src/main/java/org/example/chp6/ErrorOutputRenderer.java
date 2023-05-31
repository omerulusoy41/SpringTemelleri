package org.example.chp6;

public class ErrorOutputRenderer implements Renderer {
    @Override
    public void Render(Provider p) {
        System.err.println(p.getGreeting());
    }
}
