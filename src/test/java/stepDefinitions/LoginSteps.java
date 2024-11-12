package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import org.testng.Assert;
import pages.LoginPage;

public class LoginSteps {

    private PageObjectManager pageObjectManager = new PageObjectManager();;
    private LoginPage loginPage;


    public LoginSteps() {

    }

    @Given("I access to the login page")
    public void iAccessToTheLoginPage() {
      loginPage = pageObjectManager.getLoginPage();
      loginPage.navigateToLoginPage();
    }

    @When("I enter a username {}")
    public void iEnterAUsername(String username) {
       loginPage.setUsernameField(username);

    }

    @And("I enter a password {string}")
    public void iEnterAPassword(String password) {
        loginPage.setPasswordField(password);
    }

    @And("I click on login button")
    public void iClickOnLogin() {
        loginPage.clickLoginButton();
    }

    @Then("I verify the alert popup shows a message indicating {string}")
    public void iVerifyAlertMessage(String validationMessage) {
        String validationMessageText = loginPage.getAlertMessageAndAccept();
        Assert.assertEquals(validationMessageText, validationMessage);
    }
}
