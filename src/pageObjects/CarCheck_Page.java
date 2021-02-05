package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;


public class CarCheck_Page {
    public static WebDriver driver;

    public CarCheck_Page(WebDriver driver){this.driver = driver;}

    public static WebElement elementWithXpath(String xpath){
        WebElement ele = driver.findElement(By.xpath(xpath));
        return ele;
    }

    public static WebElement elementWithId(String id){
        WebElement ele = driver.findElement(By.id(id));
        return ele;
    }

    public static void clickOnCarCheckReiter(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/ul/li[2]/ul/li[1]/button/span[1]/span").click();
    }

    public static void clickOnStartButton(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/div[1]/ma-checklist-type-selection/section/div[1]/button").click();

    }
    public static void clickOnStartButtonForAllgemeinProtokollCheck(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/div[1]/ma-checklist-type-selection/section/div[2]/button").click();

    }

    public static void clickOnDreiPunktMenu(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[2]/div[1]/xy-c-aux-menu[2]/button").click();
    }

    public static void clickOnDelleKontext(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[1]/ma-cc-damage-checkpoint/ma-cc-checkpoint/div/div/div/div/div[2]/div/div[3]/div/button").click();
    }

    public static void clickOnDellImage(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div/ma-cc-checklist-with-checkpoints/div/div[1]/ma-cc-damage-checkpoint/xy-c-picker[1]/div[2]/div/div/xy-c-map/div/div/img").click();
    }


    public static void moveTheCosorToElement(WebElement element){
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
    }

