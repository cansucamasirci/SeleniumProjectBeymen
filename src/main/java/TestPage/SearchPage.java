package TestPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
        super((driver));
    }

    public SearchPage search() {
        click(By.className("col-4 col-sm-4 col-md-5 col-lg-4 col-xl-5"));
        sendKeys(By.className("col-4 col-sm-4 col-md-5 col-lg-4 col-xl-5"),"pantolon");
        click(By.className("o-header__search--btn bmi-search"));
        return search();
    }

    public SearchPage nextPage() {
        click(By.xpath("//a[@href='/search?q=pantolon&sayfa=2']"));
        assertionUrl("https://www.beymen.com/search?q=pantolon&sayfa=2");
        return nextPage();
    }
}
