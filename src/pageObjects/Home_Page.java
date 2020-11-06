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
        WebElement cockpit = driver.findElement(By.xpath("/html/body/app-root/div/div/div[1]/div/app-tiles/div[2]/div[1]/app-tile[1]/a/div/div[1]"));
        return cockpit;
    }

    public static void clickOnCockPit(){
        cockpit().click();
    }

    public static WebElement frameOfOutletName(){
        WebElement frameOfOutlet = driver.findElement(By.id("xf-frame-outlet-name"));
        return frameOfOutlet;
    }

    public static void clickOnFrameOfOutletName(){
        clickOnElement(frameOfOutletName());
    }

    public static WebElement outLetBern(){
        WebElement outletName = driver.findElement(By.xpath("//span[text()[contains(.,'003 - Mercedes-Benz Automobil AG, Zweigniederlassung Bern')]]"));
        return outletName;
    }

    public static WebElement outLetAugsburg(){
        WebElement outletName = driver.findElement(By.xpath("//span[text()[contains(.,'24900 - Mercedes-Benz AG Niederlassung Augsburg')]]"));
        return outletName;
    }

    public static WebElement outLetHannover(){
        WebElement outletName = driver.findElement(By.xpath("//span[text()[contains(.,'22005 - Daimler Truck AG vertreten durch Mercedes-Benz Vertrieb NFZ GmbH, Niederlassung Hannover')]]"));
        return outletName;
    }

    public static WebElement outLetEvoBus(){
        WebElement outletName = driver.findElement(By.xpath("//span[text()[contains(.,'37513 - EvoBus GmbH OMNIplus BusWorld Home')]]"));
        return outletName;
    }

    public static WebElement outLetMunich(){
        WebElement outletName = driver.findElement(By.xpath("//span[text()[contains(.,'22600 - Mercedes-Benz AG vertreten durch Mercedes-Benz Vertrieb PKW GmbH, Niederlassung München')]]"));
        return outletName;
    }

    public static WebElement outLetNuernberg(){
        WebElement outletName = driver.findElement(By.xpath("//span[text()[contains(.,'22700 - Mercedes-Benz AG vertreten durch Mercedes-Benz Vertrieb PKW GmbH, Niederlassung Nürnberg')]]"));
        return outletName;
    }

    public static WebElement outLetReutlingen(){
        WebElement outletName = driver.findElement(By.xpath("//span[text()[contains(.,'24700 - Daimler Truck AG vertreten durch Mercedes-Benz Vertrieb NFZ GmbH, Niederlassung Reutlingen und Tü')]]"));
        return outletName;
    }

    public static WebElement outLetChur(){
        WebElement outletName = driver.findElement(By.xpath("//span[text()[contains(.,'014 - Ring Garage AG Chur')]]"));
        return outletName;
    }

    public static WebElement outLetNurnberg_22795(){
        WebElement outletName = driver.findElement(By.xpath("//span[text()[contains(.,'22795 - Mercedes-Benz AG vertreten durch Mercedes-Benz Vertrieb PKW GmbH, Niederlassung Nürnberg')]]"));
        return outletName;
    }

    public static WebElement outLetNurnberg_22700(){
        WebElement outletName = driver.findElement(By.xpath("//span[text()[contains(.,'22700 - Mercedes-Benz AG Niederlassung Nürnberg')]]"));
        return outletName;
    }

    public static WebElement outLetWarszawa(){
        WebElement outletName = driver.findElement(By.xpath("//span[text()[contains(.,'107900 - Mercedes-Benz Warszawa Sp. z o.o.')]]"));
        return outletName;
    }

    public static WebElement outLetWackemut(){
        WebElement outletName = driver.findElement(By.xpath("//span[text()[contains(.,'22919 - Wackenhut GmbH & Co. KG')]]"));
        return outletName;
    }

    public static WebElement outLetStuttgart(){
        WebElement outletName = driver.findElement(By.xpath("//span[text()[contains(.,'22901 - Mercedes-Benz AG vertreten durch Mercedes-Benz Vertrieb PKW GmbH, Niederlassung Stuttgart')]]"));
        return outletName;
    }

    public static WebElement outLetLandau(){
        WebElement outletName = driver.findElement(By.xpath("//span[text()[contains(.,'20800 - Mercedes-Benz AG vertreten durch Mercedes-Benz Vertrieb PKW GmbH, Niederlassung Mannheim-Heidelbe')]]"));
        return outletName;
    }

    public static WebElement outLetPraha(){
        WebElement outletName = driver.findElement(By.xpath("//span[text()[contains(.,'50 - Mercedes-Benz PRAHA s.r.o.')]]"));
        return outletName;
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








    public static WebElement outletChangeButton(){
        WebElement changeButton = driver.findElement(By.xpath("//*[contains(@class, 'xf-outletswitch-button xf-outletswitch-change')]"));
        return changeButton;
    }

    public static void clickOnChangeOutletButton(){
        clickOnElement(outletChangeButton());
    }

    public static void clickOnNaVBarControlPanel(){
        WebElement element = driver.findElement(By.xpath("//*[contains(@class, 'xf-icon xf-controlpanel-icon xf-line-icons')]"));
        element.click();
    }

    public static void clickOnSettings(){
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/nav[3]/div/a[1]/div/span[2]"));
        element.click();
    }

    public static void clickOnIconTriangleForLanguage(){
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div[3]/section/div[2]/form/div/div/ul/li[3]/div/div/div/div[3]/span"));
        element.click();
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

    public static void clickOnSaveLanguageButton(){
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div[3]/section/div[2]/form/div/div/ul/li[5]/div/button/span"));
        element.click();
    }

    public static void clickOnLogoutButton() throws InterruptedException {
        WebElement dreiPunktButton = driver.findElement(By.xpath("//*[contains(@class, 'xf-icon xf-controlpanel-icon xf-line-icons')]"));
        dreiPunktButton.click();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//*[contains(@class, 'xf-logout-icon')]"));
        element.click();
    }



}
