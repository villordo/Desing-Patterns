package com.company;

import com.company.attacks.AttackWithAxe;
import com.company.behaviors.IAttackBehavior;
import com.company.behaviors.IDefendBehavior;
import com.company.defends.DefendWithShield;
import com.company.defends.DefendWithSword;
import com.company.defends.WithoutDefend;
import com.company.models.Gladiator;

public class Main {

    public static void main(String[] args) {
        Gladiator gladiator = new Gladiator();
        IAttackBehavior axe = new AttackWithAxe();
        IDefendBehavior shield = new DefendWithShield();
        IDefendBehavior noweapon = new WithoutDefend();

        gladiator.performAttack();
        gladiator.performDefend();
        gladiator.move(3);
        System.out.println("Se encuentra un hacha y la toma");
        gladiator.setAttackBehavior(axe);
        gladiator.setDefendBehavior(noweapon);
        gladiator.performAttack();
        gladiator.performDefend();

    }
}
