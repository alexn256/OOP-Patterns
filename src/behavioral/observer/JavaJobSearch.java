package behavioral.observer;


public class JavaJobSearch {
    public static void main(String[] args) {
        JavaJobSite javaSite = new JavaJobSite();
        javaSite.addVacancy("Java Junior Developer");
        javaSite.addVacancy("Java Senior Developer");

        Observer firstObserver = new Subscriber("First Observer");
        Observer secondObserver = new Subscriber("Second Observer");

        javaSite.addObserver(firstObserver);
        javaSite.addObserver(secondObserver);

        javaSite.addVacancy("Java Middle Java Developer");
        javaSite.removeVacancy("Java Senior Developer");

    }
}
