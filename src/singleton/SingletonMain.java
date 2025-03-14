package singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton1.hashCode());
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton2.hashCode());
        System.out.println(singleton1 == singleton2);
    }
}
