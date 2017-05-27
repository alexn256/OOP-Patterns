package creational.abstractfactory.javateam;

import creational.abstractfactory.Developer;
import creational.abstractfactory.Team;
import creational.abstractfactory.TeamLead;
import creational.abstractfactory.Tester;


public class JavaTeamFactory implements Team{

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public TeamLead getTeamlead() {
        return new JavaTeamLead();
    }
}
