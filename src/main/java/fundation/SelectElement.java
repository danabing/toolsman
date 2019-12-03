package fundation;

import org.openqa.selenium.WebDriver;

public class SelectElement extends Element {


    public SelectElement(WebDriver webDriver,String findBy,String location){
        super(webDriver, findBy, location);
    }
}
