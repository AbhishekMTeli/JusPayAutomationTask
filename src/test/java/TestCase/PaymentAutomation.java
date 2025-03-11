package TestCase;

import Base.BasicConfiguration;
import Pages.HomePage;
import Pages.ProductPage;
import Pages.PaymentPage;
import Utilities.CommonActions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PaymentAutomation extends BasicConfiguration {
    private HomePage homePage;
    private ProductPage productPage;
    private PaymentPage paymentPage;
    private CommonActions actions;

    @BeforeClass
    public void setUpTest() {
        setup();
        actions = new CommonActions(driver, wait);
        homePage = new HomePage(driver, actions);
        productPage = new ProductPage(driver, actions);
        paymentPage = new PaymentPage(driver, actions);
    }

    @Test
    public void testPaymentAutomation() {
        homePage.searchProduct("JBL");
        productPage.selectProduct();
        productPage.addToCart();
        paymentPage.proceedToPayment("9986102846");
        paymentPage.enterCardDetails("123456789");
    }

    @AfterClass
    public void tearDownTest() {
        teardown();
    }
}
