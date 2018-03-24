package MyStoreDemo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MyStoreLandingPage;

/**
 * Created by Souke Family on 24/03/2018.
 */
public class UserCreatesAccount {

    @Test
    public void startWebDriver(){

        System.setProperty("webdriver.chrome.driver", "C:\\workspace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
        Assert.assertTrue("title should start with My Store",
          driver.getTitle().startsWith("My Store"));
}

    @Test
    public void createAccount() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\workspace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
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

    }
}
