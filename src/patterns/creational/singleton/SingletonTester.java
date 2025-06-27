package patterns.creational.singleton;

public class SingletonTester {

    public static void main(String[] args) {
        LazyInitializeSingleton lazyInitializeSingleton1 = LazyInitializeSingleton.getInstance();
        LazyInitializeSingleton lazyInitializeSingleton2 = LazyInitializeSingleton.getInstance();
        System.out.println("LazyInitializeSingleton instances are the same: " + (lazyInitializeSingleton1 == lazyInitializeSingleton2));
        lazyInitializeSingleton1.doSomething();
        lazyInitializeSingleton2.doSomething();
        System.out.println();

        EagerInitializeSingleton eagerInitializeSingleton1 = EagerInitializeSingleton.INSTANCE;
        EagerInitializeSingleton eagerInitializeSingleton2 = EagerInitializeSingleton.INSTANCE;
        System.out.println("EagerInitializeSingleton instances are the same: " + (eagerInitializeSingleton1 == eagerInitializeSingleton2));
        eagerInitializeSingleton1.doSomething();
        eagerInitializeSingleton2.doSomething();

    }
}
