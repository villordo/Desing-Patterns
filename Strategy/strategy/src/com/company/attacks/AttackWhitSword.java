package com.company.attacks;

import com.company.behaviors.IAttackBehavior;

public class AttackWhitSword implements IAttackBehavior {
    @Override
    public void performHowToAttack() {
        System.out.println("Ataco con una espada");
    }
}
