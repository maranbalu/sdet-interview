import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InterviewTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Chrome options for Gitpod environment
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");
        // NOT using --headless so browser is visible in noVNC

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Test
    public void testGoogleSearch() throws InterruptedException {
        System.out.println("🚀 Opening Google...");
        driver.get("https://www.google.com");

        System.out.println("📄 Page Title: " + driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Google"));

        // Keep browser open for 10 seconds so you can see it
        System.out.println("✅ Test Passed! Browser will stay open for 10 seconds...");
        Thread.sleep(10000);
    }

    @Test
    public void testAmazon() throws InterruptedException {
        System.out.println("🚀 Opening Amazon...");
        driver.get("https://www.amazon.com");

        System.out.println("📄 Page Title: " + driver.getTitle());

        System.out.println("✅ Browser visible for 10 seconds...");
        Thread.sleep(10000);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            System.out.println("🔴 Closing browser...");
            driver.quit();
        }
    }
}
