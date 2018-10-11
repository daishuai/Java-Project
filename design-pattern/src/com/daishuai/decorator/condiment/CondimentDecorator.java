package com.daishuai.decorator.condiment;

import com.daishuai.decorator.Beverage;

/**
 * @Description: 调料（装饰者）
 * @Author: daishuai
 * @CreateDate: 2018/10/11 14:36
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

}
