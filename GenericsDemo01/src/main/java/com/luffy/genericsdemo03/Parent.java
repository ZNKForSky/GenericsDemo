package com.luffy.genericsdemo03;

/**
 * 作者：<a href="https://blog.csdn.net/qq_35101450">张宁科CSDN主页</a><p>
 * 创建时间：2020/6/24 05:10 <p>
 * 描述：泛型父类
 */
public class Parent<T> {
    private T t;

    public T getValue() {
        return t;
    }

    public void setValue(T t) {
        this.t = t;
    }
}
