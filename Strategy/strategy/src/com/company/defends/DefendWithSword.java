package com.company.defends;

import com.company.behaviors.IDefendBehavior;

public class DefendWithSword implements IDefendBehavior {
    @Override
    public void performHowtoDefend() {
        System.out.println("Defiendo con mi espada.");
    }
}
