package observer.youtube;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notified(String message) {
        System.out.println("Notified " + name + " with message " +message);
    }
}
