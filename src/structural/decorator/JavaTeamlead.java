package structural.decorator;


public class JavaTeamlead extends Decorator {

    public JavaTeamlead(Developer developer) {
        super(developer);
    }

    public String weekReport(){
        return "Week report";
    }

    @Override
    public String doJob() {
        return super.doJob() + " " + weekReport();
    }
}
