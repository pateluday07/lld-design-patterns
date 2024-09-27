package patterns.chapter1.strategy.pattern.adventure.game.behaviour.weapon;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("cutting with knife");
    }
}
