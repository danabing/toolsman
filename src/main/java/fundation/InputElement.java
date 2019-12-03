package fundation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputElement extends Element {

    private short maxLength;


    public InputElement(WebDriver webDriver,String findBy,String location,short maxLength){
        super(webDriver, findBy, location);
        this.maxLength = maxLength;
    }

    public void inputKeys(String keys){

        super.waitUtilFind().sendKeys(keys);
    }

    public short getMaxLength(){

        return this.maxLength;
    }

}
