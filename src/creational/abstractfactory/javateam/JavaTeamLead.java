package creational.abstractfactory.javateam;

import creational.abstractfactory.TeamLead;


public class JavaTeamLead implements TeamLead {

    @Override
    public void direct() {
        System.out.println("JavaTeamLead give tasks...");
    }
}
