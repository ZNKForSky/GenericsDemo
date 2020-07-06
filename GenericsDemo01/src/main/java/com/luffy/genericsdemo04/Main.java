package com.luffy.genericsdemo04;

import com.luffy.genericsdemo02.Lottery;

import java.util.ArrayList;

/**
 * 作者：<a href="https://blog.csdn.net/qq_35101450">张宁科CSDN主页</a><p>
 * 创建时间：2020/7/1 23:49 <p>
 * 描述：泛型类实现通用类型测试
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("一个女朋友");
        stringArrayList.add("一台法拉利");
        stringArrayList.add("一栋亿万别墅");

        Lottery<Integer> integerLottery = new Lottery<>();
        //调用泛型方法获取奖品
        String prize = integerLottery.getPrize(stringArrayList);
        System.out.println("prize === " + prize);
        System.out.println("-------------------");
        Lottery<Integer> integerLottery02 = new Lottery<>();
        integerLottery02.addPrize(100);
        integerLottery02.addPrize(500);
        integerLottery02.addPrize(1000);
        integerLottery02.addPrize(5000);
        integerLottery02.addPrize(10000);
        //调用普通成员方法获取奖品
        Integer prize02 = integerLottery02.getPrize();
        System.out.println("prize02 === " + prize02);
    }

}
