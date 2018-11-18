package behavioral.observer.newspaper;

/**
 * @author Alexander Naumov.
 */


public abstract class Subscriber {

    private String[] priorities;
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void update(String event);
    abstract String[] getPriorities();
}
