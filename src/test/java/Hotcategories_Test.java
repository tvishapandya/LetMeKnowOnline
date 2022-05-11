import Pages.hotCategoriesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class Hotcategories_Test {

    private WebDriver driver;

    @BeforeMethod
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://letmeknow.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.findElement(By.xpath("//button[@class='close']/span")).click();
    }

    @Test
    public void HotCategories_Function() throws InterruptedException {
        hotCategoriesPage page = new hotCategoriesPage(driver);
        page.countHotCategories_function();
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
