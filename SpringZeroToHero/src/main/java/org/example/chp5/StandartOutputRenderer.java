package org.example.chp5;


public class StandartOutputRenderer implements Renderer {
    @Override
    public void Render(Provider p) {
        System.out.println(p.getGreeting());
    }
}








