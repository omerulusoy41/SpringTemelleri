package org.example.chp5;

public class ErrorOutputRenderer implements Renderer {
    @Override
    public void Render(Provider p) {
        System.err.println(p.getGreeting());
    }
}
