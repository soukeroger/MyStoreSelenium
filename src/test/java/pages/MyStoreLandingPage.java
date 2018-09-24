package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Souke Family on 24/03/2018.
 */
public class MyStoreLandingPage {

    WebDriver driver;
//

    By signIn = By.className("login");
    By createAccount = By.id("email_create");
    By submitButton = By.id("SubmitCreate");
    By enterTitle = By.id("id_gender1");

    By enterFirstName = By.id("customer_firstname");
    By enterLastName = By.id("customer_lastname");
    By enterEmail = By.id("email");
    By enterPassword = By.id("passwd");
    By enterCompanyName = By.id("company");
    By enterAddress = By.id("address1");
    By enterCity = By.id("city");
    By enterPostCode = By.id("postcode");
    By enterMobileNumber = By.id("phone_mobile");
    By enterAdditionalAddress = By.id("alias");
//    By searchDress = By.id("search_query_top");

    //    The above 8By's represent Element Locators
    public MyStoreLandingPage(WebDriver driver1) {

        this.driver = driver1;
//        driver1 is a local driver
//        constructor to instantiate webdriver
    }

    public void setSignin() {
        driver.findElement(signIn).click();
    }

    public void setSubmitButton() {
        driver.findElement(submitButton).click();
    }

    public void createAccount(String ca) {
        driver.findElement(createAccount).sendKeys(ca);
    }

    public void setEnterTitle() {
        WebElement selectTitle = driver.findElement(enterTitle);
        selectTitle.click();


    }

    public void setEnterFirstName(String fn) {
        driver.findElement(enterFirstName).clear();
        driver.findElement(enterFirstName).sendKeys(fn);
    }

    public void setEnterLastName(String ln) {
        driver.findElement(enterLastName).clear();
        driver.findElement(enterLastName).sendKeys(ln);
    }

    public void setEnterEmail(String em) {
        driver.findElement(enterEmail).clear();
        driver.findElement(enterEmail).sendKeys(em);
    }

    public void setEnterPassword(String pwd) {
        driver.findElement(enterPassword).clear();
        driver.findElement(enterPassword).sendKeys(pwd);
    }

    public void setEnterCompanyName(String cn){
        driver.findElement(enterCompanyName).clear();
        driver.findElement(enterCompanyName).sendKeys(cn);}

    public void setEnterAddress(String ea){
        driver.findElement(enterAddress).clear();
        driver.findElement(enterAddress).sendKeys(ea);}

    public void setEnterCity(String ec){
        driver.findElement(enterCity).clear();
        driver.findElement(enterCity).sendKeys(ec);}

    public void setEnterPostCode(String pc){
        driver.findElement(enterPostCode).clear();
        driver.findElement(enterPostCode).sendKeys(pc);}

    public void setEnterMobileNumber(String mn){
        driver.findElement(enterMobileNumber).clear();
        driver.findElement(enterMobileNumber).sendKeys(mn);}

//        public void searchItem(String dr){
//        driver.findElement(searchDress).clear();
//        driver.findElement(searchDress).sendKeys(dr);
//        }

    public void setEnterAdditionalAddress(String eaa){
        driver.findElement(enterAdditionalAddress).clear();
        driver.findElement(enterAdditionalAddress).sendKeys(eaa);}

//    Above 8 methods to call the above 8 element locators


    }

