package behavioral.observer.newspaper;

/**
 *
 * @author Alexander Naumov.
 */


public class CorporateSubscriber extends Subscriber {

    private String[] priorities = {"statistics", "newspaper"};

    public CorporateSubscriber(String name) {
        super(name);
    }
    @Override
    public String[] getPriorities() {
        return priorities;
    }

    @Override
    public void update(String news) {
        System.out.println(getName() + ": " + news);
    }
}
