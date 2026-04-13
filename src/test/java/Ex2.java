import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex2 {

    By email = By.name("email");
    By password = By.name("passwd");
    By signin = By.name("SubmitLogin");

    WebDriver driver;

    @Parameters("browser")
    @BeforeClass
    public void setup(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();

            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");

            driver = new ChromeDriver(options);        }
        else {
            driver = new FirefoxDriver();
        }
        driver.get(" https://demo.guru99.com/test/login.html");

    }

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][]{
                {"test@mail.com", "123", "error message."},
                {"test@mail.com", "152", "https://demo.guru99.com/test/success.html"}
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String Email, String pass, String excpected) throws InterruptedException {

        driver.findElement(email).sendKeys(Email);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(signin).click();

        Thread.sleep(5000);


        String CorrectURL = driver.getCurrentUrl();
        driver.get(" https://demo.guru99.com/test/login.html");
        Assert.assertEquals(excpected, CorrectURL,"login successfully");


    }
}