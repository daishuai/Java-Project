package com.daishuai.strategy.character;

import com.daishuai.strategy.weapon.BowAndArrowBehavior;

/**
 * @Description: 皇后
 * @Author: daishuai
 * @CreateDate: 2018/9/28 20:54
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class Queen extends Character {

    public Queen() {
        this.setWeapon(new BowAndArrowBehavior());
    }
}
