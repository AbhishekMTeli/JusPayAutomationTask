package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasicConfiguration {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.flipkart.com/");
    }

    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
