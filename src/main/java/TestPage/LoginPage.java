package TestPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage check() {
        assertionUrl("https://www.beymen.com/");
        return this;
    }

    public LoginPage hover() {
        hoverElement(By.className("o-header__userInfo--item bwi-account-o -customer"));
        return this;
    }

    public LoginPage login() {
        click(By.className("o-header__userInfo--text"));
        sendKeys(By.id("email"),"cansucamasirci@gmail.com");
        sendKeys(By.id("password"),"108589Cc");
        click(By.id("loginBtn"));
        return this;

    }
}
