package com.ym.learn.DesignPattern.FactoryPattern;

import org.junit.jupiter.api.Test;

public class FactoryMain {
    FactoryClass factoryClass = new FactoryClass();
    private Boy boy;

    @Test
    public void getBoy() {
        try {
            Boy boy = factoryClass.getBoy("");
            // factoryClass.getBoy(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getBoy2() {
        try {
            boy = factoryClass.getBoy("Piquant");
            System.out.println(boy);
            boy.say();
            boy = factoryClass.getBoy("Handsome");
            System.out.println(boy);
            boy.say();
            boy = factoryClass.getBoy("Sun");
            System.out.println(boy);
            boy.say();
            boy = factoryClass.getBoy("sdfgasdgasdg");
            System.out.println(boy);
            boy.say();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
