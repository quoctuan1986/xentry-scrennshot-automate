package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.sound.midi.SysexMessage;


public class Kundendialog_Page {
    public static WebDriver driver;

    public Kundendialog_Page(WebDriver driver){this.driver = driver;}

    public static WebElement element(String xpath){
        WebElement ele = driver.findElement(By.xpath(xpath));
        return ele;
    }

    public static void clickOnKundendialog() throws InterruptedException{
        while (driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/ul/li[2]/ul/li[2]/button/span[1]/span[contains(@class, 'xy-i-app-customer-dialogue')]")).isEmpty()) {
            Thread.sleep(2000);
            System.out.println("Warte auf Button Kundendialog");
        }
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

    public static void clickOnStiftSymbolOfCustomerDataPKW(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/header/div[1]/div/button").click();

    }

    public static void clickOnSaveButtonOfCustomerData(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/header/div[2]/button").click();
    }

    public static void clickOnSaveButtonOfCustomerDataPKW(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/header/div[1]/div/button").click();

    }

    public static void clickOnMercedesmeIcon(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/header/div[1]/div/xy-c-spinner/div/button").click();
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

        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-app-order-position-table/div/div[1]/h3"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToTop(){

        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-app-reception-details/div/div[2]/div[1]/label"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToAnnahme(){

        WebElement element = driver.findElement(By.xpath("//html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-reception-check-table/div/div[1]/h3"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToEmpfehlung(){

        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-upselling-advisory-table/div/div[1]/h3"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToAblehnungAuftragposition(){

        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-app-order-position-table[2]/div/div[1]/h3"));
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
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/div/button[2]/span").click();
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
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-upselling-advisory-table/div/div[2]/p-table/div/div/table/tbody//*[contains(@class, 'accessory-parts')]").click();
    }

    public static void closeZubehoerDialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-odus-details/xy-c-dialog-body/div/header/div[2]/xy-c-spinner[2]/div/button").click();
    }

    public static void clickOnTextAuftragposition(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-app-order-position-table/div/div[1]/h3").click();
    }

    public static void clickOnTextFahrzeugCheckErgebniss(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-reception-check-table/div/div[1]/h3").click();
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
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-upselling-advisory-table/div/div[2]/p-table/div/div/table/tbody//*[contains(@class, 'xy-i-document-clause')]").click();
    }

    public static void clickOnVernetzFahrzaugUAT(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-upselling-advisory-table/div/div[2]/p-table/div/div/table/tbody//*[contains(@class, 'xy-i-mercedes-me')]").click();
    }

    public static void closeUATDialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-mme-details/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }

    public static void clickOnServiceSelectProgramm(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-upselling-advisory-table/div/div[2]/p-table/div/div/table/tbody//*[contains(@class, 'xy-i-percent')]").click();
    }


    public static void clickOnKundenOffenPunktHinweis(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-reception-check-table/div/div[2]/p-table/div/div/table/tbody/tr[1]/td[2]").click();
    }

    public static void closeKundenOffenPunktHinweis(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-open-checkpoints-details/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }

    public static void clickOnKundenDelegatePunktHinweis(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-reception-check-table/div/div[2]/p-table/div/div/table/tbody/tr[2]/td[2]").click();
    }

    public static void closeKundenDelegatePunktHinweis(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-delegated-checkpoints-details/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }

    public static void clickOnZustandFahrzeugaussenseite(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-reception-check-table/div/div[2]/p-table/div/div/table/tbody/tr[3]/td[2]").click();
    }

    public static void closeZustandFahrzeugaussenseite(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-damage-checkpoint-details/xy-c-dialog-body/div/header/div[2]/xy-c-spinner[4]/div/button").click();
    }

    public static void clickOnWarnUndFunktionsleuchten(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-reception-check-table/div/div[2]/p-table/div/div/table/tbody/tr[7]/td[2]").click();
    }

    public static void closeWarnUndFunktionsleuchten(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-complaint-checkpoint-details/xy-c-dialog-body/div/header/div[2]/xy-c-spinner[4]/div/button").click();
    }

    public static void clickOnNaviKartenstand(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-reception-check-table/div/div[2]/p-table/div/div/table/tbody/tr[8]/td[2]").click();
    }

    public static void closeNaviKartenstand(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-navi-checkpoint-details/xy-c-dialog-body/div/header/div[2]/xy-c-spinner[4]/div/button").click();
    }

    public static void clickOnZustandUndProfil(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-reception-check-table/div/div[2]/p-table/div/div/table/tbody/tr[6]/td[2]").click();
    }

    public static void closeZustandUndProfil(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-wheel-checkpoint-details/xy-c-dialog-body/div/header/div[2]/xy-c-spinner[4]/div/button").click();
    }

    public static void textReplace(WebElement element, String text){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].innerHTML= '"+text+"';",element);
    }

    public static void titleReplace(){
        textReplace(element("//*[@id='xf-frame-user-name']"), UIConstants.SERVICE_BERATER);
        textReplace(element("//*[@id='xf-frame-outlet-name']"), UIConstants.BETRIEB);
    }

    public static void replaceVorgangDetails(){
        WebElement finText = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/header/div/p"));
        int indexOfSonderZeichen_1 = finText.getText().indexOf("|");
        String newString = finText.getText().substring(0, indexOfSonderZeichen_1+1)+" "+UIConstants.KUNDEN_NAME+" | "+UIConstants.KENNZEICHEN_TEXTREPLACE+" | "+UIConstants.FIN_TRUCK;
        String fin = newString.replaceAll("é", "&eacute;").replaceAll("'", "&rsquo;");
        System.out.println("text is sfsfd ......: "+fin);
        textReplace(finText , fin);
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-app-reception-details/div/div[2]/div[3]/xy-c-input/xy-c-input-wrapper/div/div/p-autocomplete/span/input").clear();
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-app-reception-details/div/div[2]/div[3]/xy-c-input/xy-c-input-wrapper/div/div/p-autocomplete/span/input").sendKeys(UIConstants.SERVICE_BERATER);
        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/ul/li[2]/button/span[1]/span"), "B-XX");
    }

    public static void replaceVorgangDetailsPKW(){
        WebElement finText = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/header/div/p"));
        int indexOfSonderZeichen_1 = finText.getText().indexOf("|");
        String newString = finText.getText().substring(0, indexOfSonderZeichen_1+1)+" "+UIConstants.KUNDEN_NAME+" | "+UIConstants.KENNZEICHEN_TEXTREPLACE+" | "+UIConstants.FIN_PKW;
        String fin = newString.replaceAll("é", "&eacute;").replaceAll("'", "&rsquo;");
        System.out.println("text is sfsfd ......: "+fin);
        textReplace(finText , fin);
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-app-reception-details/div/div[2]/div[3]/xy-c-input/xy-c-input-wrapper/div/div/p-autocomplete/span/input").clear();
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-app-reception-details/div/div[2]/div[3]/xy-c-input/xy-c-input-wrapper/div/div/p-autocomplete/span/input").sendKeys(UIConstants.SERVICE_BERATER);
        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/ul/li[2]/button/span[1]/span"), "B-XX");
    }

    public static void replaceVorgangDetailForKundenNameHinterlegt(String kennzeichen, String finID, String kundenname){
        WebElement finText = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/header/div/p"));
        String fin = finText.getText().replaceAll(finID, UIConstants.FIN_PKW);
        String fin_2 = fin.replaceAll(kennzeichen, UIConstants.KENNZEICHEN_TEXTREPLACE).replaceAll(kundenname, UIConstants.KUNDEN_NAME);
        textReplace(finText, fin_2);
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-app-reception-details/div/div[2]/div[3]/xy-c-input/xy-c-input-wrapper/div/div/p-autocomplete/span/input").clear();
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-app-reception-details/div/div[2]/div[3]/xy-c-input/xy-c-input-wrapper/div/div/p-autocomplete/span/input").sendKeys(UIConstants.SERVICE_BERATER);
        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/ul/li[2]/button/span[1]/span"), "B-XX");
    }

    public static void replaceVorgangDetails_1(String kennzeichen){
        WebElement finText = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/header/div/p"));
        String fin = finText.getText().replaceAll("WDB96702510113496", UIConstants.FIN_TRUCK);
        String fin_2 = fin.replaceAll(kennzeichen, UIConstants.KENNZEICHEN_TEXTREPLACE);
        textReplace(finText, fin_2);
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-app-reception-details/div/div[2]/div[3]/xy-c-input/xy-c-input-wrapper/div/div/p-autocomplete/span/input").clear();
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-app-reception-details/div/div[2]/div[3]/xy-c-input/xy-c-input-wrapper/div/div/p-autocomplete/span/input").sendKeys(UIConstants.SERVICE_BERATER);
        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/ul/li[2]/button/span[1]/span"), "B-XX");
    }


    public static void replaceOnVersandDialog(){
        WebElement finText = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[2]/xy-c-dialog/div[2]/ma-order-communication/xy-c-dialog-body/div/header/div[1]/p"));
        int indexOfSonderZeichen_1 = finText.getText().indexOf("|");
        String newString = finText.getText().substring(0, indexOfSonderZeichen_1+1)+" "+UIConstants.KUNDEN_NAME+" | "+UIConstants.KENNZEICHEN_TEXTREPLACE+" | "+UIConstants.FIN_TRUCK;
        String fin = newString.replaceAll("é", "&eacute;").replaceAll("'", "&rsquo;");
        System.out.println("text is sfsfd ......: "+fin);
        textReplace(finText , fin);

        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[2]/xy-c-dialog/div[2]/ma-order-communication/xy-c-dialog-body/div/div/form/div[1]/xy-c-input/xy-c-input-wrapper/div/div/input").clear();
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[2]/xy-c-dialog/div[2]/ma-order-communication/xy-c-dialog-body/div/div/form/div[1]/xy-c-input/xy-c-input-wrapper/div/div/input").sendKeys(UIConstants.EMAIL);

    }



    public static void replaceOnVersandDialogPKW(){
        WebElement finText = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[2]/xy-c-dialog/div[2]/ma-order-communication/xy-c-dialog-body/div/header/div[1]/p"));
        int indexOfSonderZeichen_1 = finText.getText().indexOf("|");
        String newString = finText.getText().substring(0, indexOfSonderZeichen_1+1)+" "+UIConstants.KUNDEN_NAME+" | "+UIConstants.KENNZEICHEN_TEXTREPLACE+" | "+UIConstants.FIN_TRUCK;
        String fin = newString.replaceAll("é", "&eacute;").replaceAll("'", "&rsquo;");
        System.out.println("text is sfsfd ......: "+fin);
        textReplace(finText , fin);

        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[2]/xy-c-dialog/div[2]/ma-order-communication/xy-c-dialog-body/div/div/form/div[1]/xy-c-input/xy-c-input-wrapper/div/div/input").clear();
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[2]/xy-c-dialog/div[2]/ma-order-communication/xy-c-dialog-body/div/div/form/div[1]/xy-c-input/xy-c-input-wrapper/div/div/input").sendKeys(UIConstants.EMAIL);
    }

    public static void clickOnRCTPrufPunktPKW(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-reception-check-table/div/div[2]/p-table/div/div/table/tbody/tr[1]/td[2]").click();
    }

    public static void closeRCTPrufPunktPKW(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-open-checkpoints-details/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }

    public static void clickOnRCDelegatePrufPunktPKW(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-reception-check-table/div/div[2]/p-table/div/div/table/tbody/tr[2]/td[2]").click();
    }

    public static void closeRCDelegateTPrufPunktPKW(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-delegated-checkpoints-details/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }

    public static void clickOnRCJaNeinPrufPunktPKW(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-reception-check-table/div/div[2]/p-table/div/div/table/tbody/tr[2]/td[2]").click();
    }

    public static void closeRCJaNeinPruefPunktPKW(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-delegated-checkpoints-details/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }

    public static void clickOnRCBildPPPKW(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-reception-check-table/div/div[2]/p-table/div/div/table/tbody/tr[3]/td[2]").click();
    }

    public static void closeRCBildPPPKW(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-damage-checkpoint-details/xy-c-dialog-body/div/header/div[2]/xy-c-spinner[4]/div/button").click();
    }

    public static void clickOnRC_IO_NIO_PPPKW(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-reception-check-table/div/div[2]/p-table/div/div/table/tbody/tr[6]/td[2]").click();
    }

    public static void closeRC_IO_NIO_PPPKW(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-complaint-checkpoint-details/xy-c-dialog-body/div/header/div[2]/xy-c-spinner[4]/div/button").click();
    }


    public static void clickOnRC_Raeder_Reifen_PP(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-reception-check-table/div/div[2]/p-table/div/div/table/tbody/tr[7]/td[2]").click();
    }

    public static void closeRC_Raeder_Reifen_PP(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-wheel-checkpoint-details/xy-c-dialog-body/div/header/div[2]/xy-c-spinner[4]/div/button").click();
    }


    public static void clickOnRC_Navi_PP(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-reception-check-table/div/div[2]/p-table/div/div/table/tbody/tr[10]/td[2]").click();
    }

    public static void closeRC_Navi_PP(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-navi-checkpoint-details/xy-c-dialog-body/div/header/div[2]/xy-c-spinner[4]/div/button").click();
    }

    public static void clickOnRC_Rel_nRel_PP(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-reception-check-table/div/div[2]/p-table/div/div/table/tbody/tr[11]/td[2]").click();
    }

    public static void closeRC_Rel_nRel_PP(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-relevant-not-relevant-checkpoint-details/xy-c-dialog-body/div/header/div[2]/xy-c-spinner[4]/div/button").click();
    }

    public static void replaceKundendatenDialog(){
        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[1]/div[3]/div[1]/xy-c-input/xy-c-input-wrapper/div/div/p"), UIConstants.KUNDEN_VORNAME);
        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[1]/div[3]/div[2]/xy-c-input/xy-c-input-wrapper/div/div/p"), UIConstants.KUNDEN_NACHNAME);
        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[2]/div[3]/div/textarea"), UIConstants.KUNDEN_NAME+"<br>"+UIConstants.STRASSE+"<br>"+UIConstants.STADT+"<br>"+UIConstants.LAND);
        System.out.println("Text is....:"+element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[2]/div[3]/div/textarea").getText());
        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[3]/div[1]/div[1]/xy-c-input/xy-c-input-wrapper/div/div/p"), UIConstants.EMAIL);
    }

    public static void replaceKundendatenDialogInEdit(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[2]/div[1]/div[2]/xy-c-input/xy-c-input-wrapper/div/div/input").clear();
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[2]/div[1]/div[2]/xy-c-input/xy-c-input-wrapper/div/div/input").sendKeys(UIConstants.STRASSE);
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[2]/div[1]/div[8]/xy-c-input/xy-c-input-wrapper/div/div/input").clear();
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[2]/div[1]/div[8]/xy-c-input/xy-c-input-wrapper/div/div/input").sendKeys(UIConstants.STADT);
    }

    public static void repalceTheServiceBeraterInVorgangDetail(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-app-reception-details/div/div[2]/div[3]/xy-c-input/xy-c-input-wrapper/div/div/p-autocomplete/span/input").clear();
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-app-reception-details/div/div[2]/div[3]/xy-c-input/xy-c-input-wrapper/div/div/p-autocomplete/span/input").sendKeys(UIConstants.SERVICE_BERATER);
    }

    public static void replaceMMCRLinkAuswahl(){
        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-app-mercedes-me-link/xy-c-dialog-body/div/div/div/p-table/div/div/table/tbody/tr/td[1]"), UIConstants.EMAIL);
    }

    public static void replaceMMCRDialogMerge(){
        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-app-customer-data-merge/xy-c-dialog-body/div/div/div/div[2]/div/div[2]/div[2]/div[1]/div/p"), UIConstants.KUNDEN_VORNAME);
        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-app-customer-data-merge/xy-c-dialog-body/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/p"), UIConstants.KUNDEN_NACHNAME);
        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-app-customer-data-merge/xy-c-dialog-body/div/div/div/div[2]/div/div[2]/div[3]/div[2]/div/p"), UIConstants.LAND);
        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-app-customer-data-merge/xy-c-dialog-body/div/div/div/div[3]/div/div[2]/div/div[1]/div[1]/div/p"), UIConstants.STRASSE);
        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-app-customer-data-merge/xy-c-dialog-body/div/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div/p"), UIConstants.STADT);
        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-app-customer-data-merge/xy-c-dialog-body/div/div/div/div[4]/div[2]/div/div[1]/div/p"), UIConstants.EMAIL);
        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-app-customer-data-merge/xy-c-dialog-body/div/div/div/div[4]/div[2]/div/div[3]/div/p"), UIConstants.TELEFON);
    }

    public static void replaceFahrzeugInfo(){
        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/xy-c-picker/div/ma-app-vehicle-info/div/div/ma-app-vehicle-info-overview/section/div/section[1]/form/div[1]/xy-c-input/xy-c-input-wrapper/div/div/p"), UIConstants.FIN_PKW);
        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/xy-c-picker/div/ma-app-vehicle-info/div/div/ma-app-vehicle-info-overview/section/div/section[1]/form/div[2]/xy-c-input/xy-c-input-wrapper/div/div/p"), UIConstants.KENNZEICHEN_TEXTREPLACE);
    }

    public static void replaceFinImMMCRDialog(String fin){
        String neueFin = element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-app-simple-text-dialog/xy-c-dialog-body/div/div/div/p[1]").getText().replaceAll(fin, UIConstants.FIN_PKW).replaceAll("é", "&eacute;").replaceAll("'", "&rsquo;").replaceAll("à", "&agrave;");
        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-app-simple-text-dialog/xy-c-dialog-body/div/div/div/p[1]"), neueFin);
    }

    public static void replaceInServiceVertragDialog(){
        String serviceVertragNummer = element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-upselling-advisory-table/div/div[2]/p-table/div/div/table/tbody/tr[2]/td[2]").getText().replaceAll("F0LC3L", UIConstants.SERVICE_NUMMER);

        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-service-contract-info/xy-c-dialog-body/div/div/div/div[2]/dc-sc-table/table/tbody/tr/td[1]/a"), UIConstants.SERVICE_NUMMER);
    }

    public static int serviceVertragZeile(){
        int zeile = driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-upselling-advisory-table/div/div[2]/p-table/div/div/table/tbody/tr")).size();
        int nummerVonZeileDesServiceVertrag = 0;
        for(int i=1; i<= zeile; i++){
            if(!driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-upselling-advisory-table/div/div[2]/p-table/div/div/table/tbody/tr["+i+"]/td[1]/span[contains(@class, 'xy-i-document-clause')]")).isEmpty()){
                nummerVonZeileDesServiceVertrag = i;
                break;
            }
        }
        System.out.println("Zeile von Servicevertrag: "+nummerVonZeileDesServiceVertrag);
        return nummerVonZeileDesServiceVertrag;
    }

    public static int angebotZeile(){
        int zeile = driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-upselling-advisory-table/div/div[2]/p-table/div/div/table/tbody/tr")).size();
        int nummerVonZeileAngebot = 0;
        for(int i=1; i<= zeile; i++){
            if(!driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-upselling-advisory-table/div/div[2]/p-table/div/div/table/tbody/tr["+i+"]/td[1]/span[contains(@class, 'xy-i-offer-app')]")).isEmpty()){
                nummerVonZeileAngebot = i;
                break;
            }
        }
        System.out.println("Zeile von Angebot: "+nummerVonZeileAngebot);
        return nummerVonZeileAngebot;
    }

    public static void replaceServiceVertragNummerAndAngebotnummer(){
        if (serviceVertragZeile() !=0){
            String servicevertragnummer = element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-upselling-advisory-table/div/div[2]/p-table/div/div/table/tbody/tr["+serviceVertragZeile()+"]/td[2]").getText().replaceAll("F0LC3L", UIConstants.SERVICE_NUMMER);
            textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-upselling-advisory-table/div/div[2]/p-table/div/div/table/tbody/tr["+serviceVertragZeile()+"]/td[2]"), servicevertragnummer);
        }

        if(angebotZeile() !=0){
            WebElement angebot = element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-upselling-advisory-table/div/div[2]/p-table/div/div/table/tbody/tr["+angebotZeile()+"]/td[2]");
            int indexOfAngebot = angebot.getText().indexOf(" ");
            String text = angebot.getText().substring(0, indexOfAngebot+1);
            textReplace(angebot, text+" "+UIConstants.ANGEBOT_NUMMER);
        }
    }

    public static void clickOnTextKundenEmpfehlen(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-upselling-advisory-table/div/div[1]/h3").click();
    }

    public static void replaceOnUATDialog(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/xy-c-picker/div/ma-app-mercedes-me/div/div/iframe"));
        String newString = element("/html/body/cvi-vehicleservices/div/cvi-vehicleservices/div/cvi-vehicleservices-mmedata/div/p-panel/div/div[2]/div/div[1]/div[1]/div[2]/div[2]/div").getText().replaceAll("son", "rau");
        textReplace(element("/html/body/cvi-vehicleservices/div/cvi-vehicleservices/div/cvi-vehicleservices-mmedata/div/p-panel/div/div[2]/div/div[1]/div[1]/div[2]/div[2]/div"), newString);
        driver.switchTo().defaultContent();
    }

    public static void replaceOnUATDialog_1(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-mme-details/xy-c-dialog-body/div/div/div/div/section/iframe"));
        String newString = element("/html/body/cvi-vehicleservices/div/cvi-vehicleservices/div/cvi-vehicleservices-mmedata/div/p-panel/div/div[2]/div/div[1]/div[1]/div[2]/div[2]/div").getText().replaceAll("son", "rau");
        textReplace(element("/html/body/cvi-vehicleservices/div/cvi-vehicleservices/div/cvi-vehicleservices-mmedata/div/p-panel/div/div[2]/div/div[1]/div[1]/div[2]/div[2]/div"), newString);
        driver.switchTo().defaultContent();
    }

    public static void clickOnHeadOfKundendialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/header").click();
    }

    public static void closeTelematikReiter(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/ma-app-context-navigation/div/ul/li[6]/button/span").click();
    }

    public static void clickOnEmailButtonImKommunikationDialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/xy-c-picker/div/ma-app-communication/div/div/xy-c-status-center/div/xy-c-status-send/form/div[3]/button[1]").click();
    }