    public static void scrollDownThePageToFahrzeugAussenSeite(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/div/div[1]/h2"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToImageCar(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[1]/ma-cc-damage-checkpoint/ma-cc-checkpoint/div/div/div/div/div[1]/xy-c-map/div/div/img"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToDell(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[1]/ma-cc-damage-checkpoint/ma-cc-checkpoint/div/div/div/div/div[2]/div/div[3]/div/button"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToReifenCheck(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-chassis-config/div/header"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToReifenCheckForCar(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-chassis-config/div/header"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToReifenCheckForCar_1(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div/ma-cc-checklist-with-checkpoints/div/div[4]/ma-cc-chassis-config/div/header"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }



    public static void scrollDownThePageToRadCheck(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div/ma-cc-checklist-with-checkpoints/div/div[2]/ma-cc-wheel-checkpoint-list/div/div/div[1]/xy-c-spinner/div"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToRadCheckPunkt(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[2]/ma-cc-chassis-config/div/header"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToRadOfRadCheckPunkt(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[2]/ma-cc-chassis-config/div/div/div[2]/div/xy-c-chassis/div/div/div[4]/div[3]/div/div/div[2]"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToRadOfRadCheckPunkt_2(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[2]/ma-cc-chassis-config/div/div/div[2]/div/xy-c-chassis/div/div/div[3]/div[2]/div/div/div[1]"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public static void scrollDownThePageToRadCheckPunkt_1(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[2]/ma-cc-chassis-config/div/div/div[2]/div/xy-c-chassis/div/div/div[4]/div[4]/div/div/div[2]"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToRadCheckPunkt_3(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[2]/ma-cc-chassis-config/div/div/div[2]/div/xy-c-chassis/div/div/div[6]/div/div/div[2]"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }



    public static void scrollDownThePageToRadCheckForCar(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-wheel-checkpoint-list/div/div/div[2]"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }



    public static void scrollDownThePageToReifen(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[2]/ma-cc-wheel-checkpoint/ma-cc-checkpoint/div/header"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToReifenForCar(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-chassis-config/div/div/div[2]/div/xy-c-chassis/div/div/div[3]/div[2]/div/div/div[2]"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToReifenGanzRechtsCar(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-chassis-config/div/div/div[2]/div/xy-c-chassis/div/div/div[5]/div/div/div[1]"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToReifenLinksUnterForCar(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-chassis-config/div/div/div[2]/div/xy-c-chassis/div/div/div[3]/div[3]/div/div/div[1]"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }



    public static void scrollDownThePageToFahrzeuginnenraum(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/div[1]/div[3]"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToFahrzeuginnenraumForCar(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[5]/h2"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public static void scrollDownThePageToFrontscheibe(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/div[1]/div[3]/ma-cc-complaint-checkpoint[2]/ma-cc-checkpoint/div/header"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToFrontscheibeForCar(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[1]/ma-cc-complaint-checkpoint[1]/ma-cc-checkpoint/div/header"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToKartedatenstand(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-navi-checkpoint/ma-cc-checkpoint/div/header"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToWischBlatt(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-complaint-checkpoint[3]/ma-cc-checkpoint/div/header"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToKartedatenstandForCar(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[5]/ma-cc-navi-checkpoint/ma-cc-checkpoint/div/header"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }



    public static void scrollDownThePageToWartungdaten(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-maintenance-checkpoint/ma-cc-checkpoint/div/header"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToWartungdatenForCar(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div/ma-cc-checklist-with-checkpoints/div/div[5]/ma-cc-maintenance-checkpoint/ma-cc-checkpoint/div/header/div[1]"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageInWartung(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-truck-maintenance/xy-c-dialog-body/div/div/form/div/h3"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageInWartungNachUnten(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-truck-maintenance/xy-c-dialog-body/div/div/form/div/div/div/h3"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }





    public static void scrollDownThePageToZustandAussenSeiteForCar(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div/ma-cc-checklist-with-checkpoints/div/div[1]/ma-cc-damage-checkpoint/ma-cc-checkpoint/div/header/div[1]"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToKundenSpezifisch(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[6]/h2"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }






    public static void clickOnStiftSymbolForRader(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[2]/ma-cc-chassis-config/div/div/div[1]/button").click();
    }

    public static void clickOnStiftSymbolForRaderForCar(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-chassis-config/div/div/div[1]/button").click();
    }



    public static void closeDialogForRader(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-chassis-selection/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }


    public static void enterProfilTiefe(String tiefe){
        elementWithXpath("*//input[@id='treadDepth']").clear();
        elementWithXpath("*//input[@id='treadDepth']").sendKeys(tiefe);
    }

    public static void enterProfilTiefe_1(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", elementWithXpath("*//input[@id='treadDepth']"));
        executor.executeScript("arguments[0].value ='4';", elementWithXpath("*//input[@id='treadDepth']"));

    }

    public static void enterReifenDruck(String druck){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[2]/ma-cc-chassis-config/div/div/ma-cc-chassis-sliders/form/div[2]/div/xy-c-input/xy-c-input-wrapper/div/div/input").clear();
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[2]/ma-cc-chassis-config/div/div/ma-cc-chassis-sliders/form/div[2]/div/xy-c-input/xy-c-input-wrapper/div/div/input").sendKeys(druck);
    }

    public static void enterReifenDruckForCar(String druck){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-chassis-config/div/div/ma-cc-chassis-sliders/form/div[2]/div/xy-c-input/xy-c-input-wrapper/div/div/input").clear();
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-chassis-config/div/div/ma-cc-chassis-sliders/form/div[2]/div/xy-c-input/xy-c-input-wrapper/div/div/input").sendKeys(druck);
    }

    public static void enterReifenDruckForCar_1(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", elementWithXpath("*//input[@id='undefined']"));
        executor.executeScript("arguments[0].value ='3';", elementWithXpath("*//input[@id='undefined']"));
    }

    public static void clickOnCrosshairForProfilTiefe(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[2]/ma-cc-chassis-config/div/div/ma-cc-chassis-sliders/form/div[1]/div/button[1]").click();
    }

    public static void clickOnCrosshairForProfilTiefeForCar(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-chassis-config/div/div/ma-cc-chassis-sliders/form/div[1]/div/button[1]").click();
    }

    public static void clickOnCrosshairForProfilTiefeForCar_1(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div/ma-cc-checklist-with-checkpoints/div/div[4]/ma-cc-chassis-config/div/div/ma-cc-chassis-sliders/form/div[1]/div/button[1]"));
    }

    public static void clickOnCrosshairReifenDruck(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[2]/ma-cc-chassis-config/div/div/ma-cc-chassis-sliders/form/div[2]/div/button[1]").click();
    }

    public static void clickOnCrosshairReifenDruckForCar(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-chassis-config/div/div/ma-cc-chassis-sliders/form/div[2]/div/button[1]").click();
    }

    public static void clickOnCrosshairReifenDruckForCar_1(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",  elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div/ma-cc-checklist-with-checkpoints/div/div[4]/ma-cc-chassis-config/div/div/ma-cc-chassis-sliders/form/div[2]/div/button[1]"));
    }

    public static void positionierenAnReifenLinkVorne(){
        moveTheCosorToElement(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-chassis-overlay-picking-wheels/xy-c-dialog-body/div/div/xy-c-chassis/div/div/div[3]/div[3]/div/div/div[1]"));
    }

    public static void positionierenAnReifenLinkVorneForCar(){
        moveTheCosorToElement(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-chassis-overlay-picking-wheels/xy-c-dialog-body/div/div/xy-c-chassis/div/div/div[3]/div[3]/div/div/div[2]"));
    }

    public static void clickOnReifenLinkVorne(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-chassis-overlay-picking-wheels/xy-c-dialog-body/div/div/xy-c-chassis/div/div/div[3]/div[3]/div/div/div[1]").click();
    }

    public static void clickOnReifenLinkVorneForCar(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-chassis-overlay-picking-wheels/xy-c-dialog-body/div/div/xy-c-chassis/div/div/div[3]/div[3]/div/div/div[2]").click();
    }

    public static void clickOnReifenLinkVorneForCar_1(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-chassis-overlay-picking-wheels/xy-c-dialog-body/div/div/xy-c-chassis/div/div/div[3]/div[3]/div/div/div[2]"));
    }


    public static void clickOnXSymbolForReifenCheck(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div/ma-cc-checklist-with-checkpoints/div/div[2]/ma-cc-wheel-checkpoint-list/ma-cc-wheel-checkpoint/ma-cc-checkpoint/div/header/div[2]/button[1]").click();
    }

    public static void clickOnXSymbolForReifenCheck_1(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[2]/ma-cc-wheel-checkpoint/ma-cc-checkpoint/div/header/div[2]/button[2]").click();
    }

    public static void chooseAktionForReifenBeanstandung()throws InterruptedException{
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[2]/ma-cc-wheel-checkpoint/ma-cc-checkpoint/div/div/div/div/ma-cc-wheel-complaint/div[3]/div/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[2]/span").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[2]/ma-cc-wheel-checkpoint/ma-cc-checkpoint/div/div/div/div/ma-cc-wheel-complaint/div[3]/div/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[4]/div/ul/p-dropdownitem[4]/li/span").click();
    }

    public static void photoUpload(){
        WebElement ele =driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div/ma-cc-checklist-with-checkpoints/div/div[2]/ma-cc-wheel-checkpoint-list/ma-cc-wheel-checkpoint/ma-cc-checkpoint/div/div/div/div/ma-cc-wheel-complaint/ma-cc-image/xy-c-multi-image-selection/ul/li/xy-c-single-image-selection/div/input"));
        String filePath =  System.getProperty("user.home") + "/Downloads/Reifen_Upload.png";
        ele.sendKeys(filePath);

    }



    public static void photoUpload_1(){
        WebElement ele =driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[2]/ma-cc-wheel-checkpoint/ma-cc-checkpoint/div/div/div/div/ma-cc-wheel-complaint/ma-cc-image/xy-c-multi-image-selection/ul/li/xy-c-single-image-selection/div/input"));

        String filePath =  System.getProperty("user.home") + "/Downloads/Reifen_Upload.png";
        ele.sendKeys(filePath);

    }

    public static void clickOnPhoto(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[2]/ma-cc-wheel-checkpoint/ma-cc-checkpoint/div/div/div/div/ma-cc-wheel-complaint/ma-cc-image/xy-c-multi-image-selection/ul/li[1]/xy-c-single-image-selection/div/button").click();
    }

    public static void closePhotoDetail(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/xy-c-image-details-dialog/xy-c-image-details/xy-c-dialog-body/div/header/div[2]/xy-c-spinner[2]/div/button").click();
    }

    public static void clickOnStiftSymbolBeiKilometerStand(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-vehicle-checkpoint/ma-cc-checkpoint/div/header/div[2]/button[2]").click();
    }

    public static void clickOnStiftSymbolBeiKilometerStandForCar(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[5]/ma-cc-vehicle-checkpoint/ma-cc-checkpoint/div/header/div[2]/button[2]").click();

    }


    public static void closeKilometerStandDialog(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-edit-form/form/header/button").click();
    }

    public static void closeKilometerStandDialogForCar(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-edit-form/form/header/button").click();
    }



    public static void clickOnXButtonVonFrontscheibe(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/div[1]/div[3]/ma-cc-complaint-checkpoint[2]/ma-cc-checkpoint/div/header/div[2]/button[2]").click();
    }
    public static void clickOnXButtonVonFrontscheibeForCar(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/div[1]/div[1]/ma-cc-complaint-checkpoint[1]/ma-cc-checkpoint/div/header/div[2]/button[2]").click();
    }

    public static void beanstandungVonFrontscheibeWahl() throws InterruptedException{
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-complaint-checkpoint[2]/ma-cc-checkpoint/div/div/div/div/ma-cc-complaint-checkpoint-complaint/div[1]/div/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[2]/span").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-complaint-checkpoint[2]/ma-cc-checkpoint/div/div/div/div/ma-cc-complaint-checkpoint-complaint/div[1]/div/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li").click();
    }

    public static void clickOnHakeVonWischer(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/div[1]/div[3]/ma-cc-complaint-checkpoint[3]/ma-cc-checkpoint/div/header/div[2]/button[3]").click();
    }

    public static void clickOnHakeVonWischerForCar(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/div[1]/div[3]/ma-cc-complaint-checkpoint[3]/ma-cc-checkpoint/div/header/div[2]/button[3]").click();
    }

    public static void clickOnHakeVonWischerForCar_1(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div/ma-cc-checklist-with-checkpoints/div/div[1]/ma-cc-complaint-checkpoint[2]/ma-cc-checkpoint/div/header/div[2]/button[1]").click();
    }

    public static void clickOnHakenVonKuehlMittelStand(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div/ma-cc-checklist-with-checkpoints/div/div[2]/ma-cc-complaint-checkpoint/ma-cc-checkpoint/div/header/div[2]/button[2]").click();
    }


    public static void clickOnDelegateOfSignalhorn(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/div[1]/div[3]/ma-cc-complaint-checkpoint[4]/ma-cc-checkpoint/div/header/div[2]/button[1]").click();
    }

    public static void clickXSymbolVonKartenStand(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-navi-checkpoint/ma-cc-checkpoint/div/header/div[2]/button[4]").click();
    }

    public static void clickXSymbolVonKartenStandForCar(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[5]/ma-cc-navi-checkpoint/ma-cc-checkpoint/div/header/div[2]/button[3]").click();
    }


    public static void aktionVonKartenStandWahl() throws InterruptedException{
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-navi-checkpoint/ma-cc-checkpoint/div/div/div/div/div[2]/div[2]/div/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[2]/span").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-navi-checkpoint/ma-cc-checkpoint/div/div/div/div/div[2]/div[2]/div/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[4]/div/ul/p-dropdownitem[3]/li/span").click();
    }

    public static void clickOnStiftSymbolForWartungdaten(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/div[1]/div[3]/ma-cc-maintenance-checkpoint/ma-cc-checkpoint/div/header/div[2]/button[2]").click();
    }

    public static void clickOnStiftSymbolForWartungdatenForCar(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[5]/ma-cc-maintenance-checkpoint/ma-cc-checkpoint/div/header/div[2]/button[2]").click();
    }



    public static void wartungKanalWahl() throws InterruptedException{
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-truck-maintenance/xy-c-dialog-body/div/div/form/div/div/ma-truck-quick-test-maintenance-channels/p-table/div/div/table/tbody/tr[2]/td[1]/p-tablecheckbox/div/div[2]").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-truck-maintenance/xy-c-dialog-body/div/div/form/div/div/ma-truck-quick-test-maintenance-channels/p-table/div/div/table/tbody/tr[3]/td[1]/p-tablecheckbox/div/div[2]").click();
    }

     public static void closeWartungKanal(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-truck-maintenance/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
     }

     public static void hakenRausnehmenVonKurztest() throws InterruptedException {
        //Click on Kurztest reiter
         elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/ma-app-context-navigation/div/ul/li[3]/button/span").click();
         waitForSpinnerNotAppears();
         //Deselektiere ein Kurztest
         elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[3]/xy-c-dialog/div/ma-quick-test/xy-c-spinner/div/div/div[2]/div[2]/p-table/div/div/table/tbody/tr[1]/td[1]/p-tablecheckbox/div/div[2]/span").click();
         waitForSpinnerNotAppears();
         //Close Kurztest reiter
         elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/ma-app-context-navigation/div/ul/li[3]/button/span").click();
         Thread.sleep(2000);
     }

     public static void kurztestZuweisen() throws InterruptedException{
         //Click on Kurztest reiter
         elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/ma-app-context-navigation/div/ul/li[3]/button/span").click();
         waitForSpinnerNotAppears();
         //selektiere ein Kurztest
         elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[3]/xy-c-dialog/div/ma-quick-test/xy-c-spinner/div/div/div[2]/div[2]/p-table/div/div/table/tbody/tr[1]/td[1]/p-tablecheckbox/div/div[2]").click();
         waitForSpinnerNotAppears();
         //Close Kurztest reiter
         elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/ma-app-context-navigation/div/ul/li[3]/button/span").click();
         Thread.sleep(2000);
     }

    public static void hakenRausnehmenVonKurztest_1() throws InterruptedException {
        //Click on Kurztest reiter
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/ma-app-context-navigation/div/ul/li[3]/button/span").click();
        waitForSpinnerNotAppears();
        //Deselektiere ein Kurztest
        int selected = 1;
        while(selected == 1){
            elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/xy-c-picker/div/ma-quick-test/div/div[2]/div[2]/p-table/div/div/table/tbody/tr[2]/td[1]/p-tablecheckbox/div/div[2]/span").click();
            waitForSpinnerNotAppears();
            closeErrorAndHinweis();
            elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/xy-c-picker/div/ma-quick-test/div/div[2]/div[1]/button").click();
            waitForSpinnerNotAppears();
            Thread.sleep(2000);
            selected = driver.findElements(By.xpath("*//span[contains(@class, 'pi-check')]")).size();
            System.out.println("Checkbox : "+selected+"\n");
        }
        //Close Kurztest reiter
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/ma-app-context-navigation/div/ul/li[3]/button/span").click();
        Thread.sleep(2000);
    }

    public static void hakenSetzenVonKurztest_1() throws InterruptedException {
        //Click on Kurztest reiter
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/ma-app-context-navigation/div/ul/li[3]/button/span").click();
        waitForSpinnerNotAppears();
        //Deselektiere ein Kurztest
        int selected = 0;
        while(selected == 0){
            elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/xy-c-picker/div/ma-quick-test/div/div[2]/div[2]/p-table/div/div/table/tbody/tr[2]/td[1]/p-tablecheckbox/div/div[2]").click();
            waitForSpinnerNotAppears();
            closeErrorAndHinweis();
            elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/xy-c-picker/div/ma-quick-test/div/div[2]/div[1]/button").click();
            waitForSpinnerNotAppears();
            Thread.sleep(2000);
            selected = driver.findElements(By.xpath("*//span[contains(@class, 'pi-check')]")).size();
            System.out.println("Checkbox : "+selected+"\n");
        }
        //Close Kurztest reiter
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/ma-app-context-navigation/div/ul/li[3]/button/span").click();
        Thread.sleep(2000);
    }


    public static void closeErrorAndHinweis(){
        int sizeOfError = driver.findElements(By.xpath("*//div[contains(@class, 'xy-i-warning xy-white')]")).size();
        int sizeOfHinweis = driver.findElements(By.xpath("*//div[contains(@class,'xy-i-error')]")).size();

        System.out.print("Size of Error: "+sizeOfError+"\n");
        if (sizeOfError !=0 || sizeOfHinweis !=0){
            elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-notification-bar/div/button[2]").click();
        }
    }



    public static void wartungKanalWahl_2() throws InterruptedException{

        //Serviceumfang
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-truck-maintenance/xy-c-dialog-body/div/div/form/div/ma-truck-manual-maintenance-data/div/div/div[1]/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/span").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-truck-maintenance/xy-c-dialog-body/div/div/form/div/ma-truck-manual-maintenance-data/div/div/div[1]/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[3]/li").click();

        //ServiceInterval bei Wartungkanl 1
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-truck-maintenance/xy-c-dialog-body/div/div/form/div/div/ma-truck-manual-maintenance-channels/div[1]/div[2]/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/span").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-truck-maintenance/xy-c-dialog-body/div/div/form/div/div/ma-truck-manual-maintenance-channels/div[1]/div[2]/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[3]/li").click();
        Thread.sleep(2000);
        //Wartungkanal 2
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-truck-maintenance/xy-c-dialog-body/div/div/form/div/div/ma-truck-manual-maintenance-channels/div[2]/div[1]/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/span").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-truck-maintenance/xy-c-dialog-body/div/div/form/div/div/ma-truck-manual-maintenance-channels/div[2]/div[1]/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]/li").click();
        Thread.sleep(2000);
        //ServiceInterval bei Wartungkanal 2
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-truck-maintenance/xy-c-dialog-body/div/div/form/div/div/ma-truck-manual-maintenance-channels/div[2]/div[2]/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/span").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-truck-maintenance/xy-c-dialog-body/div/div/form/div/div/ma-truck-manual-maintenance-channels/div[2]/div[2]/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[3]/li").click();
        Thread.sleep(2000);
        //Zeitwartungswaählen
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-truck-maintenance/xy-c-dialog-body/div/div/form/div/div/ma-truck-manual-maintenance-channels/div[3]/div[1]/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/span").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-truck-maintenance/xy-c-dialog-body/div/div/form/div/div/ma-truck-manual-maintenance-channels/div[3]/div[1]/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[5]/li").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-truck-maintenance/xy-c-dialog-body/div/div/form/div/div/ma-truck-manual-maintenance-channels/div[3]/div[2]/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/span").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-truck-maintenance/xy-c-dialog-body/div/div/form/div/div/ma-truck-manual-maintenance-channels/div[3]/div[2]/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]/li").click();
        Thread.sleep(2000);
        Thread.sleep(2000);
    }


    public static void checkListDelete() throws InterruptedException{
        clickOnDreiPunktMenu();
        Thread.sleep(2000);
        //Checklist löschen
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[2]/div[1]/xy-c-aux-menu[2]/button/nav/button[4]").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-delete-checklist-dialog/xy-c-dialog-body/div/footer/div[2]/xy-c-spinner/div/button").click();
        Thread.sleep(5000);

    }


