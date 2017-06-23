package behavioral.chain;


public class LogNotifier extends Notifier {

    public LogNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple log report:");
    }
}
