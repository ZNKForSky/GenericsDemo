package com.luffy.genericsdemo03;

/**
 * 作者：<a href="https://blog.csdn.net/qq_35101450">张宁科CSDN主页</a><p>
 * 创建时间：2020/6/24 05:12 <p>
 * 描述：若子类也是泛型类，子类的泛型标识中必须包含父类的泛型标识。
 */
public class ChildOne<E, T> extends Parent<T> {
    private E e;

    @Override
    public void setValue(T t) {
        super.setValue(t);

    }

    @Override
    public T getValue() {
        return super.getValue();
    }

    public void setSelfValue(E e) {
        this.e = e;
    }

    public E getSelfValue() {
        return e;
    }
}
