package com.luffy.genericsdemo07;


public interface Plate<T> {
    public void set(T t);

    public T get();
}
