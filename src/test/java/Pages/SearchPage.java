package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
    static By warning = By.className("result-mean-word");
    static By firstProduct = By.cssSelector("[href=\"https://www.n11.com/telefon-ve-aksesuarlari?q=ayfone\"]");
    static By cartButton = By.cssSelector(".product-add-cart");
    static WebDriver driver;
    static WebDriverWait wait;

    public SearchPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);

    }

    public static void checkWarning(){
       // wait.until(ExpectedConditions.visibilityOf(driver.findElement(warning)));
       // driver.findElement(warning);
    }

    public static void selectProduct(){
//        wait.until(ExpectedConditions.presenceOfElementLocated(firstProduct));
        driver.findElement(firstProduct).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(firstProduct));
        driver.findElement(cartButton).click();

        driver.navigate().back();

    }


}
