package creational.abstractfactory.consoles;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new PlayStationFactory());
        System.out.println(client);
    }
}
