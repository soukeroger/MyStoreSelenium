package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

public class MyStoreAccountPage {

    WebDriver driver;

    By signIn = By.className("login");
    By LoginInButton = By.id("SubmitLogin");
    By enterEmail = By.id("email");
    By enterPassword = By.id("passwd");
    By searchDress = By.id("search_query_top");
    By searchBtn = By.name("submit_search");
    By quickView = By.xpath("\n" + "/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/h5/a");
    By dressQty = By.id("quantity_wanted");
    By cart = By.cssSelector("button.exclusive");
    By switchWindow = By.cssSelector(".btn.btn-default.button.button-medium>span");
    By proceed = By.cssSelector(".btn.btn-default.button.button-medium>span");


    public MyStoreAccountPage(WebDriver driver1) {

        this.driver = driver1;
//        driver1 is a local driver
//        constructor to instantiate webdriver

    }

    public void startWebdriver() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\workspace\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
        Assert.assertTrue("My Store",
                driver.getTitle().startsWith("My Store"));

    }

    public void setSignIn() {
        driver.findElement(signIn).click();
    }

    public void setEnterEmail(String em) {
        driver.findElement(enterEmail).clear();
        driver.findElement(enterEmail).sendKeys(em);
    }

    public void setEnterPassword(String pwd) {
        driver.findElement(enterPassword).clear();
        driver.findElement(enterPassword).sendKeys(pwd);
    }

    public void setSignInButton() {
        driver.findElement(LoginInButton).click();
    }

    public void searchItem(String dr) {
        driver.findElement(searchDress).clear();
        driver.findElement(searchDress).sendKeys(dr);
    }

    public void clickOnSearchBtn() {
        driver.findElement(searchBtn).click();
    }

    public void clickOnQuickView() {
        driver.findElement(quickView).click();
    }

    public void addDressQty(String ad) {
        driver.findElement(dressQty).clear();
        driver.findElement(dressQty).sendKeys(ad);
    }

    public void clickOCart() {
        driver.findElement(cart).click();

    }

    public void clickOnProceed(){
        driver.findElement(proceed).click();
    }

    public void assertCartTitle(){
        Assert.assertEquals("Shopping-cart summary", driver.findElement(By.className("navigation_page")).isDisplayed(), true);
    }

    public void switchWindows() {
        driver.findElement(switchWindow).click();
//Get all the window handles in a set
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
//iterate through your windows
        while (it.hasNext()) {
            String parent = it.next();
            String newwin = it.next();
            driver.switchTo().window(newwin);
//perform actions on new window
            driver.close();
            driver.switchTo().window(parent);
        }
    }
}


