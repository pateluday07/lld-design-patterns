package patterns.chapter1.strategy.pattern.duck.simulation.behaviour.quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack Quack..");
    }
}
