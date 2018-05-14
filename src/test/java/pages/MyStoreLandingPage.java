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

//    The above 8By's represent Element Locators
    public MyStoreLandingPage(WebDriver driver1){

        this.driver = driver1;
//        driver1 is a local driver
//        constructor to instantiate webdriver
    }

    public void setSignin(){
        driver.findElement(signIn).click();
    }

    public void setSubmitButton(){
        driver.findElement(submitButton).click();
    }

    public void createAccount(String ca){
        driver.findElement(createAccount).sendKeys(ca);
    }

    public void setEnterTitle(){
        WebElement selectTitle = driver.findElement(enterTitle);
        selectTitle.click();


    }

    public void setEnterFirstName(String fn){
        driver.findElement(enterFirstName).sendKeys(fn);
    }

    public void setEnterLastName(String ln){
        driver.findElement(enterLastName).sendKeys(ln);
    }

    public void setEnterEmail(String em){
        driver.findElement(enterEmail).sendKeys(em);
    }

    public void setEnterPassword(String pwd){
        driver.findElement(enterPassword).sendKeys(pwd);
    }

//    public void selectDays(){
//        WebElement selectDays = driver.findElement(By.id("days"));
//        selectDays.isSelected();

//    public void setEnterTitle(){
//        WebElement selectTitle = driver.findElement(enterTitle);
//        selectTitle.click();




//    Above 8 methods to call the above 8 element locators



}
