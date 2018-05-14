package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Souke Family on 14/05/2018.
 */
public class DropDownPage {
    WebDriver driver;

    By setDays = By.id("days");
    By setMonths = By.id("months");
    By setYears = By.id("years");


    public DropDownPage(WebDriver driver1) {

        this.driver = driver1;
    }

    public  void setDays(){
        WebElement selectDays = driver.findElement(setDays);
        Select dropdown = new Select(selectDays);
       dropdown.selectByValue("3");
    }

    public void setMonths(){
        WebElement selectMonths = driver.findElement(setMonths);
        Select dropdown = new Select(selectMonths);
        dropdown.selectByValue("10");
    }

    public void setYears(){
        WebElement selectYears = driver.findElement(setYears);
        Select dropdown = new Select(selectYears);
        dropdown.selectByValue("2018");
    }



}