    public static void clickOnJaNein(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/div[1]/div/ma-reception-check-table/div/div[2]/p-table/div/div/table/tbody/tr[2]/td[2]").click();
    }

    public static void waitForSpinnerNotAppearsImUAT_1() throws InterruptedException{
        driver.switchTo().defaultContent();
        driver.switchTo().frame(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-mme-details/xy-c-dialog-body/div/div/div/div/section/iframe"));
        boolean countOfSpin = true;
        while (countOfSpin ==true){
            countOfSpin = driver.findElements(By.xpath("*//div[contains(@class, 'spinner')]")).size() != 0;
            System.out.print("Warten"+"\n");
            Thread.sleep(2000);
        }
        driver.switchTo().defaultContent();

    }

    public static void waitForSpinnerNotAppearsImUA() throws InterruptedException{
        driver.switchTo().defaultContent();
        driver.switchTo().frame(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-customer-dialog-overview/div/div/div/xy-c-picker/div/ma-app-mercedes-me/div/div/iframe"));
        boolean countOfSpin = true;
        while (countOfSpin ==true){
            countOfSpin = driver.findElements(By.xpath("*//div[contains(@class, 'spinner')]")).size() != 0;
            System.out.print("Warten"+"\n");
            Thread.sleep(2000);
        }
        driver.switchTo().defaultContent();

    }


}
