package chapters.introduction.duck.simulation;

public abstract class Duck {

    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;

    protected void swim() {
        System.out.println("I am swimming");
    }

    protected abstract void display();

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    protected void performFly() {
        flyBehavior.fly();
    }

    protected void performQuack() {
        quackBehavior.quack();
    }

    protected void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    protected FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    protected void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
