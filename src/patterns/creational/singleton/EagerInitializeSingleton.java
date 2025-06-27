package patterns.creational.singleton;

// Thread safe and Reflection safe singleton using enum
public enum EagerInitializeSingleton {

    INSTANCE;

    public void doSomething() {
        System.out.println("EagerInitializeSingleton: Enum Singleton Doing something..");
    }
}
