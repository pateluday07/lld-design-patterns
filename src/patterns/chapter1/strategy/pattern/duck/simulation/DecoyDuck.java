package patterns.chapter1.strategy.pattern.duck.simulation;

import patterns.chapter1.strategy.pattern.duck.simulation.behaviour.fly.FlyNoWay;
import patterns.chapter1.strategy.pattern.duck.simulation.behaviour.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        this.quackBehavior = new MuteQuack();
        this.flyBehavior = new FlyNoWay();
    }

    @Override
    protected void display() {
        System.out.println("I am a Decoy Duck!");
    }
}
