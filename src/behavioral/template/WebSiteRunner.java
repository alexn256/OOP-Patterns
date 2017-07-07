package behavioral.template;


public class WebSiteRunner {
    public static void main(String[] args) {
        WebSitePage welcomePage = new WelcomePage();
        WebSitePage newsPage = new NewsPage();

        welcomePage.showPage();
        System.out.println("\n====================================\n");
        newsPage.showPage();
    }
}
