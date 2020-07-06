package com.luffy.genericsdemo07;

public class XiaoMing<T> extends Person {


    public RawPlate getPlate(){
        return new RawPlate();
    }

    public <T> AIPlate<T> getAIPlate(){
        return new AIPlate<T>();
    }

}
