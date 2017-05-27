package creational.builder;


public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new VisitCardWebSiteBuilder());

        System.out.println(director.buildWebSite());
    }
}
