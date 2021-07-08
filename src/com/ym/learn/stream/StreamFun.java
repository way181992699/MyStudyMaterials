package com.ym.learn.stream;

import com.ym.learn.stream.pojo.Dog;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * java8  新特性 stream的运用
 */
public class StreamFun {

    @Test
    public void fun() throws FileNotFoundException {
        //测试数据
        List<Dog> dogList = Arrays.asList(new Dog("red", 42, 10.5), new Dog("red", 46, 17.7), new Dog("red", 36, 9.3), new Dog("black", 63), new Dog("blue", 41));

        /**
         * 一、Stream的创建方式：
         */
        //1.1 Collection下的stream()和parallelStream()方法
        List<Object> list = new ArrayList<>();

        //stream()为串行流
        Stream<Object> stream = list.stream();

        //parallelStream()为并行流
        Stream<Object> objectStream = list.parallelStream();

        //1.2 使用Arrays中的stream（）方法，讲数组转化成流
        Integer[] nums = new Integer[10];
        Stream<Integer> stream1 = Arrays.stream(nums);

        //1.3 Stream 静态方法： of() ; iterate() ;  generate()
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> limit = Stream.iterate(0, x -> x + 2).limit(6);
//        limit.forEach(System.out::println);//0 2 4 6 8 10
        Stream<Double> limit1 = Stream.generate(Math::random).limit(4);

        //1.4 使用BufferedReader.lines()方法，将每行内容转成流
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/test.txt"));
        Stream<String> lines = bufferedReader.lines();

        //1.5 使用Pattern.splitAsStream()方法，将字符串分割成流.
        Pattern compile = Pattern.compile("1");
        Stream<String> stringStream = compile.splitAsStream("2145312125481");

        /**
         * 二、流的中间操作
         */
        //2.1 筛选与切片
        //  filter:过滤流中的某些元素
        //  limit(n): 获取n个元素
        //  skip(n): 跳过n元素，配合limit(n)可实现分页
        //  distinct：通过流中元素的hashCode()和equals()去除重复元素
        Stream<Integer> integerStream1 = Stream.of(6, 75, 96, 45, 6, 1, 2, 6, 7);
        Stream<Integer> limit2 = integerStream1.filter(x -> x > 2) // 6 75 96 45 6 6 7
                .distinct() // 6 75 96 45 7
                .skip(2)// 96 45 7
                .limit(2);// 96 45
//        limit2.forEach(System.out::println);

        //2.2 映射
        //  map： 接受一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素。
        //  flatMap: 接受一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流。
        List<String> strings = Arrays.asList("a,b,c", "1,2,3");
        //将每个元素转成一个新的且不带逗号的元素
        Stream<String> stringStream1 = strings.stream().map(x -> x.replaceAll(",", ""));
//        stringStream1.forEach(System.out::println); // abc 123

        Stream<String> stringStream2 = strings.stream().flatMap(s -> {
            String[] split = s.split(",");
            Stream<String> stream2 = Arrays.stream(split);
            return stream2;
        });
//        stringStream2.forEach(System.out::println);// a b c 1 2 3

        //2.3 排序
        //  sorted(): 自然排序，流中元素需实现Comparable接口
        //  sorted(Comparator com): 定制排序，自定义Comparator排序器

        Stream<Integer> integerStream2 = Stream.of(10, 2, 3, 68);
        Stream<Integer> integerStream3 = Stream.of(10, 2, 3, 68);
        //默认为升序排列
        Stream<Integer> sorted = integerStream2.sorted();
//        sorted.forEach(System.out::println);// 2 3 10 68
        //配置为降序排列
        Stream<Integer> sorted2 = integerStream3.sorted((o1, o2) -> {
            return o2 - o1;
        });
//        sorted2.forEach(System.out::println); // 68 10 3 2


        Dog s1 = new Dog("aa", 10);
        Dog s2 = new Dog("bb", 20);
        Dog s3 = new Dog("aa", 30);
        Dog s4 = new Dog("dd", 40);
        List<Dog> studentList = Arrays.asList(s1, s2, s3, s4);

        //自定义排序：先按姓名升序，姓名相同则按年龄降序
        Stream<Dog> sorted3 = studentList.stream().sorted(
                (o1, o2) -> {
                    if (o1.getColor().equals(o2.getColor())) {
                        return o2.getWeight() - o1.getWeight();
                    } else {
                        return o1.getColor().compareTo(o2.getColor());
                    }
                }
        );
//        sorted3.forEach(System.out::println);

        //2.4 消费
        //  peek: 如果mao，能得到流中的每一个元素。但map接收的是一个Function表达式，有返回值；而peek接收的是Consumer表达式，没有返回值。
        Dog s11 = new Dog("aa", 10);
        Dog s22 = new Dog("bb", 20);
        List<Dog> dogList1 = Arrays.asList(s11, s22);
        Stream<Dog> peek = dogList1.stream().peek(x -> x.setWeight(x.getWeight() * 2));
//        peek.forEach(System.out::println);

        /**
         * 三、流的终止操作
         */
        // 3.1 匹配、聚合操作
        //  allMatch: 接收一个Predicate函数，当流中的每个元素都符合该断言时才返回true，否则返回false
        //  noneMatch: 接收一个Predicate函数，当流中每个元素都不符合该断言时才返回true，否则返回false
        //  anyMatch: 接收一个Predicate函数，当流中有一个元素符合该断言时则返回true，否则返回false
        //  findFirst: 返回流中第一个元素。
        //  findAny: 返回流中的任意元素。
        //  count: 返回流中元素的总个数。
        //  max: 返回流中元素的最大值。
        //  min: 返回流中元素的最小值。

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

//        System.out.println(integers.stream().allMatch(x -> x > 10));//false
//        System.out.println(integers.stream().noneMatch(x -> x > 10));//true
//        System.out.println(integers.stream().anyMatch(x -> x > 4));//true
//
//        System.out.println(integers.stream().findFirst().get());//1
//        System.out.println(integers.stream().findAny().get());//1 or n
//
//        System.out.println(integers.stream().count());//5
//        System.out.println(integers.stream().max(Integer::compareTo).get());//5
//        System.out.println(integers.stream().min(Integer::compareTo).get());//1

        //3.2 规约操作（比较复杂，此处暂且不提）

        //3.3 收集操作
        //3.31 Collector工具库: Collectors

        Dog luck = new Dog("Luck", 20, 100.5d);
        Dog jack = new Dog("Jack", 26, 150.7d);
        Dog li = new Dog("Li", 26, 96.3d);
        List<Dog> dogList2 = Arrays.asList(luck, jack, li);
        //把某个属性封装成List
        System.out.println(dogList2.stream().map(Dog::getWeight).collect(Collectors.toList())); // [20,26,26]
        //转成Set
        System.out.println(dogList2.stream().map(Dog::getWeight).collect(Collectors.toSet())); // [20,26]
        //转成map，注：key不能相同，否则报错
        //(1)value为对象的封装方法
        Map<String, Dog> collect = dogList2.stream().collect(Collectors.toMap(Dog::getColor, x -> x));
        System.out.println(collect);// {Luck=Dog{color='Luck', weight=20, price=100.5}, Jack=Dog{color='Jack', weight=26, price=150.7}, Li=Dog{color='Li', weight=26, price=96.3}}
        //(1)value为单一元素的封装方法
        Map<String, Integer> collect1 = dogList2.stream().collect(Collectors.toMap(Dog::getColor, Dog::getWeight));
        System.out.println(collect1); // {Luck=20, Jack=26, Li=26}
        //字符串分隔符连接
        System.out.println(dogList2.stream().map(Dog::getColor).collect(Collectors.joining(",", "to ", " end")));

        //聚合函数(类似SQL聚合函数)
        //分组
        Map<String, List<Dog>> collect2 = dogList2.stream().collect(Collectors.groupingBy(Dog::getColor));
        System.out.println(collect2);//{Luck=[Dog{color='Luck', weight=20, price=100.5}], Jack=[Dog{color='Jack', weight=26, price=150.7}], Li=[Dog{color='Li', weight=26, price=96.3}]}
        //多重分组 先分第一次参，再分第二个参
        Map<String, Map<Integer, List<Dog>>> collect3 = dogList2.stream().collect(Collectors.groupingBy(Dog::getColor, Collectors.groupingBy(Dog::getWeight)));
        System.out.println(collect3);//{Luck={20=[Dog{color='Luck', weight=20, price=100.5}]}, Jack={26=[Dog{color='Jack', weight=26, price=150.7}]}, Li={26=[Dog{color='Li', weight=26, price=96.3}]}}
        //分区，根据条件分
        Map<Boolean, List<Dog>> collect4 = dogList2.stream().collect(Collectors.partitioningBy(x -> x.getWeight() > 20));
        System.out.println(collect4);//{false=[Dog{color='Luck', weight=20, price=100.5}], true=[Dog{color='Jack', weight=26, price=150.7}, Dog{color='Li', weight=26, price=96.3}]}
        //获取符合条件的List
        System.out.println(collect4.get(true));//[Dog{color='Jack', weight=26, price=150.7}, Dog{color='Li', weight=26, price=96.3}]
        //规约
        //￥%……&%……&%……&*……&*

    }


}

