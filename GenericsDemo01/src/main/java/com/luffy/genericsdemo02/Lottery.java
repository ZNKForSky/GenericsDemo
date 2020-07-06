package com.luffy.genericsdemo02;

import java.util.ArrayList;
import java.util.Random;

/**
 * 作者：<a href="https://blog.csdn.net/qq_35101450">张宁科CSDN主页</a><p>
 * 创建时间：2020/6/24 04:30 <p>
 * 描述：通用类型的抽奖器
 */
public class Lottery<T> {
    private static Random random = new Random();
    /**
     * 奖品池
     */
    private ArrayList<T> prizeList = new ArrayList<T>();
    /**
     * 未知类型的奖品
     */
    private T prize;

    /**
     * 添加奖品
     *
     * @param t 未知类型的奖品
     */
    public void addPrize(T t) {
        prizeList.add(t);
    }

    /**
     * 随机获取奖品
     *
     * @return 奖品
     */
    public T getPrize() {
        return prizeList.get(random.nextInt(prizeList.size()));
    }

    /**
     * 随机获取奖品的泛型方法
     * PS:泛型方法的泛型标识与泛型类的泛型标识没有一毛钱关系，它的类型是由调用者独立决定的。
     * @param list 奖品的List
     * @param <T> 未知类型的奖品
     * @return 具体的奖品
     */
    public static <T> T getPrize(ArrayList<T> list){
        return list.get(random.nextInt(list.size()));
    }

}
