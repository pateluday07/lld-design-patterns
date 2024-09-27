package patterns.chapter1.strategy.pattern.adventure.game.behaviour.weapon;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("shooting an arrow with a bow");
    }
}
