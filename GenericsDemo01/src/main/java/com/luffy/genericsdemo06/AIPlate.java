package com.luffy.genericsdemo06;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 作者：<a href="https://blog.csdn.net/qq_35101450">张宁科CSDN主页</a><p>
 * 创建时间：2020/7/3 14:56 <p>
 * 描述：类型擦除剖析
 */
public class AIPlate<T extends Comparable<T>> implements Plate<T> {

    private List<T> items = new ArrayList<T>(10);

    public AIPlate(){

    }

    @Override
    public void set(T t) {
        items.add(t);
        Collections.sort(items);
    }

    @Override
    public T get(){
        int index = items.size() -1;
        if(index>= 0){
            return items.get(index);
        }else{
            return null;
        }

    }

//    @Override
//    public boolean equals(T obj) {
//        return super.equals(obj);
//    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "items=" + items +
                '}';
    }
}
//擦除后
//public class AIPlate implements Plate {
//
//    private List<Comparable> items = new ArrayList<Comparable>(10);
//
//    public AIPlate(){
//
//    }
//
//    @Override
//    public void set(Comparable t) {
//        items.add(t);
//        Collections.sort(items);
//    }
//
//    @Override
//    public Comparable get(){
//        int index = items.size() -1;
//        if(index>= 0){
//            return items.get(index);
//        }else{
//            return null;
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Plate{" +
//                "items=" + items +
//                '}';
//    }
//}
