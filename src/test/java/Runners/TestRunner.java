package Runners;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\main\\resources\\features\\05_Categories.feature"},
        glue = "stepDefinitions",
        tags = "@Regression",
        plugin = { "pretty", "html:target/cucumber-reports" }
)

public class TestRunner {
     public static WebDriver driver;

    @BeforeClass
    public static void startDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @AfterClass
    public static void stopDriver()
    {
        driver.close();
    }

}
