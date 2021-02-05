package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn_Page {
    private static WebDriver driver;

    public static void timeDelay(long t) {
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {}
    }

    public static WebElement elementWithXpath(String xpath){
        int timeToSleep = 0;
        Boolean elementIsExist = driver.findElements(By.xpath(xpath)).isEmpty();
        Boolean elementIsEnable = driver.findElement(By.xpath(xpath)).isEnabled();
        Boolean elementIsDisplayed = driver.findElement(By.xpath(xpath)).isDisplayed();
        while((elementIsExist || !elementIsDisplayed || !elementIsEnable)  && timeToSleep < 60000){
            timeToSleep = timeToSleep+1000;
            timeDelay(1000);
            System.out.print("Warte auf Element"+"\n");
            elementIsExist = driver.findElements(By.xpath(xpath)).isEmpty();
            elementIsEnable = driver.findElement(By.xpath(xpath)).isEnabled();
            elementIsDisplayed = driver.findElement(By.xpath(xpath)).isDisplayed();
        }
        return driver.findElement(By.xpath(xpath));
    }


    public static WebElement elementWithID(String id){
        int timeToSleep = 0;
        Boolean elementIsExist = driver.findElements(By.id(id)).isEmpty();
        Boolean elementIsEnable = driver.findElement(By.id(id)).isEnabled();
        Boolean elementIsDisplayed = driver.findElement(By.id(id)).isDisplayed();
        while((elementIsExist || !elementIsDisplayed || !elementIsEnable)   && timeToSleep < 60000){
            timeToSleep = timeToSleep+1000;
            timeDelay(1000);
            System.out.print("Warte auf Element"+"\n");
            elementIsExist = driver.findElements(By.id(id)).isEmpty();
            elementIsEnable = driver.findElement(By.id(id)).isEnabled();
            elementIsDisplayed = driver.findElement(By.id(id)).isDisplayed();
        }
        return driver.findElement(By.id(id));
    }


    public static void clickOnsignInButton(){
        elementWithXpath("//button[@class='xf-signin-button']").click();
        /*
        boolean staleElement = true;
        while(staleElement){
            try{
                WebElement loginButton = driver.findElement(By.xpath("//button[@class='xf-signin-button']"));
                loginButton.click();
                staleElement = false;
            } catch (StaleElementReferenceException e){
                staleElement = true;
            }
        }*/
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
        return elementWithID("userid");
    }

    public static WebElement nextButtonforSignIn(){
        return elementWithID("next-btn");
    }

    public static WebElement passWordField(){
        return elementWithID("password");
    }

    public static WebElement submitButtonForLogin(){
        return elementWithID("loginSubmitButton");
    }

    public static void enterUserName(String username){
        userNameField().click();
        userNameField().sendKeys(username);
    }

    public static void clickOnNextButton(){
        nextButtonforSignIn().click();
    }

    public static void enterPassWord(String password){
        passWordField().click();
        passWordField().sendKeys(password);
    }

    public static void clickOnSubmitButton(){
        submitButtonForLogin().click();
    }

    public static void cookiesAkzep() {
        if (!driver.findElements(By.id("uc-btn-accept-banner")).isEmpty()){
            driver.findElement(By.id("uc-btn-accept-banner")).click();
        }
    }


    public LogIn_Page(WebDriver driver) {
        this.driver = driver;
    }
}
