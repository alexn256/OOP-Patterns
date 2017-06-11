package structural.facade;


public class Developer {

    public void doJobBeforeDeadLine(BugTracker bugTracker){
        if(bugTracker.isActiveSprint() == true){
            System.out.println("Developer is solving problems...");
        }
        else {
            System.out.println("Developer is reading StackOverFlow...");
        }
    }
}
