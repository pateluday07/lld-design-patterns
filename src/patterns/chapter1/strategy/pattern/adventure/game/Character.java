package patterns.chapter1.strategy.pattern.adventure.game;

import patterns.chapter1.strategy.pattern.adventure.game.behaviour.weapon.WeaponBehavior;

public abstract class Character {

    protected WeaponBehavior weaponBehavior;

    protected void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    protected void useWeapon() {
        weaponBehavior.useWeapon();
    }

    protected abstract void fight();
}
