package StepDefinition;

import Utilities.CommonUtils;
import Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks {
    WebDriver driver = Driver.getDriver(CommonUtils.getProperty("browser"));

    @Before
    public void setUp(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Before Scenario");
    }
    @After
    public void tearDown(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
    //        CommonUtils.takeScreenshot(driver, "Test Scenario");
            byte[]screeshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screeshot, "imagae/png","Failed part");
        }
       // driver.close();
    }
}
