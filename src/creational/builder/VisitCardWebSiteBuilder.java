package creational.builder;


public class VisitCardWebSiteBuilder extends SiteBuilder{


    @Override
    public void buildName() {
        webSite.setName("VisitCard WebSite");
    }

    @Override
    public void buildPrice() {
        webSite.setPrice(500);
    }

    @Override
    public void buildCms() {
        webSite.setCms(Cms.WORDPRESS);
    }
}
