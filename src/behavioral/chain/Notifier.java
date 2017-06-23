package behavioral.chain;


public abstract class Notifier {

    private int priority;
    private Notifier next;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNext(Notifier next) {
        this.next = next;
    }

    public void notifierManager(String message, int level){
        if (level >= priority){
            write(message);
        }
        if (next != null){
            next.notifierManager(message, level);
        }
    }

    public abstract void write(String message);

}
