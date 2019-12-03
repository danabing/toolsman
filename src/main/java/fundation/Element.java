package fundation;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Element {

    private WebDriver webDriver;
    private String findBy;
    private String location;

    public static final Logger logger = LoggerFactory.getLogger(Element.class);

    public Element(WebDriver webDriver,String findBy,String location){

        this.findBy = findBy;
        this.location = location;
        this.webDriver = webDriver;

    }


    public WebElement waitUtilFind(){
        try {

            switch (findBy){
                case "ID" :
                    return new WebDriverWait(webDriver,10)
                            .until(ExpectedConditions.presenceOfElementLocated(By.id(location)));

                case "NAME":
                    return new WebDriverWait(webDriver,10)
                            .until(ExpectedConditions.presenceOfElementLocated(By.name(location)));

            }

        }catch (TimeoutException e){

            logger.warn("The element({},{}) is not found ",findBy,location);
            return null;
        }

        logger.warn("The element({},{}) is not found ",findBy,location);
        return null;

    }

    public WebElement find(){

        try {

            switch (findBy){
                case "ID" :
                    return webDriver.findElement(By.id(location));

                case "NAME":
                    return webDriver.findElement(By.name(location));
            }

        }catch (NoSuchElementException e){

            logger.warn("The element({},{}) is not found ",findBy,location);
            return null;
        }

        logger.warn("The element({},{}) is not found ",findBy,location);
        return null;
    }

    public boolean isExist(){

        try {

            switch (findBy){
                case "ID" :
                     webDriver.findElement(By.id(location));
                     return true;

                case "NAME":
                     webDriver.findElement(By.name(location));
                    return true;
            }

        }catch (NoSuchElementException e){

            logger.warn("The element({},{}) is not found ",findBy,location);
            return false;
        }

        logger.warn("The element({},{}) is not found ",findBy,location);
        return false;

    }

    public boolean isRequiredIcon(){
        return false;
    }

    public boolean isEdit(){

        return waitUtilFind().isEnabled();
    }



}
