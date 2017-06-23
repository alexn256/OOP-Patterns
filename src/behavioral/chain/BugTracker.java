package behavioral.chain;


public class BugTracker {
    public static void main(String[] args) {
        Notifier logNotifier = new LogNotifier(Priority.RUTINE);
        Notifier emailNotifier = new EmailReport(Priority.IMPORTANT);
        Notifier smsNotifier = new SmsNotifier(Priority.DANGER);

        logNotifier.setNext(emailNotifier);
        emailNotifier.setNext(smsNotifier);

        logNotifier.notifierManager("Everything is Ok", Priority.RUTINE);
        logNotifier.notifierManager("Something is wrong!", Priority.IMPORTANT);
        logNotifier.notifierManager("Houston, we have a problems!!!", Priority.DANGER);
    }
}
