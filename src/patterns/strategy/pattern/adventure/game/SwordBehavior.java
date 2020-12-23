package patterns.strategy.pattern.adventure.game;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("swinging a sword");
    }

}
