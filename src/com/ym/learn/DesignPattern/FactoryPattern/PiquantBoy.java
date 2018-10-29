package com.ym.learn.DesignPattern.FactoryPattern;

public class PiquantBoy implements Boy {

    private String name = "陈好难";

    private String appearance = "调皮的";//外表

    @Override
    public void say() {
        System.out.println("每个调皮的男孩子心里面都藏着一个女孩");
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
        return "PiquantBoy{" +
                "name='" + name + '\'' +
                ", appearance='" + appearance + '\'' +
                '}';
    }
}
