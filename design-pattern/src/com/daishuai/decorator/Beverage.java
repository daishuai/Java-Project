package com.daishuai.decorator;

/**
 * @Description: 饮料
 * @Author: daishuai
 * @CreateDate: 2018/10/11 14:32
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription(){
        return this.description;
    }

    public abstract double cost();
}
