package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Home_Page {
    private static WebDriver driver;
    public Home_Page(WebDriver driver) {
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

    public static WebElement cockpit(){
        return elementWithXpath("/html/body/app-root/div/div/div[1]/div/app-tiles/div[2]/div[1]/app-tile[1]/a/div/div[1]");
    }

    public static void clickOnCockPit(){
        cockpit().click();
    }

    public static WebElement frameOfOutletName() throws InterruptedException{
        while(driver.findElements(By.id("xf-frame-outlet-name")).isEmpty()){
            Thread.sleep(1000);
        }
        WebElement frameOfOutlet = elementWithID("xf-frame-outlet-name");
        return frameOfOutlet;
    }

    public static void clickOnFrameOfOutletName() throws InterruptedException{
        frameOfOutletName().click();
    }

    public static WebElement outLetBern(){
        return elementWithXpath("//span[text()[contains(.,'003 - Mercedes-Benz Automobil AG, Zweigniederlassung Bern')]]");
    }

    public static WebElement outLetAugsburg(){
        return elementWithXpath("//span[text()[contains(.,'24900 - Mercedes-Benz AG Niederlassung Augsburg')]]");
    }

    public static WebElement outLetHannover(){
        return elementWithXpath("//span[text()[contains(.,'22005 - Daimler Truck AG Niederlassung Langenhagen')]]");
    }

    public static WebElement outLetEvoBus(){
        return elementWithXpath("//span[text()[contains(.,'37513 - EvoBus GmbH OMNIplus BusWorld Home')]]");
    }

    public static WebElement outLetMunich(){
        return elementWithXpath("//span[text()[contains(.,'22600 - Mercedes-Benz AG Niederlassung München')]]");
    }

    public static WebElement outLetNuernberg(){
        return elementWithXpath("//span[text()[contains(.,'22700 - Mercedes-Benz AG Niederlassung Nürnberg')]]");
    }

    public static WebElement outLetReutlingen(){
        return elementWithXpath("//span[text()[contains(.,'24700 - Daimler Truck AG Niederlassung Reutlingen und Tübingen')]]");
    }

    public static WebElement outLetChur(){
        return elementWithXpath("//span[text()[contains(.,'014 - Ring Garage AG Chur')]]");
    }

    public static WebElement outLetNurnberg_22795(){
        return elementWithXpath("//span[text()[contains(.,'22795 - Mercedes-Benz AG vertreten durch Mercedes-Benz Vertrieb PKW GmbH, Niederlassung Nürnberg')]]");
    }

    public static WebElement outLetNurnberg_22700(){
        return elementWithXpath("//span[text()[contains(.,'22700 - Mercedes-Benz AG Niederlassung Nürnberg')]]");
    }

    public static WebElement outLetWarszawa(){
        return elementWithXpath("//span[text()[contains(.,'107900 - Mercedes-Benz Warszawa Sp. z o.o.')]]");
    }

    public static WebElement outLetWackemut(){
        return elementWithXpath("//span[text()[contains(.,'22919 - Wackenhut GmbH & Co. KG')]]");
    }

    public static WebElement outLetStuttgart(){
        return elementWithXpath("//span[text()[contains(.,'22901 - Mercedes-Benz AG vertreten durch Mercedes-Benz Vertrieb PKW GmbH, Niederlassung Stuttgart')]]");
    }

    public static WebElement outLetLandau(){
        return elementWithXpath("//span[text()[contains(.,'20800 - Mercedes-Benz AG vertreten durch Mercedes-Benz Vertrieb PKW GmbH, Niederlassung Mannheim-Heidelbe')]]");
    }

    public static WebElement outLetPraha(){
        return elementWithXpath("//span[text()[contains(.,'50 - Mercedes-Benz PRAHA s.r.o.')]]");
    }

    public static WebElement outLetBoeblingen(){
        return elementWithXpath("//span[text()[contains(.,'053000 - Mercedes-Benz AG After-Sales Kompetenz-Center Böblingen')]]");
    }




    public static void clickOnOutletBern(){
        clickOnElement(outLetBern());
    }

    public static void clickOnOutletHannover(){
        clickOnElement(outLetHannover());
    }

    public static void clickOnOutletAugsburg(){
        clickOnElement(outLetAugsburg());
    }

    public static void clickOnOutletEvoBus(){
        clickOnElement(outLetEvoBus());
    }
    public static void clickOnOutletMunich(){
        clickOnElement(outLetMunich());
    }
    public static void clickOnOutletNuerberg(){
        clickOnElement(outLetNuernberg());
    }

    public static void clickOnOutletReutlingen(){
        clickOnElement(outLetReutlingen());
    }
    public static void clickOnOutletChur(){
        clickOnElement(outLetChur());
    }
    public static void clickOnOutletNurnberg_22795(){
        clickOnElement(outLetNurnberg_22795());
    }

    public static void clickOnOutletNurnberg_22700(){
        clickOnElement(outLetNurnberg_22700());
    }
    public static void clickOnOutletWarszawa(){
        clickOnElement(outLetWarszawa());
    }
    public static void clickOnOutletWackemut(){
        clickOnElement(outLetWackemut());
    }

    public static void clickOnOutletStuttgart(){
        clickOnElement(outLetStuttgart());
    }

    public static void clickOnOutletLandau(){
        clickOnElement(outLetLandau());
    }
    public static void clickOnOutletPraha(){
        clickOnElement(outLetPraha());
    }

    public static void clickOnOutletBoeblingen(){
        clickOnElement(outLetBoeblingen());
    }







    public static WebElement outletChangeButton(){
        return elementWithXpath("//*[contains(@class, 'xf-outletswitch-button xf-outletswitch-change')]");
    }

    public static void clickOnChangeOutletButton(){
        clickOnElement(outletChangeButton());
    }


    public static int countOfLanguage(){
        List<WebElement> elements = driver.findElements(By.xpath("/html/body/div[10]/div/ul/li"));
        System.out.print("Count of Vehicle is: "+elements.size());
        return elements.size();
    }


    public static void selectTheLanguage(String language) {
        for (int i=1; i<= countOfLanguage(); i++){
            WebElement element = driver.findElement(By.xpath("/html/body/div[10]/div/ul/li["+i+"]"));
            System.out.print("Text is :" +element.getText()+"\n");
            if(element.getText().equals(language)){
                element.click();
                break;
            }
        }
    }


    public static void clickOnLogoutButton() throws InterruptedException {
        int time =0;
        while(driver.findElements(By.xpath("//*[contains(@class, 'xf-controlpanel-icon')]")).isEmpty()){
            Thread.sleep(500);
            time=time+500;
            if (time>10000){
                driver.navigate().refresh();
                time =0;
            }
        }
        elementWithXpath("//*[contains(@class, 'xf-controlpanel-icon')]").click();
        elementWithXpath("//*[contains(@class, 'xf-logout-icon')]").click();
    }



}
