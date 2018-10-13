package com.daishuai.decorator;

import com.daishuai.decorator.condiment.Mocha;
import com.daishuai.decorator.condiment.Soy;

/**
 * @Description: 装饰者模式（Decorator Pattern）:
 * 动态的将责任附加到对象上，
 * @Author: daishuai
 * @CreateDate: 2018/10/11 15:24
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class DecoratorPatternTest {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + espresso.cost());
        Beverage mocha = new Mocha(espresso);
        System.out.println(mocha.getDescription() + mocha.cost());
        Beverage soy = new Soy(mocha);
        System.out.println(soy.getDescription() + soy.cost());

    }
}
