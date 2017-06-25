package behavioral.command;


public class Database {

    public void insert(){
        System.out.println("Inserting record...");
    }

    public void update(){
        System.out.println("Updating record...");
    }

    public void read(){
        System.out.println("Loading record...");
    }

    public void remove(){
        System.out.println("Deleting record...");
    }
}
