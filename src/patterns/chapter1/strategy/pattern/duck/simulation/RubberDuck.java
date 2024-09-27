package patterns.chapter1.strategy.pattern.duck.simulation;

import patterns.chapter1.strategy.pattern.duck.simulation.behaviour.fly.FlyNoWay;
import patterns.chapter1.strategy.pattern.duck.simulation.behaviour.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.quackBehavior = new Squeak();
        this.flyBehavior = new FlyNoWay();
    }

    @Override
    protected void display() {
        System.out.println("I am a Rubber Duck!");
    }
}
