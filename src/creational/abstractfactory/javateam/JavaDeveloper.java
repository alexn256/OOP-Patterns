package creational.abstractfactory.javateam;

import creational.abstractfactory.Developer;


public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java JavaDeveloper write Java code...");
    }
}
