package behavioral.observer.newspaper;

/**
 * @author Alexander Naumov.
 */
public class Demo {
    public static void main(String[] args) {

        Subscriber sarah = new SimpleSubscriber("Sarah");
        Subscriber bank = new CorporateSubscriber("Bank of America");

        PublishingHouse publishingHouse = new PublishingHouse(sarah, bank);

        publishingHouse.newRelease();
        publishingHouse.newStatistic();
    }

}
