package behavioral.observer;

import java.util.List;


public class Subscriber implements Observer{

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\n" + "We have same changes in vacancies for you: \n" + vacancies +"\n" +
                "=========================================================");
    }
}
