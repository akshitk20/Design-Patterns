package singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SingletonLazy {

    private static SingletonLazy singleton = null;
    private static Lock lock = new ReentrantLock();
    private SingletonLazy() throws Exception {
        if (singleton != null) {
            throw new Exception("Singleton called from Reflection");
        }
    }

    public static SingletonLazy getSingleton() throws Exception {
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
