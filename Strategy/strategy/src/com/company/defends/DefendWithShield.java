package com.company.defends;

import com.company.behaviors.IDefendBehavior;

public class DefendWithShield implements IDefendBehavior {
    @Override
    public void performHowtoDefend() {
        System.out.println("Defiendo con escudo.");
    }
}
