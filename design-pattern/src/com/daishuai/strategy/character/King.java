package com.daishuai.strategy.character;

import com.daishuai.strategy.character.Character;
import com.daishuai.strategy.weapon.KnifeBehavior;

/**
 * @Description: 国王
 * @Author: daishuai
 * @CreateDate: 2018/9/28 20:41
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class King extends Character {

    public King() {
        this.setWeapon(new KnifeBehavior());
    }
}
