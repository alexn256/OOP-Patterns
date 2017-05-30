package structural.adapter;


public class Program {
    public static void main(String[] args) {
        Database crudObject = new Adapter();
        crudObject.create();
        crudObject.read();
        crudObject.update();
        crudObject.delete();
    }
}
