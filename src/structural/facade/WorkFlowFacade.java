package structural.facade;


public class WorkFlowFacade {

    private Job job = new Job();
    private BugTracker bugTracker = new BugTracker();
    private Developer developer = new Developer();

    public void solveProblems(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadLine(bugTracker);
    }
}
