package com.daishuai.decorator;

/**
 * @Description: 浓缩咖啡
 * @Author: daishuai
 * @CreateDate: 2018/10/11 14:38
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "浓缩咖啡";
    }

    @Override
    public double cost() {
        return 12.5;
    }
}
