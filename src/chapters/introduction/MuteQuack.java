package chapters.introduction;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I don't quack!");
    }
}
