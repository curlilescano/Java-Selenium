package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import org.testng.Assert;
import pages.Base.BasePage;
import pages.ContactUsPage;


public class ContactUsSteps {

    private PageObjectManager pageObjectManager = new PageObjectManager();
    private ContactUsPage contactUsPage;

    public ContactUsSteps(ContactUsPage contactUsPage) {
        this.contactUsPage = contactUsPage;
    }

    @Given("I access the webdriver university contact us page")
    public void i_access_the_webdriver_university_contact_us_page() {
        contactUsPage = pageObjectManager.getContactUsPage();
        contactUsPage.navigateToContactUsURL();
    }

    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        contactUsPage = pageObjectManager.getContactUsPage();
        contactUsPage.setFirstNameField("AutoFN" + contactUsPage.generateRandomNumber(5));
    }

    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
        contactUsPage = pageObjectManager.getContactUsPage();
        contactUsPage.setLastNameField("AutoLN" + contactUsPage.generateRandomNumber(5));
    }

    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
        contactUsPage = pageObjectManager.getContactUsPage();
        contactUsPage.setEmailField("AutoEmail" + contactUsPage.generateRandomNumber(5) + "@mail.com");
    }

    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        contactUsPage = pageObjectManager.getContactUsPage();
        contactUsPage.setCommentField("Hello World" + contactUsPage.generateRandomString(15));
    }

    @When("I enter a specific first name {word}")
    public void i_enter_a_specific_first_name(String firstName) {
        contactUsPage = pageObjectManager.getContactUsPage();
        contactUsPage.setFirstNameField(firstName);
    }

    @When("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name(String lastName) {
        contactUsPage = pageObjectManager.getContactUsPage();
        contactUsPage.setLastNameField(lastName);
    }

    @When("I enter a specific email address {word}")
    public void i_enter_a_specific_email_address(String email) {
        contactUsPage = pageObjectManager.getContactUsPage();
        contactUsPage.setEmailField(email);
    }

    @When("I enter a specific comment {string}")
    public void i_enter_a_specific_comment(String comment) {
        contactUsPage = pageObjectManager.getContactUsPage();
        contactUsPage.setCommentField(comment);
    }

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
        contactUsPage = pageObjectManager.getContactUsPage();
        contactUsPage.clickOnSubmitBtn();
    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        contactUsPage = pageObjectManager.getContactUsPage();
        Assert.assertEquals(contactUsPage.getSubmissionMessage(), "Thank You for your Message!");
    }

}
