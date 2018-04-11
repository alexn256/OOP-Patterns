package creational.abstractfactory.consoles;

public class PlayStationFactory implements ConsoleFactory {

    @Override
    public Console cheapConsole() {
        return new PlayStation(200, 1, 1);
    }

    @Override
    public Console expensiveConsole() {
        return new PlayStationPlus(450, 2, 4, true);
    }
}
