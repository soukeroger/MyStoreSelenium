package MyStoreDemo;

import Helper.BrowserFactory;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pages.DropDownPage;
import pages.MyStoreLandingPageNew;

import java.util.concurrent.TimeUnit;

public class VerifyValidAccountCreation {


        @Test
        public void createAccount() throws InterruptedException {
            System.setProperty("webdriver.gecko.driver", "C:\\workspace\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.navigate().to("http://automationpractice.com/index.php");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            MyStoreLandingPageNew sign_in_page = PageFactory.initElements(driver,MyStoreLandingPageNew.class);
            sign_in_page.createAccount("signIn@demo.com", "rabit", "Whisl", "dfdsfs", "23");

            DropDownPage chooseDays = PageFactory.initElements(driver, DropDownPage.class);
            chooseDays.setDays();
            DropDownPage chooseMnths = PageFactory.initElements(driver, DropDownPage.class);
            chooseMnths.setMonths();



        }
    }

