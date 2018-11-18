package behavioral.observer.newspaper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexander Naumov.
 */
public class Newspaper {

    private List<Subscriber> subscribers;
    private String state;

    public Newspaper() {
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String state) {
        subscribers.forEach(subscriber -> subscriber.update(state));
    }
}
