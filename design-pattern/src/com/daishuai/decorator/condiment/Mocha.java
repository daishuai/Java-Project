package com.daishuai.decorator.condiment;

import com.daishuai.decorator.Beverage;

/**
 * @Description: 摩卡
 * @Author: daishuai
 * @CreateDate: 2018/10/11 15:18
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "，摩卡";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 2;
    }
}
