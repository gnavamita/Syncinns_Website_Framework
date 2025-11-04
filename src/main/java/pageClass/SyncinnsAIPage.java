package pageClass;

import baseClass.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static baseClass.BrowserSetUp.driver;

public class SyncinnsAIPage {
    BrowserActions browserActions = new BrowserActions();

    public void Syncinns_AI(String name, String email, String mobilenumber, String businessname, String date, String time) throws InterruptedException {
        browserActions.typingToText_id("nameModern", name);
        browserActions.typingToText_id("finalEmailModern", email);
        browserActions.typingToText_id("mobile_code", mobilenumber);
        WebElement BusinessType_dropdown = driver.findElement(By.id("employeeModern"));
        Select BusinessType = new Select(BusinessType_dropdown);
        BusinessType.selectByIndex(1);
        browserActions.typingToText_id("propertyModern", businessname);
        //WebElement Number_Of_Rooms_dropdown = driver.findElement(By.id("roomsModern"));
        //Select Number_Of_Rooms = new Select(Number_Of_Rooms_dropdown);
        //Number_Of_Rooms.selectByValue("100");
        Thread.sleep(2000);
        browserActions.typingToText_xpath("//*[@id=\"step3-form-modern\"]/div[6]/div[1]/div/input[2]", date);
        browserActions.typingToText_xpath(".//input[@id='timeModern' and @name='time']", time);
    }

}
