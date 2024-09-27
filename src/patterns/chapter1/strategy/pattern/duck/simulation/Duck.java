package patterns.chapter1.strategy.pattern.duck.simulation;

import patterns.chapter1.strategy.pattern.duck.simulation.behaviour.fly.FlyBehavior;
import patterns.chapter1.strategy.pattern.duck.simulation.behaviour.quack.QuackBehavior;

public abstract class Duck {

    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;

    protected void swim() {
        System.out.println("I am swimming");
    }

    protected abstract void display();

    protected void performFly() {
        flyBehavior.fly();
    }

    protected void performQuack() {
        quackBehavior.quack();
    }

    protected void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    protected void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
