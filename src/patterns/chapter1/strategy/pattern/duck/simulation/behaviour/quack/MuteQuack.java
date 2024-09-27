package patterns.chapter1.strategy.pattern.duck.simulation.behaviour.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I don't quack!");
    }
}
