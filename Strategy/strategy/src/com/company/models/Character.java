package com.company.models;

import com.company.behaviors.IAttackBehavior;
import com.company.behaviors.IDefendBehavior;

public abstract class Character {
    private IAttackBehavior attackBehavior;
    private IDefendBehavior defendBehavior;
    private String classs;

    public Character(String classs){
        this.classs = classs;
    }

    public void performAttack(){
        this.attackBehavior.performHowToAttack();
    }
    public void performDefend(){
        this.defendBehavior.performHowtoDefend();
    }

    public void setAttackBehavior(IAttackBehavior attackBehavior) {
        //System.out.println("El "+getClasss()+" cambio de arma.");
        this.attackBehavior = attackBehavior;
    }

    public void setDefendBehavior(IDefendBehavior defendBehavior) {
        //System.out.println("Cambio de defensa.");
        this.defendBehavior = defendBehavior;
    }

    public String getClasss(){
        return this.classs;
    }
    public abstract void move(int q);
}
