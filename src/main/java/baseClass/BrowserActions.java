package baseClass;

import org.openqa.selenium.By;

public class BrowserActions extends BrowserSetUp {

    public void clickable(String locators) {
        driver.findElement(By.xpath(locators)).click();
    }

    public void typingToText_id(String locators, String texts) {
        driver.findElement(By.id(locators)).sendKeys(texts);
    }

       public void typingToText_xpath(String locators, String texts) {
        driver.findElement(By.xpath(locators)).sendKeys(texts);
    }

    public void typingToText_name(String locators, String texts) {
        driver.findElement(By.name(locators)).sendKeys(texts);
    }

}
