package com.ym.learn.DesignPattern.FactoryPattern;

public class HandsomeBoy implements Boy {

    private String name = "赵子虫";

    private String appearance = "英俊的";//外表

    @Override
    public void say() {
        System.out.println("每个英俊的男孩子心里面都藏着一个女孩");
    }

    public HandsomeBoy() {
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
        return "HandsomeBoy{" +
                "name='" + name + '\'' +
                ", appearance='" + appearance + '\'' +
                '}';
    }
}
