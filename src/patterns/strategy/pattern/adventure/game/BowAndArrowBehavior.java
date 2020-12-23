package patterns.strategy.pattern.adventure.game;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("shooting an arrow with a bow");
    }
}
