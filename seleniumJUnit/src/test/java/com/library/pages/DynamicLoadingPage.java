package com.library.pages;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.library.utilities.BrowserUtils;

public class DynamicLoadingPage extends PageBase{

    @FindBy(xpath = "//*[@id='start']")
    protected WebElement startButton;

    @FindBy(xpath = "//*[@id='finish']/h4")
    protected WebElement message;

    public void checkLoadingFunctionality(){
        startButton.click();
        BrowserUtils.waitForVisibility(message,10);
        String exp ="Hello World!";
        Assert.assertEquals(exp,message.getText());
    }

}