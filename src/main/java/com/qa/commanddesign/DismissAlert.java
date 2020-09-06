package com.qa.commanddesign;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DismissAlert extends ElementValidator {

    public final WebElement dismissAlert;

    public DismissAlert(WebElement element){
        this.dismissAlert=element;
    }


    @Override
    public boolean validate() {
        boolean result1=this.dismissAlert.isDisplayed();
        this.dismissAlert.findElement(By.cssSelector("button.close")).click();
        boolean result2=this.dismissAlert.isDisplayed();
        return result1 && (!result2);
    }
}
