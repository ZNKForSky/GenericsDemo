package com.luffy.genericsdemo01;

import java.util.ArrayList;

/**
 * 作者：<a href="https://blog.csdn.net/qq_35101450">张宁科CSDN主页</a><p>
 * 创建时间：2020/6/23 15:55 <p>
 * 描述：为什么要使用泛型
 */
public class Main {
    public static void main(String[] args) {
        // No generics
        ArrayList arrayList = new ArrayList();
        arrayList.add("kkr");
        arrayList.add("love");
        arrayList.add("coding");
        arrayList.add(666);

       /* for (int i = 0; i < arrayList.size(); i++) {
            String string = (String) arrayList.get(i);//java.lang.ClassCastException
            System.out.println(string);
        }*/

        //Generics
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("kkr");
        stringArrayList.add("love");
        stringArrayList.add("coding");
        stringArrayList.add("666");

        for (int i = 0; i < stringArrayList.size(); i++) {
            String s = stringArrayList.get(i);
            System.out.println("s ====== " + s);
        }
    }
}
