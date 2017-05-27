package creational.builder;


public class EnterpriseWebSiteBuilder extends SiteBuilder{

    @Override
    public void buildName() {
        webSite.setName("Enterprise WebSite");
    }

    @Override
    public void buildPrice() {
        webSite.setPrice(10000);
    }

    @Override
    public void buildCms() {
        webSite.setCms(Cms.ALFRESCO);
    }
}
