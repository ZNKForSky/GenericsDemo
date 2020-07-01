package com.luffy.genericsdemo04;

import com.luffy.genericsdemo02.Lottery;

import java.util.ArrayList;

/**
 * 作者：<a href="https://blog.csdn.net/qq_35101450">张宁科CSDN主页</a><p>
 * 创建时间：2020/7/1 23:49 <p>
 * 描述：
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("一个女朋友");
        stringArrayList.add("一台法拉利");
        stringArrayList.add("一栋亿万别墅");

        Lottery<Integer> integerLottery = new Lottery<>();
        String prize = integerLottery.getPrize(stringArrayList);
        System.out.println("prize === " + prize);
    }

}
