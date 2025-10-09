package baseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetUp {
    public WebDriver driver;

    public void browserOpen() {
        WebDriverManager.chromedriver().setup();
    //    WebDriverManager.firefoxdriver().setup();
    //    driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syncinns.com/");

    }

    public void browserClose() {
        driver.close();
    }
}
