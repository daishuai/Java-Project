package com.daishuai.strategy.weapon;

/**
 * @Description: 使用弓箭
 * @Author: daishuai
 * @CreateDate: 2018/9/28 20:51
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("正在使用弓箭进行攻击！");
    }
}
