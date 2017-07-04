package structural.facade;


public class Developer {

    public void doJobBeforeDeadLine(BugTracker bugTracker){
        if(bugTracker.isActiveSprint() == true){
            System.out.println("JavaDeveloper is solving problems...");
        }
        else {
            System.out.println("JavaDeveloper is reading StackOverFlow...");
        }
    }
}
