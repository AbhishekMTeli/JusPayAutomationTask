package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.CommonActions;

public class ProductPage {
    private WebDriver driver;
    private CommonActions actions;

    private By productLink = By.xpath("//img[@alt='JBL Wave Beam TWS, 32Hr Playtime, IP54, Smart Ambient & TalkThru Mode, App Bluetooth']");
    private By addToCartButton = By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']");

    public ProductPage(WebDriver driver, CommonActions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    public void selectProduct() {
        actions.click(productLink);
        actions.switchToNewTab();
    }

    public void addToCart() {
        actions.click(addToCartButton);
    }
}
