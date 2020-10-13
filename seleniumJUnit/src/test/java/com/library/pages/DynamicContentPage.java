package com.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.library.utilities.BrowserUtils;

import java.util.List;

public class DynamicContentPage extends PageBase{

    @FindBy(xpath = "//*[@class='large-10 columns']")
    List<WebElement> listOfMessage;


    public List<String> getMessagesText(){
        return BrowserUtils.getElementsText(listOfMessage);
    }

}