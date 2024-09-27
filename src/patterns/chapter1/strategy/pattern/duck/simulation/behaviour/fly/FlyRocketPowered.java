package patterns.chapter1.strategy.pattern.duck.simulation.behaviour.fly;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with rockets!");
    }
}
