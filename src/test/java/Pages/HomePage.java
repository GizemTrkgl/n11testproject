package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    By logo = By.cssSelector(".logo.home");

    By search = By.id("searchData");

    By button = By.cssSelector(".searchBtn");
    WebDriver driver;
    WebDriverWait wait;
    public HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);

    }
    public void checkLogo(){
        driver.findElement(logo);
        wait.until(ExpectedConditions.presenceOfElementLocated(logo));
    }


    public void getWord(String product){
        driver.findElement(search).sendKeys(product);
    }
    public void searchButton(){
        driver.findElement(button).click();
    }
}
