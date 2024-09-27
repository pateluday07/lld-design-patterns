package patterns.chapter1.strategy.pattern.adventure.game;

import patterns.chapter1.strategy.pattern.adventure.game.behaviour.weapon.KnifeBehavior;

public class Queen extends Character {

    public Queen() {
        this.weaponBehavior = new KnifeBehavior();
    }

    @Override
    protected void fight() {
        System.out.println("Queen is fighting!");
    }
}
