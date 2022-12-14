package test;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import page.*;
import util.TestListener;

@Listeners({TestListener.class})
public class CommonConditions {
    protected WebDriver driver;

    protected MainPage mainPage;
    protected BrandPage brandPage;
    protected BlogPage blogPage;
    protected SearchPage searchPage;
    protected WorkshopPage workshopPage;
    protected NewItemsPage newItemsPage;

    @BeforeMethod()
    public void setUp() {
        driver = DriverSingleton.getDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void stopBrowser() throws InterruptedException {
        DriverSingleton.closeDriver();
    }
}