package com.ym.learn.DesignPattern.TemplatePattern;

public abstract class EveryDay {

    abstract void getUp();

    abstract void eat();

    abstract void sleep();

    public final void toDo() {
        //起床
        getUp();
        //吃东西
        eat();
        //睡觉
        sleep();
    }

}