    public static void clickOnRissAndKratz(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[1]/ma-cc-damage-checkpoint/ma-cc-checkpoint/div/div/div/div/div[2]/div/div[5]/div/button").click();
    }

    public static void clickOnMotorHaube(){
        WebElement ele = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div/ma-cc-checklist-with-checkpoints/div/div[1]/ma-cc-damage-checkpoint/xy-c-picker[1]/div[2]/div/div/xy-c-map/div/div/img"));
        Actions builder = new Actions(driver);
        builder.moveToElement(ele, -150, 50).click().build().perform();
    }

    public static void clickOnFahrzeugTuer(){
        WebElement ele = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-damage-map/div/xy-c-map/div/div/img"));
        Actions builder = new Actions(driver);
        builder.moveToElement(ele, 0, 380).click().build().perform();
        // builder.moveToElement(ele, -50, 300).click().build().perform();
    }

    public static void clickOnFahrzeugBeiFahrerTuer(){
        WebElement ele = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[1]/ma-cc-damage-checkpoint/xy-c-picker[1]/div[2]/div/div/xy-c-map/div/div/img"));
        Actions builder = new Actions(driver);
        builder.moveToElement(ele, 330, -140).click().build().perform();
    }

    public static void photoUploadForCar_1(){
        WebElement ele = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[1]/ma-cc-damage-checkpoint/ma-cc-checkpoint/div/div/div/ma-cc-damage/ma-cc-image/xy-c-multi-image-selection/ul/li/xy-c-single-image-selection/div/input"));
        String filePath =  System.getProperty("user.home") + "/Downloads/20200327_112100.jpg";

        ele.sendKeys(filePath);
    }

