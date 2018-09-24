package MyStoreDemo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import pages.MyStoreAccountPage;
import pages.MyStoreLandingPage;

public class UserPurchasesDress {

    @Test

    public void BuysAndCheckout() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\workspace\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://automationpractice.com/index.php");

        MyStoreAccountPage dressChoice = new MyStoreAccountPage(driver);

        dressChoice.setSignIn();
        dressChoice.setEnterEmail("paulpogba@gmail.com");
        dressChoice.setEnterPassword("Victoria123");
        dressChoice.setSignInButton();
        dressChoice.searchItem("dress");
        dressChoice.clickOnSearchBtn();
        Thread.sleep(2000);
        dressChoice.clickOnQuickView();
        dressChoice.addDressQty("4");

    }
}

//    public void startWebdriver() throws InterruptedException {
//        System.setProperty("webdriver.gecko.driver", "C:\\workspace\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//        driver.navigate().to("http://automationpractice.com/index.php");
//        Assert.assertTrue("My Store",
//                driver.getTitle().startsWith("My Store"));
//
//    }
