package testCases;

import baseClass.BrowserActions;
import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.*;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.regex.*;
import java.io.IOException;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;


public class OTP extends BrowserActions {
    @BeforeMethod
    public void openingBrowser() {
        browserOpen();
    }

    @Test
    public void email_OTP_Fetch() throws MailosaurException, IOException, InterruptedException {
        clickable(".//a[@href='https://www.syncinns.com/partner-with-us']");
        clickable(".//a[@href='https://www.syncinns.com/list-your-property']");
        clickable(".//a[@href='https://www.syncinns.com/registration']");
        typingToText_name("name", "Testing");
        typingToText_name("email", "air-lunch@ctwouvya.mailosaur.net");
        typingToText_id("mobile_code", "8788473203");
        Thread.sleep(2000);
        clickable(".//button[@class='registation_button']");

        String apiKey = "uKqJZjI5mfh6OkDJdcJIlZBTulDaiTkI";
        String serverId = "ctwouvya";
        String serverDomain = "ctwouvya.mailosaur.net";

        MailosaurClient mailosaur = new MailosaurClient(apiKey);

        MessageSearchParams params = new MessageSearchParams();
        params.withServer(serverId);
      //  params.withReceivedAfter();


        // Mark the time *just before* you click the registration button
//        Instant formSubmitTime = Instant.now();
//        clickable(".//button[@class='registation_button']");

// THEN use that time to restrict search
        //params.withReceivedAfter(Date.from(formSubmitTime));


        SearchCriteria criteria = new SearchCriteria();
        criteria.withSentTo("air-lunch@SERVER_ID.mailosaur.net");

        Thread.sleep(20000);

        Message message = mailosaur.messages().get(params,criteria);


        assertNotNull(message);
        assertEquals("Your OTP for Demo Scheduling", message.subject());


        System.out.println(message.subject());
        System.out.println(message.to().get(0).email());
        System.out.println(message.from().get(0).email());

    }
}






//String apiKey = "uKqJZjI5mfh6OkDJdcJIlZBTulDaiTkI";
//String serverId = "ctwouvya";
//String serverDomain = "ctwouvya.mailosaur.net";
//
//MailosaurClient mailosaur = new MailosaurClient(apiKey);
//
//MessageSearchParams params = new MessageSearchParams();
//        params.withServer(serverId);
//
////        Instant tenMinutesAgo = Instant.now().minusSeconds(600); // 600 seconds = 10 minutes
////        params.withReceivedAfter(Date.from(tenMinutesAgo));
//
//// Mark the time *just before* you click the registration button
//Instant formSubmitTime = Instant.now();
//clickable(".//button[@class='registation_button']");
//
//// THEN use that time to restrict search
//        params.withReceivedAfter(Date.from(formSubmitTime));
//
//SearchCriteria criteria = new SearchCriteria();
//        criteria.withSentTo("air-lunch@" + serverDomain);
//
//
//        Thread.sleep(20000);
//
//Message message = mailosaur.messages().get(serverId, criteria);
//
//
//
//assertNotNull(message);
//assertEquals("Your OTP for Listing Your Property", message.subject());
//
//        System.out.println(message.subject());
//        System.out.println(message.to().get(0).email());
//        System.out.println(message.from().get(0).email());
//
//        System.out.println("---- EMAIL BODY START ----");
//        System.out.println(message.text().body());
//        System.out.println("---- EMAIL BODY END ----");
//
//String emailBody = "";
//
//        if (message.html() != null && message.html().body() != null) {
//emailBody = message.html().body();
//            System.out.println("Using HTML body.");
//        } else if (message.text() != null && message.text().body() != null) {
//emailBody = message.text().body();
//            System.out.println("Fallback to text body.");
//        } else {
//                throw new IllegalStateException("Email has no body content.");
//        }
//
//                System.out.println("---- EMAIL BODY ----\n" + emailBody + "\n--------------------");
//Pattern pattern = Pattern.compile(">(\\d{6})<");
//
//
//Matcher matcher = pattern.matcher(emailBody);
//
//String otp;
//
//        if (matcher.find()) {
//otp = matcher.group(1);
//            System.out.println("OTP Found: " + otp);
//        } else {
//                throw new IllegalStateException("No OTP match found in email.");
//        }
//
//
//
//
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//
////  Find all 6 OTP input boxes
//// List<WebElement> otpBoxes = wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath(".//span[@style='display:inline-block; background-color:#080032; color:#fff; font-size:18px; text-decoration:none; padding:14px 40px; border-radius:8px; font-weight:bold']"), 5));
////  List<WebElement> otpBoxes = wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//span[starts-with(@text, 'username_')"), 5));
//List<WebElement> otpBoxes = wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("input.otp-input"), 5));
////   List<WebElement> otpBoxes = driver.findElements(By.cssSelector("input.otp-input")); // Adjust if needed
//
////  Sanity check
//        if (otp.length() == 6 && otpBoxes.size() >= 6) {
//        for (int i = 0; i < 6; i++) {
//        otpBoxes.get(i).sendKeys(String.valueOf(otp.charAt(i)));
//        }
//        } else {
//        throw new IllegalStateException("OTP or input fields are not valid.");
//        }
//
//                System.out.println("Using OTP: " + otp);
//        System.out.println("Number of OTP input fields: " + otpBoxes.size());
//        System.out.println("Current page URL: " + driver.getCurrentUrl());
//
////
////       Thread.sleep(10000);
////        clickable("//button[text()='proceed']");
//
//// Wait for success message or redirection
//wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//
//clickable(".//button[text()='proceed']");
//        Thread.sleep(5000);
//
//
////  assertNotNull(success, "OTP was not accepted — registration did not complete.");
//    }