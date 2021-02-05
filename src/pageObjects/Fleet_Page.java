package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class Fleet_Page {
    private static WebDriver driver;

    public Fleet_Page(WebDriver driver) {
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

    public static void clickOnElement(WebElement element) {
        boolean staleElement = true;
        while (staleElement) {
            try {
                element.click();
                staleElement = false;
            } catch (StaleElementReferenceException e) {
                staleElement = true;
            }
        }
    }





    public static WebElement vehicleList() throws InterruptedException {
        int i=0;
        while (driver.findElements(By.xpath("/html/body/cp-app/p-tabview/div/ul/li[2]/a/span")).isEmpty()){
            Thread.sleep(500);
            i=i+500;
            if (i>10000){
                driver.navigate().refresh();
            }
        }
        WebElement vehicle = driver.findElement(By.xpath("/html/body/cp-app/p-tabview/div/ul/li[2]/a/span"));
        return vehicle;
    }

    public static WebElement fleetList() {
        return elementWithXpath("/html/body/cp-app/p-tabview/div/ul/li[1]/a/span");
    }

    public static void clickOnVehicleList() throws InterruptedException {
        vehicleList().click();
    }

    public static void clickOnFleetList() {
        clickOnElement(fleetList());
    }

    public static WebElement filterButton() {
        return elementWithXpath("//*[contains(@class, 'rc-i-filter')]");
    }

    public static void clickOnFilterButton() {
        clickOnElement(filterButton());
    }

    public static WebElement finFieldOfFilter() {
        List<WebElement> elements = driver.findElements(By.className("values"));
        return elements.get(2);
    }

    public static void enterFinForFilter(String fin) {
        finFieldOfFilter().click();
        finFieldOfFilter().sendKeys(fin);
    }

    public static int countOfVehicleInTheList() {
        List<WebElement> elements = driver.findElements(By.xpath("*//cp-outletvehiclelist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr"));
        System.out.print("Count of Vehicle is: " + elements.size());
        return elements.size();
    }

    public static int countOfTruckInTheListOfFleet() {
        List<WebElement> elements = driver.findElements(By.xpath(" /html/body/cp-app/cp-vehiclelist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr"));
        System.out.print("Count of Truck is: " + elements.size());
        return elements.size();
    }


    public static int countOfFleetInTheFleetList() {
        List<WebElement> elements = driver.findElements(By.xpath("/html/body/cp-app/cp-fleetlist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr"));
        System.out.print("Count of Fleet is: " + elements.size() + "\n");
        return elements.size();
    }


    public static void clickOnTheFin(String fin) {
        for (int i = 1; i <= countOfVehicleInTheList(); i++) {
            WebElement element = driver.findElement(By.xpath("*//cp-outletvehiclelist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr[" + i + "]/td[3]/span/span[1]"));
            System.out.print("Text is :" + element.getText() + "\n");
            if (element.getText().equals(fin)) {
                element.click();
                break;
            }
        }
    }


    public static void clickOnTheFinOfTruck(String fin) {
        for (int i = 1; i <= countOfTruckInTheListOfFleet(); i++) {
            WebElement element = driver.findElement(By.xpath("/html/body/cp-app/cp-vehiclelist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr[" + i + "]/td[3]/span/span"));
            System.out.print("Text is :" + element.getText() + "\n");
            if (element.getText().equals(fin)) {
                element.click();
                break;
            }
        }
    }

    public static void clickOnTheFleet(String fleetName) {
        for (int i = 1; i <= countOfFleetInTheFleetList(); i++) {
            WebElement element = driver.findElement(By.xpath("/html/body/cp-app/cp-fleetlist/div/div[1]/div[2]/p-datatable/div/div[1]/div/div[2]/div/table/tbody/tr[" + i + "]/td[3]/span/span"));
            System.out.print("Text is : " + element.getText() + "\n");
            if (element.getText().equals(fleetName)) {
                element.click();
                break;
            }
        }
    }

    public static void showAllVehicle() {
        elementWithID("showVehiclesBtn").click();
    }

    public static WebElement spinner() {
        WebElement spin = driver.findElement(By.className("Spinner"));
        return spin;
    }

    public static boolean isElementDisplayed(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 1);
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException
                | org.openqa.selenium.StaleElementReferenceException
                | org.openqa.selenium.TimeoutException e) {
            return false;
        }
    }

    public static void waitForElementToBeGone(WebElement element, int timeout) {
        if (isElementDisplayed(element)) {
            new WebDriverWait(driver, timeout).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(element)));
        }
    }

    public static void waitingForSpinnerGone() throws InterruptedException {
        List<WebElement> spin = driver.findElements(By.className("values"));
        while (spin.size() != 0) {
            Thread.sleep(5000);
        }
    }

    public static WebElement OfferButton() {
        return elementWithID("offerBtn");
    }

    public static void clickOnOfferButton(){
        OfferButton().click();
    }


    public static void clickOnDataProtectionBanner() {
        boolean elements = driver.findElements(By.xpath("//*[contains(@class, 'xf-data-protection-hint-content xf-icon xf-data-protection-hint-close-icon xf-line-icons')]")).size() != 0;
        System.out.print("Wert is: " + elements);
        if (elements == true) {
            WebElement element = driver.findElement(By.xpath("//*[contains(@class, 'xf-data-protection-hint-content xf-icon xf-data-protection-hint-close-icon xf-line-icons')]"));
            element.click();
        }
    }

    public static void clickOnCookieBanner() {
        boolean elements = driver.findElements(By.xpath("//*[contains(@class, 'xf-cookie-hint-content xf-icon xf-cookie-hint-close-icon xf-line-icons')]")).size() != 0;
        if (elements == true) {
            WebElement element = driver.findElement(By.xpath("//*[contains(@class, 'xf-cookie-hint-content xf-icon xf-cookie-hint-close-icon xf-line-icons')]"));
            element.click();
        }
    }

    public static void closeCookies(){
        WebElement element = driver.findElement(By.xpath("//*[contains(@class, 'xf-hint-content xf-icon xf-hint-close-icon xf-line-icons')]"));
        element.click();
    }

    public static void clickOnMoreInfoButton() {
        WebElement element = driver.findElement(By.className("addition"));
        element.click();
    }

    public static void clickOnCustomerInfo() {
        elementWithID("0").click();
    }

    public static void clickOnCustomerInfoForTruck() {
        elementWithID("0").click();
    }

    public static void closeDialogOfCustomerInfoForTruck() {
        elementWithXpath("/html/body/cp-app/cp-contact-details/p-dialog/div/div[1]/a/span").click();
    }

    public static void clickOnFahrzeugmeldungenForTruck() {
        elementWithID("1").click();
    }

    public static void closeDialogFahrzeugmeldungen() {
        elementWithXpath("/html/body/cp-app/cp-vehicle-notifications/p-dialog/div/div[1]/a/span").click();
    }

    public static void clickOnTeleDataForTruck() {
        elementWithID("2").click();
    }

    public static void closeDialogOfTeleDataForTruck() {
        elementWithXpath("/html/body/cp-app/cp-telematics-data/p-dialog/div/div[1]/a/span").click();
    }


    public static void clickOnVehicleDataForTruck() {
        elementWithID("3").click();
    }

    public static void closeDialogOfVehicleDataForTruck() {
        elementWithXpath("/html/body/cp-app/cp-vehicle-data/p-dialog/div/div[1]/a/span").click();
    }

    public static void clickOnTeleData() {
        elementWithID("1").click();
    }

    public static void clickOnTeleData_Pro() {
        elementWithID("2").click();
    }


    public static void clickOnVehicleData() {
        elementWithID("2").click();
    }

    public static void closeDialogOfCustomerInfo() {
        elementWithXpath("/html/body/cp-app/cp-contact-details/p-dialog/div/div[1]/a/span").click();
    }

    public static void closeDialogOfTeleData() {
        elementWithXpath("/html/body/cp-app/cp-telematics-data/p-dialog/div/div[1]/a/span").click();
    }

    public static void closeDialogOfVehicleData() {
        elementWithXpath("/html/body/cp-app/cp-vehicle-data/p-dialog/div/div[1]/a/span").click();
    }

    public static void clickOnNavbarAppdrawer() {
        elementWithXpath("/html/body/div[1]/div[1]/div[2]/a[2]").click();
    }

    public static void clickOnArchivMenu() {
        elementWithXpath("/html/body/div[1]/div[1]/div[2]/nav[1]/div/div[2]/a[1]/div").click();
    }

    public static void changeToArchivOfferTab() {
        elementWithXpath("/html/body/div[1]/header/div[2]/div[2]/nav/ul/div/li[2]/a/div").click();
    }

    public static void clickOnInboxIcon() {
        elementWithXpath("//*[contains(@class, 'xf-icon xf-inbox-icon xf-line-icons')]").click();
    }


    public static void clickOnLupeForLeadDetail() {
        elementWithXpath("/html/body/cp-app/cp-outletvehiclelist/div/div[2]/cp-vehiclelist-context/div[2]/div[1]/div[2]/p-datatable/div/div[1]/table/tbody/tr[1]/td[5]/span/button/span[1]").click();
    }

    public static void clickOnLupeForLeadDetailOfTruck() {
        elementWithXpath("/html/body/cp-app/cp-vehiclelist/div/div[2]/cp-vehiclelist-context/div[2]/div[1]/div[2]/p-datatable/div/div[1]/table/tbody/tr[1]/td[5]/span/button/span[1]").click();
    }


    public static void closeDialogLeadDetails() {
        elementWithXpath("/html/body/cp-app/cp-lead-details/p-dialog/div/div[1]/a/span").click();
    }

    public static void clickOnIButton(){
        elementWithXpath("/html/body/cp-app/cp-outletvehiclelist/div/div[1]/div[1]/div[2]/button[1]/span[1]").click();

    }

    public static void closeSmartOnboardingDialog(){
        elementWithXpath("/html/body/div[11]/div[1]/button").click();
    }

}

