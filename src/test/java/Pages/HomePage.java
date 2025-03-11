package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utilities.CommonActions;

public class HomePage {
    private WebDriver driver;
    private CommonActions actions;

    private By searchBox = By.cssSelector("input[placeholder='Search for Products, Brands and More']");
    private By searchButton = By.xpath("//button[@type='submit']");
    
    public HomePage(WebDriver driver, CommonActions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    public void searchProduct(String productName) {
        actions.enterText(searchBox, productName);
        actions.click(searchButton);
    }
}
