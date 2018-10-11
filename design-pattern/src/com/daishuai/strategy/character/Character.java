package com.daishuai.strategy.character;

import com.daishuai.strategy.weapon.WeaponBehavior;

/**
 * @Description: 角色抽象类
 * @Author: daishuai
 * @CreateDate: 2018/9/28 20:40
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public abstract class Character {
    private WeaponBehavior weapon;
    public void fight() {
        this.weapon.useWeapon();
    }

    public WeaponBehavior getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
