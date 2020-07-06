package com.luffy.genericsdemo06;


public class Fruit implements Comparable<Fruit>{

    int price = 0;

    @Override
    public String toString() {
        return "Fruit";
    }

    @Override
    public int compareTo(Fruit fruit) {
        return this.price - fruit.price;
    }
}
