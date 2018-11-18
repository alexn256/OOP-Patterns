package behavioral.observer.newspaper;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject monitored by {@link Subscriber}.
 *
 * @author Alexander Naumov.
 */


public class Publisher {

    private List<Subscriber> subscribers;

    public Publisher() {
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String event, String eventType) {
        subscribers.forEach(subscriber -> {
            String [] priorities = subscriber.getPriorities();
            for (String priority: priorities) {
                if (priority.equals(eventType)) {
                    subscriber.update(event);
                }
            }
        });
    }
}
