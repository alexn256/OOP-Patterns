package examinator;


import java.util.Random;

public class Examinator {

    private String[] creational = {"Abstract Factory", "Builder", "Factory", "Pototype", "Singleton"};
    private String[] structural = {"Adapter", "Bridge", "Composite", "Decorator", "Facade", "Flyweight", "Proxy"};
    private String[] behavioral = {"Chain of Responsibility", "Command", "Interpreter", "Iterator", "Mediator",
            "Momento", "Observer", "State", "Strategy", "Template Method", "Visitor"};
    private Random random = new Random();

    public String getCreational(){
        int x = random.nextInt(creational.length);
        return creational[x];
    }

    public String getStructural(){
        int x = random.nextInt(structural.length);
        return structural[x];
    }

    public String getBehavioral(){
        int x = random.nextInt(behavioral.length);
        return behavioral[x];
    }
}
