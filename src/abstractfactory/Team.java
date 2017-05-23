package abstractfactory;


public interface Team {
    Developer getDeveloper();
    Tester getTester();
    TeamLead getTeamlead();
}
