package org.example.chp6;


public class ObjectProviderFramework {

    public Object getObject(String clazzname){
        Object o;
        try {
            Class<?> cls = Class.forName(clazzname);
            o = cls.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return o;
    }

}
