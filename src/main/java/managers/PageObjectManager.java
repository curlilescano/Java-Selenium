package managers;

import pages.*;

public class PageObjectManager {

    private LoginPage loginPage;
    private ContactUsPage contactUsPage;

    public PageObjectManager() {
    }

    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
    }

    public ContactUsPage getContactUsPage() {
        return (contactUsPage == null) ? contactUsPage = new ContactUsPage() : contactUsPage;
    }


}
