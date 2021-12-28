package TestPages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    static WebDriver webDriver=null;
    WebDriver driver;
    public static Logger logger = LogManager.getLogger(BaseTest.class);
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/mucah/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        System.out.println("1");
        driver.get("www.beymen.com");
        logger.info("Driver başlatıldı");
        driver.manage().window().maximize();

    }

    @After
    public void tearDown(){
        System.out.println("1");
        driver.quit();
        logger.info("Driver kapatıldı");
    }
}