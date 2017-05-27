package creational.builder;


public class Director {

    private SiteBuilder builder;

    public void setBuilder(SiteBuilder builder) {
        this.builder = builder;
    }

    WebSite buildWebSite(){
        builder.createWebSite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();
        return builder.getWebSite();
    }

}
