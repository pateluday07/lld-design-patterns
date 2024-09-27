package patterns.chapter1.strategy.pattern.adventure.game;

import patterns.chapter1.strategy.pattern.adventure.game.behaviour.weapon.BowAndArrowBehavior;

public class Troll extends Character {

    public Troll() {
        this.weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    protected void fight() {
        System.out.println("Troll is fighting!");
    }
}
