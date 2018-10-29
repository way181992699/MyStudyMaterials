package com.ym.learn.DesignPattern.FactoryPattern;

/**
 * 工厂
 */
public class FactoryClass {

    public Boy getBoy(String type) throws Exception {
        if (type == null || "".equals(type)) {
            throw new NullPointerException("请输入正确的男孩类型");
        }
        if (type.equals("Handsome")) {
            return new HandsomeBoy();
        } else if (type.equals("Piquant")) {
            return new PiquantBoy();
        } else if (type.equals("Sun")) {
            return new SunBoy();
        } else {
            throw new Exception("这类型的男孩还没出厂,请静候佳音");
        }
    }

}
