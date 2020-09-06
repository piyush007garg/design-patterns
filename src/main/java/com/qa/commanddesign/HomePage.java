package com.qa.commanddesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class HomePage {
    private final WebDriver driver;


    public HomePage(final WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(this.driver,this);
    }

    // adding webElement to the page
    public void goTo(){
        // URL
    }
    @FindBy(id="")
    private WebElement test;

    @FindBy(id="")
    private WebElement test1;

    public List<ElementValidator> getElementValidator(){

        return Arrays.asList(
            new NotificationValidator(test,test1),
             new NotificationValidator(test,test1),

             new DismissAlert(test)

        );


    }

}
