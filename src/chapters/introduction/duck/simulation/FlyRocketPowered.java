package chapters.introduction.duck.simulation;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with rockets!");
    }
}
