package chapters.introduction.adventure.game;

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
