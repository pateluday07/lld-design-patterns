package patterns.chapter1.strategy.pattern.adventure.game.behaviour.weapon;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("swinging a sword");
    }

}
