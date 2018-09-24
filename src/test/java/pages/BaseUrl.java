package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseUrl {

    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "C:\\workspace\\geckodriver.exe");
//        system property should be set before initialising the geckDriver
        driver = new FirefoxDriver();
        String baseURL = "http://automationpractice.com/index.php";

        driver.get(baseURL);

    }
}