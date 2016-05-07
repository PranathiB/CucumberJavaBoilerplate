package features.steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.UserLoginDetails;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class ClearTripLoginSteps {
    LoginPage loginPage;
    WebDriver driver;
    WebDriverWait wait;

    public ClearTripLoginSteps() {
        driver = DriverHooks.driver;
        wait = DriverHooks.wait;
        loginPage = new LoginPage(driver );
    }

    @Given("^I am on cleartrip login page$")
    public void iAmOnCleartripLoginPage() throws Throwable {
        loginPage.open();
    }

    @When("^I enter invalid credentials$")
    public void iEnterInvalidCredentials() throws Throwable {
        loginPage.fillDetails(UserLoginDetails.INVALID_USER_DETAILS);
        loginPage.clickLogin();
    }

    @Then("^I should see a error message$")
    public void iShouldSeeAErrorMessage() throws Throwable {
        loginPage.assertIsShowingLoginError();
    }
}
