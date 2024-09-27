package patterns.chapter1.strategy.pattern.adventure.game;

import patterns.chapter1.strategy.pattern.adventure.game.behaviour.weapon.SwordBehavior;

public class King extends Character {

    public King() {
        this.weaponBehavior = new SwordBehavior();
    }

    @Override
    protected void fight() {
        System.out.println("King is fighting!");
    }
}