    public static void photoUploadForCar_2(){
        WebElement ele = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[1]/ma-cc-damage-checkpoint/ma-cc-checkpoint/div/div/div/ma-cc-damage/ma-cc-image/xy-c-multi-image-selection/ul/li[2]/xy-c-single-image-selection/div/input"));
        String filePath =  System.getProperty("user.home") + "/Downloads/20200327_112123.jpg";
        ele.sendKeys(filePath);
    }

    public static void clickOnPhotoForCar_1(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[1]/ma-cc-damage-checkpoint/ma-cc-checkpoint/div/div/div/ma-cc-damage/ma-cc-image/xy-c-multi-image-selection/ul/li[1]/xy-c-single-image-selection/div/button").click();
    }

    public static void clickOnPhotoForCar_2(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[1]/ma-cc-damage-checkpoint/ma-cc-checkpoint/div/div/div/ma-cc-damage/ma-cc-image/xy-c-multi-image-selection/ul/li[2]/xy-c-single-image-selection/div/button").click();
    }

    public static void closePhotoDetailForCar(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/xy-c-image-details-dialog/xy-c-image-details/xy-c-dialog-body/div/header/div[2]/xy-c-spinner[2]/div/button").click();
    }

    public static void clickOnButtonErstellenInWartungDialog(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/footer/button").click();
    }

