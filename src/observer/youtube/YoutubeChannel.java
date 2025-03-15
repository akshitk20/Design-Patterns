package observer.youtube;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {
    List<Subscriber> subscribers = new ArrayList<>();
    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.notified(message);
        }
    }
}
