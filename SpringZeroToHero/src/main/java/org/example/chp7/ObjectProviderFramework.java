package org.example.chp7;


public class ObjectProviderFramework {

    public Object getObject(String renderstr,String providerstr){
        ErrorOutputRenderer renderer;
        HelloWorldGreetingProvider provider;
        try {
            Class<?> cls = Class.forName(renderstr);
            renderer = (ErrorOutputRenderer)cls.newInstance();
            cls = Class.forName(providerstr);
            provider = (HelloWorldGreetingProvider) cls.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        renderer.setProvider(provider);
        return renderer;
    }

}
