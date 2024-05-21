package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver {


    public static String sign_in_portal_User_text_field = "input[id='usr']";
    public static String sigh_in_portal_password_field = "input[id='pwd']";

    public static String sign_in_portal_login_button_locater = "input[type='submit']";

    public static void sign_in_portal_for_username() throws InterruptedException{

        Thread.sleep(2000);
        driver.findElement(By.cssSelector(sign_in_portal_User_text_field)).sendKeys("Scott.gale@gmail.com");
    }

    public static void sign_in_portal_for_password() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(sigh_in_portal_password_field)).sendKeys("P@sword!");
    }
    public static void sign_in_portal_login_button () throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(sign_in_portal_login_button_locater)).click();
    }

}
