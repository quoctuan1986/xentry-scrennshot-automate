package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WhoIsWho_Page {
    private static WebDriver driver;

    public WhoIsWho_Page(WebDriver driver) {
        this.driver = driver;
    }

    public static void timeDelay(long t) {
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {}
    }

    public static WebElement elementWithXpath(String xpath){
        int timeToSleep = 0;
        Boolean elementIsExist = driver.findElements(By.xpath(xpath)).isEmpty();
        while(elementIsExist  && timeToSleep < 60000){
            timeToSleep = timeToSleep+1000;
            timeDelay(1000);
            System.out.print("Warte auf Element"+"\n");
            elementIsExist = driver.findElements(By.xpath(xpath)).isEmpty();
        }
        return driver.findElement(By.xpath(xpath));
    }


    public static WebElement elementWithID(String id){
        int timeToSleep = 0;
        Boolean elementIsExist = driver.findElements(By.id(id)).isEmpty();
        while(elementIsExist  && timeToSleep < 60000){
            timeToSleep = timeToSleep+1000;
            timeDelay(1000);
            System.out.print("Warte auf Element"+"\n");
            elementIsExist = driver.findElements(By.id(id)).isEmpty();
        }
        return driver.findElement(By.id(id));
    }

    public static WebElement userModify(){
        return elementWithID("slni_ID_SECOND_user-modify");
    }

    public static void clickOnUserModify(){
        userModify().click();
    }

    public static WebElement preflanguageBox(){
        return elementWithID("prefLang_sel");
    }

    public static void clickOnPrefLanguageBox(){
        preflanguageBox().click();
    }


    public static int countOfLanguage(){
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id='prefLang_sel']/optgroup[2]/option"));
        System.out.print("Count of Language is: "+elements.size()+"\n");
        return elements.size();
    }


    public static void selectTheLanguage(String language) {
        for (int i=1; i<= countOfLanguage(); i++){
            WebElement element = driver.findElement(By.xpath("//*[@id='prefLang_sel']/optgroup[2]/option["+i+"]"));
            System.out.print("Text is :" +element.getText()+"\n");
            if(element.getText().contains(language)){
                element.click();
                break;
            }
        }
    }

    public static  WebElement saveButton(){
        return elementWithID("saveModBtn");
    }

    public static void clickOnSaveButton(){
        saveButton().click();
    }

    public static WebElement logoutButton(){
        return elementWithXpath("/html/body/div[1]/div[1]/div[1]/a");
    }

    public static void clickOnLogoutButton(){
        logoutButton().click();
    }
}
