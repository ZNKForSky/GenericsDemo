package com.luffy.genericsdemo0x;


public interface Plate<T> {
    public void set(T t);

    public T get();
}
