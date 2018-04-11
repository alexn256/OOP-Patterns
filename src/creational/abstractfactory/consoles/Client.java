package creational.abstractfactory.consoles;

public class Client {

    private ConsoleFactory factory;
    private Console console;

    public Client(ConsoleFactory factory) {
        this.factory = factory;
        console = factory.expensiveConsole();
    }

    @Override
    public String toString() {
        return "Client " + "[console=" + console.getDescription() + ']';
    }
}
