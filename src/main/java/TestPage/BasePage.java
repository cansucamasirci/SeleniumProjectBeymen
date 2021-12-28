package TestPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.junit.Assert;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;

    }
    public void click(By by){
        findElement(by).click();
    }
    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
    }
    public void assertionUrl(String text) {
        Assert.assertEquals(text, driver.getCurrentUrl());
        ;
    }

    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    public void hoverElement(By by) {
        Actions act=new Actions(driver);
        act.moveToElement(findElement(by)).build().perform();
    }

}