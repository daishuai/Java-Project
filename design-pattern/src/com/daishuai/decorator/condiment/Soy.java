package com.daishuai.decorator.condiment;

import com.daishuai.decorator.Beverage;

/**
 * @Description: 大豆，酱油
 * @Author: daishuai
 * @CreateDate: 2018/10/11 15:22
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ",大豆";
    }

    @Override
    public double cost() {
        return 1 + this.beverage.cost();
    }
}
