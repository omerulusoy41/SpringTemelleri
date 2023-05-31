package org.example.chp7;


public class Main {
    public static void main(String[] args) {
        ObjectProviderFramework framework = new ObjectProviderFramework();

        ErrorOutputRenderer render = (ErrorOutputRenderer) framework.getObject("org.example.chp7.ErrorOutputRenderer"
                                    ,"org.example.chp7.HelloWorldGreetingProvider");
        render.Render();
    }
}
