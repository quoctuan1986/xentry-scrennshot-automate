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

    public static WebElement verhicleData(){
        return elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/ul/li[2]/button/span");

    }

    public static void clickOnVerhicleData(){
        verhicleData().click();
    }

    public static WebElement customerData(){
        return elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/ul/li[1]/button/span");
    }

    public static void clickOnCustomerData(){
        customerData().click();
    }

    public static WebElement telematikData(){
        return elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/ul/li[3]/button/span");
    }

    public static void clickOnTelematikData() {
        telematikData().click();
    }

    public static void clickOnXentryAppointment() {
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/ul/li[4]/button/span").click();
    }

    public static void clickOnCommunication() {
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/ul/li[5]/button/span").click();
    }

    public static void clickOnSideNavigation(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/button").click();
    }

    public static void closeTheOffer(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/ul/li[2]/button/span[3]/button").click();
    }

    public static void closeOfferCustomerInfo(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/ul/li[1]/button/span").click();
    }

    public static void closeOfferVehicleInfo(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/ul/li[2]/button/span").click();
    }

    public static void closeTelematikData(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/ul/li[3]/button/span").click();
    }


    public static void closeXentryAppointment(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/ul/li[4]/button/span").click();
    }

    public static void closeCommunication(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/ul/li[5]/button/span").click();
    }

    public static void clickOnServiceContractNumber(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[2]/div[2]/div/offer-vehicle-data/div/div/div[2]/div/dc-sc-table/table/tbody/tr/td[1]/a").click();
    }

    public static void clickOnTabOverviewOfVehicleData(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[2]/div[2]/div/offer-vehicle-data/div/div/ul/li[1]/button").click();
    }

    public static void clickOnTabVehicleHistoryOfVehicleData(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[2]/div[2]/div/offer-vehicle-data/div/div/ul/li[2]/button").click();
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
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-creation/div/p-table/div/div/table/tbody/tr[1]/td[4]/div").click();
    }

    public static void clickOnTheTabPackage(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/div/ul/li[2]/button").click();
    }

    public static void packageUnfold(){
       elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/div/section/offer-packages-table/form/p-table/div/div/table/tbody/tr[2]/td[1]/button").click();
    }

    public static void moveTheCosorToTabPackage(){
        WebElement element = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/div/ul/li[2]/button"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
    }

    public static void addPackage(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/div/section/header/div/button[2]").click();
    }

    public static void clickOnCheckBoxToAddPackage(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[3]/div[2]/offer-add-packages/div/div/offer-packages-table/form/p-table/div/div/table/tbody/tr[1]/td[2]/p-tablecheckbox/div/div[2]").click();
    }

    public static void clickOnAssumeButton(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[3]/div[2]/offer-add-packages/div/footer/button").click();
    }

    public static void clickOnDelegateButton(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/header/div/button[1]").click();
    }

    public static void closeDelegateDialog(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog[2]/div[2]/offer-delegate-lead/form/header/button").click();
    }

    public static void clickOnPlusButtonForAddMeasures(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-creation/header/button[3]").click();
    }

    public static void closeDialogAddMeasures(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[2]/div[2]/offer-add-measures/div/header/div/button").click();
    }

    public static void clickOnTabLegal(){
       elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[2]/div[2]/offer-add-measures/div/div/ul/li[2]/button").click();
    }

    public static void closeAddPackageDialog(){
       elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog[2]/div[2]/offer-add-packages/div/header/button").click();
    }

    public static void clickOnEditButtonForPackage(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/div/section/header/div/button[3]").click();
    }

    public static void changeThePriceOfPackage()throws InterruptedException{
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/div/section/offer-packages-table/form/p-table/div/div/table/tbody/tr[1]/td[8]/div/xy-c-picker-button/xy-c-input-wrapper/div/div/button").click();
        Thread.sleep(2000);
        WebElement priceField = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog[2]/div[2]/offer-price-selection/form/xy-c-dialog-body/div/div/div/table/tbody/tr[2]/td[2]//*[@id='undefined']"));
        priceField.click();
        for (int i=0;i<10;i++){
            priceField.sendKeys(Keys.BACK_SPACE);
        }
        priceField.sendKeys("200");
    }

    public static void changeThePriceOfPackageVAN()throws InterruptedException{
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/div/section/offer-packages-table/form/p-table/div/div/table/tbody/tr[1]/td[8]/div/xy-c-picker-button/xy-c-input-wrapper/div/div/button").click();
        Thread.sleep(2000);
        WebElement priceField = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog[2]/div[2]/offer-price-selection/form/xy-c-dialog-body/div/div/div/table/tbody/tr[2]/td[2]//*[@id='undefined']"));
        priceField.click();
        for (int i=0;i<10;i++){
            priceField.sendKeys(Keys.BACK_SPACE);
        }
        priceField.sendKeys("20");
    }

    public static void closeEditPackageDialog(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/header/div/button[3]").click();
    }

    public static void closeEditPackageDialogVAN(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/header/div/button[3]").click();
    }

    public static void addManualOperation(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/div/section/header/div/button[1]").click();
    }

    //Manuel Position hinzufügen

    public static void  addManualOperationWithText(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog[2]/div[2]/offer-add-manual-operation/form/div/div/div/div[1]//*[@id='undefined']").sendKeys("400000");
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog[2]/div[2]/offer-add-manual-operation/form/div/div/div/div[2]/textarea").sendKeys("Test");
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog[2]/div[2]/offer-add-manual-operation/form/div/div/div/div[3]//*[@id='undefined']").sendKeys("003");
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog[2]/div[2]/offer-add-manual-operation/form/footer/button").click();
    }



    //




    public static void closeAddManualOperationDialog(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog[2]/div[2]/offer-add-manual-operation/form/header/button").click();
    }

    public static void clickOnSummary(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/ul/li[2]/ul/li[2]/button/span[1]/span").click();
    }

    public static void clickOnStornoButton(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary/offer-summary-editing/div/form/footer/button[1]").click();
    }

    public static void closeStornoDialog(){
       elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div[2]/offer-cancel/form/header/button").click();
    }

    public static void clickOnScheduleAppointmentButton(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary/offer-summary-sent/div/div[1]/footer/button[3]").click();
    }

    public static void clickOnScheduleAppointmentButtonTruck(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary/offer-summary-sent/div/div[1]/footer/button[4]").click();
    }

    public static WebElement textBoxDateDelivery() {
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        return elementWithXpath("/html/body/app-xa/div/appointment-list/div[1]/appointment-details/div/div[2]/calendar-input[1]/div/div/div/p-calendar/span/input");
    }

    public static WebElement textBoxDatePickUp() {
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        return elementWithXpath("/html/body/app-xa/div/appointment-list/div[1]/appointment-details/div/div[2]/calendar-input[2]/div/div/div/p-calendar/span/input");
    }

    public static void clickOnPlusButtonForNewAppointment(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        elementWithXpath("/html/body/app-xa/div/appointment-list/p-table/div/div/div/div[1]/div/table/thead/tr[3]/td/div/span[1]").click();
        driver.switchTo().defaultContent();
    }

    public static void clickOnTerminInTheList(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        elementWithXpath("/html/body/app-xa/div/appointment-list/p-table/div/div/div/div[2]/table/tbody/tr/td[2]").click();
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
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/footer/xy-c-aux-menu/button").click();
    }

    public static void clickOnSettingInOffer(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/footer/xy-c-aux-menu/button/nav/button").click();
    }

    public static void clickOnSettingBetriebTab(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[2]/div[2]/div/offer-application-settings-wrapper/div/div/offer-application-settings/div/div/ul/li[2]/button").click();
    }

    public static void clickOnSettingMarketTab(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[2]/div[2]/div/offer-application-settings-wrapper/div/div/offer-application-settings/div/div/ul/li[3]/button").click();
    }

    public static void clickOnSettingGlobalTab(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[2]/div[2]/div/offer-application-settings-wrapper/div/div/offer-application-settings/div/div/ul/li[4]/button").click();
    }

    public static void clickOnSettingBenutzereinstellungen(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[2]/div[2]/div/offer-application-settings-wrapper/div/div/offer-application-settings/div/div/ul/li[1]/button").click();
    }


    public static void closeSettingDialogInOffer(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[2]/div[2]/div/offer-application-settings-wrapper/div/header/div/button").click();
    }

    public static void clickOnDiscardDialog(){
        elementWithXpath("/html/body/offer-root/offer-confirmation-dialog/xy-c-dialog/div/div[2]/div/div/footer/button[1]").click();
    }

    public static void clickOnRejectButton(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary/offer-summary-sent/div/div[1]/footer/button[2]").click();
    }

    public static void clickOnRejectButtonTruck(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary-editing/div/form/footer/button[2]").click();
    }

    public static void clickOnNotificationDetailsInTelematikData(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        elementWithXpath("/html/body/app-dda/dda-notification/xy-notification-stack/div/xy-notification-panel/div/div[1]/div[2]/button[1]").click();
        driver.switchTo().defaultContent();
    }

    public static void clickOnNotificationDetailsInPaket(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div/xy-notification-panel/div/div[1]/div[2]/button[1]").click();
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
        elementWithXpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-overview/div/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr[13]/td[4]/span").click();
    }

    public static void clickOnArchivDetailForBus(){
       elementWithXpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-overview/div/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr[4]/td[5]/span/span").click();
    }

    public static void clickOnArchivDetailForVan(){
       elementWithXpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-overview/div/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr[1]/td[5]/span/span").click();
    }

    public static void closeAblehnungDialog(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/xy-c-picker[2]/div[2]/offer-reject-offer/form/header/button").click();
    }

    public static void closeNotificationDialog(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
    }

    public static void waitForSpinnerNotAppears() throws InterruptedException{
        boolean countOfSpin = true;
        while (countOfSpin ==true){
            countOfSpin = driver.findElements(By.xpath("*//div[contains(@class, 'spinner')]")).size() != 0;
            System.out.print("Warten"+"\n");
            Thread.sleep(1000);
        }
    }

    public static void waitForSpinnerNotAppearsOnAppointment() throws InterruptedException{
        driver.switchTo().defaultContent();
        driver.switchTo().frame(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[5]/div[2]/div/offer-appointment/div/iframe"));
        Thread.sleep(1000);
        boolean countOfSpin = true;
        int time = 0;
        while (countOfSpin ==true && time <50000){
            countOfSpin = driver.findElements(By.xpath("*//div[contains(@class, 'spinner')]")).size() != 0;
            System.out.print("Warten"+"\n");
            Thread.sleep(1000);
            time = time +1000;
        }
        driver.switchTo().defaultContent();
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
                elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div/div["+faktor+"]/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
            }
        }

    }

    public static void closeErrorAndHinweis(){
        int sizeOfError = driver.findElements(By.xpath("*//div[contains(@class, 'xy-i-warning xy-white')]")).size();
        int sizeOfHinweis = driver.findElements(By.xpath("*//div[contains(@class,'xy-i-error')]")).size();
        System.out.print("Size of Error: "+sizeOfError+"\n");
        System.out.print("Size of Hinweis: "+sizeOfHinweis+"\n");
        if (sizeOfHinweis != 0){
            if (sizeOfHinweis ==1 && sizeOfError ==0){
               elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div/div[2]/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
            }
            else{
                for(int i=1; i<=sizeOfError+sizeOfHinweis; i++){
                    boolean hinweis = driver.findElements(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div["+i+"]/xy-notification-panel/div/div[1]/div[1]/div[contains(@class,'xy-i-error')]")).isEmpty();
                    if(hinweis == false){
                       elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div/div["+i+"]/xy-notification-panel/div/div[1]/div[2]/button[2]").click();                }
                }
            }

        }
        else{
            System.out.print("Es gibt keine Hinweis!"+"\n");
        }

        if(sizeOfError == 1){
           elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div/div[2]/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
        }
        else if(sizeOfError >= 2){
            for (int i=2; i<=sizeOfError; i++){
                int faktor = sizeOfError-i+3;
                elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div/div["+faktor+"]/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
            }
            elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div/div[2]/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
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
                elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
            }
            else{
                for(int i=1; i<=sizeOfError+sizeOfHinweis; i++){
                    boolean hinweis = driver.findElements(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div["+i+"]/xy-notification-panel/div/div[1]/div[1]/div[contains(@class,'xy-i-error')]")).isEmpty();
                    if(hinweis == false){
                        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div["+i+"]/xy-notification-panel/div/div[1]/div[2]/button[2]").click();                }
                }
            }

        }
        else{
            System.out.print("Es gibt keine Hinweis!"+"\n");
        }
    }

    public static void clickOnTextAnfrage(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-creation/header/div/h2").click();
    }

    public static void closeError(){
        elementWithXpath("*//xy-notification-stack/div/div[2]/xy-notification-panel/div/div[1]/div[2]/button[2]").click();

    }

    public static void closeError_1(){
        int sizeOfError = driver.findElements(By.xpath("*//div[contains(@class, 'xy-i-warning xy-white')]")).size();
        int sizeOfHinweis = driver.findElements(By.xpath("*//div[contains(@class,'xy-i-error')]")).size();
        System.out.print("Size of Error: "+sizeOfError+"\n");
        System.out.print("Size of Hinweis: "+sizeOfHinweis+"\n");
        if (sizeOfHinweis != 0){
            if (sizeOfHinweis ==1 && sizeOfError ==0){
                elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div/div[2]/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
            }
            else{
                for(int i=1; i<=sizeOfError+sizeOfHinweis; i++){
                    boolean hinweis = driver.findElements(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div["+i+"]/xy-notification-panel/div/div[1]/div[1]/div[contains(@class,'xy-i-error')]")).isEmpty();
                    if(hinweis == false){
                       elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div/div["+i+"]/xy-notification-panel/div/div[1]/div[2]/button[2]").click();                }
                }
            }

        }
        else{
            System.out.print("Es gibt keine Hinweis!"+"\n");
        }

        if(sizeOfError == 1){
            System.out.print("Es gibt keine Error!"+"\n");
        }
        else if(sizeOfError == 2){
            elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div/div[2]/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
        }
        else if(sizeOfError > 2){
            for (int i=2; i<=sizeOfError; i++){
                int faktor = sizeOfError-i+2;
                elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div/div["+faktor+"]/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
            }
        }
        else{
            System.out.print("Es gibt keine Error!"+"\n");
        }
    }

    public static void closeErrorPackage(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-notification-stack/div/div[2]/xy-notification-panel/div/div/div[2]/button").click();
    }

    public static void closeErrorInKommunikationVAN(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        elementWithXpath("/html/body/app-root/xy-notification-stack/div/xy-notification-panel/div/div[1]/div[2]/button[2]").click();
        driver.switchTo().defaultContent();
    }

    public static void clickOnNachrichtOnKommunikationVAN() throws InterruptedException{
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        elementWithXpath("/html/body/app-root/div/div/xy-c-frame/div/div/div[1]/div/div/div[1]/app-threads/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr/td[2]").click();
        Thread.sleep(3000);
        elementWithXpath("/html/body/app-root/div/div/div/xy-c-dialog[1]/div/app-thread-preview/div/div/p-table/div/div/div/div[2]/table/tbody/tr/td[2]/div/span[1]").click();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
    }

    public static void clickOnNachrichtOnKommunikation() throws InterruptedException{
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        elementWithXpath("/html/body/app-root/div/div/div/xy-c-dialog/div[2]/app-message-editor/div/header/div[2]/button").click();
        Thread.sleep(3000);
        elementWithXpath("/html/body/app-root/div/div/xy-c-frame/div/div/div[1]/div/div/div[1]/app-thread-details/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr[2]/td[3]").click();
        driver.switchTo().defaultContent();
    }

    public static void closeChangePriceDialog(){
       elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog[2]/div[2]/offer-price-selection/form/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }

    public static void clickOnTextMaintanceManagement(){
        elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[2]/div/xy-c-dialog/div/offer-item-group-details/div/header/h2").click();

    }

    public static void textReplace(WebElement element, String text){
        String newText = text.replaceAll("é", "&eacute;").replaceAll("'", "&rsquo;");
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].innerHTML= '"+newText+"';",element);
    }




    ///

    public static void closeCookies(){
        WebElement element = driver.findElement(By.xpath("//*[contains(@class, 'xf-hint-content xf-icon xf-hint-close-icon xf-line-icons')]"));
        element.click();
    }

    public static void closeFeatureGuideOnCommunication(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[6]/div[2]/div/offer-communication/div/iframe"));
        elementWithXpath("/html/body/app-root/div/div/div/xy-c-dialog[2]/div[2]/app-feature-guide/div/header/div[2]/button").click();
        driver.switchTo().defaultContent();
    }


    public static void closeEmailDialogOnComminication(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[6]/div[2]/div/offer-communication/div/iframe"));
        elementWithXpath("/html/body/app-root/div/div/div/xy-c-dialog/div[2]/app-message-editor/div/header/div[2]/button").click();
        driver.switchTo().defaultContent();
    }


    public static void replaceEmailListOnCommunication(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[6]/div[2]/div/offer-communication/div/iframe"));
        int coutOfEmail = driver.findElements(By.xpath("/html/body/app-root/div/div/xy-c-frame/div/div/div[1]/div/div/div[1]/app-thread-details/div/div[2]/p-table/div/div/div/cdk-virtual-scroll-viewport/div[1]/table/tbody/tr")).size();
        for (int i=1;i<= coutOfEmail; i++){
            textReplace(elementWithXpath("/html/body/app-root/div/div/xy-c-frame/div/div/div[1]/div/div/div[1]/app-thread-details/div/div[2]/p-table/div/div/div/cdk-virtual-scroll-viewport/div[1]/table/tbody/tr["+i+"]/td[3]"), UIConstants.EMAIL);
        }
        textReplace(elementWithXpath("/html/body/app-root/div/div/xy-c-frame/div/div/div[1]/div/div/div[1]/app-thread-details/div/div[1]/div[1]/app-customer-info/p[1]"), UIConstants.KUNDEN_NAME);
        textReplace(elementWithXpath("/html/body/app-root/div/div/xy-c-frame/div/div/div[1]/div/div/div[1]/app-thread-details/div/div[1]/div[1]/app-customer-info/p[2]"), UIConstants.EMAIL +" | "+UIConstants.MOBILE);
        textReplace(elementWithXpath("/html/body/app-root/div/div/xy-c-frame/div/div/div[1]/div/div/div[1]/app-thread-details/div/div[1]/div[1]/app-customer-info/p[3]"), UIConstants.KENNZEICHEN_TEXTREPLACE +" | "+UIConstants.FIN_TRUCK);
        driver.switchTo().defaultContent();
    }

    public static void neueEmailErfassen() throws InterruptedException{
        driver.switchTo().defaultContent();
        driver.switchTo().frame(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[6]/div[2]/div/offer-communication/div/iframe"));
        elementWithXpath("/html/body/app-root/div/div/xy-c-frame/div/div/div[1]/div/div/div[1]/app-thread-details/xy-c-action-menu/div/div/button").click();
        Thread.sleep(3000);
        elementWithXpath("/html/body/app-root/div/div/xy-c-frame/div/div/div[1]/div/div/div[1]/app-thread-details/xy-c-action-menu/div/nav/ul/li[4]/button/span").click();
        driver.switchTo().defaultContent();
    }


    public static void clickOnVerwerfenButton(){
        elementWithXpath("/html/body/offer-root/offer-confirmation-dialog/xy-c-dialog/div/div[2]/div/div/footer/button[1]").click();
    }

    public static int countOfVehicleInTheList() {
        List<WebElement> elements = driver.findElements(By.xpath("*//cp-outletvehiclelist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr"));
        System.out.print("Count of Vehicle is: " + elements.size());
        return elements.size();
    }

    public static void clickOnRefreshButtonOnTheVehicleList(){
        elementWithXpath("/html/body/cp-app/cp-outletvehiclelist/div/div[1]/div[1]/div[2]/button[2]/span[1]").click();
    }

    public static void titleReplace(){
        textReplace(elementWithXpath("//*[@id='xf-frame-user-name']"), UIConstants.SERVICE_BERATER);
        textReplace(elementWithXpath("//*[@id='xf-frame-outlet-name']"), UIConstants.BETRIEB);
    }

    public static void gutenTag(){
        System.out.println("text is dsgsagad:"+elementWithXpath("/html/body/app-root/div/div/div[1]/app-welcome/div[2]/div/div").getText());
        String string = elementWithXpath("/html/body/app-root/div/div/div[1]/app-welcome/div[2]/div/div").getText().replaceAll("\\r\\n|\\r|\\n", " ");
        String[] parts = string.split(",");
        System.out.println(string);
        textReplace(elementWithXpath("/html/body/app-root/div/div/div[1]/app-welcome/div[2]/div/div"), parts[0]+","+"<br>"+UIConstants.SERVICE_BERATER+"!");
    }

    public static void replaceTheVehicleList(){
        for (int i=1; i<=countOfVehicleInTheList(); i++){
            textReplace(elementWithXpath("/html/body/cp-app/cp-outletvehiclelist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr["+i+"]/td[3]/span/span[1]"), UIConstants.FIN_PKW);
            textReplace(elementWithXpath("/html/body/cp-app/cp-outletvehiclelist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr["+i+"]/td[4]/span/span[1]"), UIConstants.KUNDEN_NAME);
            textReplace(elementWithXpath("/html/body/cp-app/cp-outletvehiclelist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr["+i+"]/td[3]/span/span[2]"), UIConstants.KENNZEICHEN_TEXTREPLACE);

        }
    }

    public static void replaceTheVehicleListVAN(){
        for (int i=1; i<=countOfVehicleInTheList(); i++){
            textReplace(elementWithXpath("/html/body/cp-app/cp-outletvehiclelist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr["+i+"]/td[3]/span/span[1]"), UIConstants.FIN_TRUCK);
            textReplace(elementWithXpath("/html/body/cp-app/cp-outletvehiclelist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr["+i+"]/td[4]/span/span[1]"), UIConstants.KUNDEN_NAME);
            textReplace(elementWithXpath("/html/body/cp-app/cp-outletvehiclelist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr["+i+"]/td[3]/span/span[2]"), UIConstants.KENNZEICHEN_TEXTREPLACE);

        }
    }

    public static void replaceTheVehicleListBUS(){
        for (int i=1; i<=countOfVehicleInTheList(); i++){
            textReplace(elementWithXpath("/html/body/cp-app/cp-outletvehiclelist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr["+i+"]/td[3]/span/span[1]"), UIConstants.FIN_BUS);
            textReplace(elementWithXpath("/html/body/cp-app/cp-outletvehiclelist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr["+i+"]/td[4]/span/span[1]"), UIConstants.FIRMENNAME);
            textReplace(elementWithXpath("/html/body/cp-app/cp-outletvehiclelist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr["+i+"]/td[3]/span/span[2]"), UIConstants.KENNZEICHEN_TEXTREPLACE);

        }
    }

    public static void replaceServiceNameOnLeadDetails(){
        textReplace(elementWithXpath("/html/body/cp-app/cp-outletvehiclelist/div/div[2]/cp-vehiclelist-context/div[2]/div[1]/div[1]/p-datatable/div/div[1]/table/tbody/tr/td[3]/span/span"), UIConstants.SERVICE_BERATER);
    }

    public static void replaceTextOnTele(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(elementWithXpath("/html/body/cp-app/cp-telematics-data/p-dialog/div/div[2]/div/iframe"));
        textReplace(elementWithXpath("/html/body/app-dda/app-diagnosis-data-viewer/header-component/div[1]/div[1]/div/span"), UIConstants.FIN_PKW);
        driver.switchTo().defaultContent();
    }

    public static void replaceTextOnTeleBUS(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(elementWithXpath("/html/body/cp-app/cp-telematics-data/p-dialog/div/div[2]/div/iframe"));
        textReplace(elementWithXpath("/html/body/app-dda/app-diagnosis-data-viewer/header-component/div[1]/div[1]/div/span"), UIConstants.FIN_BUS);
        driver.switchTo().defaultContent();
    }

    public static void waitForTelematikToDisplayedInCockpit() throws InterruptedException{
        driver.switchTo().defaultContent();
        driver.switchTo().frame(elementWithXpath("/html/body/cp-app/cp-telematics-data/p-dialog/div/div[2]/div/iframe"));
        while (driver.findElements(By.xpath("/html/body/app-dda/app-diagnosis-data-viewer/header-component/div[1]/div[1]/div/span")).isEmpty()){
            Thread.sleep(2000);
            System.out.println("Warte auf Telematik");
        }
        driver.switchTo().defaultContent();
    }


    public static void replaceTextOnTeleVAN(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(elementWithXpath("/html/body/cp-app/cp-telematics-data/p-dialog/div/div[2]/div/iframe"));
        textReplace(elementWithXpath("/html/body/app-dda/app-diagnosis-data-viewer/header-component/div[1]/div[1]/div/span"), UIConstants.FIN_TRUCK);
        driver.switchTo().defaultContent();
    }

    public static void replaceKundenInfoInVehicle(){
        textReplace(elementWithXpath("/html/body/cp-app/cp-contact-details/p-dialog/div/div[2]/div/div[2]/ul/li"), UIConstants.KUNDEN_NAME);
        textReplace(elementWithXpath("/html/body/cp-app/cp-contact-details/p-dialog/div/div[2]/div/div[2]/div/h2"),"MRS "+UIConstants.KUNDEN_NAME);
        textReplace(elementWithXpath("/html/body/cp-app/cp-contact-details/p-dialog/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div[1]/div[2]"), UIConstants.STRASSE);
        textReplace(elementWithXpath("/html/body/cp-app/cp-contact-details/p-dialog/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div[2]/div[2]"), UIConstants.PLZ);
        textReplace(elementWithXpath("/html/body/cp-app/cp-contact-details/p-dialog/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div[3]/div[2]"), UIConstants.STADT);
        textReplace(elementWithXpath("/html/body/cp-app/cp-contact-details/p-dialog/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div[4]/div[2]"), UIConstants.TELEFON);
        textReplace(elementWithXpath("/html/body/cp-app/cp-contact-details/p-dialog/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div[5]/div[2]"), UIConstants.TELEFON);
        textReplace(elementWithXpath("/html/body/cp-app/cp-contact-details/p-dialog/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div[8]/div[2]/a"), UIConstants.EMAIL);
    }

    public static void replaceKundenInfoInVehicleBUS(){
       textReplace(elementWithXpath("/html/body/cp-app/cp-contact-details/p-dialog/div/div[2]/div/div[1]/div/div[1]"), UIConstants.FIRMENNAME);
       textReplace(elementWithXpath("/html/body/cp-app/cp-contact-details/p-dialog/div/div[2]/div/div[1]/div/div[2]"), UIConstants.STRASSE);
       textReplace(elementWithXpath("/html/body/cp-app/cp-contact-details/p-dialog/div/div[2]/div/div[1]/div/div[3]/div"), UIConstants.STADT);
       textReplace(elementWithXpath("/html/body/cp-app/cp-contact-details/p-dialog/div/div[2]/div/div[2]/div/h2"), UIConstants.KUNDEN_NAME);
       textReplace(elementWithXpath("/html/body/cp-app/cp-contact-details/p-dialog/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]/a"), UIConstants.EMAIL);
       textReplace(elementWithXpath("/html/body/cp-app/cp-contact-details/p-dialog/div/div[2]/div/div[2]/div/table/tbody/tr[2]/td[2]/div[1]"), UIConstants.TELEFON);
       textReplace(elementWithXpath("/html/body/cp-app/cp-contact-details/p-dialog/div/div[2]/div/div[2]/div/table/tbody/tr[2]/td[2]/div[2]"), UIConstants.MOBILE);
       textReplace(elementWithXpath("/html/body/cp-app/cp-contact-details/p-dialog/div/div[2]/div/div[2]/ul/li"), UIConstants.KUNDEN_NAME);
    }

    public static void replaceFinOnVehicleDetail(){
        textReplace(elementWithXpath("/html/body/cp-app/cp-vehicle-data/p-dialog/div/div[2]/div/p-panel/div/div[2]/div/div[1]/div[1]/div[2]"), UIConstants.FIN_PKW);
    }

    public static void replaceFinOnVehicleDetailVAN(){
        textReplace(elementWithXpath("/html/body/cp-app/cp-vehicle-data/p-dialog/div/div[2]/div/p-panel/div/div[2]/div/div[1]/div[1]/div[2]"), UIConstants.FIN_TRUCK);
    }

    public static void replaceFinOnVehicleDetailBUS(){
        textReplace(elementWithXpath("/html/body/cp-app/cp-vehicle-data/p-dialog/div/div[2]/div/p-panel/div/div[2]/div/div[1]/div[1]/div[2]"), UIConstants.FIN_BUS);
    }

    public static void replaceFinOnOfferDetail(String oldFin){
        WebElement finText = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-creation/header/div/p"));
        String fin = finText.getText().replaceAll(oldFin, UIConstants.FIN_PKW);

        textReplace(finText, fin);
    }

    public static void replaceFinOnOfferDetailBUS(String oldFin){
        WebElement finText = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-creation/header/div/p"));
        String fin = finText.getText().replaceAll(oldFin, UIConstants.FIN_BUS);

        textReplace(finText, fin);
    }

    public static void replaceFinOnOfferDetailVAN(String oldFin){
        WebElement finText = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-creation/header/div/p"));
        String fin = finText.getText().replaceAll(oldFin, UIConstants.FIN_TRUCK);

        textReplace(finText, fin);
    }



    public static void replaceFinOnOfferDetailOfSummaryForSent(String oldFin){
        WebElement finText = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary/offer-summary-sent/div/div[1]/header/div/p"));
        String fin = finText.getText().replaceAll(oldFin, UIConstants.FIN_PKW);

        textReplace(finText, fin);
    }

    public static void replaceFinOnOfferDetailOfSummaryForSentBUS(String oldFin){
        WebElement finText = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary/offer-summary-sent/div/div[1]/header/div/p"));
        String fin = finText.getText().replaceAll(oldFin, UIConstants.FIN_BUS);

        textReplace(finText, fin);
    }


    public static void replaceFinOnOfferDetailOfSummaryForSentVAN(String oldFin){
        WebElement finText = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary/offer-summary-sent/div/div[1]/header/div/p"));
        String fin = finText.getText().replaceAll(oldFin, UIConstants.FIN_TRUCK);

        textReplace(finText, fin);
    }


    public static void replaceFinOnOfferDetailOfSummaryForEditing(String oldFin){
        WebElement finText = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary/offer-summary-editing/div/form/header/div/p"));
        String fin = finText.getText().replaceAll(oldFin, UIConstants.FIN_PKW);

        textReplace(finText, fin);
    }

    public static void replaceFinOnOfferDetailOfSummaryForEditingBUS(String oldFin){
        WebElement finText = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary/offer-summary-editing/div/form/header/div/p"));
        String fin = finText.getText().replaceAll(oldFin, UIConstants.FIN_BUS);

        textReplace(finText, fin);
    }

    public static void replaceFinOnOfferDetailOfSummaryForEditingVAN(String oldFin){
        WebElement finText = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary/offer-summary-editing/div/form/header/div/p"));
        String fin = finText.getText().replaceAll(oldFin, UIConstants.FIN_TRUCK);

        textReplace(finText, fin);
    }

    public static void replaceKundendatenInOffer(){
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[1]/div/div[1]/div"), UIConstants.KUNDEN_NAME);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[1]/div/div[2]/div"), UIConstants.STRASSE);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[1]/div/div[3]/div"), UIConstants.PLZ);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[1]/div/div[4]/div"), UIConstants.STADT);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[2]/div/div[2]/div"), UIConstants.TELEFON);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[2]/div/div[3]/div"), UIConstants.TELEFON);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[2]/div/div[6]/div/a"), UIConstants.EMAIL);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[2]/div/div[4]/div"), UIConstants.MOBILE);
    }


    public static void replaceKundendatenInOfferBUS(){
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[1]/div/div[3]/div"), UIConstants.KUNDEN_NAME);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[1]/div/div[1]/div"), UIConstants.FIRMENNAME);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[1]/div/div[4]/div"), UIConstants.STRASSE);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[1]/div/div[5]/div"), UIConstants.PLZ);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[1]/div/div[6]/div"), UIConstants.STADT);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[2]/div/div[2]/div"), UIConstants.TELEFON);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[2]/div/div[3]/div"), UIConstants.TELEFON);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[2]/div/div[4]/div"), UIConstants.MOBILE);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[1]/div[2]/div/offer-customer-data/div/div/div[2]/div[2]/div/div[5]/div/a"), UIConstants.EMAIL);

    }

    public static void replaceFahrzeugdatenInOffer(){
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[2]/div[2]/div/offer-vehicle-data/div/div/div[1]/div[1]/div/div[1]/div"), UIConstants.FIN_PKW);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[2]/div[2]/div/offer-vehicle-data/div/div/div[1]/div[1]/div/div[2]/div"), UIConstants.KENNZEICHEN_TEXTREPLACE);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[2]/div[2]/div/offer-vehicle-data/div/div/div[2]/div/dc-sc-table/table/tbody/tr/td[1]/a"), UIConstants.SERVICE_NUMMER);
    }

    public static void replaceFahrzeugdatenInOfferBUS(){
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[2]/div[2]/div/offer-vehicle-data/div/div/div[1]/div[1]/div/div[1]/div"), UIConstants.FIN_BUS);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[2]/div[2]/div/offer-vehicle-data/div/div/div[1]/div[1]/div/div[2]/div"), UIConstants.KENNZEICHEN_TEXTREPLACE);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[2]/div[2]/div/offer-vehicle-data/div/div/div[2]/div/dc-sc-table/table/tbody/tr/td[1]/a"), UIConstants.SERVICE_NUMMER);
    }

    public static void replaceFahrzeugdatenInOfferVAN(){
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[2]/div[2]/div/offer-vehicle-data/div/div/div[1]/div[1]/div/div[1]/div"), UIConstants.FIN_TRUCK);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[2]/div[2]/div/offer-vehicle-data/div/div/div[1]/div[1]/div/div[2]/div"), UIConstants.KENNZEICHEN_TEXTREPLACE);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[2]/div[2]/div/offer-vehicle-data/div/div/div[2]/div/dc-sc-table/table/tbody/tr/td[1]/a"), UIConstants.SERVICE_NUMMER);
    }

    public static void replaceOnVetragdetail(){
        WebElement elementNummer = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[3]/div[2]/div/div/dc-sc-details/dc-sc-details-base/header/h2"));
        System.out.println(elementNummer.getText());
        String nummerOfVertrag = elementNummer.getText().replaceAll("F0LC3L", UIConstants.SERVICE_NUMMER);
        textReplace(elementNummer , nummerOfVertrag);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[3]/div[2]/div/div/dc-sc-details/dc-sc-details-base/div/div[1]/div[1]/table/tbody/tr[4]/td[2]"), UIConstants.SERVICE_NUMMER);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[3]/div[2]/div/div/dc-sc-details/dc-sc-details-base/div/div[1]/div[1]/table/tbody/tr[5]/td[2]"), UIConstants.FIRMENNAME);
        WebElement telefon = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[3]/div[2]/div/div/dc-sc-details/dc-sc-details-base/div/div[2]/div[2]/p"));
        String telefonNummer = telefon.getText().replaceAll("0711 2574-7326", UIConstants.MOBILE);
        textReplace(telefon, telefonNummer);
    }


    public static void replaceOnVetragdetailBUS(){
        WebElement elementNummer = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[3]/div[2]/div/div/dc-sc-details/dc-sc-details-base/header/h2"));
        System.out.println(elementNummer.getText());
        String nummerOfVertrag = elementNummer.getText().replaceAll("0000204654", UIConstants.SERVICE_NUMMER);
        textReplace(elementNummer , nummerOfVertrag);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[3]/div[2]/div/div/dc-sc-details/dc-sc-details-base/div/div[1]/div[1]/table/tbody/tr[4]/td[2]"), UIConstants.SERVICE_NUMMER);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[3]/div[2]/div/div/dc-sc-details/dc-sc-details-base/div/div[1]/div[1]/table/tbody/tr[5]/td[2]"), UIConstants.FIRMENNAME);
        WebElement telefon = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[3]/div[2]/div/div/dc-sc-details/dc-sc-details-base/div/div[2]/div[2]/p"));
        String telefonNummer = telefon.getText().replaceAll("0711 2574-7326", UIConstants.MOBILE);
        textReplace(telefon, telefonNummer);
    }


    public static void replaceOnVetragdetailVAN(){
        WebElement elementNummer = driver.findElement(By.xpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[3]/div[2]/div/div/dc-sc-details/dc-sc-details-base/header/h2"));
        String nummerOfVertrag = elementNummer.getText().replaceAll("990065/0188", UIConstants.SERVICE_NUMMER);
        textReplace(elementNummer , nummerOfVertrag);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[3]/div[2]/div/div/dc-sc-details/dc-sc-details-base/div/div[1]/div[1]/table/tbody/tr[4]/td[2]"), UIConstants.SERVICE_NUMMER);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[3]/div[2]/div/div/dc-sc-details/dc-sc-details-base/div/div[1]/div[1]/table/tbody/tr[5]/td[2]"), UIConstants.FIRMENNAME);
    }

    public static void replaceOnTelematikdataOnOffer(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[4]/div[2]/div/offer-telematics/div/iframe"));
        textReplace(elementWithXpath("/html/body/app-dda/app-diagnosis-data-viewer/header-component/div[1]/div[1]/div/span"), UIConstants.FIN_PKW);
        driver.switchTo().defaultContent();
    }


    public static void replaceOnTelematikdataOnOfferBUS(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[4]/div[2]/div/offer-telematics/div/iframe"));
        textReplace(elementWithXpath("/html/body/app-dda/app-diagnosis-data-viewer/header-component/div[1]/div[1]/div/span"), UIConstants.FIN_BUS);
        driver.switchTo().defaultContent();
    }

    public static void replaceOnCommunication(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[6]/div[2]/div/offer-communication/div/iframe"));
        textReplace(elementWithXpath("/html/body/app-root/div/div/div/xy-c-dialog/div[2]/app-message-editor/div/header/div[1]/app-customer-info/p[1]"), UIConstants.SERVICE_BERATER+" | "+"jack.mustermann@email.com"+" | "+UIConstants.TELEFON);
        textReplace(elementWithXpath("/html/body/app-root/div/div/div/xy-c-dialog/div[2]/app-message-editor/div/header/div[1]/app-customer-info/p[2]"), UIConstants.KENNZEICHEN_TEXTREPLACE+" | "+UIConstants.FIN_PKW);
        textReplace(elementWithXpath("//*[@id='email']"), UIConstants.EMAIL);
        driver.switchTo().defaultContent();
    }


    public static void replaceOnCommunicationVAN(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[6]/div[2]/div/offer-communication/div/iframe"));
        textReplace(elementWithXpath("/html/body/app-root/div/div/div/xy-c-dialog/div[2]/app-message-editor/div/header/div[1]/app-customer-info/p[1]"), UIConstants.SERVICE_BERATER+" | "+"jack.mustermann@email.com"+" | "+UIConstants.TELEFON);
        textReplace(elementWithXpath("/html/body/app-root/div/div/div/xy-c-dialog/div[2]/app-message-editor/div/header/div[1]/app-customer-info/p[2]"), UIConstants.KENNZEICHEN_TEXTREPLACE+" | "+UIConstants.FIN_TRUCK);
        textReplace(elementWithXpath("//*[@id='email']"), UIConstants.EMAIL);
        driver.switchTo().defaultContent();
    }

    public static void replaceSummaryPage(){
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary/offer-summary-editing/div/form/div/div/div[2]/div[1]/div[1]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/label"), UIConstants.KUNDEN_NAME);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary/offer-summary-editing/div/form/div/div/div[2]/div[1]/div[2]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/label"), UIConstants.SERVICE_BERATER);

    }

    public static void replaceSummaryPageBUS(){
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary/offer-summary-editing/div/form/div/div/div[2]/div/div[1]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/label"), UIConstants.KUNDEN_NAME);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary/offer-summary-editing/div/form/div/div/div[2]/div/div[2]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/label"), UIConstants.SERVICE_BERATER);

    }

    public static void replaceKundengespaechPage(){
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary/offer-summary-sent/div/div[1]/div/div/div[2]/div[1]/div[1]/div"), UIConstants.KUNDEN_NAME);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary/offer-summary-sent/div/div[1]/div/div/div[2]/div[1]/div[2]/div"), UIConstants.SERVICE_BERATER);
    }

    public static void replaceKundengespaechPageBUS(){
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary/offer-summary-sent/div/div[1]/div/div/div[2]/div/div[1]/div"), UIConstants.KUNDEN_NAME);
        textReplace(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/div/div/offer-summary/offer-summary-sent/div/div[1]/div/div/div[2]/div/div[2]/div"), UIConstants.SERVICE_BERATER);
    }

    public static void clickOnATerminOnTheList(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[5]/div[2]/div/offer-appointment/div/iframe"));
        elementWithXpath("/html/body/app-xa/div/appointment-list/p-table/div/div/div/div[2]/table/tbody/tr[1]/td[2]").click();
        driver.switchTo().defaultContent();
    }

    public static void closeTerminVereinbarenDialog(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(elementWithXpath("/html/body/offer-root/div/xy-c-frame/div/div/div[1]/xy-c-picker[5]/div[2]/div/offer-appointment/div/iframe"));
        elementWithXpath("/html/body/app-xa/div/appointment-list/div[1]/appointment-details/div/div[1]/button").click();
        driver.switchTo().defaultContent();
    }

    public static void replaceArchivList(){
        int countOfArchivInTheList = driver.findElements(By.xpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-overview/div/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr")).size();
        for (int i=1; i<=countOfArchivInTheList; i++) {
            textReplace(elementWithXpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-overview/div/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr[" + i + "]/td[5]/span/span"), UIConstants.FIN_PKW);
            textReplace(elementWithXpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-overview/div/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr[" + i + "]/td[6]/span/span"), UIConstants.KENNZEICHEN_TEXTREPLACE);
            textReplace(elementWithXpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-overview/div/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr["+i+"]/td[7]/span/span"), UIConstants.KUNDEN_NAME);
            textReplace(elementWithXpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-overview/div/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr["+i+"]/td[8]/span/span"), UIConstants.SERVICE_BERATER);
        }
    }

    public static void replaceArchivListBUS(){
        int countOfArchivInTheList = driver.findElements(By.xpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-overview/div/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr")).size();
        for (int i=1; i<=countOfArchivInTheList; i++) {
            textReplace(elementWithXpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-overview/div/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr[" + i + "]/td[5]/span/span"), UIConstants.FIN_BUS);
            textReplace(elementWithXpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-overview/div/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr[" + i + "]/td[6]/span/span"), UIConstants.KENNZEICHEN_TEXTREPLACE);
            textReplace(elementWithXpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-overview/div/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr["+i+"]/td[7]/span/span"), UIConstants.KUNDEN_NAME);
            textReplace(elementWithXpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-overview/div/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr["+i+"]/td[8]/span/span"), UIConstants.SERVICE_BERATER);
        }
    }


    public static void replaceArchivListVAN(){
        int countOfArchivInTheList = driver.findElements(By.xpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-overview/div/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr")).size();
        for (int i=1; i<=countOfArchivInTheList; i++) {
            textReplace(elementWithXpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-overview/div/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr[" + i + "]/td[5]/span/span"), UIConstants.FIN_TRUCK);
            textReplace(elementWithXpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-overview/div/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr[" + i + "]/td[6]/span/span"), UIConstants.KENNZEICHEN_TEXTREPLACE);
            textReplace(elementWithXpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-overview/div/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr["+i+"]/td[7]/span/span"), UIConstants.KUNDEN_NAME);
            textReplace(elementWithXpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-overview/div/div/div[2]/p-table/div/div/div/div[2]/table/tbody/tr["+i+"]/td[8]/span/span"), UIConstants.SERVICE_BERATER);
        }
    }

    public static void replaceOnArchivDetail(){
        WebElement finText = driver.findElement(By.xpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-details/div/archive-context-bar/div/div/div/div[1]/header/div[1]/p"));
        String fin = finText.getText().substring(0,16);
        String text = finText.getText().replaceAll(fin, UIConstants.FIN_PKW);
        textReplace(finText, text);
        textReplace(elementWithXpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-details/div/archive-context-bar/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div[1]/div"), UIConstants.KUNDEN_NAME);
        textReplace(elementWithXpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-details/div/archive-context-bar/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div[2]/div"), UIConstants.SERVICE_BERATER);

    }


    public static void replaceOnArchivDetailBUS(){
        WebElement finText = driver.findElement(By.xpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-details/div/archive-context-bar/div/div/div/div[1]/header/div[1]/p"));
        String fin = finText.getText().substring(0,16);
        String text = finText.getText().replaceAll(fin, UIConstants.FIN_BUS);
        textReplace(finText, text);
        textReplace(elementWithXpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-details/div/archive-context-bar/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div[1]/div"), UIConstants.KUNDEN_NAME);
        textReplace(elementWithXpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-details/div/archive-context-bar/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div[2]/div"), UIConstants.SERVICE_BERATER);

    }

    public static void replaceOnArchivDetailVAN(){
        WebElement finText = driver.findElement(By.xpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-details/div/archive-context-bar/div/div/div/div[1]/header/div[1]/p"));
        String fin = finText.getText().substring(0,16);
        String text = finText.getText().replaceAll(fin, UIConstants.FIN_TRUCK);
        textReplace(finText, text);
        textReplace(elementWithXpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-details/div/archive-context-bar/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div[1]/div"), UIConstants.KUNDEN_NAME);
        textReplace(elementWithXpath("/html/body/archive-app-root/div/xy-c-frame/div/div/div[1]/div/div/archive-details/div/archive-context-bar/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div[2]/div"), UIConstants.SERVICE_BERATER);

    }


    public static void replaceFleetList(){
        int countOfFleetInTheList = driver.findElements(By.xpath("/html/body/cp-app/cp-fleetlist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr")).size();
        for (int i=1; i<=countOfFleetInTheList; i++){
            textReplace(elementWithXpath("/html/body/cp-app/cp-fleetlist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr["+i+"]/td[3]/span/span"), "Uptime Company");
            textReplace(elementWithXpath("/html/body/cp-app/cp-fleetlist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr["+i+"]/td[4]/span/span"), UIConstants.FIRMENNAME);

        }

    }



}
