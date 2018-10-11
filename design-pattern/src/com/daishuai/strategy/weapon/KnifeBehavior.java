package com.daishuai.strategy.weapon;

/**
 * @Description: 使用匕首
 * @Author: daishuai
 * @CreateDate: 2018/9/28 20:45
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("正在使用匕首进行攻击！");
    }
}
