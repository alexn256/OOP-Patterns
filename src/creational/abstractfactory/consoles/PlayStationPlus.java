package creational.abstractfactory.consoles;

public class PlayStationPlus implements Console{

    private int prise;
    private int controllers;
    private int games;
    private boolean oculus;

    public PlayStationPlus(int prise, int controllers, int games, boolean oculus) {
        this.prise = prise;
        this.controllers = controllers;
        this.games = games;
        this.oculus = oculus;
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
        return "PlayStationPlus [" + "prise=" + prise + ", controllers=" + controllers + ", games=" + games + ", oculus exist=" + oculus + ']';
    }
}
