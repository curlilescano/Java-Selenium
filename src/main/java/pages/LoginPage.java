package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Base.BasePage;
import utils.GlobalVars;

public class LoginPage extends BasePage {

    @FindBy(id = "text")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginBtn;

    public LoginPage() {
        super();
    }

    public void navigateToLoginPage() {
        navigateToURL(GlobalVars.LOGIN_URL);
    }

    public void setUsernameField(String username) {
        sendKeys(usernameField, username);
    }

    public void setPasswordField(String password) {
        sendKeys(passwordField, password);
    }

    public void clickLoginButton() {
       waitAndClick(loginBtn);
    }

}
