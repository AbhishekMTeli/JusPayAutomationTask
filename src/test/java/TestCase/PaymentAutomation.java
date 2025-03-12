package TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.BasicConfiguration;
import Pages.HomePage;
import Pages.PaymentPage;
import Pages.ProductPage;
import Utilities.CommonActions;

public class PaymentAutomation extends BasicConfiguration {
    private HomePage homePage;
    private ProductPage productPage;
    private PaymentPage paymentPage;
    private CommonActions actions;

    @BeforeClass
    public void setUpTest() {
    	setup2();
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
        paymentPage.otp_pass("998610");
       // paymentPage.enterCardDetails("123456789");
    }

    @AfterClass
    public void tearDownTest() {
        teardown();
    }
}
