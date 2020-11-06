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

    public static WebElement element(String xpath){
        WebElement ele = driver.findElement(By.xpath(xpath));
        return ele;
    }

    public static void alleKachelAnzeige(){
        element("/html/body/app-root/div/div/div[1]/div/app-tiles/div[2]/p-panel/div/div[1]/span").click();
    }

    public static void clickOnXentryOrder(){
        element("/html/body/app-root/div/div/div[1]/div/app-tiles/div[2]/div[1]/app-tile/a/div/div[1]").click();
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
        if (sizeOfHinweis != 0){
            if (sizeOfHinweis ==1 && sizeOfError ==0){
                element("/html/body/ma-cc-car-check-app/div/xy-notification-stack/div/xy-notification-panel/div/div/div[2]/button[2]").click();
            }
            else{
                for(int i=1; i<=sizeOfError+sizeOfHinweis; i++){
                    int f = i+1;
                    boolean hinweis = driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-notification-stack/div/div["+f+"]/xy-notification-panel/div/div[1]/div[1]/div[contains(@class,'xy-i-error')]")).isEmpty();
                    if(hinweis == false){
                        element("/html/body/ma-cc-car-check-app/div/xy-notification-stack/div/div["+f+"]/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
                    }
                }
            }

        }
        else{
            System.out.print("Es gibt keine Hinweis!"+"\n");
        }

        if(sizeOfError == 1){
            element("/html/body/ma-cc-car-check-app/div/xy-notification-stack/div/div[2]/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
        }
        else if(sizeOfError >= 2){
            for (int i=2; i<=sizeOfError; i++){
                int faktor = sizeOfError-i+3;
                element("/html/body/ma-cc-car-check-app/div/xy-notification-stack/div/div["+faktor+"]/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
            }
            element("/html/body/ma-cc-car-check-app/div/xy-notification-stack/div/div[2]/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
        }
        else{
            System.out.print("Es gibt keine Error!"+"\n");
        }
    }


    public static void searchWithText(String text){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-reception-list/div/div/header/div/xy-c-search/div/button").click();
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-reception-list/div/div/header/div/xy-c-search/div/div/input").sendKeys(text);

    }

    public static int countOfOperationInTheList() {
        List<WebElement> elements = driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-reception-list/div/div/div/div[1]/p-table/div/div/div/div[2]/table/tbody/tr"));
        System.out.print("Count of Operation is: " + elements.size()+"\n");
        return elements.size();
    }


    public static void clickOnTheOperation(String kennzeichen) {
        for (int i = 1; i <= countOfOperationInTheList(); i++) {
            WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-reception-list/div/div/div/div[1]/p-table/div/div/div/div[2]/table/tbody/tr["+i+"]/td[3]"));
            System.out.print("Text is :" + element.getText() + "\n");
            if (element.getText().equals(kennzeichen)) {
                element.click();
                break;
            }
        }
    }

    public static void closeOperationInTheList(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-reception-list/div/xy-c-picker/div/div/header/div[2]/button").click();
    }

    public static void clickOnMoreLoad(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-reception-list/div/div/div/div[2]/button").click();
    }

    public static void openOperation(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-reception-list/div/xy-c-picker/div/div/xy-c-dialog-body/div/footer/div/xy-c-spinner/div/button").click();
    }

    public static void clickOnThreePointMenu(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/footer/xy-c-aux-menu/button").click();
    }

    public static void clickOnSetting(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/footer/xy-c-aux-menu/button/nav/button").click();
    }

    public static void clickOnBetriebSetting(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/ul/li[2]/button").click();
    }

    public static void clickOnMarktSetting(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/ul/li[3]/button").click();
    }

    public static void clickOnAnreichungSetting(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/ul/li[4]/button").click();
    }

    public static void clickOnAnreichungAnwenderSetting(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/enrichment-configuration/div/xy-c-tabs/div/ul/li[2]/button").click();
    }

    public static void clickOnDropDownForShortTest(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/enrichment-configuration/div/quicktest-assignment/div/form/div/p-dropdown/div/div[2]").click();
    }

    public static int countOfZuordnung(){
        List<WebElement> elements = driver.findElements(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/enrichment-configuration/div/quicktest-assignment/div/form/div/p-dropdown/div/div[4]/div/ul/p-dropdownitem"));
        System.out.print("Count of item is: "+elements.size()+"\n");
        return elements.size();
    }


    public static void selectTheShortTestZuordnung() throws InterruptedException {
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/enrichment-configuration/div/div/quicktest-assignment/div/form/div/p-dropdown/div/div[2]/label").click();
        Thread.sleep(2000);
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/enrichment-configuration/div/div/quicktest-assignment/div/form/div/p-dropdown/div/div[4]/div/ul/p-dropdownitem[4]/li").click();
    }

    public static void closeSetting(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/header/button").click();
    }

    public static void clickOnCustomerData(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[1]/button/span").click();
    }

    public static void clickOnEditButtonForCustomerData(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/header/div[2]/button").click();
    }

    public static void closeCustomerDataDialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[1]/button/span").click();
    }

    public static void clickOnVehicleData(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[2]/button/span").click();
    }

    public static void vehicleEdit(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-vehicle-info/div/header/button").click();
    }

    public static void clickOnServiceVertrafNumber(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-vehicle-info/div/div/ma-app-vehicle-info-overview/section/dc-sc-table/table/tbody/tr[1]/td[1]/a").click();
    }

    public static void closeServiceVertragDialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/xy-c-picker[1]/div[2]/div/header/button").click();
    }

    public static void clickOnButtonErweiterteDatacard(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-vehicle-info/div/div/ma-app-vehicle-info-overview/section/div/section[3]/form/button").click();
    }

    public static void closeErweiterteDatacardDialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/xy-c-picker[1]/div[2]/ma-app-extended-datacard/div/header/button").click();
    }

    public static void clickOnTabHistorie(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-vehicle-info/div/div/ul/li[2]/button").click();
    }


    public static void navigateToTitelHistorie(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-vehicle-info/div/div/dc-vh-timeline/dc-vehicle-history-timeline-base/header/h3"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
    }

    public static void closeVehicleDataDialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[2]/button/span").click();
    }

    public static void clickOnShortTestReiter(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[3]/button/span").click();
    }

    public static void clickOnShortTestReiterForPKW(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[4]/button/span").click();
    }


    public static void closeShortTestDialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/xy-c-picker[1]/div[2]/ma-app-quick-test-details/div/header/button").click();
    }

    public static void closeShortTestReiter(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[3]/button/span").click();
    }
    public static void closeShortTestReiterForPKW(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[4]/button/span").click();
    }

    public static void clickOnAShortTest(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-quick-test/div/div[2]/div[2]/p-table/div/div/table/tbody/tr[2]/td[3]").click();
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
        element("/html/body/app-dda/app-diagnosis-data-viewer/tab-component/div/div/div/a[3]").click();
        driver.switchTo().defaultContent();
    }

    public static void clickOnDocumentReiter(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[4]/button/span").click();
    }
    public static void clickOnDocumentReiterForPKW(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[5]/button/span").click();
    }

    public static void closeDocumentDialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[4]/button/span").click();
    }

    public static void closeDocumentDialogForPKW(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[5]/button/span").click();
    }

    public static void clickAKundendienst(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div/ma-app-order-position-table/div/div[2]/p-table/div/div/table/tbody/tr[1]/td[1]").click();
    }

    public static void closeKundenAnliegeDialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-service-measure-details/div/header/div[1]/div/button[2]").click();
    }

    public static void clickOnBeanstandung(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div/ma-app-order-position-table/div/div[2]/p-table/div/div/table/tbody/tr[4]/td[1]").click();
    }


    public static void clickOnWartung(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div/ma-app-order-position-table/div/div[2]/p-table/div/div/table/tbody/tr[3]/td[1]").click();
    }


    public static void clickOnWartungForPKW(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div/ma-app-order-position-table/div/div[2]/p-table/div/div/table/tbody/tr[1]/td[1]").click();
    }

    public static void editWartung(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/div/button[1]").click();
    }

    public static void closeWartungDialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/div/button[3]").click();
    }

    public static void closeBeanstandungDialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/div/button[2]").click();
    }



    public static void closeWartungDialogForPKW(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/div/button[2]").click();
    }

    public static void addPackage(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/div/section[4]/header/ma-app-position-table-toolbar/div/div/button").click();
    }

    public static void unfoldPackage() {
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-app-package-selection/xy-c-dialog-body/div/div/div/div/ma-position-table/div/p-table/div/div/table/tbody/tr[11]/td[1]/button").click();
    }
    public static void closeAddPackageDialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-app-package-selection/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }

    public static void clickOnPlusButtonForTipps(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/div/section[4]/header/ma-app-position-table-toolbar/div/button[2]").click();
    }

    public static void clickOnPlusButtonForTippsForPKW(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/div/section[4]/header/ma-app-position-table-toolbar/div/button[2]").click();
    }


    public static void clickOnKommunikation(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[3]/button/span").click();
    }

    public static void closeKommunikationReiter(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/ma-app-context-navigation/div/ul/li[3]/button/span").click();
    }

    public static void clickOnTextFahrzeuginformation(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-vehicle-info/div/header/h2").click();
    }

    public static void clickOnTextKundendaten(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-customer-data/div/header/div[1]/h2").click();
    }

    public static void clickOnArchivBar(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/ul/li[2]/button/span[1]/span").click();
    }

    public static void closeTippsDialog(){
        element("/html/body/xiw-app/div/xiw-research-complaint/div/div[2]/app-common-concern/div[2]/div[2]/div/button[2]/span").click();
    }

    public static void clickOnAArchiv(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-reception-list/div/div/div/div[1]/p-table/div/div/div/div[2]/table/tbody/tr[3]/td[4]").click();
    }

    public static void clickOnBeanstandungOfPKW(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div/ma-app-order-position-table/div/div[2]/p-table/div/div/table/tbody/tr[3]/td[1]").click();
    }

    public static void closeBeanstandungsdialog(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/div/button[2]").click();
    }

    public static void clickOnNotificationDetails(){
        element("/html/body/ma-cc-car-check-app/div/xy-notification-stack/div/div[2]/xy-notification-panel/div/div[1]/div[2]/button[1]").click();
    }

    public static void clickOnTextDokumente(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-app-documents-tab/div/header/h2").click();
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
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-reception-list/div/div/div/div[1]/p-table/div/div/div/div[1]/div/table/thead/tr/th[1]").click();
    }

    public static void clickOnTextAuftragmanagement(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div/header/div/h2").click();
    }

    public static void clickOnTextTechnischeBeanstandung(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/h2").click();
    }

    public static void waitForSpinnerNotAppears() throws InterruptedException{
        boolean countOfSpin = true;
        while (countOfSpin ==true){
            countOfSpin = driver.findElements(By.xpath("*//div[contains(@class, 'xy-spinner xy-spinner-obsidian xy-size-xl')]")).size() != 0;
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
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-reception-list/div/div/header/h1").click();
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
            WebElement element = driver.findElement(By.xpath("html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-reception-list/div/div/div/div[1]/p-table/div/div/div/div[2]/table/tbody/tr[" + i + "]/td[4]"));
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
            WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-reception-list/div/div/div/div[1]/p-table/div/div/div/div[2]/table/tbody/tr[" + i + "]/td[3]"));
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
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/xy-c-picker[1]/div[2]/ma-app-quick-test-details/div/div/ul/li[2]/button").click();
    }

    public static void unfoldPaketTruck(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-app-package-selection/xy-c-dialog-body/div/div/div/div/ma-position-table/div/p-table/div/div/table/tbody/tr[9]/td[1]/button").click();
    }

    public static void clickOnSideNavigation(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/button").click();
    }

   public static void clickOnTextKurztest(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/xy-c-picker/div/ma-quick-test/div/h2").click();
   }

   public static void clickOnTextKundendienstmassnahme(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-service-measure-details/div/header/div[1]/h2").click();
   }

   public static void clickOnTextWartung(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div/ma-app-customer-concern-details/div/header/div[1]/h2").click();
   }

   public static void clickOnTextPaketauswahl(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-app-package-selection/xy-c-dialog-body/div/header/div[1]/h2").click();
   }

   public static void clickOnTextArchiv(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div/header/div/h2").click();
   }

   public static void clickOnAArchivOnTheList(){
        element("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-reception-list/div/div/div/div[1]/p-table/div/div/div/div[2]/table/tbody/tr[6]/td[3]").click();
   }


}
