package com.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.library.utilities.BrowserUtils;

public class NotificationMessagePage extends PageBase {

    @FindBy(xpath = "//a[@href='/notification_message']")
    protected WebElement notificationMessage;

    @FindBy(xpath = "//div[@id='flash']")
    WebElement message;

    public  void click(){
        notificationMessage.click();
        String actual = message.getText();
        BrowserUtils.notificationMessageAlert(message," Action successful");
    }

}