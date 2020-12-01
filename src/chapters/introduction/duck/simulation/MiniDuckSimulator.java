package chapters.introduction.duck.simulation;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println();
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.setFlyBehavior(new FlyRocketPowered());
        rubberDuck.performFly();

        System.out.println();
        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        decoyDuck.setFlyBehavior(new FlyRocketPowered());
        decoyDuck.setQuackBehavior(new Squeak());
        decoyDuck.performFly();
        decoyDuck.performQuack();
    }
}
