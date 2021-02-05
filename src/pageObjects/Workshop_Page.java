package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Workshop_Page {
    private static WebDriver driver;

    public Workshop_Page(WebDriver driver) {
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

    public static void


    moveTheCosorToElement(WebElement element){
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
        boolean countOfBlock= true;
        while (countOfBlock ==true){
            countOfBlock = driver.findElements(By.xpath("*//div[contains(@class, 'iw-block-ui-content')]")).size() != 0;
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

    public static void alleKachelAnzeige(){
        element("/html/body/app-root/div/div/div[1]/div/app-tiles/div[2]/p-panel/div/div[1]/span").click();
    }

    public static void clickOnDrawIcon(){
        WebElement element = driver.findElement(By.xpath("//*[contains(@class, 'xf-appdrawer-icon')]"));
        element.click();
    }

    public static void clickOnControlPanelIcon(){
        WebElement element = driver.findElement(By.xpath("//*[contains(@class, 'xf-controlpanel-icon')]"));
        element.click();
    }

    public static void clickOnOutletRahmen(){
        WebElement element = driver.findElement(By.xpath("//*[@id='xf-frame-outlet-name']"));
        element.click();
    }

    public static void clickOnCancelButtonOutletRahmen(){
        element("/html/body/div[1]/div[3]/div/div[3]/button[1]").click();
    }

    public static void clickOnSupportIcon(){
        WebElement element = driver.findElement(By.xpath("//*[contains(@class, 'xf-controlpanel-support-icon')]"));
        element.click();
    }

    public static void clickOnPlusButtonOnSupportDialog() throws InterruptedException{
        driver.switchTo().defaultContent();
        driver.switchTo().frame("xf-support-iframe");
        element("/html/body/app-root/app-ticket-list/div/div/div[2]/button/i").click();
        Thread.sleep(2000);
        element("/html/body/app-root/app-ticket-list/div/div/div[2]/app-topic-selection/button[2]/span").click();
        driver.switchTo().defaultContent();
    }

    public static void closeSupportDialog(){
        element("/html/body/div[1]/div[4]/div/div[1]/span[2]").click();
    }

    public static void openTheXentryWorkshop(){
        element("/html/body/app-root/div/div/div[1]/div/app-tiles/div[2]/div[1]/app-tile[4]/a/div/div[1]").click();
    }

    public static void clickOnTheSucheReiter(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/ul/li[1]/a/span").click();
    }

    public static void clickOnJobauswahlReiter(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/ul/li[2]/a/span").click();
    }

    public static void alleServiceBeraterAuswaehlen() throws InterruptedException{
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[2]/div/job-selection/div/div[1]/table/tr[2]/td[4]/p-dropdown/div/div[2]/span").click();
        Thread.sleep(2000);
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[2]/div/job-selection/div/div[1]/table/tr[2]/td[4]/p-dropdown/div/div[3]/div[2]/ul/p-dropdownitem[1]/li/span").click();
    }

    public static void alleTechnikerAuswaehlen() throws InterruptedException{
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[2]/div/job-selection/div/div[1]/table/tr[2]/td[5]/p-dropdown/div/div[2]/span").click();
        Thread.sleep(2000);
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[2]/div/job-selection/div/div[1]/table/tr[2]/td[5]/p-dropdown/div/div[3]/div[2]/ul/p-dropdownitem[2]/li/span").click();
    }

    public static void alleTechnikerAuswaehlenAlsUser() throws InterruptedException{
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[2]/div/job-selection/div/div[1]/table/tr[2]/td[5]/p-dropdown/div/div[2]/span").click();
        Thread.sleep(2000);
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[2]/div/job-selection/div/div[1]/table/tr[2]/td[5]/p-dropdown/div/div[3]/div[2]/ul/p-dropdownitem[1]/li/span").click();
    }

    public static void clickOnBlaueAugen(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[2]/div/job-selection/div/div[2]/p-table/div/div/table/tbody/tr[1]/td[10]/div/button").click();
    }

    public static void closePopupVorganguebersicht(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[2]/div/job-selection/job-readonly-dialog/p-dialog/div/div[3]/p-footer/div[2]/div/button/span").click();
    }

    public static void clickOnBriefumschlag(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/ul/li[5]/a/span[1]").click();
    }

    public static int countOfJobsInTheList() {
        List<WebElement> elements = driver.findElements(By.xpath("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[2]/div/job-selection/div/div[2]/p-table/div/div/table/tbody/tr"));
        System.out.print("Count of Jobs is: " + elements.size()+"\n");
        return elements.size();
    }

    public static void clickOnTheJob(String fin) {
        for (int i = 1; i <= countOfJobsInTheList(); i++) {
            WebElement element = driver.findElement(By.xpath("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[2]/div/job-selection/div/div[2]/p-table/div/div/table/tbody/tr["+i+"]/td[3]/div/div"));
            System.out.print("Text is :" + element.getText() + "\n");
            if (element.getText().equals(fin)) {
                element.click();
                break;
            }
        }
    }

    public static void filternach(String fin) throws InterruptedException{
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[2]/div/job-selection/div/div[1]/table/tr[2]/td[6]/input").clear();
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[2]/div/job-selection/div/div[1]/table/tr[2]/td[6]/input").click();
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[2]/div/job-selection/div/div[1]/table/tr[2]/td[6]/input").sendKeys(fin);
        Thread.sleep(2000);
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[2]/div/job-selection/div/div[1]/table/tr[2]/td[7]/button").click();
    }

    public static void closePopupByOpenJob(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/job-content/div/jobenrichmentdialog/div/p-dialog/div/div[3]/p-footer/div/button/span").click();
    }

    public static void clickOnModellText(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/job-content/div/iw-header-common/div[1]/div[2]/div[1]/div/div[2]").click();
    }

    public static void closeTheJob(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/ul/li[4]/span").click();
    }

    public static void suchennach(String fin){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[1]/div/div[2]/job-search/value-search/p-panel/div/div[2]/div/div[1]/input").sendKeys(fin);
    }

    public static void clickOnCancelButtonBySearchOfJob(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[1]/div/div[2]/job-search/value-search/p-dialog[2]/div/div[3]/p-footer/div/button").click();
    }

    public static void clickOnButtonKurztestsuchen(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[1]/div/div[2]/job-search/value-search/p-panel/div/div[2]/div/div[5]/button").click();
    }

    public static void clickOnDropdownforKurztest(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[1]/div/div[2]/job-search/value-search/p-panel/div/div[2]/div/quicktest-search/div[1]/p-dialog/div/div[2]/div/form/div/div[1]/div[2]/p-dropdown/div/div[2]").click();
    }

    public static void kurztestAuswahl(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[1]/div/div[2]/job-search/value-search/p-panel/div/div[2]/div/quicktest-search/div[1]/p-dialog/div/div[2]/div/form/div/div[1]/div[2]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[8]/li/span").click();
    }

    public static void clickOnAkzeptierenButton(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[1]/div/div[2]/job-search/value-search/p-panel/div/div[2]/div/quicktest-search/div[1]/p-dialog/div/div[2]/div/div/button[1]").click();
    }

    public static void clickOnFehlerCodeSuchenTab(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[1]/div/div[2]/job-search/search/div/div[1]/p-tabview/div/ul/li[2]").click();
    }

    public static void scrollDownThePageToFehlerCode(){
        WebElement element = driver.findElement(By.xpath("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[1]/div/div[2]/job-search/search/div/div[1]/p-tabview/div/div/div/p-tabpanel[2]/div/div/fault-code-tree/p-tree/div/ul/p-treenode[31]/li/div/span[2]/span/div"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToAufbau(){
        WebElement element = driver.findElement(By.xpath("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[1]/div/div[2]/job-search/search/div/div[1]/p-tabview/div/div/div/p-tabpanel[1]/div/div/symptom-tree/p-tree/div/ul/p-treenode[6]/li/div/span[2]/span/div"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToAlleReduzieren(){
        WebElement element = driver.findElement(By.xpath("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[1]/iw-header-common/div[1]/div[2]/div[1]/div/div[1]"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToTipsDocument(){
        WebElement element = driver.findElement(By.xpath("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/p-accordion/div/p-accordiontab[2]/div[1]/a/span[2]"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToReparaturpakete(){
        WebElement element = driver.findElement(By.xpath("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/p-accordion/div/p-accordiontab[4]/div[1]/a/span[2]"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToTeile(){
        WebElement element = driver.findElement(By.xpath("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/p-accordion/div/p-accordiontab[6]/div[1]/a/span[2]"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToArbeiten(){
        WebElement element = driver.findElement(By.xpath("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/p-accordion/div/p-accordiontab[5]/div[1]/a/span[2]"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToReparaturSuchenButton(){
        WebElement element = driver.findElement(By.xpath("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/p-accordion/div/p-accordiontab[4]/div[2]/div/div/div/button/span"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToErsatzTeile(){
        WebElement element = driver.findElement(By.xpath("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/p-accordion/div/p-accordiontab[7]/div[1]/a/span[2]"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public static void scrollDownThePageToUrsacheUndHilfe(){
        WebElement element = driver.findElement(By.xpath("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/p-accordion/div/p-accordiontab[9]/div[1]/a/span[2]"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageToKundenaussage(){
        WebElement element = driver.findElement(By.xpath("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/p-accordion/div/p-accordiontab[1]/div[1]/a/span[2]"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollDownThePageInSettingNachUntenToEmail(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame("settingIframe");
        WebElement element = driver.findElement(By.xpath("/html/body/app-root/settings-selection/p-tabview/div/div/p-tabpanel/div/div[2]/p-panel/div/div[1]/span"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.switchTo().defaultContent();
    }

    public static void scrollDownThePageInSettingNachUntenToGarantie(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame("settingIframe");
        WebElement element = driver.findElement(By.xpath("/html/body/app-root/settings-selection/p-tabview/div/div/p-tabpanel/div/div[3]/p-panel/div/div[1]/span"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.switchTo().defaultContent();
    }











    public static void clickOnTabSymptomsuche(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[1]/div/div[2]/job-search/search/div/div[1]/p-tabview/div/ul/li[1]").click();
    }



    public static void clickOnPfeilStossfaenger(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[1]/div/div[2]/job-search/search/div/div[1]/p-tabview/div/div/div/p-tabpanel[1]/div/div/symptom-tree/p-tree/div/ul/p-treenode[6]/li/ul/p-treenode[3]/li/div/span[1]").click();
    }

    public static void clickOnTabStichwortsuche(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[1]/div/div[2]/job-search/search/div/div[1]/p-tabview/div/ul/li[3]").click();
    }

    public static void clickOnButtonErstellungBeanstandung(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[1]/div/div[2]/job-search/search/div/div[2]/div[1]/button[1]").click();
    }

    public static void symptomAuswahl(){
        element("//*[@id='selectedNodeId-1']").click();
    }

    public static void checkBoxTippsDocument(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/create-complaint/div[2]/div/div[2]/p-panel/div/div[2]/div/div/div/div/p-table/div/div/table/tbody/tr[1]/td[3]/p-tablecheckbox/div/div[2]").click();
    }

    public static void clickOnButtonErstellungBeanstandungInTipsDokument(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/create-complaint/div[2]/div/div[2]/div/button").click();
    }

    public static void markiereSSL(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/create-complaint/div[1]/p-dialog/div/div[2]/div/p-table[1]/div/div/table/tbody/tr/td[1]/div/p-radiobutton/div/div[2]/span").click();
    }

    public static void markiereAlleArbeit(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/create-complaint/div[1]/p-dialog/div/div[2]/div/div[2]/p-checkbox/div/div[2]").click();
    }

    public static void tipsDocumentZuordnen(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/create-complaint/div[1]/p-dialog/div/div[3]/p-footer/div/button[1]").click();
    }

    public static void alleReduzieren() throws InterruptedException{
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/expand-collapse/div/div/span[1]/div/span").click();
        Thread.sleep(2000);
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/expand-collapse/div/div/span[1]/div/span").click();
    }


    public static void clickOnSideMenue(){
        element("//*[@id='sidePanel']").click();
    }

    public static void closeSideMenue(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[1]/iw-header-common/div[1]/div[2]/div[4]/function-indicators/div/div[1]/span").click();
    }

    public static void kundenaussageErweitern(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/p-accordion/div/p-accordiontab[1]/div[1]/a/span[2]").click();
    }

    public static void tipsErweitern(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/p-accordion/div/p-accordiontab[2]/div[1]/a/span[2]").click();
    }

    public static void paketErweitern(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/p-accordion/div/p-accordiontab[3]/div[1]/a/span[2]").click();
    }

    public static void premiumOelServiceBAuswahl(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/p-accordion/div/p-accordiontab[3]/div[2]/div/div/packages/div/div[3]/p-table/div/div/table/tbody/tr[8]/td[1]/div[2]/p-radiobutton/div/div[2]/span").click();
    }

    public static void reparaturpaketeErweitern(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/p-accordion/div/p-accordiontab[4]/div[1]/a/span[2]").click();
    }

    public static void arbeitenErweitern(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/p-accordion/div/p-accordiontab[5]/div[1]/a/span[2]").click();
    }

    public static void reparaturpaketesuchen(String sprache) throws InterruptedException{
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/p-accordion/div/p-accordiontab[4]/div[2]/div/div/div/button").click();
        Thread.sleep(2000);
        waitForSpinnerNotAppears();
        alleSuchbegriffeEntfernenUndNeueSuchen(sprache);
        Thread.sleep(2000);


    }

    public static void alleSuchbegriffeEntfernenUndNeueSuchen(String sprache) throws InterruptedException{
        driver.switchTo().defaultContent();
        driver.switchTo().frame(element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/p-accordion/div/p-accordiontab[4]/div[2]/div/div/div/complaint-rpr-package/div/iframe"));
        element("//*[@id='ResetBtnOnSearchDetailtlPage']").click();
        Thread.sleep(2000);
        if (sprache.contains("cs")){
            element("//*[@id='keywordChipInput']").sendKeys("turbodmychadlo");
        }
        else{
            element("//*[@id='keywordChipInput']").sendKeys("Abgasturbolader");
        }
        Thread.sleep(2000);
        element("//*[@id='SearchBtnOnSearchDetailtlPage']").click();
        Thread.sleep(2000);
        waitForSpinnerNotAppears();
        element("/html/body/div[1]/app-root/xy-c-frame/div/div[2]/div[1]/div/div/div/rpr-search/div/div[2]/div/div/result/div/table/tr/div/div/div[2]/pw-scrollpanel/div/div[1]/div/p-table/div/div/div/div[2]/table/tbody/tr[1]/td[1]").click();
        Thread.sleep(2000);
        waitForSpinnerNotAppears();
        element("/html/body/div[1]/app-root/xy-c-frame/div/div[2]/div[1]/div/div/div/rpr-search/div/div[3]/div/div/app-package-details/div[1]/div[2]/pw-scrollpanel/div/div[1]/div/div/div[1]/damage-type/ul/li[2]/span/label").click();
        Thread.sleep(2000);
        element("/html/body/div[1]/app-root/xy-c-frame/div/div[2]/div[1]/div/div/div/rpr-search/div/div[3]/div/div/app-package-details/div[1]/div[2]/pw-scrollpanel/div/div[1]/div/div/labor-operation/div/p-table/div/div/table/tbody/tr[1]/td[1]/div/span/label").click();
        Thread.sleep(2000);
        element("/html/body/div[1]/app-root/xy-c-frame/div/div[2]/div[1]/div/div/div/rpr-search/div/div[3]/div/div/app-package-details/div[1]/div[2]/pw-scrollpanel/div/div[1]/div/div/labor-operation/div/p-table/div/div/table/tbody/tr[2]/td[1]/div/span/label").click();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
    }

    public static void clickOnButtonUebernehmen(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/p-accordion/div/p-accordiontab[4]/div[2]/div/div/div/complaint-rpr-package/div/iframe"));
        element("/html/body/div[1]/app-root/xy-c-frame/div/div[2]/div[1]/div/div/div/rpr-search/div/div[3]/div/div/app-package-details/div[1]/div[3]/div[2]/button[2]").click();
        driver.switchTo().defaultContent();
    }

    public static void aufrufenASRA(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/p-accordion/div/p-accordiontab[5]/div[2]/div/div/maintenance-scope/div/div/button[1]/span").click();
    }

    public static void teileRecherchieren(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/p-accordion/div/p-accordiontab[6]/div[2]/div/div/parts/div/div/button[2]").click();
    }

    public static void clickOnGruppen_47(){
        element("/html/body/app-root/app-inquiry-main/div[2]/div[2]/div[1]/app-kg-selection/div/ul[2]/li[16]/div/div[2]/span[1]").click();
    }

    public static void clickOnImageOfTeile_35(){
        element("/html/body/app-root/app-inquiry-main/div[2]/div[2]/div[2]/div[2]/div/app-tuselection/div/div[2]/ul/li[2]/ul/li/img").click();
    }

    public static void clickOnWarenkorbVonBauteil(){
        element("/html/body/app-root/app-inquiry-main/div[2]/div[2]/div/div[1]/div[2]/app-parts-list/div[2]/div/div/ul/li[1]/app-part-row/div/div[3]/div[2]/app-add-to-cart/div/button").click();
    }

    public static void partsInfoVerlassen(){
        element("/html/body/app-root/div/app-nav-sidebar/app-sidebar/div/div[2]/app-sidebar-button[1]").click();
    }

    public static void ursacheUndHilfeErweitern(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/p-accordion/div/p-accordiontab[9]/div[1]/a/span[2]").click();
    }

    public static void anhangErweitern(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/p-accordion/div/p-accordiontab[10]/div[1]/a/span[2]").click();
    }

    public static void speichernUndSchliessenVorgang(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/complaint/div[2]/div[2]/div/button[1]").click();
    }

    public static void clickOnTheLupe(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/job-content/div/iw-header-common/div[1]/div[1]/div[3]/div[2]/div/span[1]/span/i").click();
    }

    public static void anforderungErstellen(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/edit-search/search/div/div[2]/div[1]/button[2]").click();
    }

    public static void anforderungAbbrechen(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/request/div/div/button[2]").click();
    }

    public static void clickOnOkButtonOnPopUp(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/job-content/div/div[1]/p-dialog/div/div[3]/p-footer/div/button").click();
    }

    public static void vorgangSchliessen(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/ul/li[4]/span").click();
    }

    public static void clickOnPfeilButtonInJobDetails(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/job-content/div/iw-header-common/div[1]/div[1]/div[3]/div[2]/div/span[3]/i").click();
    }

    public static void clickOnFahrzeugtestdaten(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/job-content/div/div[2]/div/div[1]/div[2]/div[1]/div/content-button/div").click();
    }

    public static void telediagnoseStarten(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/short-test/div[1]/div/div/div/td[1]/button").click();
    }

    public static void kurztestanalyse(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/short-test/div[1]/div/div/div/td[3]/button/span").click();
    }

    public static void kurztestAnalyseSchliessen(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/short-test/div[2]/p-dialog/div/div[3]/p-footer/div/button/span").click();
    }

    public static void kurztestDetails() throws InterruptedException{
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/short-test/div[1]/div/div/p-table/div/div[2]/table/tbody/tr[1]/td[5]/button/span[1]").click();
        waitForSpinnerNotAppears();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/dda-app/div/iframe"));
        element("/html/body/app-dda/app-diagnosis-data-viewer/ecu-tab/label[3]/span").click();
        waitForSpinnerNotAppears();
        element("/html/body/app-dda/app-diagnosis-data-viewer/ecu-tab/table/tbody/tr[9]/td[1]/div/toggle-button/button/span").click();
        driver.switchTo().defaultContent();

    }

    public static void kurztestDateilsSchliessen(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/dda-app/div/div/button/span").click();
    }

    public static void kurztestEntkoppeln(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/short-test/div[1]/div/div/p-table/div/div[2]/table/tbody/tr[7]/td[4]/button/span[1]").click();
    }

    public static void gobackToJobDetailsFromKurztest(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/short-test/div[1]/iw-header-common/div[1]/div[1]/div[1]/i").click();
    }

    public static void clickOnFahrzeugInformation(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/job-content/div/div[2]/div/div[1]/div[2]/div[2]/div/content-button/div").click();
    }


    public static void gobackToJobdetailsFromFahrzeugInfo(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/vehicle-information/iw-header-common/div[1]/div[1]/div[1]/i").click();
    }

    public static void clickOnVorgangInfo(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/job-content/div/div[2]/div/div[1]/div[2]/div[3]/div/content-button/div").click();
    }

    public static void gobackToJobdetailsFromJobInfo(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/job-information/iw-header-common/div[1]/div[1]/div[1]/i").click();
    }

    public static void clickOnReparaturPakete(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/job-content/div/div[2]/div/div[1]/div[2]/div[7]/div/content-button/div").click();
    }

    public static void reparaturPaketeSuchen_2( String sprache){
        driver.switchTo().defaultContent();
        driver.switchTo().frame("iw-rpr-iframe");
        if (sprache.contains("cs")){
            element("//*[@id='keywordChipInput']").sendKeys("turbodmychadlo");
        }
        else{
            element("//*[@id='keywordChipInput']").sendKeys("Abgasturbolader");
        }
        element("//*[@id='SearchBtnOnSearchDetailtlPage']").click();
        driver.switchTo().defaultContent();
    }

    public static void gobackToJobdetailsFromReparaturPakete(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/rpr/iw-header-common/div[1]/div[1]/div[1]/i").click();
    }



    public static void vorgangArchivieren(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[2]/div/job-selection/div/div[2]/p-table/div/div/table/tbody/tr[1]/td[11]/div/button/img").click();
    }

    public static void vorgangArchivierenJa(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[2]/div/job-selection/p-dialog[1]/div/div[3]/p-footer/div/button[1]/span").click();
    }

    public static void clickOnArchivTab(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/ul/li[3]/a/span").click();
    }

    public static void archivPopup() throws InterruptedException{
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[3]/div/archived-job/div/div[2]/p-table/div/div/table/tbody/tr[1]/td[1]/div/div").click();
        waitForSpinnerNotAppears();
        Thread.sleep(2000);
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[3]/div/archived-job/job-readonly-dialog/p-dialog/div/div[2]/div/div/p-accordion/div/div[1]/div/p-accordiontab/div[1]/a/span[1]").click();

    }

    public static void closeArchivPopup(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[3]/div/archived-job/job-readonly-dialog/p-dialog/div/div[3]/p-footer/div[2]/div/button/span").click();
    }

    public static void clickOnEinstellungButton(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/ul/li[4]/a/span[1]").click();
    }

    public static void clickOnWis(){
        element("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/job-content/div/div[2]/div/div[1]/div[2]/div[10]/div/content-button/div").click();
    }








    //Text Replace
    public static void executeScript(String text, WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].innerHTML= '"+text+"';",element);
    }

    public static void textReplace_2_Aufruf_XIW(){
        WebElement outletUser = driver.findElement(By.xpath("//*[@id='xf-frame-user-name']"));
        WebElement outletName= driver.findElement(By.xpath("//*[@id='xf-frame-outlet-name']"));
        WebElement willKommenText = driver.findElement(By.xpath("/html/body/app-root/div/div/div[1]/app-welcome/div[2]/div/div"));
        executeScript("0000 Musterbetrieb", outletName);
        executeScript("Max Mustermann", outletUser);
        System.out.println("text is dsgsagad:"+element("/html/body/app-root/div/div/div[1]/app-welcome/div[2]/div/div").getText());
        String string = element("/html/body/app-root/div/div/div[1]/app-welcome/div[2]/div/div").getText().replaceAll("\\r\\n|\\r|\\n", " ");
        String[] parts = string.split(",");
        System.out.println(string);

        executeScript(parts[0]+"<br>"+UIConstants.SERVICE_BERATER+"!", element("/html/body/app-root/div/div/div[1]/app-welcome/div[2]/div/div"));
    }

    public static void textReplace_2_XENTRY_Portal_Rahmen(){
        WebElement menueUser = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/nav[3]/div/div[2]/div/span[2]"));
        WebElement menueBetrieb = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/nav[3]/div/div[3]/div/div/div[2]"));
        WebElement betriebID = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/nav[3]/div/div[3]/div/div/div[1]"));
        executeScript("0000 - ", betriebID);
        executeScript("Musterbetrieb", menueBetrieb);
        executeScript("Max Mustermann", menueUser);

    }

    public static void textReplace_2_Servicebetrieb_Wechseln(){
        for (int i=1; i<5; i++){
            WebElement betriebName = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div["+i+"]/span[1]"));
            executeScript("0000 Musterbetrieb", betriebName);
        }
    }

    public static void textReplace_2_Suche(){
        WebElement outletUser = driver.findElement(By.xpath("//*[@id='xf-frame-user-name']"));
        WebElement outletName= driver.findElement(By.xpath("//*[@id='xf-frame-outlet-name']"));
        executeScript("0000 Musterbetrieb", outletName);
        executeScript("Max Mustermann", outletUser);
    }


    public static void textReplace_2_Jobauswahl(){
        //Fin
        for (int i=1; i<21; i++){
            WebElement fin = driver.findElement(By.xpath("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[2]/div/job-selection/div/div[2]/p-table/div/div/table/tbody/tr["+i+"]/td[3]/div/div"));
            executeScript("WDD1234567A891011", fin);
        }
        //Techniker
        for (int i=1; i<21; i++){
            WebElement fin = driver.findElement(By.xpath("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[2]/div/job-selection/div/div[2]/p-table/div/div/table/tbody/tr["+i+"]/td[9]/div/div"));
            executeScript("Jack Mustermann", fin);
        }

    }

    public static void textReplace_2_Vorganguebersicht_Popup(){
        WebElement fin = driver.findElement(By.xpath("//*[@id='ui-dialog-10-label']"));
        executeScript("WDD1234567A891011", fin);
    }

    public static void textReplace_2_Inhalt_Job(){
        WebElement schildTab = driver.findElement(By.xpath("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/ul/li[4]/a/span"));
        executeScript("XX-XX 0000", schildTab);
        WebElement fin = driver.findElement(By.xpath("/html/body/xiw-app/div/job-selection-search/div[1]/p-tabview/div/div/p-tabpanel[4]/div/div/job-content/div/iw-header-common/div[1]/div[2]/div[1]/div/div[1]"));
        executeScript("FIN: WDB1234567A891011", fin);
        WebElement licenseNumber = driver.findElement(By.xpath("//*[@id='licensePlateNumber']"));
        licenseNumber.clear();
        licenseNumber.sendKeys("XX-XX 0000");
    }





}
