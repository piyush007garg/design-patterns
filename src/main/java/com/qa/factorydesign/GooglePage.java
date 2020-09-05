package com.qa.factorydesign;

// all the common functionality put in abstract class
public abstract class GooglePage {
    public abstract void launchUrl();
    public abstract void search(String keyword);
    public abstract int getResultCount();

}
