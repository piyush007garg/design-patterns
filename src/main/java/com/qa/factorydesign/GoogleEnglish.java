package com.qa.factorydesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class GoogleEnglish extends GooglePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @FindBy(name="q")
    private WebElement searchBox;

    @FindBy(name="btnK")
    private WebElement searchButton;

    @FindBy(css="div.rc")
    private List<WebElement> result;

    public GoogleEnglish(final WebDriver driver){
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofMillis(30000));
        PageFactory.initElements(driver,this);
    }


    public void launchUrl() {
        driver.get("http://www.google.com");

    }

    public void search(String keyword) {
        char[] charData = keyword.toCharArray();
        for(Character ch:charData) {
            this.searchBox.sendKeys(ch + "");
        }
        this.searchButton.clear();
    }

    public int getResultCount() {
        this.wait.until(driver->this.result.size()>1);
        return this.result.size();
    }
}
