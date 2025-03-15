package observer.youtube;

public class Main {
    public static void main(String[] args) {
        Subject channel = new YoutubeChannel();

        Subscriber subscriber1 = new Subscriber("Bob");
        Subscriber subscriber2 = new Subscriber("Yelena");
        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);

        channel.notifySubscriber("Hello");
    }
}
