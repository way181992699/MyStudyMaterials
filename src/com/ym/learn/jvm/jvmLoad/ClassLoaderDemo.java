package com.ym.learn.jvm.jvmLoad;


/**
 * 第一步：验证静态变量和静态块的加载+链接（校验，准备，解析）+初始化过程中值的变化。
 * log输出如下：
 * 1 【Test类构造方法】a=0
 * 2 【Test类构造方法】b=0
 * 3 【Test类实例】com.chong.studyparalell.clazz.loader.Test@16c1857
 * 4 【Test类静态块】a=2
 * 5 【Test类构造方法】a=2
 * 6 【Test类构造方法】b=2
 * 7 【Test类实例】com.chong.studyparalell.clazz.loader.Test@1b1fd9c
 * 8 Test2实例化结束com.chong.studyparalell.clazz.loader.Test@1b1fd9c
 * <p>
 * 首先Test类在链接阶段（准备阶段），a，b分别被设置默认值0。
 * 当new Test()执行后，
 * 1）首先初始化Test类的三个静态变量 test1,a,b。
 * 初始化test1时，第一次调用构造方法，此时a,b为0。对应日志1,2行。
 * 实例化test1，日志第3行。
 * test1初始化完成后，继续初始化a,b，设为2。
 * 接着初始化静态块 ，对应日志第4行。
 * 2）执行Test类的构造方法
 * 因为a,b已经被初始化为2，所以执行类的构造方法时，会输出a，b 为2。日志第5,6行。
 * 实例化后输出地址信息，日志第7行。
 * 3）最终main方法里打出实例工作完成，日志第8行。
 */
public class ClassLoaderDemo {
    public static void main(String[] args) {
        Test test2 = new Test();
        System.out.println("Test2实例化结束" + test2.toString());
    }
}
