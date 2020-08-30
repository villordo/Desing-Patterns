package com.company.attacks;

import com.company.behaviors.IAttackBehavior;

public class AttackWithAxe implements IAttackBehavior {
    @Override
    public void performHowToAttack() {
        System.out.println("Ataco con un hacha.");
    }
}
