package creational.builder;


public abstract class SiteBuilder {

    WebSite webSite;

    public void createWebSite(){
        webSite = new WebSite();
    }

    public abstract void buildName();

    public abstract void buildPrice();

    public abstract void buildCms();

    public WebSite getWebSite(){
        return webSite;
    }

}
