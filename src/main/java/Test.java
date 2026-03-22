import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class Test {

    @Test
    public void openGoogle() {

        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://www.google.com");

        // Print message
        System.out.println("Opened Google successfully");

        // Close browser
        driver.quit();
    }
}
