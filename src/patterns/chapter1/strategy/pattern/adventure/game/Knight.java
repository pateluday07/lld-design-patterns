package patterns.chapter1.strategy.pattern.adventure.game;

import patterns.chapter1.strategy.pattern.adventure.game.behaviour.weapon.AxeBehavior;

public class Knight extends Character {

    public Knight() {
        this.weaponBehavior = new AxeBehavior();
    }

    @Override
    protected void fight() {
        System.out.println("Knight is fighting");
    }
}
