package abstractfactory.javateam;

import abstractfactory.Developer;
import abstractfactory.Team;
import abstractfactory.TeamLead;
import abstractfactory.Tester;


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
