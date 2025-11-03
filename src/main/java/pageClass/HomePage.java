package pageClass;

import baseClass.BrowserActions;
import locators.HomePage_Locators;

public class HomePage {
   BrowserActions browserActions = new BrowserActions();
    HomePage_Locators homePageLocators = new HomePage_Locators();

    public void click_On_Request_A_Demo_Button() {
        browserActions.clickable(homePageLocators.RequestADemo_Button);
    }

    public void click_on_Talk_To_US_Button(){
        browserActions.clickable(homePageLocators.TalkToUs_Button);
    }
}
