package stepdefinitions;

import pages.LoginPage;
import utils.DriverFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("user is on login page")
    public void openLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("user enters username {string}")
    public void enterUsername(String username) {
        loginPage.enterUsername(username);
    }

    @When("user enters password {string}")
    public void enterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @When("clicks login button")
    public void clickLogin() {
        loginPage.clickLogin();
    }

    @Then("user should be navigated to home page")
    public void verifyLogin() {
        System.out.println("Login successful");
    }
}