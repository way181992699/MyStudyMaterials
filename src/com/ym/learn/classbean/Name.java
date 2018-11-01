package com.ym.learn.classbean;

public class Name {
    static int count = 0;
    static {
        count++;
        System.out.println("Name Class Loaded! count = [" + count + "]");//4
    }

    public Name() {
        System.out.println("Name Constructor called!");//6   9
    }
}
