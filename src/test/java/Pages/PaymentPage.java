package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utilities.CommonActions;

public class PaymentPage {
    private WebDriver driver;
    private CommonActions actions;

    private By proceedToCheckout = By.xpath("//button[@class='QqFHMw zA2EfJ _7Pd1Fp']");
    private By phoneInput = By.xpath("//input[@type='text']");
    private By continueButton = By.xpath("//button[@type='submit']");
    private By creditCardOption = By.xpath("//label[@for='CREDIT']//div[@class='qsHXPi']");
    private By cardNumberField = By.xpath("//input[@name='cardNumber']");

    public PaymentPage(WebDriver driver, CommonActions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    public void proceedToPayment(String phoneNumber) {
        actions.click(proceedToCheckout);
        actions.enterText(phoneInput, phoneNumber);
        actions.click(continueButton);
    }

    public void enterCardDetails(String cardNumber) {
        actions.click(creditCardOption);
        actions.enterText(cardNumberField, cardNumber);
    }
}
