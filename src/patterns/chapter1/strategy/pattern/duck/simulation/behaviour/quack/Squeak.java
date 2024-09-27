package patterns.chapter1.strategy.pattern.duck.simulation.behaviour.quack;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak Squeak..");
    }
}
