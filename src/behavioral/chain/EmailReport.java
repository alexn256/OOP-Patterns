package behavioral.chain;


public class EmailReport extends Notifier{

    public EmailReport(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending by E-Mail report.");
    }
}
