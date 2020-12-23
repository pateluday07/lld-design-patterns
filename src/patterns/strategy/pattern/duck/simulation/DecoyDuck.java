package patterns.strategy.pattern.duck.simulation;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
        setQuackBehavior(new MuteQuack());
        setFlyBehavior(new FlyNoWay());
    }

    @Override
    protected void display() {
        System.out.println("I am a Decoy Duck!");
    }
}
