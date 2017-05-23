package abstractfactory.javateam;


import abstractfactory.Developer;
import abstractfactory.Team;
import abstractfactory.TeamLead;
import abstractfactory.Tester;

public class Main {
    public static void main(String[] args) {
        Team team = new JavaTeamFactory();
        Developer javaDeveloper = team.getDeveloper();
        Tester manualTester = team.getTester();
        TeamLead javaTeamLead = team.getTeamlead();

        System.out.println("Tested Abstract Factory:");

        javaDeveloper.writeCode();
        manualTester.testCode();
        javaTeamLead.direct();
    }
}
