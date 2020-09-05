package com.qa.factorydesign;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class GoogleFactory {

    public static final Function<WebDriver, GooglePage> ENG = GoogleEnglish::new;
    public static final Function<WebDriver, GooglePage> MARATHI = (GoogleMarathi::new);

    public static final Map<String, Function<WebDriver, GooglePage>> MAP = new HashMap<>();

    static {
        MAP.put("ENG",ENG);
        MAP.put("MARATHI",MARATHI);
    }

    public static GooglePage get(String language, WebDriver driver){
      return  MAP.get(language).apply(driver);
    }


}
