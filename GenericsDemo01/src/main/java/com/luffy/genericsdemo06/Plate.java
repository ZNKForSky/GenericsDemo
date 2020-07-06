package com.luffy.genericsdemo06;


public interface Plate<T> {


    public void set(T t);
    public T get();
}
