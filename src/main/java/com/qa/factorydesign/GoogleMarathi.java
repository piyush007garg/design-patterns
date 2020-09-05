package com.qa.factorydesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleMarathi extends GoogleEnglish {

    @FindBy(xpath="//div[@id='SIvCob']/a[4]")
    private WebElement clickOnMarathi;

    public GoogleMarathi(WebDriver driver) {
        super(driver);
    }

    @Override
    public void launchUrl() {
        driver.get("http://www.google.com");
        this.clickOnMarathi.click();
    }}
