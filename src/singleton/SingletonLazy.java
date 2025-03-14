package singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SingletonLazy {

    private static SingletonLazy singleton = null;
    private static Lock lock = new ReentrantLock();
    private SingletonLazy() {}

    public static SingletonLazy getSingleton() {
        lock.lock();
        try {
            if (singleton == null) {
                singleton = new SingletonLazy();
            }
        } finally {
            lock.unlock();
        }
        return singleton;
    }
}
