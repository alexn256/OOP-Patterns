package creational.abstractfactory.consoles;

public class XBoxFactory implements ConsoleFactory{

    @Override
    public Console cheapConsole() {
        return new XBox(250, 2, 2);
    }

    @Override
    public Console expensiveConsole() {
        return new XBoxPlus(400, 4, 2, true);
    }
}
