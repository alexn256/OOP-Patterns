package structural.decorator;


public class SeniorJavaDeveloper extends Decorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String codeReview(){
        return "Review Java code...";
    }

    @Override
    public String doJob() {
        return super.doJob() + " " + codeReview();
    }
}
