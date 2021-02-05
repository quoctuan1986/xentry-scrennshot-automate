package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;


import java.util.List;

public class Auftrag_Management_Page {
    public static WebDriver driver;

    public Auftrag_Management_Page(WebDriver driver){this.driver = driver;}

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


    public static WebElement element(String xpath){
        WebElement ele = driver.findElement(By.xpath(xpath));
        return ele;
    }

    public static void alleKachelAnzeige(){
        elementWithXpath("/html/body/app-root/div/div/div[1]/div/app-tiles/div[2]/p-panel/div/div[1]/span").click();
    }

    public static void clickOnXentryOrder(){
        elementWithXpath("/html/body/app-root/div/div/div[1]/div/app-tiles/div[2]/div[1]/app-tile/a/div/div[1]").click();
    }

    public static void closeHinweis(){
        int size = driver.findElements(By.xpath("*//div[@class='xy-i-md xy-size-md xy-i-error']")).size();
        System.out.print("Size of Hinweis: "+size+"\n");
        if(size == 1){
            element("*//xy-notification-panel/div/div/div[2]/button").click();
        }
        else{
            System.out.print("Es gibt keine Hinweis!"+"\n");
        }
    }

    public static void closeHinweisForCarCheck(){
        element("/html/body/ma-cc-car-check-app/div/xy-notification-stack/div[2]/xy-notification-panel/div/div/div[2]/button").click();
    }
    public static void closeError(){
        int size = driver.findElements(By.xpath("*//div[@class='xy-i-md xy-size-md xy-i-warning xy-white']")).size();
        System.out.print("Size of Error: "+size+"\n");
        if(size == 1){
            element("/html/body/ma-cc-car-check-app/div/xy-notification-stack/div/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
        }
        else if(size >= 2){
            for (int i=2; i<=size; i++){
                int faktor = size-i+2;
                element("/html/body/ma-cc-car-check-app/div/xy-notification-stack/div["+faktor+"]/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
            }
            element("/html/body/ma-cc-car-check-app/div/xy-notification-stack/div/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
        }
        else{
            System.out.print("Es gibt keine Error!"+"\n");
        }
    }

    public static void closeErrorAndHinweis(){
        int sizeOfError = driver.findElements(By.xpath("*//div[contains(@class, 'xy-i-warning xy-white')]")).size();
        int sizeOfHinweis = driver.findElements(By.xpath("*//div[contains(@class,'xy-i-error')]")).size();
        System.out.print("Size of Error: "+sizeOfError+"\n");
        System.out.print("Size of Hinweis: "+sizeOfHinweis+"\n");
        if (sizeOfHinweis == 0 && sizeOfError ==0){
            System.out.print("Es gibt keine Hinweis!"+"\n");
            System.out.print("Es gibt keine Error!"+"\n");
        }
        else if(sizeOfError != 0 || sizeOfHinweis !=0 ){
            int size = sizeOfError+sizeOfHinweis;
            for (int i=1; i<=size; i++){
                int faktor = size-i+2;
                element("html/body/ma-cc-car-check-app/div/xy-notification-stack/div/div["+faktor+"]/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
            }
        }
    }

    public static void closeErrorAndHinweis_1(){
        int sizeOfError = driver.findElements(By.xpath("*//div[contains(@class, 'xy-i-warning xy-white')]")).size();
        int sizeOfHinweis = driver.findElements(By.xpath("*//div[contains(@class,'xy-i-error')]")).size();
        System.out.print("Size of Error: "+sizeOfError+"\n");
        System.out.print("Size of Hinweis: "+sizeOfHinweis+"\n");
        if (sizeOfHinweis == 0 && sizeOfError ==0){
            System.out.print("Es gibt keine Hinweis!"+"\n");
            System.out.print("Es gibt keine Error!"+"\n");
        }
        else if(sizeOfError != 0 || sizeOfHinweis !=0 ){
            int size = sizeOfError+sizeOfHinweis;
            for (int i=1; i<=size; i++){
                int faktor = size-i+2;
                element("html/body/ma-cc-car-check-app/div/xy-notification-stack/div/div["+faktor+"]/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
            }
        }

    }


    public static void closeErrorAndHinweis_2(){
        int sizeOfError = driver.findElements(By.xpath("*//div[contains(@class, 'xy-i-warning xy-white')]")).size();
        int sizeOfHinweis = driver.findElements(By.xpath("*//div[contains(@class,'xy-i-error')]")).size();

        System.out.print("Size of Error: "+sizeOfError+"\n");
        if (sizeOfError !=0 || sizeOfHinweis !=0){
            element("/html/body/ma-cc-car-check-app/div/xy-c-notification-bar/div/button[2]").click();
        }

    }

    public static void closeErrorInKommunikation(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-notification-bar/div/button").click();
    }


    public static void searchWithText(String text){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/header/div[2]//*[@id='undefined']").sendKeys(text);
    }

    public static void searchFieldClear(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/header/div[2]//*[@id='undefined']").clear();
    }

    public static int countOfOperationInTheList() {
        List<WebElement> elements = driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div[2]/xy-c-card"));
        System.out.print("Count of Operation is: " + elements.size()+"\n");
        return elements.size();
    }


    public static void clickOnTheOperation(String kennzeichen) {
        for (int i = 1; i <= countOfOperationInTheList(); i++) {
            WebElement element = elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div[2]/xy-c-card["+i+"]/button/span/span/span[1]/span/span[2]/span");
            System.out.print("Text is :" + element.getText() + "\n");
            if (element.getText().equals(kennzeichen)) {
                element.click();
                break;
            }
        }
    }

    public static void closeOperationInTheList(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/xy-c-picker/div/div/header/div[2]/button").click();
    }

    public static void clickOnMoreLoad(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div/div[2]/button").click();

    }

    public static void openOperation(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/xy-c-picker/div/div/xy-c-dialog-body/div/footer/div/xy-c-spinner/div/button").click();
    }

    public static void clickOnThreePointMenu(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/footer/xy-c-aux-menu/button").click();
    }

    public static void clickOnSetting(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/footer/xy-c-aux-menu/button/nav/button").click();
    }

    public static void clickOnBetriebSetting(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/ul/li[2]/button").click();
    }

    public static void clickOnMarktSetting(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/ul/li[3]/button").click();
    }

    public static void clickOnAnreichungSetting(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/ul/li[4]/button").click();
    }

    public static void clickOnAnreichungAnwenderSetting(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/enrichment-configuration/div/xy-c-tabs/div/ul/li[2]/button").click();
    }

    public static void clickOnDropDownForShortTest(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/enrichment-configuration/div/quicktest-assignment/div/form/div/p-dropdown/div/div[2]").click();
    }

    public static int countOfZuordnung(){
        List<WebElement> elements = driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/enrichment-configuration/div/quicktest-assignment/div/form/div/p-dropdown/div/div[4]/div/ul/p-dropdownitem"));
        System.out.print("Count of item is: "+elements.size()+"\n");
        return elements.size();
    }


    public static void selectTheShortTestZuordnung() {
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/enrichment-configuration/div/div/quicktest-assignment/div/form/div/p-dropdown/div/div[2]/span").click();

        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/enrichment-configuration/div/div/quicktest-assignment/div/form/div/p-dropdown/div/div[4]/div/ul/p-dropdownitem[4]/li").click();
    }

    public static void closeSetting(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/header/button").click();
    }

    public static void clickOnCustomerData(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[1]/button/span").click();
    }

    public static void clickOnEditButtonForCustomerData(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/header/div[1]/div/button[2]").click();
    }

    public static void clickOnEditButtonForCustomerDataPKW(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/header/div[1]/div/button").click();
    }



    public static void closeCustomerDataDialog(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[1]/button/span").click();
    }

    public static void clickOnVehicleData(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[2]/button/span").click();
    }

    public static void vehicleEdit(){
        elementWithXpath("*//ma-app-vehicle-info/div/header/button").click();
    }

    public static void clickOnServiceVertrafNumber(){
        elementWithXpath("*//ma-app-vehicle-info/div/div/ma-app-vehicle-info-overview/section/dc-sc-table/table/tbody/tr[1]/td[1]/a").click();
    }

    public static void closeServiceVertragDialog(){
        elementWithXpath("*//ma-service-contract-details-wrapper/div/header/button").click();
    }

    public static void clickOnButtonErweiterteDatacard(){
        elementWithXpath("*//ma-app-vehicle-info-overview/section/div/section[3]/form/button").click();
    }

    public static void closeErweiterteDatacardDialog(){
        elementWithXpath("*//ma-app-extended-datacard/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }

    public static void clickOnTabHistorie(){
        elementWithXpath("*//ma-app-vehicle-info/div/div/ul/li[2]/button").click();
    }


    public static void navigateToTitelHistorie(){
        WebElement element = driver.findElement(By.xpath("*//ma-app-vehicle-info/div/div/dc-vh-timeline/dc-vehicle-history-timeline-base/header/h3"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
    }

    public static void closeVehicleDataDialog(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[2]/button/span").click();
    }

    public static void clickOnShortTestReiter(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[3]/button/span").click();
    }

    public static void clickOnShortTestReiterForPKW(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[4]/button/span").click();
    }


    public static void closeShortTestDialog(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-quick-test-details/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }

    public static void closeShortTestReiter(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[3]/button/span").click();
    }
    public static void closeShortTestReiterForPKW(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[4]/button/span").click();
    }

    public static void clickOnAShortTest(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[2]/xy-c-dialog/div/ma-quick-test/xy-c-spinner/div/div/div[2]/div[2]/p-table/div/div/table/tbody/tr[5]/td[2]").click();
    }

    public static void moveTheCosorToElement(WebElement element){
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
    }

    public static void scrollDownThePage(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        moveTheCosorToElement(element("/html/body/app-dda/app-diagnosis-data-viewer/tab-component/div/div/div/a[3]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // This  will scroll down the page by  1000 pixel vertical
        js.executeScript("window.scrollBy(0,600)");
        driver.switchTo().defaultContent();
    }

    public static void clickOnSteuer(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        elementWithXpath("/html/body/app-dda/app-diagnosis-data-viewer/tab-component/div/div/div/a[3]").click();
        driver.switchTo().defaultContent();
    }

    public static void clickOnDocumentReiter(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[4]/button/span").click();
    }
    public static void clickOnDocumentReiterForPKW(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[5]/button/span").click();
    }

    public static void closeDocumentDialog(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[4]/button/span").click();
    }

    public static void closeDocumentDialogForPKW(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[5]/button/span").click();
    }

    public static void clickAKundendienst(){
        int size = driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/div/ma-app-order-position-table/div/div[2]/p-table/div/div/table/tbody/tr")).size();
        for (int i=1; i<= size; i++) {
            if (!driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/div/ma-app-order-position-table/div/div[2]/p-table/div/div/table/tbody/tr[" + i + "]/td[1]/span[contains(@class, 'xy-i-warning')]")).isEmpty()){
                element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/div/ma-app-order-position-table/div/div[2]/p-table/div/div/table/tbody/tr["+i+"]/td[1]").click();
                break;
            }
        }

    }

    public static void closeKundenAnliegeDialog(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-service-measure-details/div/header/div[1]/div/button[2]").click();
    }

    public static void clickOnBeanstandung(){
        int size = driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/div/ma-app-order-position-table/div/div[2]/p-table/div/div/table/tbody/tr")).size();
        for (int i=1; i<= size; i++) {
            if (!driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/div/ma-app-order-position-table/div/div[2]/p-table/div/div/table/tbody/tr[" + i + "]/td[1]/span[contains(@class, 'xy-i-truck-technical-complaint')]")).isEmpty()){
                element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/div/ma-app-order-position-table/div/div[2]/p-table/div/div/table/tbody/tr["+i+"]/td[1]").click();
                break;
            }
        }
    }


    public static void clickOnWartung(){
        int size = driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/div/ma-app-order-position-table/div/div[2]/p-table/div/div/table/tbody/tr")).size();
        for (int i=1; i<= size; i++) {
            if (!driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/div/ma-app-order-position-table/div/div[2]/p-table/div/div/table/tbody/tr[" + i + "]/td[1]/span[contains(@class, 'xy-i-large-maintenance')]")).isEmpty()){
                element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/div/ma-app-order-position-table/div/div[2]/p-table/div/div/table/tbody/tr["+i+"]/td[1]").click();
                break;
            }
        }
    }


    public static void clickOnWartungForPKW(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/div/ma-app-order-position-table/div/div[2]/p-table/div/div/table/tbody/tr[1]/td[1]").click();
    }

    public static void editWartung(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/div/button[1]").click();
    }

    public static void closeWartungDialog(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/div/button[3]").click();
    }


    public static void closeWartungDialogInEdit(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/div/button[2]").click();
    }


    public static void closeBeanstandungDialog(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/div/button[2]").click();
    }



    public static void closeWartungDialogForPKW(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/div/button[2]").click();
    }

    public static void addPackage(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/div/section[4]/header/ma-app-position-table-toolbar/div/div/button").click();
    }

    public static void unfoldPackage() {
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-app-package-selection/xy-c-dialog-body/div/div/div/div/ma-position-table/div/p-table/div/div/table/tbody/tr[11]/td[1]/button").click();
    }
    public static void closeAddPackageDialog(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-app-package-selection/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }

    public static void clickOnPlusButtonForTipps(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/div/section[4]/header/ma-app-position-table-toolbar/div/button[2]").click();
    }

    public static void clickOnPlusButtonForTippsForPKW(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/div/section[4]/header/ma-app-position-table-toolbar/div/button[2]").click();
    }


    public static void clickOnKommunikation(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[3]/button/span").click();
    }

    public static void closeKommunikationReiter(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[3]/button/span").click();
    }

    public static void clickOnTextFahrzeuginformation(){
        elementWithXpath("*//ma-app-vehicle-info/div/header/h2").click();
    }

    public static void clickOnTextKundendaten(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/header/div[1]/h2").click();
    }

    public static void clickOnArchivBar(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/ul/li[2]/button/span[1]/span").click();
    }

    public static void closeTippsDialog(){
        elementWithXpath("/html/body/xiw-app/div/xiw-research-complaint/div/div[2]/app-common-concern/div[2]/div[2]/div/button[2]/span").click();
    }

    public static void clickOnAArchiv(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div/div[1]/p-table/div/div/div/div[2]/table/tbody/tr[3]/td[4]").click();
    }

    public static void clickOnBeanstandungOfPKW(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div/ma-app-order-position-table/div/div[2]/p-table/div/div/table/tbody/tr[3]/td[1]").click();
    }

    public static void closeBeanstandungsdialog(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/div/button[2]").click();
    }

    public static void clickOnNotificationDetails(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-notification-bar/div/button[1]").click();
    }

    public static void clickOnTextDokumente(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-documents-tab/div/header/h2").click();
    }

    public static void zoomIn(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = '0.8'");
    }
    public static void zoomIn_1(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = '0.9'");
    }

    public static void zoomRelease(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = '1.0'");
    }

    public static void zoomInKurzTest(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = '0.8'");
        driver.switchTo().defaultContent();

    }

    public static void zoomReleaseKurzTest(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = '1.0'");
        driver.switchTo().defaultContent();

    }

    public static void waitForSpinnerNotAppearsInKurztesDialogAnsicht() throws InterruptedException{
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        boolean countOfSpin = true;
        while (countOfSpin ==true){
            countOfSpin = driver.findElements(By.xpath("*//div[contains(@class, 'xy-spinner xy-spinner-obsidian xy-size-xl')]")).size() != 0;
            System.out.print("Warten"+"\n");
            Thread.sleep(1000);
        }
        driver.switchTo().defaultContent();
    }



    public static void sortiertArchivNachTermin(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div/div[1]/p-table/div/div/div/div[1]/div/table/thead/tr/th[1]").click();
    }

    public static void clickOnTextAuftragmanagement(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/header/div/h2").click();
    }

    public static void clickOnTextTechnischeBeanstandung(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/h2").click();
    }

    public static void waitForSpinnerNotAppears() throws InterruptedException{
        boolean countOfSpin = true;
        while (countOfSpin ==true){
            countOfSpin = driver.findElements(By.xpath("*//div[contains(@class, 'spinner')]")).size() != 0;
            System.out.print("Warten"+"\n");
            Thread.sleep(1000);
        }
    }

    public static void scrollDownThePageToTruckInTheVorgangListe(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-reception-list/div/div/div/div[1]/p-table/div/div/div/div[2]/table/tbody/tr[56]/td[4]"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void clickOnTextJobsInTheJobsListe(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/header/h1").click();
    }

    public static int countOfArchivJobsInList() {
        List<WebElement> elements = driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-reception-list/div/div/div/div[1]/p-table/div/div/div/div[2]/table/tbody/tr"));
        System.out.print("Count of Fleet is: " + elements.size() + "\n");
        return elements.size();
    }


    public static void clickOnTheArchivJob(String fin) {
        for (int i = 1; i <= countOfArchivJobsInList(); i++) {
            WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-reception-list/div/div/div/div[1]/p-table/div/div/div/div[2]/table/tbody/tr[" + i + "]/td[4]"));
            System.out.print("Text is :" + element.getText() + "\n");
            if (element.getText().equals(fin)) {
                element.click();
                break;
            }
        }
    }




    public static WebElement archivJob(String fin){
        WebElement job = new RemoteWebElement();
        for (int i = 1; i <= countOfArchivJobsInList(); i++) {
            WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div/div[1]/p-table/div/div/div/div[2]/table/tbody/tr["+i+"]/td[4]"));
            System.out.print("Text is :" + element.getText() + "\n");
            if (element.getText().equals(fin)) {
                job = element;
                break;
            }
        }
        return job;
    }

    public static void scrollDownThePageToArchivJobInTheVorgangListe(String fin){
        WebElement element = archivJob(fin);
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static WebElement job(String kennzeichen){
        WebElement jobElement =  new RemoteWebElement();
        for (int i = 1; i <= countOfOperationInTheList(); i++) {
            WebElement element = driver.findElement(By.xpath("//html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div/div[1]/p-table/div/div/div/div[2]/table/tbody/tr["+i+"]/td[4]"));
            System.out.print("Text is :" + element.getText() + "\n");
            if (element.getText().equals(kennzeichen)) {
                jobElement = element;
                break;
            }
        }
        return jobElement;
    }

    public static void scrollDownThePageToJobInTheVorgangListe(String kennzeichen){
        WebElement element = job(kennzeichen);
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void clickOnTabKurzTestAnalyse(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-quick-test-details/xy-c-dialog-body/div/div/div/div/ul/li[2]/button").click();
    }

    public static void unfoldPaketTruck(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-app-package-selection/xy-c-dialog-body/div/div/div/div/ma-position-table/div/p-table/div/div/table/tbody/tr[8]/td[1]/button").click();
    }

    public static void clickOnSideNavigation(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/button").click();
    }

   public static void clickOnTextKurztest(){
       elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[2]/xy-c-dialog/div/ma-quick-test/xy-c-spinner/div/div/h2").click();
   }

   public static void clickOnTextKundendienstmassnahme(){
       elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-service-measure-details/div/header/div[1]/h2").click();
   }

   public static void clickOnTextWartung(){
       elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/h2").click();
   }

   public static void clickOnTextPaketauswahl(){
       elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-app-package-selection/xy-c-dialog-body/div/header/div[1]/h2").click();
   }

   public static void clickOnTextArchiv(){
       elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/header/div/h2").click();
   }

   public static void clickOnAArchivOnTheList(){
       elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div/div[1]/p-table/div/div/div/div[2]/table/tbody/tr[1]/td[4]").click();
   }

   public static void clickOnWartung_2(){
       elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/div/ma-app-order-position-table/div/div[2]/p-table/div/div/table/tbody/tr[2]/td[1]").click();
   }

   public static void clickOnEditButtonOnWartung(){
       elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/div/button[1]").click();
   }

    public static void textReplace(WebElement element, String text){
        String newText = text.replaceAll("é", "&eacute;").replaceAll("'", "&rsquo;");
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].innerHTML= '"+newText+"';",element);
    }


    public static void titleReplace(){
        textReplace(element("//*[@id='xf-frame-user-name']"), UIConstants.SERVICE_BERATER);
        textReplace(element("//*[@id='xf-frame-outlet-name']"), UIConstants.BETRIEB);
    }

    public static void gutenTag(){
        System.out.println("text is dsgsagad:"+element("/html/body/app-root/div/div/div[1]/app-welcome/div[2]/div/div").getText());
        String string = element("/html/body/app-root/div/div/div[1]/app-welcome/div[2]/div/div").getText().replaceAll("\\r\\n|\\r|\\n", " ");
        String[] parts = string.split(",");
        System.out.println(string);
        textReplace(element("/html/body/app-root/div/div/div[1]/app-welcome/div[2]/div/div"), parts[0]+","+"<br>"+UIConstants.SERVICE_BERATER+"!");
    }

    public static int countOfVorgangInTheList() {
        List<WebElement> elements = driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div[2]/xy-c-card"));
        return elements.size();
    }

    public static void replaceVorgangList(){
        for (int i=1; i<=countOfVorgangInTheList(); i++){
            textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div[2]/xy-c-card["+i+"]/button/span/span/span[3]/span/span[3]/span"), UIConstants.SERVICE_BERATER);
            textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div[2]/xy-c-card["+i+"]/button/span/span/span[1]/span/span[1]/span"), UIConstants.KUNDEN_NAME);
            textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div[2]/xy-c-card["+i+"]/button/span/span/span[1]/span/span[2]/span"), UIConstants.KENNZEICHEN_TEXTREPLACE);

        }
    }

    public static void replaceVorgangListPKW(){
        for (int i=1; i<=countOfVorgangInTheList(); i++){
            if (!driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div[2]/xy-c-card["+i+"]/button/span/span/span[3]/span/span[3]/span")).isEmpty()){
                textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div[2]/xy-c-card["+i+"]/button/span/span/span[3]/span/span[3]/span"), UIConstants.SERVICE_BERATER);

            }
            if (!driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div[2]/xy-c-card["+i+"]/button/span/span/span[1]/span/span[1]/span")).isEmpty()){
                textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div[2]/xy-c-card["+i+"]/button/span/span/span[1]/span/span[1]/span"), UIConstants.KUNDEN_NAME);

            }
            if (!driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div[2]/xy-c-card["+i+"]/button/span/span/span[1]/span/span[2]/span")).isEmpty()){
                textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div[2]/xy-c-card["+i+"]/button/span/span/span[1]/span/span[2]/span"), UIConstants.KENNZEICHEN_TEXTREPLACE);
            }


        }
    }

    public static void replaceVorgangOverlay(){
        WebElement finText = elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/xy-c-picker/div/div/header/div[1]/div/p");
        int indexOfSonderZeichen_1 = finText.getText().indexOf("|");
        String newString = finText.getText().substring(0, indexOfSonderZeichen_1+1)+" "+UIConstants.KUNDEN_NAME+" | "+UIConstants.KENNZEICHEN_TEXTREPLACE+" | "+UIConstants.FIN_TRUCK;
        String fin = newString.replaceAll("é", "&eacute;").replaceAll("'", "&rsquo;");
        System.out.println("text is sfsfd ......: "+fin);
        textReplace(finText , fin);
        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/xy-c-picker/div/div/xy-c-dialog-body/div/div/ma-job-details/div/div/div[2]/div[3]//*[@id='undefined']"), UIConstants.SERVICE_BERATER);
    }

    public static void replaceVorgangOverlayPKW(){
        WebElement finText = elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/xy-c-picker/div/div/header/div[1]/div/p");
        int indexOfSonderZeichen_1 = finText.getText().indexOf("|");
        String newString = finText.getText().substring(0, indexOfSonderZeichen_1+1)+" "+UIConstants.KUNDEN_NAME+" | "+UIConstants.KENNZEICHEN_TEXTREPLACE+" | "+UIConstants.FIN_PKW;
        String fin = newString.replaceAll("é", "&eacute;").replaceAll("'", "&rsquo;");
        System.out.println("text is sfsfd ......: "+fin);
        textReplace(finText , fin);
        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/xy-c-picker/div/div/xy-c-dialog-body/div/div/ma-job-details/div/div/div[2]/div[3]/xy-c-input/xy-c-input-wrapper/div/div/input"), UIConstants.SERVICE_BERATER);
    }

    public static void replaceVorgangDetails(){
        WebElement finText = elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/header/div/p");
        int indexOfSonderZeichen_1 = finText.getText().indexOf("|");
        String newString = finText.getText().substring(0, indexOfSonderZeichen_1+1)+" "+UIConstants.KUNDEN_NAME+" | "+UIConstants.KENNZEICHEN_TEXTREPLACE+" | "+UIConstants.FIN_TRUCK;
        String fin = newString.replaceAll("é", "&eacute;").replaceAll("'", "&rsquo;");
        System.out.println("text is sfsfd ......: "+fin);
        textReplace(finText , fin);
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/div/ma-app-reception-details/div/div[2]/div[3]/xy-c-input/xy-c-input-wrapper/div/div/p-autocomplete/span/input").clear();
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/div/ma-app-reception-details/div/div[2]/div[3]/xy-c-input/xy-c-input-wrapper/div/div/p-autocomplete/span/input").sendKeys(UIConstants.SERVICE_BERATER);
        textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/ul/li[2]/button/span[1]/span"), "B-XX");
    }

    public static void replaceVorgangDetailsPKW(){
        WebElement finText = elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/header/div/p");
        int indexOfSonderZeichen_1 = finText.getText().indexOf("|");
        String newString = finText.getText().substring(0, indexOfSonderZeichen_1+1)+" "+UIConstants.KUNDEN_NAME+" | "+UIConstants.KENNZEICHEN_TEXTREPLACE+" | "+UIConstants.FIN_PKW;
        String fin = newString.replaceAll("é", "&eacute;").replaceAll("'", "&rsquo;");
        System.out.println("text is sfsfd ......: "+fin);
        textReplace(finText , fin);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/div/ma-app-reception-details/div/div[2]/div[3]/xy-c-input/xy-c-input-wrapper/div/div/p-autocomplete/span/input").clear();
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/div/ma-app-reception-details/div/div[2]/div[3]/xy-c-input/xy-c-input-wrapper/div/div/p-autocomplete/span/input").sendKeys(UIConstants.SERVICE_BERATER);
        textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/ul/li[2]/button/span[1]/span"), "B-XX");
    }

    public static void replaceFahrzeugInfo(){
        textReplace(elementWithXpath("*//ma-app-vehicle-info-overview/section/div/section[1]/form/div[1]/xy-c-input/xy-c-input-wrapper/div/div/p"), UIConstants.FIN_TRUCK);
        textReplace(elementWithXpath("*//ma-app-vehicle-info-overview/section/div/section[1]/form/div[2]/xy-c-input/xy-c-input-wrapper/div/div/p"), UIConstants.KENNZEICHEN_TEXTREPLACE);
        textReplace(elementWithXpath("*//ma-app-vehicle-info/div/div/ma-app-vehicle-info-overview/section/div/section[3]/form/div[3]/xy-c-input/xy-c-input-wrapper/div/div/p"), "123456");
        textReplace(elementWithXpath("*//ma-app-vehicle-info/div/div/ma-app-vehicle-info-overview/section/dc-sc-table/table/tbody/tr[1]/td[1]/a"), UIConstants.SERVICE_NUMMER);
        textReplace(elementWithXpath("*//ma-app-vehicle-info-overview/section/dc-sc-table/table/tbody/tr[2]/td[1]/a"), UIConstants.SERVICE_NUMMER_2);

    }

    public static void replaceFahrzeugInfoInEdit(){
        elementWithXpath("*//ma-app-vehicle-info/div/div/ma-app-vehicle-info-overview/section/div/section[1]/form/div[2]//*[@id='undefined']").clear();
        elementWithXpath("*//ma-app-vehicle-info/div/div/ma-app-vehicle-info-overview/section/div/section[1]/form/div[2]//*[@id='undefined']").sendKeys(UIConstants.KENNZEICHEN_TEXTREPLACE);
    }

    public static void replaceFahrzeugInfoPKW(){
        textReplace(elementWithXpath("*//ma-app-vehicle-info/div/div/ma-app-vehicle-info-overview/section/div/section[1]/form/div[1]/xy-c-input/xy-c-input-wrapper/div/div/p"), UIConstants.FIN_PKW);
        textReplace(elementWithXpath("*//ma-app-vehicle-info/div/div/ma-app-vehicle-info-overview/section/div/section[1]/form/div[2]/xy-c-input/xy-c-input-wrapper/div/div/p"), UIConstants.KENNZEICHEN_TEXTREPLACE);
        textReplace(elementWithXpath("*//ma-app-vehicle-info/div/div/ma-app-vehicle-info-overview/section/div/section[3]/form/div[3]/xy-c-input/xy-c-input-wrapper/div/div/p"), "123456");
        textReplace(elementWithXpath("*//ma-app-vehicle-info/div/div/ma-app-vehicle-info-overview/section/dc-sc-table/table/tbody/tr[1]/td[1]/a"), UIConstants.SERVICE_NUMMER);

    }



    public static void replaceFahrzeugInfoInEditPKW(){
        elementWithXpath("*//ma-app-vehicle-info/div/div/ma-app-vehicle-info-overview/section/div/section[1]/form/div[2]//*[@id='undefined']").clear();
        elementWithXpath("*//ma-app-vehicle-info/div/div/ma-app-vehicle-info-overview/section/div/section[1]/form/div[2]//*[@id='undefined']").sendKeys(UIConstants.KENNZEICHEN_TEXTREPLACE);
    }

    public static void replaceServiceVertragNummerInServiceDetail(){
        WebElement elementNummer = elementWithXpath("*//dc-sc-details/dc-sc-details-base/header/h2");
        System.out.println(elementNummer.getText());
        String nummerOfVertrag = elementNummer.getText().replaceAll("UP099A", UIConstants.SERVICE_NUMMER);
        textReplace(elementNummer, nummerOfVertrag);
        textReplace(elementWithXpath("*//dc-sc-details/dc-sc-details-base/div/div[1]/div[1]/table/tbody/tr[4]/td[2]"), UIConstants.SERVICE_NUMMER);
        textReplace(elementWithXpath("*//dc-sc-details/dc-sc-details-base/div/div[1]/div[1]/table/tbody/tr[5]/td[2]"), UIConstants.FIRMENNAME);
        textReplace(elementWithXpath("*//dc-sc-details/dc-sc-details-base/div/div[1]/div[1]/table/tbody/tr[3]/td[2]"), "12345");
    }

    public static void replaceServiceVertragNummerInServiceDetailPKW(){
        WebElement elementNummer = elementWithXpath("*//dc-sc-details/dc-sc-details-base/header/h2");
        System.out.println(elementNummer.getText());
        String nummerOfVertrag = elementNummer.getText().replaceAll("113682739080080", UIConstants.SERVICE_NUMMER);
        textReplace(elementNummer, nummerOfVertrag);
        textReplace(elementWithXpath("*//dc-sc-details/dc-sc-details-base/div/div[1]/div[1]/table/tbody/tr[4]/td[2]"), UIConstants.SERVICE_NUMMER);
        textReplace(elementWithXpath("*//dc-sc-details/dc-sc-details-base/div/div[1]/div[1]/table/tbody/tr[5]/td[2]"), UIConstants.FIRMENNAME);
    }



    public static void replaceOnKurztestDetail(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-quick-test-details/xy-c-dialog-body/div/div/div/div/section/section/iframe"));
        textReplace(elementWithXpath("/html/body/app-dda/app-diagnosis-data-viewer/header-component/div[1]/div[1]/div/span"), UIConstants.FIN_TRUCK);
        driver.switchTo().defaultContent();
    }


    public static void replaceOnKurztestDetailPKW(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-quick-test-details/xy-c-dialog-body/div/div/div/div/section/section/iframe"));
        textReplace(elementWithXpath("/html/body/app-dda/app-diagnosis-data-viewer/header-component/div[1]/div[1]/div/span"), UIConstants.FIN_PKW);
        driver.switchTo().defaultContent();
    }

    public static void replaceOnDoucumentReiter(){
        for (int i=1; i<6; i++){
            WebElement finText = elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-documents-tab/div/div/section[1]/ma-app-attachments-table/div/p-table/div/div/table/tbody/tr["+i+"]/td[2]");
            String fin = finText.getText().replaceAll("WDB96302010127665", UIConstants.FIN_TRUCK);
            textReplace(finText, fin);
        }
    }

    public static void replaceOnDoucumentReiter_2(){
        for (int i=2; i<4; i++){
            WebElement finText = elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-documents-tab/div/div/section[1]/ma-app-attachments-table/div/p-table/div/div/table/tbody/tr["+i+"]/td[2]");
            String fin = finText.getText().replaceAll("WDB96302010127665", UIConstants.FIN_TRUCK);
            textReplace(finText, fin);
        }
    }

    public static void replaceOnDoucumentReiterPKW(){
        for (int i=1; i<3; i++){
            WebElement finText = elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-documents-tab/div/div/section[1]/ma-app-attachments-table/div/p-table/div/div/table/tbody/tr["+i+"]/td[2]");
            String fin = finText.getText().replaceAll("WDD2130501A253633", UIConstants.FIN_PKW);
            textReplace(finText, fin);
        }
    }


    public static void replaceInTipsDialog(){
        textReplace(elementWithXpath("/html/body/xiw-app/div/xiw-research-complaint/div/div[1]/div[1]/span"), UIConstants.FIN_TRUCK);
    }

    public static void replaceInTipsDialogPKW(){
        textReplace(elementWithXpath("/html/body/xiw-app/div/xiw-research-complaint/div/div[1]/div[1]/span"), UIConstants.FIN_PKW);
    }


    public static void replaceArchivList(){
        int sizeOfArchiv = driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div/div[1]/p-table/div/div/div/div[2]/table/tbody/tr")).size();

        for (int i=1; i<=sizeOfArchiv; i++){
            textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div/div[1]/p-table/div/div/div/div[2]/table/tbody/tr["+i+"]/td[4]"), UIConstants.FIN_TRUCK);
        }
    }


    public static void replaceArchivListPKW(){
        int sizeOfArchiv = driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div/div[1]/p-table/div/div/div/div[2]/table/tbody/tr")).size();

        for (int i=1; i<=sizeOfArchiv; i++){
            textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div/div[1]/p-table/div/div/div/div[2]/table/tbody/tr["+i+"]/td[4]"), UIConstants.FIN_PKW);
        }
    }

    public static void replaceVorgangUebersichtArchiv(String fin){
        WebElement nummer = elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/xy-c-picker/div/div/header/div[1]/p");
        String text = nummer.getText().replaceAll(fin, UIConstants.FIN_TRUCK).replaceAll("é", "&eacute;").replaceAll("'", "&rsquo;");;
        textReplace(nummer, text);
        textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/header/div[2]//*[@id='undefined']"), UIConstants.FIN_TRUCK);
    }

    public static void replaceVorgangUebersichtArchivPKW(String fin){
        WebElement nummer = elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/xy-c-picker/div/div/header/div[1]/p");
        String text = nummer.getText().replaceAll(fin, UIConstants.FIN_PKW).replaceAll("é", "&eacute;").replaceAll("'", "&rsquo;");;
        textReplace(nummer, text);
        textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/header/div[2]//*[@id='undefined']"), UIConstants.FIN_PKW);
    }

    public static void replaceInArchivDetail(String fin){
        WebElement nummer = elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/header/div/p");
        String text = nummer.getText().replaceAll(fin, UIConstants.FIN_TRUCK).replaceAll("é", "&eacute;").replaceAll("'", "&rsquo;");;
        textReplace(nummer, text);
        textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/ul/li[3]/button/span[2]/span"), UIConstants.FIN_TRUCK);
    }

    public static void replaceInArchivDetailPKW(String fin){
        WebElement nummer = elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/header/div/p");
        String text = nummer.getText().replaceAll(fin, UIConstants.FIN_PKW).replaceAll("é", "&eacute;").replaceAll("'", "&rsquo;");;
        textReplace(nummer, text);
        textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/ul/li[3]/button/span[2]/span"), UIConstants.FIN_PKW);
    }

    public static void repalceTheServiceBeraterInVorgangDetail(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/div/ma-app-reception-details/div/div[2]/div[3]/xy-c-input/xy-c-input-wrapper/div/div/p-autocomplete/span/input").clear();
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div[1]/div/ma-app-reception-details/div/div[2]/div[3]/xy-c-input/xy-c-input-wrapper/div/div/p-autocomplete/span/input").sendKeys(UIConstants.SERVICE_BERATER);
    }


    public static void clickOnButtonSpeichernOnKundendatenReiter(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/header/div[1]/div/button[2]").click();
    }


    public static void suchenInKundendaten(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/header/div[1]/div/button[1]").click();
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-ccdb-search/xy-c-dialog-body/div/div/form/div/div[1]//input").sendKeys("Thomas");
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-ccdb-search/xy-c-dialog-body/div/div/form/div/div[2]//input").sendKeys("Stuttgart");
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-ccdb-search/xy-c-dialog-body/div/div/form/div/div[3]/button").click();
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-ccdb-search/xy-c-dialog-body/div/div/section/xy-c-spinner/div/div/p-table/div/div/table/tbody/tr[4]/td[1]/button").click();

    }

    public static void clickOnButtonImportInKundendatenReiter(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-ccdb-search/xy-c-dialog-body/div/footer/div/xy-c-spinner/div/button").click();
    }

    public static void closeDatenAuswahlDialog(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-ccdb-search/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }

    public static void closeDatenImportDialog(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-app-customer-data-merge/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }

    public static void replaceInDatenAuswahl(){
        int countOfZeile = driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-ccdb-search/xy-c-dialog-body/div/div/section/xy-c-spinner/div/div/p-table/div/div/table/tbody/tr")).size();
        for (int i=1; i<= countOfZeile; i++){
            textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-ccdb-search/xy-c-dialog-body/div/div/section/xy-c-spinner/div/div/p-table/div/div/table/tbody/tr["+i+"]/td[4]"),UIConstants.STRASSE+", "+UIConstants.STADT+"<br> "+UIConstants.LAND);
            textReplace(element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-ccdb-search/xy-c-dialog-body/div/div/section/xy-c-spinner/div/div/p-table/div/div/table/tbody/tr["+i+"]/td[2]"), UIConstants.KUNDEN_NAME+"<br>"+UIConstants.FIRMENNAME);
        }
        textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-ccdb-search/xy-c-dialog-body/div/div/section/xy-c-spinner/div/div/p-table/div/div/table/tbody/tr[5]/td[3]"), UIConstants.EMAIL+"<br>"+UIConstants.TELEFON);

        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-ccdb-search/xy-c-dialog-body/div/div/form/div/div[1]//input").clear();
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-ccdb-search/xy-c-dialog-body/div/div/form/div/div[1]//input").sendKeys(UIConstants.KUNDEN_VORNAME);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-ccdb-search/xy-c-dialog-body/div/div/form/div/div[2]//input").clear();
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-ccdb-search/xy-c-dialog-body/div/div/form/div/div[2]//input").sendKeys(UIConstants.STADT);



    }

    public static void clickOnTabelleEintrag(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-ccdb-search/xy-c-dialog-body/div/div/section/xy-c-spinner/div/div/p-table/div/div/table/tbody/tr[5]/td[2]").click();
    }

    public static void clickOnButtonAkzeptierenImKundendatendialog(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-app-customer-data-merge/xy-c-dialog-body/div/footer/div/xy-c-spinner/div/button").click();
    }

    public static void replaceImKundenDailogMerge(){
        textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-app-customer-data-merge/xy-c-dialog-body/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/p"), UIConstants.KUNDEN_NACHNAME);
        textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-app-customer-data-merge/xy-c-dialog-body/div/div/div/div[2]/div/div[2]/div[2]/div[1]/div/p"), UIConstants.KUNDEN_NACHNAME);
        textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-app-customer-data-merge/xy-c-dialog-body/div/div/div/div[2]/div/div[2]/div[4]/div/div/p"), UIConstants.FIRMENNAME);
        textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-app-customer-data-merge/xy-c-dialog-body/div/div/div/div[3]/div/div[2]/div/textarea[1]"), UIConstants.FIRMENNAME);
        textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-app-customer-data-merge/xy-c-dialog-body/div/div/div/div[3]/div/div[2]/div/textarea[2]"), UIConstants.STRASSE+"<br>"+UIConstants.STADT+"<br>"+UIConstants.LAND);
        textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-app-customer-data-merge/xy-c-dialog-body/div/div/div/div[4]/div[2]/div/div[1]/div/p"), UIConstants.EMAIL);
        textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-app-customer-data-merge/xy-c-dialog-body/div/div/div/div[4]/div[2]/div/div[2]/div/p"), UIConstants.MOBILE);
    }

    public static void replaceImKundendatenDialog(){
        textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[1]/div[3]/div[1]/xy-c-input/xy-c-input-wrapper/div/div"), UIConstants.KUNDEN_VORNAME);
        textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[1]/div[3]/div[2]/xy-c-input/xy-c-input-wrapper/div/div/p"), UIConstants.KUNDEN_NACHNAME);
        textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[1]/div[5]/div[1]/xy-c-input/xy-c-input-wrapper/div/div/p"), UIConstants.FIRMENNAME);
        textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[1]/div[5]/div[2]/xy-c-input/xy-c-input-wrapper/div/div/p"), UIConstants.FIRMENNAME);
        textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[3]/div[1]/div[1]/xy-c-input/xy-c-input-wrapper/div/div/p"), UIConstants.EMAIL);
        textReplace(elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[3]/div[1]/div[3]/xy-c-input/xy-c-input-wrapper/div/div/p"), UIConstants.MOBILE);
    }

    public static void replaceImKundendatenDialogInEdit(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[1]/div[3]/div[2]/xy-c-input/xy-c-input-wrapper/div/div/input").clear();
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[1]/div[3]/div[2]/xy-c-input/xy-c-input-wrapper/div/div/input").sendKeys(UIConstants.KUNDEN_NACHNAME);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[1]/div[5]/div[1]/xy-c-input/xy-c-input-wrapper/div/div/input").clear();
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[1]/div[5]/div[1]/xy-c-input/xy-c-input-wrapper/div/div/input").sendKeys(UIConstants.FIRMENNAME);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[1]/div[5]/div[2]/xy-c-input/xy-c-input-wrapper/div/div/input").clear();
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[1]/div[5]/div[2]/xy-c-input/xy-c-input-wrapper/div/div/input").sendKeys(UIConstants.FIRMENNAME);

        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[2]/div[2]/div[1]/textarea").clear();
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[2]/div[2]/div[1]/textarea").sendKeys(UIConstants.KUNDEN_NAME +" "+UIConstants.STRASSE+" "+UIConstants.STADT);

        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[2]/div[2]/div[2]/textarea").clear();
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[2]/div[2]/div[2]/textarea").sendKeys(UIConstants.FIRMENNAME +" "+UIConstants.STRASSE+" "+UIConstants.STADT);


        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[3]/div[1]/div[1]/xy-c-input/xy-c-input-wrapper/div/div/input").clear();
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[3]/div[1]/div[1]/xy-c-input/xy-c-input-wrapper/div/div/input").sendKeys(UIConstants.EMAIL);

        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[3]/div[1]/div[3]/xy-c-input/xy-c-input-wrapper/div/div/input").clear();
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/div/form/section[3]/div[1]/div[3]/xy-c-input/xy-c-input-wrapper/div/div/input").sendKeys(UIConstants.MOBILE);

    }









}
