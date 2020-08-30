package com.company.defends;

import com.company.behaviors.IDefendBehavior;

public class WithoutDefend implements IDefendBehavior {
    @Override
    public void performHowtoDefend() {
        System.out.println("No me puedo defender.");
    }
}
