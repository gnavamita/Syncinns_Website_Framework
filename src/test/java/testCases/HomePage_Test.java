package testCases;

import HomePage.RequestADemo_Form;
import baseClass.BrowserActions;
import com.mailosaur.models.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.regex.*;
import java.time.Duration;

public class HomePage_Test extends BrowserActions {
    RequestADemo_Form requestADemoForm = new RequestADemo_Form();

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
        requestADemoForm.click_On_Request_A_Demo_Button();
        requestADemoForm.Fill_Book_A_Free_Demo_Form("Test","navamitaghosh30@gmail.com","8788473203","Hotelier","Test","100","October 29, 2025","1111");
        requestADemoForm.click_On_SUbmit_Button();
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
    public void Syncinns_AI_Test() throws InterruptedException { // positive scenario
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
        Thread.sleep(2000);
        typingToText_xpath(" //*[@id=\"step3-form-modern\"]/div[6]/div[1]/div/input[2]", "October 29, 2025");
        typingToText_xpath(".//input[@id='timeModern' and @name='time']", "1111");
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
    public void Pricing_Test() throws InterruptedException { //issue
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
        typingToText_xpath("//*[@id=\"step3-form-modern\"]/div[6]/div[1]/div/input[2]", "October 29, 2025");
        typingToText_xpath(".//input[@id='timeModern' and @name='time']", "1111");
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
        //Manually OTP captured by user and proceed then button is automated

        clickable(".//button[text()='proceed']");


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
        //what’s the star rating of your Property?

        clickable(".//label[@class='wizard-star-rating' and input[@value='3']]//i");

        Thread.sleep(2000);
        // are you a property management company or part of a group?*
        WebElement radioVisual = driver.findElement(By.xpath("//input[@value='yes']/following-sibling::span[contains(@class, 'wizard-form-radio-mark')] "));
        radioVisual.click();
        Thread.sleep(2000);
        //  Next button
        clickable("//*[@id=\"pane-3\"]//button[contains(@class, \"wizard-btn-next\")]");

        //Facilities at your property
        clickable(".//input[@name ='facilities[]']/following-sibling::span[@class='wizard-facility-list-item']");

        Thread.sleep(4000);
        clickable("//*[@id=\"pane-4\"]//button[contains(@class, 'wizard-btn-next')]");

        //Amenities at your property
        Thread.sleep(2000);
        clickable("//*[@id=\"pane-5\"]/div/div[1]/div/div[2]/div/div/div/div/ul/li[11]/div/label/span[1]");
        //Next button
        clickable("//*[@id=\"pane-5\"]//button[contains(@class, \"wizard-btn-next\")]");
        //Guest Policies
        //check-in Time
        driver.findElement(By.name("check_in_time")).click();
        Thread.sleep(2000);
        WebElement check_in_Time = driver.findElement(By.xpath(".//input[@class='numInput flatpickr-hour']"));
        Actions time = new Actions(driver);
        time.moveToElement(check_in_Time).sendKeys("01").sendKeys(Keys.TAB).sendKeys("01").sendKeys(Keys.ENTER).build().perform();
        //check-OUT TIME
        driver.findElement(By.name("check_out_time")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //WebElement check_Out_Time = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div//div[(@class='flatpickr-calendar hasTime noCalendar animate arrowLeft arrowTop open')]//div[contains(@class, 'flatpickr-time')]//div[@class='numInputWrapper']/input[@class='numInput flatpickr-hour']")));
        WebElement check_Out_Time = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/div[1]/input")));
        time.moveToElement(check_Out_Time).sendKeys("02").sendKeys(Keys.TAB).sendKeys("02").sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(10000);
        WebElement Pet_Allowed = driver.findElement(By.xpath(".//input[@name='pet_allowed' and @value='yes']/following-sibling::span[@class='wizard-form-radio-mark']"));
        Pet_Allowed.click();
        WebElement staff_speak = driver.findElement(By.xpath(".//input[@name='staff_language[]' and @value='others']/following-sibling::span[text()='Others']"));
        staff_speak.click();
        clickable(".//*[@id=\"pane-6\"]//button[@class='wizard-btn-next']");
        Thread.sleep(2000);
        //Accommodation Details
        clickable(".//*[@id=\"pane-7\"]//span[contains(text(),'Queen size bedroom')]");
        Thread.sleep(2000);
        typingToText_xpath("//*[@id=\"pane-7\"]//input[@name='rooms[0][no_of_bed]']", "100");

        //*[@id="pane-7"]/div/div/div/div[3]/div/div/div/div/div[1]/div[2]/div/div/div[1]/input
        typingToText_xpath("//*[@id=\"pane-7\"]//input[@name='rooms[0][guest_capacity]']", "100");
        WebElement Room_View = driver.findElement(By.xpath(".//*[@id=\"pane-7\"]//select[@name='rooms[0][room_view]']"));
        Select select_view = new Select(Room_View);
        select_view.selectByVisibleText("sea View");
        typingToText_xpath(".//input[@class='price-display-value is-valid' and @name='rooms[0][stock]']", "100");
        typingToText_xpath(".//input[@class='price-display-value is-valid' and @name ='rooms[0][swd_cost]']", "120");
        typingToText_xpath(".//input[@class='price-display-value is-valid' and @name ='rooms[0][swe_cost]']", "120");
        //Next button
        clickable("//*[@id=\"pane-7\"]//button[@class='wizard-btn-next']");
        Thread.sleep(20000);
        clickable("//*[@id=\"pane-8\"]//button[@class='wizard-btn-next']");
        typingToText_name("referral_code", "Ref1234");
        //submit button
        clickable(".//*[@id=\"pane-9\"]//button[@class='wizard-btn-next']");


    }

}




