package com.ym.learn.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author wkx
 * @description List集合的测试类
 * @date 2019/7/26
 */
public class ListTest {


    @Test
    public void fun(){
        List list = new ArrayList();
        ((ArrayList) list).trimToSize();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        B b = new C();
        ((C) b).setB(100);
        b.eat();
        b.say();
        D d = b.getD();

        System.out.println(d.get() + 1);


    }


}
