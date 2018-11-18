package behavioral.observer.newspaper;

/**
 * Special subject that contains business logic.
 *
 * @author Alexander Naumov.
 */


public class PublishingHouse {

    private Publisher publisher = new Publisher();
    private int realiseNumber;
    private int statisticNumber;
    private static final String NEWSPAPER = "newspaper";
    private static final String STATISTICS = "statistics";

    public PublishingHouse(Subscriber... subscribers) {
        this.realiseNumber = 100;
        this.statisticNumber = 100;
        for(Subscriber subscriber: subscribers) {
            publisher.subscribe(subscriber);
        }
    }

    public void newRelease() {
        publisher.notifySubscribers("a new " + realiseNumber++ +
                " realise of our newspaper has been released", NEWSPAPER);
    }

    public void newStatistic() {
        publisher.notifySubscribers("a new " + statisticNumber++ +
                " realise of our business statistics has been released", STATISTICS);
    }
}
