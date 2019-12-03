package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

    private WebDriver webDriver;

    public  WebElement eleLogInName(){

        return webDriver.findElement(By.id("userName"));

    }

    public  WebElement eleLogInPwd(){

        return webDriver.findElement(By.id("password"));

    }

    public  WebElement eleLogInBtn(){

        return webDriver.findElement(By.className("login_button"));

    }

    public void logIn(String name,String pwd){

        eleLogInName().clear();
        eleLogInName().sendKeys(name);
        eleLogInPwd().clear();
        eleLogInPwd().sendKeys(pwd);
        eleLogInBtn().click();
    }
}