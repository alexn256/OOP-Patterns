package creational.abstractfactory.consoles;

public class PlayStation implements Console{

    private int prise;
    private int controllers;
    private int games;

    public PlayStation(int prise, int controllers, int games) {
        this.prise = prise;
        this.controllers = controllers;
        this.games = games;
    }

    @Override
    public int getPrise() {
        return prise;
    }

    @Override
    public String getDescription() {
        return toString();
    }

    @Override
    public String toString() {
        return "PlayStation:" + "[prise=" + prise + ", controllers=" + controllers + ", games=" + games + ']';
    }
}
