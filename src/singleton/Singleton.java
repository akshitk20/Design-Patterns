package singleton;

public class Singleton { // thread safe
    private static final Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getSingleton() {
        return singleton;
    }

}
