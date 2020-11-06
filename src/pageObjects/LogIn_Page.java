package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn_Page {
    private static WebDriver driver;

    public static void clickOnsignInButton(){
        boolean staleElement = true;
        while(staleElement){
            try{
                WebElement loginButton = driver.findElement(By.xpath("//button[@class='xf-signin-button']"));
                loginButton.click();
                staleElement = false;
            } catch (StaleElementReferenceException e){
                staleElement = true;
            }
        }
    }

    public static void clickOnElement(WebElement element){
        boolean staleElement = true;
        while(staleElement){
            try{
                element.click();
                staleElement = false;
            } catch (StaleElementReferenceException e){
                staleElement = true;
            }
        }
    }

    public static WebElement userNameField(){
        WebElement username = driver.findElement(By.id("userid"));
        return username;
    }

    public static WebElement nextButtonforSignIn(){
        WebElement nextButton = driver.findElement(By.id("next-btn"));
        return nextButton;
    }

    public static WebElement passWordField(){
        WebElement password = driver.findElement(By.id("password"));
        return password;
    }

    public static WebElement submitButtonForLogin(){
        WebElement loginSubmitButton = driver.findElement(By.id("loginSubmitButton"));
        return loginSubmitButton;
    }

    public static void enterUserName(String username){
        clickOnElement(userNameField());
        userNameField().sendKeys(username);
    }

    public static void clickOnNextButton(){
        nextButtonforSignIn().click();
    }

    public static void enterPassWord(String password){
        clickOnElement(passWordField());
        passWordField().sendKeys(password);
    }

    public static void clickOnSubmitButton(){
        clickOnElement(submitButtonForLogin());
    }


    public LogIn_Page(WebDriver driver) {
        this.driver = driver;
    }
}
