package com.qa.commanddesign;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class NotificationValidator extends ElementValidator {
    public final WebElement button;
    public final WebElement notificatin;

    public NotificationValidator(WebElement button,WebElement notificatin){
        this.button=button;
        this.notificatin = notificatin;
    }


    @Override
    public boolean validate() {
        this.button.click();
        boolean result1=this.notificatin.isDisplayed(); // true
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        boolean result2 = this.notificatin.isDisplayed(); //false
        return result1 && (!result2);
    }
}
