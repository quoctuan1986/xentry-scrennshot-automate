package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.event.KeyEvent;
import java.util.List;

public class Kundendialog_Page {
    public static WebDriver driver;

    public Kundendialog_Page(WebDriver driver){this.driver = driver;}

    public static WebElement element(String xpath){
        WebElement ele = driver.findElement(By.xpath(xpath));
        return ele;
    }

    public static void clickOnKundendialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/ul/li[2]/ul/li[2]/button/span[1]/span").click();
    }

    public static void clickOnKundendatenReiter(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/ma-app-context-navigation/div/ul/li[1]/button/span").click();
    }

    public static void closeKundendatenReiter(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/ma-app-context-navigation/div/ul/li[1]/button/span").click();
    }
    public static void clickOnStiftSymbolOfCustomerData(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/header/div[2]/button").click();
    }

    public static void clickOnSaveButtonOfCustomerData(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/header/div[2]/button").click();
    }

    public static void clickOnMercedesmeIcon(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/header/div[2]/xy-c-spinner/div/button").click();
    }

    public static void clickOnButtonAllowToRelease(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-app-simple-text-dialog/xy-c-dialog-body/div/footer/div[2]/xy-c-spinner/div/button").click();
    }

    public static void closeVorgang() throws InterruptedException {
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/button").click();
        Thread.sleep(2000);
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/ul/li[2]/button/span[3]/button").click();
    }

    public static void closeMmcRFehlDialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-app-simple-text-dialog/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }

    public static void selectEmailInKontextOfMmcR(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-app-mercedes-me-link/xy-c-dialog-body/div/div/div/p-table/div/div/table/tbody/tr/td[1]").click();
    }

    public static void clickOnSelectButtonInKontextOfMmcR(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-app-mercedes-me-link/xy-c-dialog-body/div/footer/div/xy-c-spinner/div/button").click();
    }

    public static void closeKontextOfMmcR(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-app-customer-data-merge/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }

    public static void clickOnMergeButtonInKontextOfMmcR(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-app-customer-data-merge/xy-c-dialog-body/div/footer/div/xy-c-spinner/div/button").click();
    }

    public static void clickOnTelematikReiter(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/ma-app-context-navigation/div/ul/li[6]/button/span").click();
    }

    public static void clickOnCommunicationReiter(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/ma-app-context-navigation/div/ul/li[3]/button/span").click();
    }

    public static void closeCommunicationReiter(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/ma-app-context-navigation/div/ul/li[3]/button/span").click();
    }

    public static void moveTheCosorToElement(WebElement element){
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
    }

    public static void scrollDownThePageToAuftragposition(){

        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div/ma-app-reception-details/div/div[1]/ul[2]/li[2]"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToAnnahme(){

        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div/ma-reception-check-table/div/div[1]/h3"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToEmpfehlung(){

        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div/ma-upselling-advisory-table/div/div[1]/h3"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToAblehnungAuftragposition(){

        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div/ma-app-order-position-table[2]/div/div[1]/h3"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToSignaturVonBerater(){
        WebElement element = driver.findElement(By.xpath("*//button[@data-id='serviceAdvisorSignature']"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToSignaturVonKunden(){

        WebElement element = driver.findElement(By.xpath("*//button[@data-id='customerSignature']"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void clickOnStiftSymbolForKundenUnterschrift(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div/button/span").click();
    }

    public static void clickOnSignaturFeldForBerater(){
        element("*//button[@data-id='serviceAdvisorSignature']").click();
    }

    public static void clickOnSignaturFeldForKunden(){
        element("*//button[@data-id='customerSignature']").click();
    }

    public static void drawingInSignaturField(){
        WebElement element = driver.findElement(By.id("canvasSignature"));
        Point point = element.getLocation();
        int xcord = point.getX();
        System.out.println("Position of the webelement from left side is "+xcord +" pixels");
        int ycord = point.getY();
        System.out.println("Position of the webelement from top side is "+ycord +" pixels");

        int logoWidth = element.getSize().getWidth();
        System.out.println("Logo width : "+logoWidth+" pixels");
        //To get the height of the logo
        int logoHeight = element.getSize().getHeight();
        System.out.println("Logo height : "+logoHeight+" pixels");

        Action action = new Actions(driver).click(element)
                .moveToElement(element, 8, 8).clickAndHold(element)
                .moveByOffset(120, 120).moveByOffset(-120, 120)
                .moveByOffset(-120, -120).moveByOffset(100,100).moveByOffset(50,50).moveByOffset(8, 8).release(element)
                .build();
        action.perform();
    }

    public static void clickOnSignButton(){
        WebElement element = driver.findElement(By.id("buttonSign"));
        element.click();
    }

    public static void clickOnFinishButton(){
        WebElement element = driver.findElement(By.id("alternativeFinishButton"));
        element.click();
    }

    public static void clickOnVerwerfenButton(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[2]/xy-c-dialog/div[2]/ma-order-communication/xy-c-dialog-body/div/footer/div[1]/xy-c-spinner/div/button").click();
    }

    public static void clickOnPlusButtonMitNeuenKundenanliegen(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div/ma-app-order-position-table/div/div[1]/button[2]").click();
    }

    public static void scrollDownThePageOfSignaturToPageTwo(){

        WebElement element = driver.findElement(By.xpath("*//button[@data-id='customerSignature']"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void clickOnButtonSignCancel(){
        WebElement element = driver.findElement(By.id("buttonSignCancel"));
        element.click();

    }
    public static void waitForSpinnerNotAppears() throws InterruptedException{
        boolean countOfSpin = true;
        while (countOfSpin ==true){
            countOfSpin = driver.findElements(By.xpath("*//div[contains(@class, 'xy-spinner xy-spinner-obsidian xy-size-xl')]")).size() != 0;
            System.out.print("Warten"+"\n");
            Thread.sleep(2000);
        }
    }

    public static void closeVorgangUeberXButton(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div/header/ma-app-reception-toolbar/div/button[3]").click();
    }

    public static void closeKundenanliegenDialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/div/button").click();
    }

    public static void clickOnTextKundendialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div/header/div/h2").click();
    }

    public static void clickOnKundendienstmassnahme(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div/ma-app-order-position-table/div/div[2]/p-table/div/div/table/tbody/tr[1]/td[2]").click();
    }

    public static void closeKundendienstmassnahmeDialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-service-measure-details/div/header/div[1]/div/button[4]").click();
    }

    public static void clickOnWartung(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div/ma-app-order-position-table/div/div[2]/p-table/div/div/table/tbody/tr[3]/td[1]").click();
    }

    public static void closeWartungDialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/div/button[5]").click();
    }

    public static void clickOnBeanstandung(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div/ma-app-order-position-table/div/div[2]/p-table/div/div/table/tbody/tr[9]/td[1]").click();
    }

    public static void closeBeanstandungDialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/div/button[4]").click();
    }

    public static void clickOnTextKundendienstmassnahme(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-service-measure-details/div/header/div[1]/h2").click();
    }

    public static void clickOnTextWartung(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/h2").click();
    }

    public static void clickOnTextBeanstandung(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/h2").click();
    }

    public static void clickOnTextDokumentieren(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div/ma-reception-check-table/div/div[1]/h3").click();
    }

    public static void clickOnTextKundendaten(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/header/div[1]/h2").click();
    }

    public static void clickOnZubehoer(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div/ma-upselling-advisory-table/div/div[2]/p-table/div/div/table/tbody/tr[3]/td[1]").click();
    }

    public static void closeZubehoerDialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-odus-details/xy-c-dialog-body/div/header/div[2]/xy-c-spinner[2]/div/button").click();
    }

    public static void clickOnTextAuftragposition(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div/ma-app-order-position-table/div/div[1]/h3").click();
    }

    public static void clickOnTextFahrzeugCheckErgebniss(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div/ma-reception-check-table/div/div[1]/h3").click();
    }

    public static void closeDialogMMCR(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-app-simple-text-dialog/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }

    public static void ausgeklappNavigationleiste(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/button").click();
    }

    public static void clickOnAServiceVertrag(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div/ma-upselling-advisory-table/div/div[2]/p-table/div/div/table/tbody/tr[1]/td[2]").click();
    }

    public static void closeServicevertragDialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-service-contract-info/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }

    public static void clickOnServiceVertrag(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div/ma-upselling-advisory-table/div/div[2]/p-table/div/div/table/tbody/tr[1]/td[2]").click();
    }

    public static void clickOnVernetzFahrzaugUAT(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div/ma-upselling-advisory-table/div/div[2]/p-table/div/div/table/tbody/tr[2]/td[2]").click();
    }

    public static void closeUATDialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-mme-details/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }

    public static void clickOnServiceSelectProgramm(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div/ma-upselling-advisory-table/div/div[2]/p-table/div/div/table/tbody/tr[4]/td[2]").click();
    }

}
