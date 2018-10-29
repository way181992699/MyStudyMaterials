package com.ym.learn.DesignPattern.FactoryPattern;

public class SunBoy implements Boy {

    private String name = "醋留香";

    private String appearance = "阳光的";//外表

    @Override
    public void say() {
        System.out.println("每个阳光的男孩子心里面都藏着一个女孩");
    }

    public SunBoy() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    @Override
    public String toString() {
        return "SunBoy{" +
                "name='" + name + '\'' +
                ", appearance='" + appearance + '\'' +
                '}';
    }
}
