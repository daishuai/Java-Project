package com.daishuai.strategy;

import com.daishuai.strategy.character.King;
import com.daishuai.strategy.weapon.AxeBehavior;
import com.daishuai.strategy.weapon.BowAndArrowBehavior;
import com.daishuai.strategy.weapon.WeaponBehavior;

/**
 * @Description: 策略模式（Strategy Pattern）：定义了算法族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。
 * @Author: daishuai
 * @CreateDate: 2018/9/28 20:56
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class StrategyPatternTest {

    public static void main(String[] args) {
        King king = new King();
        WeaponBehavior bowAndArrow = new BowAndArrowBehavior();
        WeaponBehavior axe = new AxeBehavior();
        king.fight();
        king.setWeapon(bowAndArrow);
        king.fight();
        king.setWeapon(axe);
        king.fight();
    }
}
