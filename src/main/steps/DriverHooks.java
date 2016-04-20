package steps;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.SystemClock;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;


public class DriverHooks {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @Before
    public void openBrowser() {
        System.out.println("***********In Open browser");
        System.setProperty("webdriver.chrome.driver","/Users/pranathb/Downloads/chromedriver");
        driver = new ChromeDriver();
        System.out.println("***********after that browser"+driver);
        driver.manage().window().maximize();
        System.out.println("What happened here??");
        wait = new WebDriverWait(driver, 10);
    }

    @After
    public void afterTheScenario(Scenario scenario) throws IOException, InterruptedException {
        captureScreenShotOnFailure(scenario);
        Thread.sleep(2000);
        driver.quit();
    }

    private void captureScreenShotOnFailure(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
                File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("reports/screenshots/" + System.currentTimeMillis() + ".png"));
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }
        }
    }
}