package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class HomePageSteps {
    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);
    @Given("Uygulama acilir")
    public void uygulamaAcilir() {
        homePage.checkLogo();
    }
    @When("Arama motorunda {string} kelimesi aratilir ve ara butonuna tiklanir")
    public void aramaMotorundaKelimesiAratilirVeAraButonunaTiklanir(String product) {
        homePage.getWord(product);
        homePage.searchButton();

    }
}
