package structural.flyweight;


import java.util.ArrayList;
import java.util.List;

public class JavaProject {
    public static void main(String[] args) {
        DevelopersFactory developersFactory = new DevelopersFactory();
        List<Developer> projectTeam = new ArrayList<>();

        projectTeam.add(developersFactory.getDeveloperBySpecialty("java"));
        projectTeam.add(developersFactory.getDeveloperBySpecialty("c++"));
        projectTeam.add(developersFactory.getDeveloperBySpecialty("c++"));
        projectTeam.add(developersFactory.getDeveloperBySpecialty("c++"));

        for(Developer developer: projectTeam){
            developer.writeCode();
        }
    }
}
