package TestPage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddtoBasket extends BasePage {
    public AddtoBasket(WebDriver driver) {
        super(driver);
    }

    public AddtoBasket hoverBasket() {
        hoverElement(By.className("o-header__userInfo--item bwi-cart-o -cart"));
        click(By.id("69994944"));
        return hoverBasket();
    }

    public AddtoBasket goBasket() {
        hoverElement(By.className("header-cart-container robot-header-cart-container hidden"));
        click(By.className("gekhq4-5 kNasRh"));
        return goBasket();
    }

    public AddtoBasket comparePrices() {
        Assert.assertEquals(findElement(By.className("new price")).getText(),findElement(By.className("fiyat robotobold price-txt")).getText());
        return comparePrices();
    }
//Sepete eklediğimiz ürünün adedini 2 yapma
    public AddtoBasket countProduct() {
        click(By.className("a-selectControl -small"));
        click(By.xpath("//option[@value='2']"));
        return countProduct();
    }
//Sepete eklediğimiz ürünü silme
    public AddtoBasket countDelete() {
        click(By.className("m-basket__remove btn-text"));
        return countDelete();
    }
}
