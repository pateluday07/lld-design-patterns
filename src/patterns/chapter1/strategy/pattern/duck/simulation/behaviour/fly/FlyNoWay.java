package patterns.chapter1.strategy.pattern.duck.simulation.behaviour.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Sorry I can't fly!");
    }
}
