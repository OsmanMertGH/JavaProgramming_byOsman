package day38_Inheritance.browser;

public class InternetObjects {

    public static void main(String[] args) {

        ChromeBrowser browser1=new ChromeBrowser();

        browser1.openBrowser();
        browser1.closeBrowser();

        Safari browser2=new Safari();
        browser2.openBrowser();
        browser2.closeBrowser();

    }
}
