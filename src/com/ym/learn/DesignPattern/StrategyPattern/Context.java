package com.ym.learn.DesignPattern.StrategyPattern;

public class Context {
    private Work work;

    public Context(Work work) {
        this.work = work;
    }

    public void executeStrategy(Integer name, Integer work) {
        this.work.thinking(name, work);
    }
}
