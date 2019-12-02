import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {

    public static void logIn(String name,String password,String url){

        WebDriver webDriver = new ChromeDriver();
        webDriver.get(url);

    }
}
