package patterns.chapter1.strategy.pattern.adventure.game;

import patterns.chapter1.strategy.pattern.adventure.game.behaviour.weapon.AxeBehavior;
import patterns.chapter1.strategy.pattern.adventure.game.behaviour.weapon.BowAndArrowBehavior;

public class AdventureGame {

    public static void main(String[] args) {
        Character king = new King();
        king.fight();
        king.useWeapon();
        king.setWeaponBehavior(new AxeBehavior());
        king.useWeapon();

        System.out.println();
        Character queen = new Queen();
        queen.fight();
        queen.useWeapon();
        queen.setWeaponBehavior(new BowAndArrowBehavior());
        queen.useWeapon();
    }
}
