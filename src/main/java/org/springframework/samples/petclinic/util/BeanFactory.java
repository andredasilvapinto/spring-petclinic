package org.springframework.samples.petclinic.util;

public class BeanFactory {
    private static String string = "SOMETHING";

    public BeanFactory(String propertyValue) {
        System.out.println(">>>>>>>>>>>>>  " + propertyValue);
    }

    public String createString(){
        return string;
    }
}
