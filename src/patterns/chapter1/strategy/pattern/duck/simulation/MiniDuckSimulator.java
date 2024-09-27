package patterns.chapter1.strategy.pattern.duck.simulation;

import patterns.chapter1.strategy.pattern.duck.simulation.behaviour.fly.FlyBehavior;
import patterns.chapter1.strategy.pattern.duck.simulation.behaviour.fly.FlyRocketPowered;
import patterns.chapter1.strategy.pattern.duck.simulation.behaviour.quack.QuackBehavior;
import patterns.chapter1.strategy.pattern.duck.simulation.behaviour.quack.Squeak;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        FlyBehavior flyRocketPowered = new FlyRocketPowered();
        QuackBehavior squeakBehaviour = new Squeak();

        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println();
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.setFlyBehavior(flyRocketPowered);
        rubberDuck.performFly();

        System.out.println();
        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        decoyDuck.setFlyBehavior(flyRocketPowered);
        decoyDuck.setQuackBehavior(squeakBehaviour);
        decoyDuck.performFly();
        decoyDuck.performQuack();
    }
}
