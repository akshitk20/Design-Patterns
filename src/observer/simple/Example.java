package observer.simple;

public class Example {
    public static void main(String[] args) {
        SimpleSubject subject = new SimpleSubject();
        Observer observer = new SimpleObserver(subject);
        subject.registerObserver(observer);
        observer.update(10);
        subject.setValue(20);
    }
}
