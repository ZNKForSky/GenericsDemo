package com.luffy.genericsdemo05;

/**
 * 作者：<a href="https://blog.csdn.net/qq_35101450">张宁科CSDN主页</a><p>
 * 创建时间：2020/7/3 14:54 <p>
 * 描述：原始类型测试类
 */
public class Main {
    public static void main(String[] args) {
        Box<Number> numberBox = new Box<>();
        numberBox.setFirstDate(100);
        showBoxDate(numberBox);
        System.out.println("-------------------------------");
        Box<Integer> integerBox = new Box<>();
        integerBox.setFirstDate(520);
        showBoxDate(integerBox);

        /**
         * 在JDK 5.0之前，许多API类（例如Collections 类）不是通用的。使
         * 用原始类型时，你实际上会获得泛型行为（Box为你提供对象）。为了向后兼容，允许将参数化类型分
         * 配给其原始类型：
         */
        Box rawBox = integerBox;

//        Box<Number> numberBox1 = new Box<>();//要创建Box的参数化类型，必须为形式类型参数T提供一个实际的类型参数
//        Box box = new Box();//如果省略实际的类型参数，则创建Box 的原始类型
    }

    private static void showBoxDate(Box<? extends Number> box) {
        Number firstDate = box.getFirstDate();
        System.out.println("firstDate === " + firstDate);
    }
}

class Box<T> {
    private T firstDate;

    public T getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(T firstDate) {
        this.firstDate = firstDate;
    }
}