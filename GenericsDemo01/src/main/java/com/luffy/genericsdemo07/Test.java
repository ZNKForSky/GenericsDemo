package com.luffy.genericsdemo07;

public class Test {

    public static void main(String[] args) {

//        scene01();
//        scene02();
//        scene03();
        scene04();

    }

    public static void scene01() {
        //先让几位角色上场
        XiaoMing xiaoMing = new XiaoMing();
        XiaoLi xiaoLi = new XiaoLi();
        XiaoMingMa xiaoMingMa = new XiaoMingMa();

        //小明给了他妈一个盘子
        RawPlate rawPlate = xiaoMing.getPlate();
        //小明妈去装水果
        xiaoMingMa.addFruit(rawPlate);
        //小丽吃香蕉
        xiaoLi.eat((Banana) rawPlate.get());
    }


    @SuppressWarnings("unchecked")
    private static void scene02() {
        //先让几位角色上场
        XiaoMing xiaoMing = new XiaoMing();
        XiaoLi xiaoLi = new XiaoLi();
        XiaoMingMa xiaoMingMa = new XiaoMingMa();

        //假如这个盘子是智能的，能主动检测你往里面装什么
        //小明给的这个盘子只能装香蕉
        AIPlate<Banana> aiPlate = xiaoMing.<Banana>getAIPlate();

        //方法泛型推断
        AIPlate<Banana> aiPlate1 = xiaoMing.getAIPlate();
        xiaoMingMa.add1();
        xiaoMingMa.add2(aiPlate1);
        //小明妈就不会装错了
        xiaoMingMa.addFruitToAi(aiPlate);
        xiaoLi.eat(aiPlate.get());

    }

    public static void scene03() {
        int[] ints = new int[10];
        sort(ints);
        double[] doubles = new double[10];
        sort(doubles);
        Object[] objects = new Object[10];
        sort(objects);
    }

    private static void sort(int[] array) {
    }

    private static void sort(double[] array) {
    }

    private static <T> void sort(T[] array) {
    }

    public static void scene04() {
        NaturalNumber<Integer> integerNaturalNumber = new NaturalNumber<>(100);
        integerNaturalNumber.isEven();
        System.out.println("integerNaturalNumber.isEven() === " + integerNaturalNumber.isEven());
    }
}

class NaturalNumber<T extends Integer> {
    private T t;

    public NaturalNumber(T t) {
        this.t = t;
    }

    /**
     * 判断是否是偶数
     *
     * @return true表示是偶数
     */
    public boolean isEven() {
        return t.intValue() % 2 == 0;
    }
}

class Test1 {

    static class A {
    }

    static class A1 {
    }

    static interface B {
    }

    static interface C {
    }

    //static class D<T extends B & A &C>{}//编译报错
    //具有多个限定的类型变量是范围中列出的所有类型的子类型。如果范围之一是类，则必须首先指定它
    static class D1<T extends A & B & C> {
    }//OK

    //单继承
//    static class D2<T extends  A & A1 & B & C>{}
}


