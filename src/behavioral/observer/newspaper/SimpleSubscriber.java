package behavioral.observer.newspaper;

/**
 * @author Alexander Naumov.
 */


public class SimpleSubscriber extends Subscriber {

    private String[] priorities = {"newspaper"};

    public SimpleSubscriber(String name) {
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
