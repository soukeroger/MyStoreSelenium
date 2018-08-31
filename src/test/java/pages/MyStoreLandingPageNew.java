package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class MyStoreLandingPageNew {

    WebDriver driver;

    public MyStoreLandingPageNew(WebDriver driver1) {
        this.driver = driver1;
    }

    @FindBy(className = "login")
    WebElement signIn;

    @FindBy(how = How.ID, using = "email_create")
    WebElement enterEmail;

    @FindBy(how = How.ID, using = "SubmitCreate")
    WebElement submitButton;

    @FindBy(how = How.ID, using = "id_gender1")
    WebElement clickOnTitle;

    @FindBy(how = How.ID, using = "customer_firstname")
    WebElement enterFirstName;

    @FindBy(how = How.ID, using = "customer_lastname")
    WebElement enterLastName;

    @FindBy(how = How.ID, using = "passwd")
    WebElement enterPassword;

    @FindBy(how = How.ID, using = "days")
    WebElement setDays;

    @FindBy(how = How.ID, using = "months")
    WebElement setMonths;

    @FindBy(how = How.ID, using = "years")
    WebElement setYears;

    @FindBy(how = How.ID, using = "address1")
    WebElement enterAddress;

    @FindBy(how = How.ID, using = "city")
    WebElement enterCity;

    @FindBy(how = How.ID, using = "postcode")
    WebElement enterPostCode;

    @FindBy(how = How.ID, using = "id_state")
    WebElement setState;

    @FindBy(how = How.ID, using = "phone_mobile")
    WebElement enterMobileNumber;


    public void createAccount(String ene, String fn, String ln, String pwd, String days) {
        signIn.click();
        enterEmail.sendKeys(ene);
        submitButton.click();
        clickOnTitle.click();
        enterFirstName.sendKeys(fn);
        enterLastName.sendKeys(ln);
        enterPassword.sendKeys(pwd);

    }
}



