package com.ym.learn.list;

/**
 * @author wkx
 * @description 模型1
 * @date 2019/7/26
 */
public class pojo1 {

    String name ="老豆";

    public pojo1() {
    }

    public pojo1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "pojo1{" +
                "name='" + name + '\'' +
                '}';
    }
}
