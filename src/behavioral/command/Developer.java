package behavioral.command;


public class Developer {

    private Command insert;
    private Command update;
    private Command load;
    private Command delete;

    public Developer(Command insert, Command update, Command load, Command delete) {
        this.insert = insert;
        this.update = update;
        this.load = load;
        this.delete = delete;
    }

    public void insert(){
        insert.execute();
    }

    public void update(){
        update.execute();
    }

    public void load(){
        load.execute();
    }

    public void delete(){
        delete.execute();
    }
}
