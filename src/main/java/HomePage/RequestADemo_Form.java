package HomePage;

import baseClass.BrowserActions;
import baseClass.BrowserSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RequestADemo_Form extends BrowserSetUp {
BrowserActions browserActions = new BrowserActions();

    public void click_On_Request_A_Demo_Button(){
        browserActions.clickable(".//span[text()='Request a Demo']");
    }

    public void Fill_Book_A_Free_Demo_Form(String FullName, String Email, String PhoneNumber, String BusinessType, String BusinessName, String NumberOfRooms, String Date, String Time){
        browserActions.typingToText_id("nameModern", FullName);
        browserActions.typingToText_id("finalEmailModern", Email);
        browserActions.typingToText_id("mobile_code", PhoneNumber);
        WebElement BusinessType_dropdown = driver.findElement(By.id("employeeModern"));
        Select businessType = new Select(BusinessType_dropdown);
        businessType.selectByVisibleText(BusinessType);
        browserActions.typingToText_id("propertyModern", BusinessName);
        WebElement Number_Of_Rooms_dropdown = driver.findElement(By.id("roomsModern"));
        Select Number_Of_Rooms = new Select(Number_Of_Rooms_dropdown);
        Number_Of_Rooms.selectByValue(NumberOfRooms);
        browserActions.typingToText_xpath(".//*[@id=\"step3-form-modern\"]/div[6]/div[1]/div/input[2]", Date);
        browserActions.typingToText_xpath(".//input[@id='timeModern' and @name='time']", Time);
    }

    public void click_On_SUbmit_Button(){
        browserActions.clickable(".//button[text()='Submit']");
    }
}
