package com.company.attacks;

import com.company.behaviors.IAttackBehavior;

public class WithoutAttack implements IAttackBehavior {
    @Override
    public void performHowToAttack() {
        System.out.println("No tengo un arma para atacar!");
    }
}
