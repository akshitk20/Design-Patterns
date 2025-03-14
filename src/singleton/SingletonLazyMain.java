package singleton;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingletonLazyMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<SingletonLazy> submit = executorService.submit(() -> SingletonLazy.getSingleton());
        Future<SingletonLazy> submit1 = executorService.submit(() -> SingletonLazy.getSingleton());

        //SingletonLazy singleton = SingletonLazy.getSingleton();

        System.out.println(submit.get().hashCode());

        //SingletonLazy singleton2 = SingletonLazy.getSingleton();
        System.out.println(submit1.get().hashCode());
        executorService.shutdown();
    }
}
