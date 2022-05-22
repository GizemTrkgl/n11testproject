package StepDefinitions;

import Pages.HomePage;
import Pages.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class SearchPageSteps {
    
    @Then("Aranan kelimenin duzeltildigi ve sonuclarin ona gore geldigi gorulur")
    public void arananKelimeninDuzeltildigiVeSonuclarinOnaGoreGeldigiGorulur() {
        SearchPage.checkWarning();
    }

   /* @When("Ilk sayfadaki {int}. ve sonuncu urun ve {int}. sayfadaki {int}. urun secilir")
    public void ılkSayfadakiVeSonuncuUrunVeSayfadakiUrunSecilir(int arg0, int arg1, int arg2) {
        SearchPage.selectProduct();


    }*/

    @When("Ilk sayfadaki birinci urun secilir")
    public void ılkSayfadakiBirinciUrunSecilir() {
        SearchPage.selectProduct();
    }
}
