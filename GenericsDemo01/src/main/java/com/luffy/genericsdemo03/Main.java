package com.luffy.genericsdemo03;

/**
 * 作者：<a href="https://blog.csdn.net/qq_35101450">张宁科CSDN主页</a><p>
 * 创建时间：2020/6/24 05:10 <p>
 * 描述：泛型类测试
 */
public class Main {

    public static void main(String[] args) {
        ChildOne<Object, Object> objectObjectChildOne = new ChildOne<>();
        ChildOne<String, Integer> stringIntegerChildOne = new ChildOne<>();

        objectObjectChildOne.setValue("luffy");
        Object value = objectObjectChildOne.getValue();
        System.out.println("value === " + value);
        System.out.println("---------------------------------");
        stringIntegerChildOne.setValue(666);
        stringIntegerChildOne.setSelfValue("KKR");
        Integer value1 = stringIntegerChildOne.getValue();
        String selfValue = stringIntegerChildOne.getSelfValue();
        System.out.println("value1 === " + value1);
        System.out.println("selfValue === " + selfValue);

    }
}
