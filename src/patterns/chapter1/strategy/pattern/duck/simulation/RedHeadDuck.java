package patterns.chapter1.strategy.pattern.duck.simulation;

import patterns.chapter1.strategy.pattern.duck.simulation.behaviour.fly.FlyWithWings;
import patterns.chapter1.strategy.pattern.duck.simulation.behaviour.quack.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    protected void display() {
        System.out.println("I am Red Head Duck!");
    }
}
