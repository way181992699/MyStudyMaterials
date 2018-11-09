package com.ym.learn.DesignPattern.SingletonPattern;

/**
 * 懒汉式，线程不安全
 * 是否 Lazy 初始化：是
 * <p>
 * 是否多线程安全：否
 * <p>
 * 实现难度：易
 * <p>
 * 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 */
public class SingleLazy {

    private static SingleLazy instance;
    private SingleLazy(){
        System.out.println("SingleLazy: "+instance);
    }
    //个人理解:因为getInstance()方法没有添加synchronized同步锁,在出现多线程并发的时候,也许会获取到两个不同的实例(比如两个线程同时执行getInstance()方法,然后进入方法后,if(instance == null)判断都成立,结果就会new 出两个同步的实例返回)
    public static SingleLazy getInstance(){
        System.out.println("SingleLazy: "+instance);
        if (instance == null) {
            instance = new SingleLazy();
        }
        System.out.println("SingleLazy: "+instance);
        return instance;
    }

}
