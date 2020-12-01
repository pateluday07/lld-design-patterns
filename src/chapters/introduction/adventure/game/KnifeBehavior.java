package chapters.introduction.adventure.game;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("cutting with knife");
    }
}
