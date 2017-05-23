package abstractfactory.javateam;

import abstractfactory.Developer;


public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java Developer write Java code...");
    }
}
