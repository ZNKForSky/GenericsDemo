package com.luffy.genericsdemo02;

import java.util.Collection;
import java.util.Collections;

/**
 * 作者：<a href="https://blog.csdn.net/qq_35101450">张宁科CSDN主页</a><p>
 * 创建时间：2020/6/24 04:42 <p>
 * 描述：抽奖器的测试类
 * 通过泛型类 Lottery<T>实现了3C产品抽奖器和现金抽奖器，提高了代码的复用性；在使用泛型过程中，也避免了类型转换异常的问题。
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 场景一：3C产品抽奖
         */
        String[] productOf3C = {"华为手机", "Mac Pro", "小米平衡车", "OPPO Watch", "漫步者蓝牙耳机"};
        Lottery<String> stringLottery = new Lottery<String>();
        for (int i = 0; i < productOf3C.length; i++) {
            stringLottery.addPrize(productOf3C[i]);
        }
        String prize = stringLottery.getPrize();
        System.out.println("您抽中的奖品是：" + prize);

        /**
         * 场景二：现金抽奖
         */
        int[] cash = {100, 500, 1000, 3000, 5000, 10000, 30000};
//        Lottery<int> cashLottery = new Lottery<>();//泛型不支持基本数据类型
        Lottery<Integer> cashLottery = new Lottery<>();
        for (int i = 0; i < cash.length; i++) {
            cashLottery.addPrize(cash[i]);
        }
        int cashPrize = cashLottery.getPrize();
        System.out.println("您抽中的现金奖品额度为：" + cashPrize);

        //在创建泛型类对象时，如果没有指定泛型具体类型，将按Object处理。
        Lottery<Object> objectLottery = new Lottery<>();
        //同一泛型类，根据不同数据类型创建的对象，逻辑上可以看成不同对象，但本质上是同一类型。
        System.out.println(stringLottery.getClass() == cashLottery.getClass());

        /**
         * 原始类型显示在遗留代码中，因为许多 API 类(例如 Collections 类)在 JDK 5.0 之前不是泛型的。
         * 使用原始类型时，基本上可以获得 pre-generics 行为——Box 为你提供 Object。为了向后兼容，允
         * 许将参数化类型赋值给其原始类型，但将原始类型分配给参数化类型，则会出现unchecked警告，如果
         * 你使用原始类型调用在相应的泛型类中定义的带有泛型标识的方法（包括泛型方法和以泛型标识作为形
         * 参的普通方法），也会出现unchecked警告。
         */
        Lottery strLottery = new Lottery<String>();//OK

        Lottery<Integer> integerlottery = new Lottery<>();
        Lottery rawLottery =integerlottery;//warning:unchecked
        rawLottery.addPrize(100);//warning:unchecked
    }

    private static Lottery createLottery() {
        return new Lottery();
    }
}
