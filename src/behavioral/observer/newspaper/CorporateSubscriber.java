package behavioral.observer.newspaper;

/**
 * @author Alexander Naumov.
 */
public class CorparateSubscriber implements Subscriber {

    private String priority = "statistics";

    @Override
    public String getPriority() {
        return priority;
    }

    @Override
    public void update(String news) {

    }
}