    public static void closeWartungDialogForCar(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/div/button[3]").click();
    }

    public static void clickOnHakenVonServiceAnzeige(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[5]/ma-cc-yes-no-checkpoint/ma-cc-checkpoint/div/header/div[2]/button[3]").click();
    }

    public static void clickOnHakenVonZusatzArbeitStaufilter(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[6]/ma-cc-relevant-notrelevant-checkpoint[2]/ma-cc-checkpoint/div/header/div[2]/button[2]").click();
    }

    public static void vorgangAnlegen(String fin, String kennzeichen)throws InterruptedException {
        //Click On Plus Button
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/header/div[1]/button[3]").click();
        Thread.sleep(2000);
        //Click on Field Fin
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-jobcreate/xy-c-dialog-body/div/div/form/div[1]/xy-c-input/xy-c-input-wrapper/div/div/input").sendKeys(fin);
        Thread.sleep(2000);
        //click on field kennzeichen
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-jobcreate/xy-c-dialog-body/div/div/form/div[2]/xy-c-input/xy-c-input-wrapper/div/div/input").sendKeys(kennzeichen);
        Thread.sleep(2000);
        //Click On Button erstellen
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-jobcreate/xy-c-dialog-body/div/footer/div/xy-c-spinner/div/button").click();
        waitForSpinnerNotAppears();
    }

