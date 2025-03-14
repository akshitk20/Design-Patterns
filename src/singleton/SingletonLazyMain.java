package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingletonLazyMain {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<SingletonLazy> submit = executorService.submit(() -> SingletonLazy.getSingleton());
        Future<SingletonLazy> submit1 = executorService.submit(() -> SingletonLazy.getSingleton());

        SingletonLazy singleton = SingletonLazy.getSingleton();
        Constructor<? extends SingletonLazy> constructor = singleton.getClass().getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonLazy singletonLazy = constructor.newInstance();
        System.out.println(singletonLazy.hashCode());
        System.out.println(submit.get().hashCode());

        //SingletonLazy singleton2 = SingletonLazy.getSingleton();
        System.out.println(submit1.get().hashCode());
        executorService.shutdown();

    }
}
