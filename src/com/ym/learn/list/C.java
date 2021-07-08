package com.ym.learn.list;

/**
 * @author wkx
 * @description
 * @date 2019/7/26
 */
public class C implements B {
    int b = 20;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void say() {
        System.out.println("Hi");
    }

    @Override
    public pojo1 getPojo() {
        return new pojo1();
    }

    @Override
    public void eat() {
        System.out.println("吃");
    }

    @Override
    public D getD() {
        return new po();
    }

    public class po implements D {
        String poName = "儿子";
        int a = 10;

        public String getPoName() {
            return poName;
        }

        public void setPoName(String poName) {
            this.poName = poName;
        }

        public po() {
        }

        @Override
        public int get() {
            return a + b;
        }
    }

}
