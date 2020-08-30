package com.company.models;

import com.company.attacks.AttackWhitSword;
import com.company.behaviors.IAttackBehavior;
import com.company.behaviors.IDefendBehavior;
import com.company.defends.DefendWithSword;

public class Gladiator extends Character {

    public Gladiator() {
        super("Gladiador");
        IAttackBehavior attackBehavior = new AttackWhitSword();
        IDefendBehavior defendBehavior = new DefendWithSword();
        this.setAttackBehavior(attackBehavior);
        this.setDefendBehavior(defendBehavior);
    }

    @Override
    public void move(int q) {
        System.out.println("El "+this.getClasss()+" se movio "+q+" pasos.");
    }
}
