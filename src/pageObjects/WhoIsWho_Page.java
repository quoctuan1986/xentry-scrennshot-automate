package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.xml.ws.WebEndpoint;
import java.util.List;

public class WhoIsWho_Page {
    private static WebDriver driver;

    public WhoIsWho_Page(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement userModify(){
        WebElement element = driver.findElement(By.id("slni_ID_SECOND_user-modify"));
        return element;
    }

    public static void clickOnUserModify(){
        userModify().click();
    }

    public static WebElement preflanguageBox(){
        WebElement element = driver.findElement(By.id("prefLang_sel"));
        return element;
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
        WebElement element = driver.findElement(By.id("saveModBtn"));
        return element;
    }

    public static void clickOnSaveButton(){
        saveButton().click();
    }

    public static WebElement logoutButton(){
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/a"));
        return element;
    }

    public static void clickOnLogoutButton(){
        logoutButton().click();
    }
}
