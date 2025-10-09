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

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.regex.*;
import java.io.IOException;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class Pricing extends BrowserActions {

    @BeforeMethod
    public void openingBrowser() {
        browserOpen();
    }

    @Test
    public void Pricing_Test() throws MailosaurException, IOException, InterruptedException {
        clickable(".//a[text()='Pricing']");
        clickable(".//a[@href='https://www.syncinns.com/for-hotel-pricing']");
        clickable(".//a[@href='https://www.syncinns.com/hotel-pricing-qoute']");
        typingToText_id("emailModern", "air-lunch@ctwouvya.mailosaur.net");
        clickable(".//button[@class='btn common-bgBtn w-100 text-center align-items-center justify-content-center']");

        String apiKey = "uKqJZjI5mfh6OkDJdcJIlZBTulDaiTkI";
        String serverId = "ctwouvya";
        String serverDomain = "ctwouvya.mailosaur.net";

        MailosaurClient mailosaur = new MailosaurClient(apiKey);

        MessageSearchParams params = new MessageSearchParams();
        params.withServer(serverId);

        Instant tenMinutesAgo = Instant.now().minusSeconds(600); // 600 seconds = 10 minutes
        params.withReceivedAfter(Date.from(tenMinutesAgo));

        SearchCriteria criteria = new SearchCriteria();
        criteria.withSentTo("air-lunch@" + serverDomain);


        Message message = mailosaur.messages().get(params, criteria);

        assertNotNull(message);
        assertEquals("Your OTP for Demo Scheduling", message.subject());

        System.out.println(message.subject());
        System.out.println(message.to().get(0).email());
        System.out.println(message.from().get(0).email());

        System.out.println("---- EMAIL BODY START ----");
        System.out.println(message.text().body());
        System.out.println("---- EMAIL BODY END ----");

        String emailBody = "";

        if (message.html() != null && message.html().body() != null) {
            emailBody = message.html().body();
            System.out.println(" Using HTML body.");
        } else if (message.text() != null && message.text().body() != null) {
            emailBody = message.text().body();
            System.out.println("⚠ Fallback to text body.");
        } else {
            throw new IllegalStateException(" Email has no body content.");
        }

        System.out.println("---- EMAIL BODY ----\n" + emailBody + "\n--------------------");

// Regex: Find any 6-digit number between tags or anywhere
        Pattern pattern = Pattern.compile("\\b(\\d{6})\\b");  // safer than greedy .*
// OR, if you only want numbers between > and < tags: Pattern.compile(">(\\d{6})<")

        Matcher matcher = pattern.matcher(emailBody);

        if (matcher.find()) {
            String otp = matcher.group(1);
            System.out.println(" OTP Found: " + otp);
        } else {
            System.out.println(" No OTP found in the email body!");
            throw new IllegalStateException("No OTP match found in email.");
        }

        //  Extracted OTP (already done)
        String otp = matcher.group(1);  // e.g., "523389"

//  Find all 6 OTP input boxes
        List<WebElement> otpBoxes = driver.findElements(By.cssSelector("input.otp-digit")); // Adjust if needed

//  Sanity check
        if (otp.length() == 6 && otpBoxes.size() >= 6) {
            for (int i = 0; i < 6; i++) {
                otpBoxes.get(i).sendKeys(String.valueOf(otp.charAt(i)));
            }
        } else {
            throw new IllegalStateException("OTP or input fields are not valid.");
        }
        Thread.sleep(2000);
        clickable(".//button[@class='btn common-bgBtn w-100 text-center align-items-center justify-content-center']");
        typingToText_id("nameModern", "name");
        typingToText_id("finalEmailModern", "email");
        typingToText_id("phoneModern", "phone");

    }

}
