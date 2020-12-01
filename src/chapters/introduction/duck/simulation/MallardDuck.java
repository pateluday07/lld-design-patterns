package chapters.introduction.duck.simulation;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    protected void display() {
        System.out.println("I am a Mallard Duck!");
    }
}
