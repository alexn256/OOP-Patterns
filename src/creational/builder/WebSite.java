package creational.builder;


public class WebSite {

    private int price;
    private Cms cms;
    private String name;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCms(Cms cms) {
        this.cms = cms;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "price=" + price +
                ", cms=" + cms +
                ", name='" + name + '\'' +
                '}';
    }
}
