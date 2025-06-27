package patterns.creational.singleton;

public class LazyInitializeSingleton {

    private static volatile LazyInitializeSingleton singleton;

    // no checks needed in constructor, because reflection can change it anyway
    // If need reflection safety, use enum instead
    private LazyInitializeSingleton() {
    }

    public static LazyInitializeSingleton getInstance() {
        if (singleton == null) {
            synchronized (LazyInitializeSingleton.class) {
                if (singleton == null) {
                    singleton = new LazyInitializeSingleton();
                }
            }
        }
        return singleton;
    }

}
