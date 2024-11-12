package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Base.BasePage;
import utils.GlobalVars;

public class ContactUsPage extends BasePage {

    @FindBy(xpath = "//input[@name='first_name']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@name=\"last_name\"]")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@name=\"email\"]")
    private WebElement emailField;

    @FindBy(xpath = "//textarea[@name=\"message\"]")
    private WebElement commentField;

    @FindBy(xpath = "//input[@value=\"SUBMIT\"]")
    private WebElement submitBtn;

    @FindBy(xpath = "//div[@id='contact_reply']/h1")
    private WebElement submissionMessage;

    public ContactUsPage () {
        super();
    }

    public void navigateToContactUsURL() {
        navigateToURL(GlobalVars.CONTACT_US_URL);
    }

    public void setFirstNameField(String text) {
        sendKeys(firstNameField, text);
    }

    public void setLastNameField(String text) {
        sendKeys(lastNameField, text);
    }

    public void setEmailField(String text) {
        sendKeys(emailField, text);
    }

    public void setCommentField(String text) {
        sendKeys(commentField, text);
    }

    public void clickOnSubmitBtn() {
        waitAndClick(submitBtn);
    }

    public String getSubmissionMessage() {
        return submissionMessage.getText();
    }

}
