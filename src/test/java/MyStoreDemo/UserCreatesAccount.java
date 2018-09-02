package MyStoreDemo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import pages.DropDownPage;
import pages.MyStoreLandingPage;

/**
 * Created by Souke Family on 24/03/2018.
 */
public class UserCreatesAccount {

    @Test
    public void startWebDriver(){

        System.setProperty("webdriver.gecko.driver", "C:\\workspace\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
        Assert.assertTrue("title should start with My Store",
          driver.getTitle().startsWith("My Store"));
}

    @Test
    public void createAccount() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\workspace\\chromedriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://automationpractice.com/index.php");

        MyStoreLandingPage signIn = new MyStoreLandingPage(driver);
        signIn.setSignin();
        signIn.createAccount("qatesters101@gmail.com");
        signIn.setSubmitButton();
        Thread.sleep(5000);
        signIn.setEnterTitle();
        signIn.setEnterFirstName("qa");
        signIn.setEnterLastName("camer");
        signIn.setEnterEmail("qatesters101@gmail.com");
        signIn.setEnterPassword("victoria123");

        DropDownPage selectDays = new DropDownPage(driver);
        selectDays.setDays();
        Thread.sleep(3000);

        DropDownPage selectMonths = new DropDownPage(driver);
        selectMonths.setMonths();
        Thread.sleep(3000);

        DropDownPage selectYears =  new DropDownPage(driver);
        selectYears.setYears();

        signIn.setEnterFirstName("qa");
        signIn.setEnterLastName("camer");
        signIn.setEnterCompanyName("Rog Ltd");
        signIn.setEnterAddress("3 balling road");
        signIn.setEnterCity("Winchester");

        DropDownPage selectState = new DropDownPage(driver);
        selectState.setState();
        Thread.sleep(3000);

        signIn.setEnterPostCode("SO21 2JN");

        DropDownPage selectCountry = new DropDownPage(driver);
        selectCountry.setCountry();
        Thread.sleep(3000);

        signIn.setEnterMobileNumber("2221211212121");
        signIn.setEnterAdditionalAddress("2 swan road");




    }
}
