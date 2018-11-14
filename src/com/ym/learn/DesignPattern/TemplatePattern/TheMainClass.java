package com.ym.learn.DesignPattern.TemplatePattern;

/**
 * 在模板模式（Template Pattern）中，
 * 一个抽象类公开定义了执行它的方法的方式/模板。
 * 它的子类可以按需要重写方法实现，
 * 这种类型的设计模式属于行为型模式。
 * <p>
 * (重点)但调用将以抽象类中定义的方式进行(重点)。
 * 关键代码：在抽象类实现，其他步骤在子类实现。
 */
public class TheMainClass {
    public static void main(String[] args) {
        EveryDay everyDay = new SevenEveryDay();
        everyDay.toDo();
        System.out.println();
        everyDay = new CindyEveryDay();
        everyDay.toDo();

    }

}
