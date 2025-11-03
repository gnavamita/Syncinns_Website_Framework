package pageClass;

import baseClass.BrowserActions;

public class TalkToUsPage {
BrowserActions browserActions = new BrowserActions();

public void Fill_Talk_To_Us_Form(String firstName, String lastName, String workEmail, String companyName, String message ){
    browserActions.typingToText_name("first_name", firstName);
    browserActions.typingToText_name("last_name", lastName);
    browserActions.typingToText_name("work_email", workEmail);
    browserActions.typingToText_name("company_name", companyName);
    browserActions.typingToText_name("message", message);
}
public void Click_On_Send_Message_Button(){
    browserActions.clickable(".//button[@class='btn btn-primary rounded-2 px-4']");
}
}
