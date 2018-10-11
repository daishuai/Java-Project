package com.daishuai.strategy.weapon;

/**
 * @Description: 使用斧头
 * @Author: daishuai
 * @CreateDate: 2018/9/28 20:52
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("正在使用斧头进行攻击！");
    }
}
