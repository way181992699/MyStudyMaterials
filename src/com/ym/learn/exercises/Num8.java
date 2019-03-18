package com.ym.learn.exercises;

/**
 * 7:(数据结构栈的理解)
 * 请实现一个栈的链式存储
 */
public class Num8 {

    public static void main(String[] args) {

        LinkStack<String> linkStack = new LinkStack();
        linkStack.push("No.1");
        linkStack.push("No.2");
        linkStack.push("No.3");
//        LinkStack<String>.Node top = linkStack.getTop();
//        System.out.println(top.getData());
//        System.out.println(top.getNext().getData());
    }
}