    public static void mercedesMeMerge() throws InterruptedException{
        //click on customer data
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[1]/button/span").click();
        Thread.sleep(2000);
        //click on mercedes me icon
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/header/div[2]/xy-c-spinner/div/button").click();
        Thread.sleep(2000);
        //click on genehmigen
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-app-simple-text-dialog/xy-c-dialog-body/div/footer/div[2]/xy-c-spinner/div/button").click();
        Thread.sleep(5000);
        //wähle email und bestätigen
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-app-mercedes-me-link/xy-c-dialog-body/div/div/div/p-table/div/div/table/tbody/tr/td[1]").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-app-mercedes-me-link/xy-c-dialog-body/div/footer/div/xy-c-spinner/div/button").click();
        Thread.sleep(5000);

        //click on Merge
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-app-customer-data-merge/xy-c-dialog-body/div/footer/div/xy-c-spinner/div/button").click();
        Thread.sleep(5000);
        //close customer data
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[1]/button/span").click();
        Thread.sleep(2000);
    }

    public static void reifenBeurteilen()throws InterruptedException {
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-wheel-checkpoint[1]/ma-cc-checkpoint/div/header/div[2]/button[2]").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-chassis-overlay-picking-wheels/xy-c-dialog-body/div/div/xy-c-chassis/div/div/div[3]/div[2]/div/div/div[1]").click();
    }

    public static void zoomInWithFaktor(String faktor){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = '"+faktor+"'");
    }


    public static void zoomIn(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = '0.75'");
    }

    public static void zoomIn_2(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = '0.9'");
    }

    public static void zoomIn_4(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = '0.95'");
    }

    public static void zoomIn_3(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = '0.8'");
    }

    public static void zoomRelease(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = '1.0'");
    }

    public static void waitForSpinnerNotAppears() throws InterruptedException{
        boolean countOfSpin = true;
        while (countOfSpin ==true){
            countOfSpin = driver.findElements(By.xpath("*//div[contains(@class, 'spinner')]")).size() != 0;
            System.out.print("Warten"+"\n");
            Thread.sleep(2000);
        }
    }

    public static void waitForLoadingScreen() throws InterruptedException{
        boolean countOfSpin = true;
        while (countOfSpin ==true){
            countOfSpin = driver.findElements(By.xpath("*//div[contains(@class, 'loading-screen')]")).size() != 0;
            System.out.print("Warten"+"\n");
            Thread.sleep(5000);
        }
    }

    public static void clickOnTextAuftragsmanagement(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div/header/div/h2").click();
    }

    public static void clickOnStiftSymbolOnWartungDialog(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/div/button[1]").click();
    }

    public static void bereifungChange(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-chassis-selection/xy-c-dialog-body/div/div/div/button[2]").click();
    }

    public static void clickOnKilometerstandFeld(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-vehicle-checkpoint/xy-c-picker/div[2]/div/div/div[1]/div/div/div/xy-c-input/xy-c-input-wrapper/div/div/input").click();
    }

    public static void clickOnTextKarteStand(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-navi-checkpoint/ma-cc-checkpoint/div/header/div[1]/h2").click();
    }

    public static void clickOnSaveButtonOnWartungDialog(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/div/button[1]").click();
    }

    public static void packageWaehlen() throws InterruptedException{
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/div/section[4]/header/ma-app-position-table-toolbar/div/div/button").click();
        Thread.sleep(5000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-app-package-selection/xy-c-dialog-body/div/div/div/div/ma-position-table/p-table/div/div/table/tbody/tr[3]/td[2]/p-tablecheckbox/div/div[2]").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-app-package-selection/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }

    public static void reifenBeurteilenDelete(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-wheel-checkpoint[1]/ma-cc-checkpoint/div/div/div/div/ma-cc-wheel-complaint/div[1]/div[2]/button[2]").click();
    }

    public static void oelqualitaetWaehlen() throws InterruptedException{
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/div/section[2]/ma-maintenance-data/section/form/div[2]/div[1]/div[1]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[2]/label").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/div/section[2]/ma-maintenance-data/section/form/div[2]/div[1]/div[1]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]/li/span").click();
    }

    public static void zoomKeysMethod() throws AWTException, InterruptedException{
        for (int i = 0; i < 4; i++) {
            elementWithXpath("*//input[@id='undefined']").sendKeys(Keys.chord(Keys.COMMAND,Keys.ADD));
            System.out.println("Zoom ist gestartet");
        }

    }

    public static void zoomKeysMethodRelease(){
        driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.COMMAND, "0"));
    }

    public static void clickOnKreuzOnServiceanzeige(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[5]/ma-cc-yes-no-checkpoint/ma-cc-checkpoint/div/header/div[2]/button[2]").click();
    }

    public static void carcheckAbschliessen(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[2]/div[2]/button[3]").click();
    }

    public static void carcheckAbschliessenBestaetigen(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-complete-checklist-dialog/xy-c-dialog-body/div/footer/div[2]/xy-c-spinner/div/button").click();
    }

    public static void clickOnDelegateButtonOnKartenstand(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-navi-checkpoint/ma-cc-checkpoint/div/header/div[2]/button[1]").click();
    }

    public static void clickOnKreisOnKartenstand(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/div[1]/div[3]/ma-cc-navi-checkpoint/ma-cc-checkpoint/div/header/div[2]/button[2]").click();
    }

    public static void clickOnTextWartung(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-truck-maintenance/xy-c-dialog-body/div/header/div[1]/h2").click();
    }

    public static void textReplace(WebElement element, String text){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].innerHTML= '"+text+"';",element);
    }

    public static void replaceVorgangDetailsTruck(){
        WebElement finText = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/header/div/p"));
        int indexOfSonderZeichen_1 = finText.getText().indexOf("|");
        String newString = finText.getText().substring(0, indexOfSonderZeichen_1+1)+" "+UIConstants.KUNDEN_NAME+" | "+UIConstants.KENNZEICHEN_TEXTREPLACE+" | "+UIConstants.FIN_TRUCK;
        String fin = newString.replaceAll("é", "&eacute;").replaceAll("'", "&rsquo;");
        System.out.println("text is sfsfd ......: "+fin);
        textReplace(finText , fin);
        textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/ul/li[2]/button/span[1]/span"), "B-XX");
    }

    public static void replaceVorgangDetailsPKW(){
        WebElement finText = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/header/div/p"));
        int indexOfSonderZeichen_1 = finText.getText().indexOf("|");
        String newString = finText.getText().substring(0, indexOfSonderZeichen_1+1)+" "+UIConstants.KUNDEN_NAME+" | "+UIConstants.KENNZEICHEN_TEXTREPLACE+" | "+UIConstants.FIN_PKW;
        String fin = newString.replaceAll("é", "&eacute;").replaceAll("'", "&rsquo;");
        System.out.println("text is sfsfd ......: "+fin);
        textReplace(finText , fin);
        textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/ul/li[2]/button/span[1]/span"), "B-XX");
    }

    public static void titleReplace(){
        textReplace(elementWithXpath("//*[@id='xf-frame-user-name']"), UIConstants.SERVICE_BERATER);
        textReplace(elementWithXpath("//*[@id='xf-frame-outlet-name']"), UIConstants.BETRIEB);
    }

    public static void clickOnFahrzeugUnterseiteDelegate(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[2]/ma-cc-complaint-checkpoint/ma-cc-checkpoint/div/header/div[2]/button[1]").click();
    }

    public static void clickOnMotorraumDelegate(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[2]/ma-cc-complaint-checkpoint/ma-cc-checkpoint/div/header/div[2]/button[1]").click();
    }

    public static void clickOnReifenGanzLinkUnten(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-check-overview/div/div/div/div[1]/div/ma-cc-checklist-with-checkpoints/div/div[3]/ma-cc-chassis-config/div/div/div[2]/div/xy-c-chassis/div/div/div[4]/div[4]/div/div/div[2]").click();
    }

}
