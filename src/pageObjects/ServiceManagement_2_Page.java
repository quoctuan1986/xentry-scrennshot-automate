package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ServiceManagement_2_Page {
    private static WebDriver driver;

    public ServiceManagement_2_Page(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement element(String xpath){
        WebElement ele = driver.findElement(By.xpath(xpath));
        return ele;
    }

    public static WebElement verhicleData(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/ul/li[2]/button/span"));
        return element;

    }

    public static void clickOnVerhicleData(){
        verhicleData().click();
    }

    public static WebElement customerData(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/ul/li[1]/button/span"));
        return element;
    }

    public static void clickOnCustomerData(){
        customerData().click();
    }

    public static WebElement telematikData(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/ul/li[3]/button/span"));
        return element;
    }

    public static void clickOnTelematikData() {
        telematikData().click();
    }

    public static void clickOnXentryAppointment() {
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/ul/li[4]/button/span"));
        element.click();
    }

    public static void clickOnCommunication() {
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/ul/li[5]/button/span"));
        element.click();
    }

    public static void clickOnSideNavigation(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/button"));
        element.click();
    }

    public static void closeTheOffer(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/ul/li[2]/button/span[3]/button"));
        element.click();
    }

    public static void closeOfferCustomerInfo(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/ul/li[1]/button/span"));
        element.click();
    }

    public static void closeOfferVehicleInfo(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/ul/li[2]/button/span"));
        element.click();
    }

    public static void closeTelematikData(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/ul/li[3]/button/span"));
        element.click();
    }


    public static void closeXentryAppointment(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/ul/li[4]/button/span"));
        element.click();
    }

    public static void closeCommunication(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/ul/li[5]/button/span"));
        element.click();
    }

    public static void clickOnServiceContractNumber(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[2]/div[2]/div/offer-vehicle-data/div/div/div[2]/div/dc-sc-table/table/tbody/tr/td[1]/a"));
        element.click();
    }

    public static void clickOnTabOverviewOfVehicleData(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[2]/div[2]/div/offer-vehicle-data/div/div/ul/li[1]/button"));
        element.click();
    }

    public static void clickOnTabVehicleHistoryOfVehicleData(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[2]/div[2]/div/offer-vehicle-data/div/div/ul/li[2]/button"));
        element.click();
    }

    public static int countOfLeads(){
        List<WebElement> elements = driver.findElements(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-creation/div/p-table/div/div/table/tbody/tr"));
        System.out.print("Count of Leads is: "+elements.size()+"\n");
        return elements.size();
    }

    public static void clickOnAMaintenance() {
        for (int i=1; i<= countOfLeads(); i++){
            WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-creation/div/p-table/div/div/table/tbody/tr["+i+"]/td[6]"));
            System.out.print("Text is :" +element.getText()+"\n");
            if(!element.getText().equals("-")){
                element.click();
                break;
            }
        }
    }

    public static void clickOnALead(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-creation/div/p-table/div/div/table/tbody/tr[1]/td[4]/div"));
        element.click();
    }

    public static void clickOnTheTabPackage(){
        element("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/div/ul/li[2]/button").click();
    }

    public static void packageUnfold(){
        element("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/div/section/offer-packages-table/p-table/div/div/table/tbody/tr[2]/td[1]/button").click();
    }

    public static void moveTheCosorToTabPackage(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/div/ul/li[2]/button"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
    }

    public static void addPackage(){
        element("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/div/section/header/div/button[2]").click();
    }

    public static void clickOnCheckBoxToAddPackage(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[3]/div[2]/offer-add-packages/div/div/offer-packages-table/form/p-table/div/div/table/tbody/tr[1]/td[2]/p-tablecheckbox/div/div[2]"));
        element.click();
    }

    public static void clickOnAssumeButton(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[3]/div[2]/offer-add-packages/div/footer/button"));
        element.click();
    }

    public static void clickOnDelegateButton(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[2]/div/offer-item-group-details/div/header/div/button[1]"));
        element.click();
    }

    public static void closeDelegateDialog(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[3]/div[2]/offer-delegate-lead/form/header/button"));
        element.click();
    }

    public static void clickOnPlusButtonForAddMeasures(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-creation/header/button[3]"));
        element.click();
    }

    public static void closeDialogAddMeasures(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[2]/div[2]/offer-add-measures/div/header/div/button"));
        element.click();
    }

    public static void clickOnTabLegal(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[2]/div[2]/offer-add-measures/div/div/ul/li[2]/button"));
        element.click();
    }

    public static void closeAddPackageDialog(){
       element("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog[2]/div[2]/offer-add-packages/div/header/button").click();
    }

    public static void clickOnEditButtonForPackage(){
        element("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/div/section/header/div/button[3]").click();
    }

    public static void changeThePriceOfPackage()throws InterruptedException{
        element("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/div/section/offer-packages-table/p-table/div/div/table/tbody/tr[1]/td[8]/div/xy-c-picker-button/xy-c-input-wrapper/div/div/button/span[1]").click();
        Thread.sleep(2000);
        WebElement priceField = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div[2]/offer-price-selection/form/xy-c-dialog-body/div/div/div/table/tbody/tr[3]/td[2]//*[@id='undefined']"));
        priceField.click();
        for (int i=0;i<10;i++){
            priceField.sendKeys(Keys.BACK_SPACE);
        }
        priceField.sendKeys("300");
    }

    public static void changeThePriceOfPackageVAN()throws InterruptedException{
        element("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/div/section/offer-packages-table/p-table/div/div/table/tbody/tr[2]/td[8]/div/xy-c-picker-button/xy-c-input-wrapper/div/div/button/span[1]").click();
        Thread.sleep(2000);
        WebElement priceField = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div[2]/offer-price-selection/form/xy-c-dialog-body/div/div/div/table/tbody/tr[2]/td[2]//*[@id='undefined']"));
        priceField.click();
        for (int i=0;i<10;i++){
            priceField.sendKeys(Keys.BACK_SPACE);
        }
        priceField.sendKeys("50");
    }

    public static void closeEditPackageDialog(){
        element("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/header/div/button[3]").click();
    }

    public static void closeEditPackageDialogVAN(){
        element("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/header/div/button[3]").click();
    }

    public static void addManualOperation(){
        element("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/div/section/header/div/button[1]").click();
    }

    //Manuel Position hinzufügen

    public static void  addManualOperationWithText(){
        WebElement nummer = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[3]/div[2]/offer-add-manual-operation/form/div/div/div/div[1]/xy-c-input/xy-c-input-wrapper/div/div/input[@id='undefined']"));
        nummer.click();
        nummer.sendKeys("400000");
        WebElement beschreiben = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[3]/div[2]/offer-add-manual-operation/form/div/div/div/div[2]/textarea"));
        beschreiben.click();
        beschreiben.sendKeys("Test");
        WebElement dauer = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[3]/div[2]/offer-add-manual-operation/form/div/div/div/div[3]/xy-c-input/xy-c-input-wrapper/div/div/input[@id='undefined']"));
        dauer.click();
        dauer.sendKeys("003");
        WebElement assume = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[3]/div[2]/offer-add-manual-operation/form/footer/button"));
        assume.click();
    }



    //




    public static void closeAddManualOperationDialog(){
        element("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog[2]/div[2]/offer-add-manual-operation/form/header/button").click();
    }

    public static void clickOnSummary(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/ul/li[2]/ul/li[2]/button/span[1]/span"));
        element.click();
    }

    public static void clickOnStornoButton(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary-editing/div/form/footer/button[1]"));
        element.click();
    }

    public static void closeStornoDialog(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div[2]/offer-cancel/form/header/button"));
        element.click();
    }

    public static void clickOnScheduleAppointmentButton(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary/offer-summary-sent/div/div[1]/footer/button[3]"));
        element.click();
    }

    public static void clickOnScheduleAppointmentButtonTruck(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/ul/li[4]/button/span"));
        element.click();
    }

    public static WebElement textBoxDateDelivery() {
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement element = driver.findElement(By.xpath("/html/body/app-xa/div/appointment-list/div[1]/appointment-details/div/div[2]/calendar-input[1]/div/div/div/p-calendar/span/input"));
        return element;
    }

    public static WebElement textBoxDatePickUp() {
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement element = driver.findElement(By.xpath("/html/body/app-xa/div/appointment-list/div[1]/appointment-details/div/div[2]/calendar-input[2]/div/div/div/p-calendar/span/input"));

        return element;
    }

    public static void clickOnPlusButtonForNewAppointment(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement element = driver.findElement(By.xpath("/html/body/app-xa/div/appointment-list/p-table/div/div/div/div[1]/div/table/thead/tr[3]/td/div/span[1]"));
        element.click();
        driver.switchTo().defaultContent();
    }

    public static void clickOnTerminInTheList(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement element = driver.findElement(By.xpath("/html/body/app-xa/div/appointment-list/p-table/div/div/div/div[2]/table/tbody/tr/td[2]"));

        element.click();
        driver.switchTo().defaultContent();
    }





    public static void enterDeliveryDate() throws InterruptedException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:MM");
        Date date = new Date();
        String agreedAppointment = dateFormat.format(date);
        System.out.println(agreedAppointment);

        textBoxDateDelivery().click();
        textBoxDateDelivery().sendKeys(agreedAppointment);
        Thread.sleep(5000);
        driver.switchTo().defaultContent();

    }

    public static void enterPickUpDate() throws InterruptedException {
        Calendar futureDate = Calendar.getInstance();
        futureDate.add(Calendar.DATE, 3);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:MM");
        Date date = futureDate.getTime();
        String agreedAppointment = dateFormat.format(date);
        System.out.println(agreedAppointment);

        textBoxDatePickUp().click();
        textBoxDatePickUp().sendKeys(agreedAppointment);
        Thread.sleep(3000);

        WebElement element = driver.findElement(By.xpath("/html/body/app-xa/div/appointment-list/div[1]/appointment-details/div/div[1]/div/h2"));
        element.click();
        driver.switchTo().defaultContent();


    }

    public static void clickOnThreePointMenu(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/footer/xy-c-aux-menu/button"));
        element.click();
    }

    public static void clickOnSettingInOffer(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/footer/xy-c-aux-menu/button/nav/button"));
        element.click();
    }

    public static void clickOnSettingBetriebTab(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[2]/div[2]/div/offer-application-settings-wrapper/div/div/offer-application-settings/div/div/ul/li[2]/button"));
        element.click();
    }

    public static void clickOnSettingMarketTab(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[2]/div[2]/div/offer-application-settings-wrapper/div/div/offer-application-settings/div/div/ul/li[3]/button"));
        element.click();
    }

    public static void clickOnSettingGlobalTab(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[2]/div[2]/div/offer-application-settings-wrapper/div/div/offer-application-settings/div/div/ul/li[4]/button"));
        element.click();
    }

    public static void clickOnSettingBenutzereinstellungen(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[2]/div[2]/div/offer-application-settings-wrapper/div/div/offer-application-settings/div/div/ul/li[1]/button"));
        element.click();
    }


    public static void closeSettingDialogInOffer(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[2]/div[2]/div/offer-application-settings-wrapper/div/header/div/button"));
        element.click();
    }

    public static void clickOnDiscardDialog(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/offer-confirmation-dialog/xy-c-dialog/div/div[2]/div/div/footer/button[1]"));
        element.click();
    }

    public static void clickOnRejectButton(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary-sent/div/div[1]/footer/button[2]"));
        element.click();
    }

    public static void clickOnRejectButtonTruck(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary-editing/div/form/footer/button[2]"));

        element.click();
    }

    public static void clickOnNotificationDetailsInTelematikData(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement element = driver.findElement(By.xpath("/html/body/app-dda/dda-notification/xy-notification-stack/div/xy-notification-panel/div/div[1]/div[2]/button[1]"));
        element.click();
        driver.switchTo().defaultContent();
    }

    public static void clickOnNotificationDetailsInPaket(){
        driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div/xy-notification-panel/div/div[1]/div[2]/button[1]")).click();
    }


    public static void zoomIn(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = '0.9'");
        driver.switchTo().defaultContent();
    }

    public static void zommRelease(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = '1.0'");
        driver.switchTo().defaultContent();
    }

    public static void moveTheCosorToElement(WebElement element){
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
    }

    public static void scrollDownThePageToWartungsdaten(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement element = driver.findElement(By.xpath("/html/body/app-dda/app-diagnosis-data-viewer/header-component/div[2]/button"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.switchTo().defaultContent();

    }

    public static void clickOnArchivDetail(){
        WebElement element = driver.findElement(By.xpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-overview/div/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr[13]/td[4]/span"));
        element.click();
    }

    public static void clickOnArchivDetailForVan(){
        WebElement element = driver.findElement(By.xpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-overview/div/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr[3]/td[5]"));
        element.click();
    }

    public static void closeAblehnungDialog(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[2]/div[2]/offer-reject-offer/form/header/button"));
        element.click();
    }

    public static void closeNotificationDialog(){
        driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div/xy-notification-panel/div/div[1]/div[2]/button[2]")).click();
    }

    public static void waitForSpinnerNotAppears() throws InterruptedException{
        Thread.sleep(1000);
        boolean countOfSpin = true;
        while (countOfSpin ==true){
            countOfSpin = driver.findElements(By.xpath("*//div[contains(@class, 'spinner')]")).size() != 0;
            System.out.print("Warten"+"\n");
            Thread.sleep(1000);
        }
    }

    public static void closeErrorAndHinweis(){
        int sizeOfError = driver.findElements(By.xpath("*//div[contains(@class, 'xy-i-warning xy-white')]")).size();
        int sizeOfHinweis = driver.findElements(By.xpath("*//div[contains(@class,'xy-i-error')]")).size();
        System.out.print("Size of Error: "+sizeOfError+"\n");
        System.out.print("Size of Hinweis: "+sizeOfHinweis+"\n");
        if (sizeOfHinweis != 0){
            if (sizeOfHinweis ==1 && sizeOfError ==0){
                element("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
            }
            else{
                for(int i=1; i<=sizeOfError+sizeOfHinweis; i++){
                    boolean hinweis = driver.findElements(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div["+i+"]/xy-notification-panel/div/div[1]/div[1]/div[contains(@class,'xy-i-error')]")).isEmpty();
                    if(hinweis == false){
                        element("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div["+i+"]/xy-notification-panel/div/div[1]/div[2]/button[2]").click();                }
                }
            }

        }
        else{
            System.out.print("Es gibt keine Hinweis!"+"\n");
        }

        if(sizeOfError == 1){
            element("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
        }
        else if(sizeOfError >= 2){
            for (int i=2; i<=sizeOfError; i++){
                int faktor = sizeOfError-i+2;
                element("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div["+faktor+"]/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
            }
            element("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
        }
        else{
            System.out.print("Es gibt keine Error!"+"\n");
        }
    }

    public static void closeHinweis(){
        int sizeOfError = driver.findElements(By.xpath("*//div[contains(@class, 'xy-i-warning xy-white')]")).size();
        int sizeOfHinweis = driver.findElements(By.xpath("*//div[contains(@class,'xy-i-error')]")).size();
        System.out.print("Size of Error: "+sizeOfError+"\n");
        System.out.print("Size of Hinweis: "+sizeOfHinweis+"\n");
        if (sizeOfHinweis != 0){
            if (sizeOfHinweis ==1 && sizeOfError ==0){
                element("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
            }
            else{
                for(int i=1; i<=sizeOfError+sizeOfHinweis; i++){
                    boolean hinweis = driver.findElements(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div["+i+"]/xy-notification-panel/div/div[1]/div[1]/div[contains(@class,'xy-i-error')]")).isEmpty();
                    if(hinweis == false){
                        element("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div["+i+"]/xy-notification-panel/div/div[1]/div[2]/button[2]").click();                }
                }
            }

        }
        else{
            System.out.print("Es gibt keine Hinweis!"+"\n");
        }
    }

    public static void clickOnTextAnfrage(){
        element("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-creation/header/div/h2").click();
    }

    public static void closeError(){
        element("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div/xy-notification-panel/div/div[1]/div[2]/button[2]").click();

    }

    public static void closeErrorPackage(){
        element("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div/xy-notification-panel/div/div/div[2]/button").click();
    }

    public static void closeErrorInKommunikationVAN(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        element("/html/body/app-root/xy-notification-stack/div/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
        driver.switchTo().defaultContent();
    }

    public static void clickOnNachrichtOnKommunikationVAN() throws InterruptedException{
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        element("/html/body/app-root/div/div/xy-c-frame/div/div/div[1]/div/div/div[1]/app-threads/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr/td[2]").click();
        Thread.sleep(3000);
        element("/html/body/app-root/div/div/div/xy-c-dialog[1]/div/app-thread-preview/div/div/p-table/div/div/div/div[2]/table/tbody/tr/td[2]/div/span[1]").click();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
    }

    public static void clickOnNachrichtOnKommunikation() throws InterruptedException{
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        element("/html/body/app-root/div/div/div/xy-c-dialog/div[2]/app-message-editor/div/header/div[2]/button").click();
        Thread.sleep(3000);
        element("/html/body/app-root/div/div/xy-c-frame/div/div/div[1]/div/div/div[1]/app-thread-details/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr[2]/td[3]").click();
        driver.switchTo().defaultContent();
    }

    public static void closeChangePriceDialog(){
        element("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog[2]/div[2]/offer-price-selection/form/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }

    public static void clickOnTextMaintanceManagement(){
        element("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/header/h2").click();

    }

    public static void textReplaceUserName(){
        WebElement element = driver.findElement(By.xpath("//*[@id='xf-frame-user-name']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].innerHTML= 'Max Mustermann';",element);
    }

    public static void textReplaceOutletName(){
        WebElement element = driver.findElement(By.xpath("//*[@id='xf-frame-outlet-name']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].innerHTML= '00000-Autohaus';",element);
    }

    public static void textReplaceFinListeNameInTheVehicle(){
        for (int i=1 ; i<=10; i++){
            WebElement element = driver.findElement(By.xpath("/html/body/cp-app/cp-outletvehiclelist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr["+i+"]/td[3]/span/span[1]"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].innerHTML= 'ABC1234567D891011';",element);
        }

    }

    public static void textReplaceCustomerNameInTheVehicle(){
        for (int i=1 ; i<=10; i++){
            WebElement element = driver.findElement(By.xpath("/html/body/cp-app/cp-outletvehiclelist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr["+i+"]/td[4]/span/span[1]"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].innerHTML= 'Emma Kundin';",element);
        }

    }

    public static void textReplaceKennzeichenInTheVehicleList(){
        WebElement element = driver.findElement(By.xpath("/html/body/cp-app/cp-outletvehiclelist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr[2]/td[3]/span/span[2]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].innerHTML= 'BB-MB 1';",element);
    }

    public static void textReplacXXX(String replaceText, String newText){
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[2]/span"));
        String text = element.getText().replaceAll(replaceText, newText);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].innerHTML= '"+text+"';",element);
    }

    public static void textReplaceServiceName(){
        WebElement element = driver.findElement(By.xpath("/html/body/cp-app/cp-outletvehiclelist/div/div[2]/cp-vehiclelist-context/div[2]/div[1]/div[1]/p-datatable/div/div[1]/table/tbody/tr/td[3]/span/span"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].innerHTML= 'Max Mustermann';",element);
    }

    public static void textReplaceInOfferFIN(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-creation/header/div/p"));
        String text = element.getText().replaceAll("WDD2130421A467126", "ABC1234567D891011");
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].innerHTML= '"+text+"';",element);
    }

    public static void textReplaceInOfferCustomerData(){
        WebElement name = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[1]/div/div[1]/div"));
        WebElement streetname = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[1]/div/div[2]/div"));
        WebElement plz = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[1]/div/div[3]/div"));
        WebElement ort = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[1]/div/div[4]/div"));
        WebElement tel_1 = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[2]/div/div[2]/div"));
        WebElement tel_2 = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[2]/div/div[3]/div"));
        WebElement mobil = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[2]/div/div[4]/div"));
        WebElement email = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[2]/div/div[6]/div/a"));

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].innerHTML= 'Emma Kundin';",name);
        executor.executeScript("arguments[0].innerHTML= 'Musterstraße 1';",streetname);
        executor.executeScript("arguments[0].innerHTML= '12345';",plz);
        executor.executeScript("arguments[0].innerHTML= 'Musterstadt';",ort);
        executor.executeScript("arguments[0].innerHTML= '+49 987 654 321';",tel_1);
        executor.executeScript("arguments[0].innerHTML= '+49 987 654 321';",tel_2);
        executor.executeScript("arguments[0].innerHTML= '0123456 789';",mobil);
        executor.executeScript("arguments[0].innerHTML= 'Emma.kundin@email.com';",email);

    }


    public static void textReplaceInAuftragManagement(){
        WebElement head = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div/header/div/p"));
        WebElement kennzeichen = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/ul/li[2]/button/span[1]/span"));
        WebElement servicceBeraterInput = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div/ma-app-reception-details/div/div[2]/div[3]/xy-c-input/xy-c-input-wrapper/div/div/p-autocomplete/span/input"));
        String newHead = head.getText().replaceAll("Bastian Schweinsteiger | A BS 5555 | WDD2130421A467952", "Emma Kundin | BB-MB 1 | ABC1234567D891011");
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].innerHTML= 'Auftrags- / Vorgangsnummer : - / 1305501 | Emma Kundin | BB-MB 1 | ABC1234567D891011';",head);
        executor.executeScript("arguments[0].innerHTML= 'MB 1';",kennzeichen);
        servicceBeraterInput.click();
        for (int i=0; i<20; i++){
            servicceBeraterInput.sendKeys(Keys.BACK_SPACE);
        }
        servicceBeraterInput.sendKeys("Max Mustermann");
        head.click();
    }


    ///
    public static void textReplaceUserName_1(){
        WebElement element = driver.findElement(By.xpath("//*[@id='xf-frame-user-name']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].innerHTML= '*** ******';",element);
    }

    public static void textReplaceOutletName_1(){
        WebElement element = driver.findElement(By.xpath("//*[@id='xf-frame-outlet-name']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].innerHTML= '00000-*****';",element);
    }

    public static void textReplaceFinListeNameInTheVehicle_1(){
        for (int i=1 ; i<=10; i++){
            WebElement element = driver.findElement(By.xpath("/html/body/cp-app/cp-outletvehiclelist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr["+i+"]/td[3]/span/span[1]"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].innerHTML= '***********';",element);
        }

    }

    public static void textReplaceCustomerNameInTheVehicle_1(){
        for (int i=1 ; i<=10; i++){
            WebElement element = driver.findElement(By.xpath("/html/body/cp-app/cp-outletvehiclelist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr["+i+"]/td[4]/span/span[1]"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].innerHTML= '**** *******';",element);
        }

    }

    public static void textReplaceKennzeichenInTheVehicleList_1(){
        WebElement element = driver.findElement(By.xpath("/html/body/cp-app/cp-outletvehiclelist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr[2]/td[3]/span/span[2]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].innerHTML= '**-** 1';",element);
    }


    public static void textReplaceServiceName_1(){
        WebElement element = driver.findElement(By.xpath("/html/body/cp-app/cp-outletvehiclelist/div/div[2]/cp-vehiclelist-context/div[2]/div[1]/div[1]/p-datatable/div/div[1]/table/tbody/tr/td[3]/span/span"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].innerHTML= '*** *******';",element);
    }

    public static void textReplaceInOfferFIN_1(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-creation/header/div/p"));
        String text = element.getText().replaceAll("WDD2130421A467126", "**************");
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].innerHTML= '"+text+"';",element);
    }

    public static void textReplaceInOfferCustomerData_1(){
        WebElement name = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[1]/div/div[1]/div"));
        WebElement streetname = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[1]/div/div[2]/div"));
        WebElement plz = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[1]/div/div[3]/div"));
        WebElement ort = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[1]/div/div[4]/div"));
        WebElement tel_1 = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[2]/div/div[2]/div"));
        WebElement tel_2 = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[2]/div/div[3]/div"));
        WebElement mobil = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[2]/div/div[4]/div"));
        WebElement email = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[2]/div/div[6]/div/a"));

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].innerHTML= '*** *****';",name);
        executor.executeScript("arguments[0].innerHTML= '******** 1';",streetname);
        executor.executeScript("arguments[0].innerHTML= '*****';",plz);
        executor.executeScript("arguments[0].innerHTML= '*********';",ort);
        executor.executeScript("arguments[0].innerHTML= '+** *******';",tel_1);
        executor.executeScript("arguments[0].innerHTML= '+** *******';",tel_2);
        executor.executeScript("arguments[0].innerHTML= '******* **';",mobil);
        executor.executeScript("arguments[0].innerHTML= '******@***.com';",email);

    }


    public static void textReplaceInAuftragManagement_1(){
        WebElement head = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div/header/div/p"));
        WebElement kennzeichen = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/ul/li[2]/button/span[1]/span"));
        WebElement servicceBeraterInput = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-service-reception-overview/div/div/div/div/ma-app-reception-details/div/div[2]/div[3]/xy-c-input/xy-c-input-wrapper/div/div/p-autocomplete/span/input"));
        String newHead = head.getText().replaceAll("Bastian Schweinsteiger | A BS 5555 | WDD2130421A467952", "Emma Kundin | BB-MB 1 | ABC1234567D891011");
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].innerHTML= 'Auftrags- / Vorgangsnummer : - / 1305501 | *** ****** | **-** 1 | *************';",head);
        executor.executeScript("arguments[0].innerHTML= '** 1';",kennzeichen);
        servicceBeraterInput.click();
        for (int i=0; i<20; i++){
            servicceBeraterInput.sendKeys(Keys.BACK_SPACE);
        }
        servicceBeraterInput.sendKeys("** **********");
        head.click();
    }



    ///

    public static void closeCookies(){
        WebElement element = driver.findElement(By.xpath("//*[contains(@class, 'xf-hint-content xf-icon xf-hint-close-icon xf-line-icons')]"));
        element.click();
    }


}
