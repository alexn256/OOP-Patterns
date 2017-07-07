package behavioral.template;


public abstract class WebSitePage {

    public void showPage(){
        System.out.println("show header");
        body();
        System.out.println("show footer");
    }

    public abstract void body();
}
