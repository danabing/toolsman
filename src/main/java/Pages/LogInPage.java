package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

    private WebDriver webDriver;

    public  WebElement eleLogInName(){

        return webDriver.findElement(By.id("name"));

    }

    public  WebElement eleLogInPwd(){

        return webDriver.findElement(By.id("pwd"));

    }

    public  WebElement eleLogInBtn(){

        return webDriver.findElement(By.id("BTN"));

    }

    public void logIn(String name,String pwd){

        eleLogInName().clear();
        eleLogInName().sendKeys(name);
        eleLogInPwd().clear();
        eleLogInPwd().sendKeys(pwd);
        eleLogInBtn().click();
    }
}