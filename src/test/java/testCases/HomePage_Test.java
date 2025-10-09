package testCases;

import baseClass.BrowserActions;
import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.*;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.regex.*;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class HomePage_Test extends BrowserActions {


    @BeforeMethod
    public void openingBrowser() {
        browserOpen();
    }

    @AfterMethod(enabled = false)
    public void closingBrowser() {
        browserClose();
    }

    @Test
    public void Request_a_Demo_Test() throws InterruptedException { // positive scenario
        clickable(".//span[text()='Request a Demo']");
        typingToText_id("nameModern", "Test");
        typingToText_id("finalEmailModern", "navamitaghosh30@gmail.com");
        typingToText_id("mobile_code", "8788473203");
        WebElement BusinessType_dropdown = driver.findElement(By.id("employeeModern"));
        Select BusinessType = new Select(BusinessType_dropdown);
        BusinessType.selectByIndex(1);
        typingToText_id("propertyModern", "Test");
        WebElement Number_Of_Rooms_dropdown = driver.findElement(By.id("roomsModern"));
        Select Number_Of_Rooms = new Select(Number_Of_Rooms_dropdown);
        Number_Of_Rooms.selectByValue("100");
        clickable("//*[@id=\"step3-form-modern\"]/div[6]/div[1]/div/input[2]");
        clickable("/html/body/div[4]/div[2]/div/div[2]/div/span[19]");
        typingToText_id("timeModern", "1111");
        clickable(".//button[text()='Submit']");
    }

    @Test
    public void Talk_To_us_Test() { // positive scenario
        clickable(".//span[text()='Talk to Us']");
        typingToText_name("first_name", "first");
        typingToText_name("last_name", "last");
        typingToText_name("work_email", "work@gmail.com");
        typingToText_name("company_name", "ABC");
        typingToText_name("message", "Hi, This is a Test!");
        clickable(".//button[@class='btn btn-primary rounded-2 px-4']");
    }

    @Test
    public void Syncinns_AI_Test() { // positive scenario
        clickable(".//a[text()='Syncinns AI']");
        clickable(".//a[text()='Upgrade with AI']");
        typingToText_id("nameModern", "Test");
        typingToText_id("finalEmailModern", "navamitaghosh30@gmail.com");
        typingToText_id("mobile_code", "8788473203");
        WebElement BusinessType_dropdown = driver.findElement(By.id("employeeModern"));
        Select BusinessType = new Select(BusinessType_dropdown);
        BusinessType.selectByIndex(1);
        typingToText_id("propertyModern", "Test");
        WebElement Number_Of_Rooms_dropdown = driver.findElement(By.id("roomsModern"));
        Select Number_Of_Rooms = new Select(Number_Of_Rooms_dropdown);
        Number_Of_Rooms.selectByValue("100");
        clickable("//*[@id=\"step3-form-modern\"]/div[6]/div[1]/div/input[2]");
        clickable("/html/body/div[4]/div[2]/div/div[2]/div/span[19]");
        typingToText_id("timeModern", "1111");
        clickable(".//button[text()='Submit']");
    }

    @Test
    public void Solution_For_Hoteliers_Test() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement solution = driver.findElement(By.xpath(".//a[text()='Solution']"));
        WebElement Hoteliers = driver.findElement(By.xpath(".//div[text()='For Hoteliers']"));
        Actions action = new Actions(driver);
        action.moveToElement(solution).click(Hoteliers).build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scrolldown = driver.findElement(By.xpath(".//h5[text()='Help us with your details']"));
        js.executeScript("arguments[0].scrollIntoView();", scrolldown);
        Thread.sleep(2000);
        typingToText_name("first_name", "first");
        Thread.sleep(2000);
        typingToText_name("last_name", "last");
        Thread.sleep(2000);
        typingToText_name("email", "work@gmail.com");
        typingToText_id("mobile_code", "8788473203");
        typingToText_id("businessName", "business");
        typingToText_id("businessEmail", "business@gmail.com");
        typingToText_id("newmobile_code", "8788473203");
        typingToText_id("location", "Kolkata");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement checkbox = driver.findElement(By.name("terms"));
        checkbox.click();
        System.out.println(checkbox.isSelected());
        clickable(".//button[@class='btn common-bgBtn w-100 text-center align-items-center justify-content-center nesubbtn']");
    }

    @Test
    public void Solution_For_Transporters_Test() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement solution = driver.findElement(By.xpath(".//a[text()='Solution']"));
        WebElement Transporters = driver.findElement(By.xpath(".//div[text()='For Transporters']"));
        Actions action = new Actions(driver);
        action.moveToElement(solution).click(Transporters).build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scrolldown = driver.findElement(By.xpath(".//h5[text()='Help us with your details']"));
        js.executeScript("arguments[0].scrollIntoView();", scrolldown);
        Thread.sleep(2000);
        typingToText_name("first_name", "first");
        Thread.sleep(2000);
        typingToText_name("last_name", "last");
        Thread.sleep(2000);
        typingToText_name("email", "work@gmail.com");
        typingToText_id("mobile_code", "8788473203");
        typingToText_id("businessName", "business");
        typingToText_id("businessEmail", "business@gmail.com");
        typingToText_id("newmobile_code", "8788473203");
        typingToText_id("location", "Kolkata");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement checkbox = driver.findElement(By.name("terms"));
        checkbox.click();
        System.out.println(checkbox.isSelected());
        clickable(".//button[@class='btn common-bgBtn w-100 text-center align-items-center justify-content-center nesubbtn']");
    }

    @Test
    public void Solution_For_Reservation_Agencies_Test() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement solution = driver.findElement(By.xpath(".//a[text()='Solution']"));
        WebElement ReservationAgencies = driver.findElement(By.xpath(".//div[text()='For Reservation Agencies']"));
        Actions action = new Actions(driver);
        action.moveToElement(solution).click(ReservationAgencies).build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scrolldown = driver.findElement(By.xpath(".//h5[text()='Help us with your details']"));
        js.executeScript("arguments[0].scrollIntoView();", scrolldown);
        Thread.sleep(2000);
        typingToText_name("first_name", "first");
        Thread.sleep(2000);
        typingToText_name("last_name", "last");
        Thread.sleep(2000);
        typingToText_name("email", "work@gmail.com");
        typingToText_id("mobile_code", "8788473203");
        typingToText_id("businessName", "business");
        typingToText_id("businessEmail", "business@gmail.com");
        typingToText_id("newmobile_code", "8788473203");
        typingToText_id("location", "Kolkata");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement checkbox = driver.findElement(By.name("terms"));
        checkbox.click();
        System.out.println(checkbox.isSelected());
        clickable(".//button[@class='btn common-bgBtn w-100 text-center align-items-center justify-content-center nesubbtn']");
    }

    @Test
    public void Solution_For_Travel_Companies_Test() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement solution = driver.findElement(By.xpath(".//a[text()='Solution']"));
        WebElement TravelAgencies = driver.findElement(By.xpath(".//div[text()='For Travel Companies']"));
        Actions action = new Actions(driver);
        action.moveToElement(solution).click(TravelAgencies).build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scrolldown = driver.findElement(By.xpath(".//h5[text()='Help us with your details']"));
        js.executeScript("arguments[0].scrollIntoView();", scrolldown);
        Thread.sleep(2000);
        typingToText_name("first_name", "first");
        Thread.sleep(2000);
        typingToText_name("last_name", "last");
        Thread.sleep(2000);
        typingToText_name("email", "work@gmail.com");
        typingToText_id("mobile_code", "8788473203");
        typingToText_id("businessName", "business");
        typingToText_id("businessEmail", "business@gmail.com");
        typingToText_id("newmobile_code", "8788473203");
        typingToText_id("location", "Kolkata");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement checkbox = driver.findElement(By.name("terms"));
        checkbox.click();
        System.out.println(checkbox.isSelected());
        clickable(".//button[@class='btn common-bgBtn w-100 text-center align-items-center justify-content-center nesubbtn']");
    }

    @Test
    public void Solution_For_Travel_Hubs_Test() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement solution = driver.findElement(By.xpath(".//a[text()='Solution']"));
        WebElement TravelHubs = driver.findElement(By.xpath(".//div[text()='For Travel Hubs']"));
        Actions action = new Actions(driver);
        action.moveToElement(solution).click(TravelHubs).build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scrolldown = driver.findElement(By.xpath(".//h5[text()='Help us with your details']"));
        js.executeScript("arguments[0].scrollIntoView();", scrolldown);
        Thread.sleep(2000);
        typingToText_name("first_name", "first");
        Thread.sleep(2000);
        typingToText_name("last_name", "last");
        Thread.sleep(2000);
        typingToText_name("email", "work@gmail.com");
        typingToText_id("mobile_code", "8788473203");
        typingToText_id("businessName", "business");
        typingToText_id("businessEmail", "business@gmail.com");
        typingToText_id("newmobile_code", "8788473203");
        typingToText_id("location", "Kolkata");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement checkbox = driver.findElement(By.name("terms"));
        Thread.sleep(2000);
        checkbox.click();
        System.out.println(checkbox.isSelected());
        clickable(".//button[@class='btn common-bgBtn w-100 text-center align-items-center justify-content-center nesubbtn']");
    }

    @Test
    public void Pricing_Test() throws MailosaurException, IOException, InterruptedException { //issue
        clickable(".//a[text()='Pricing']");
        clickable(".//a[@href='https://www.syncinns.com/for-hotel-pricing']");
        clickable(".//a[@href='https://www.syncinns.com/hotel-pricing-qoute']");
        typingToText_id("emailModern", "air-lunch@ctwouvya.mailosaur.net");
        clickable(".//button[@class='btn common-bgBtn w-100 text-center align-items-center justify-content-center']");
        Thread.sleep(2000);
        clickable(".//button[@class='btn common-bgBtn w-100 text-center align-items-center justify-content-center']");
        typingToText_id("nameModern", "name");
        typingToText_id("finalEmailModern", "email@gmail.com");
        typingToText_id("phoneModern", "phone");
        WebElement BusinessType_dropdown = driver.findElement(By.id("employeeModern"));
        Select BusinessType = new Select(BusinessType_dropdown);
        BusinessType.selectByIndex(1);
        typingToText_id("propertyModern", "Test");
        WebElement Number_Of_Rooms_dropdown = driver.findElement(By.id("roomsModern"));
        Select Number_Of_Rooms = new Select(Number_Of_Rooms_dropdown);
        Number_Of_Rooms.selectByVisibleText("51 - 100");
        Thread.sleep(2000);
        clickable("//*[@id=\"step3-form-modern\"]/div[6]/div[1]/div/input[2]");
        Thread.sleep(2000);
        clickable("/html/body/div[4]/div[2]/div/div[2]/div/span[32]");
        typingToText_id("timeModern", "1111");
        clickable(".//button[text()='Submit']");
    }

    @Test
    //Partner with Us-->List your Property
    public void Partner_With_Us_Test() throws Exception {
        clickable(".//a[@href='https://www.syncinns.com/partner-with-us']");
        clickable(".//a[@href='https://www.syncinns.com/list-your-property']");
        clickable(".//a[@href='https://www.syncinns.com/registration']");
        typingToText_name("name", "Testing");
        typingToText_name("email", "air-lunch@ctwouvya.mailosaur.net");
        typingToText_id("mobile_code", "8788473203");
        Thread.sleep(2000);
        clickable(".//button[@class='registation_button']");
        Thread.sleep(20000);
        clickable(".//button[text()='proceed']");
        //submit button need to add and before that wait have to put because OTP will be placed manually as OTP fetch is not succeeding

        Thread.sleep(2000);
        clickable(".//h6[text()='Hotel']");
        clickable(".//button[text()='Next']");

        WebElement searchbox = driver.findElement(By.id("address"));
        Actions actions = new Actions(driver);
        actions.moveToElement(searchbox).click().sendKeys("Ganeshkhind Rd, Ganeshkhind, Pune, Maharashtra 411007, India");


        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).sendKeys(Keys.BACK_SPACE).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

        typingToText_name("apartment_floor", "3");
        Thread.sleep(2000);
        typingToText_name("zip_code", "411007");
        Thread.sleep(2000);
        clickable("//*[@id=\"pane-2\"]/div/div[1]/div/div[3]/button[2]");

        typingToText_name("property_name", "Testing");
        Thread.sleep(2000);
//       WebElement star = driver.findElement(By.cssSelector("input[name ='star_rating'],[value ='5']"));
//       star.click();

//        List<WebElement> stars = driver.findElements(By.cssSelector("input[name='star_rating']"));
//        stars.get(2).click();  // 0-based index: this clicks the 3rd star
        WebElement star = driver.findElement(By.xpath("//*[@id=\"pane-3\"]/div/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/label[3]/input"));
        star.click();


    }

}








