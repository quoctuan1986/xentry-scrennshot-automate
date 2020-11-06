package pageObjects;

import org.junit.rules.Timeout;
import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Fleet_Page {
    private static WebDriver driver;

    public Fleet_Page(WebDriver driver) {
        this.driver = driver;
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

    public static WebElement elementWithXpath(String xpath){
        WebElement ele = driver.findElement(By.xpath(xpath));
        return ele;
    }

    public static WebElement elementWithId(String id){
        WebElement ele = driver.findElement(By.id(id));
        return ele;
    }

    public static WebElement vehicleList() {
        WebElement vehicle = driver.findElement(By.id("ui-tabpanel-1-label"));
        return vehicle;
    }

    public static WebElement fleetList() {
        WebElement fleet = driver.findElement(By.id("ui-tabpanel-0-label"));
        return fleet;
    }

    public static void clickOnVehicleList() {
        vehicleList().click();
    }

    public static void clickOnFleetList() {
        clickOnElement(fleetList());
    }

    public static WebElement filterButton() {
        WebElement filter = driver.findElement(By.xpath("//*[contains(@class, 'rc-i-filter')]"));
        return filter;
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
        WebElement element = driver.findElement(By.id("showVehiclesBtn"));
        element.click();
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
        WebElement element = driver.findElement(By.id("offerBtn"));
        return element;
    }

    public static void clickOnOfferButton() {
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

    public static void clickOnMoreInfoButton() {
        WebElement element = driver.findElement(By.className("addition"));
        element.click();
    }

    public static void clickOnCustomerInfo() {
        WebElement element = driver.findElement(By.id("0"));
        element.click();
    }

    public static void clickOnCustomerInfoForTruck() {
        WebElement element = driver.findElement(By.id("0"));
        element.click();
    }

    public static void closeDialogOfCustomerInfoForTruck() {
        WebElement element = driver.findElement(By.xpath("/html/body/cp-app/cp-contact-details/p-dialog/div/div[1]/a/span"));
        element.click();
    }

    public static void clickOnFahrzeugmeldungenForTruck() {
        WebElement element = driver.findElement(By.id("1"));
        element.click();
    }

    public static void closeDialogFahrzeugmeldungen() {
        WebElement element = driver.findElement(By.xpath("/html/body/cp-app/cp-vehicle-notifications/p-dialog/div/div[1]/a/span"));
        element.click();
    }

    public static void clickOnTeleDataForTruck() {
        WebElement element = driver.findElement(By.id("2"));
        element.click();
    }

    public static void closeDialogOfTeleDataForTruck() {
        WebElement element = driver.findElement(By.xpath("/html/body/cp-app/cp-telematics-data/p-dialog/div/div[1]/a/span"));
        element.click();
    }


    public static void clickOnVehicleDataForTruck() {
        WebElement element = driver.findElement(By.id("3"));
        element.click();
    }

    public static void closeDialogOfVehicleDataForTruck() {
        WebElement element = driver.findElement(By.xpath("/html/body/cp-app/cp-vehicle-data/p-dialog/div/div[1]/a/span"));
        element.click();
    }

    public static void clickOnTeleData() {
        WebElement element = driver.findElement(By.id("1"));
        element.click();
    }

    public static void clickOnTeleData_Pro() {
        WebElement element = driver.findElement(By.id("2"));
        element.click();
    }


    public static void clickOnVehicleData() {
        WebElement element = driver.findElement(By.id("2"));
        element.click();
    }

    public static void closeDialogOfCustomerInfo() {
        WebElement element = driver.findElement(By.xpath("/html/body/cp-app/cp-contact-details/p-dialog/div/div[1]/a/span"));
        element.click();
    }

    public static void closeDialogOfTeleData() {
        WebElement element = driver.findElement(By.xpath("/html/body/cp-app/cp-telematics-data/p-dialog/div/div[1]/a/span"));
        element.click();
    }

    public static void closeDialogOfVehicleData() {
        WebElement element = driver.findElement(By.xpath("/html/body/cp-app/cp-vehicle-data/p-dialog/div/div[1]/a/span"));
        element.click();
    }

    public static void clickOnNavbarAppdrawer() {
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/a[2]"));
        element.click();
    }

    public static void clickOnArchivMenu() {
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/nav[1]/div/div[2]/a[1]/div"));
        element.click();
    }

    public static void changeToArchivOfferTab() {
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[2]/nav/ul/div/li[2]/a/div"));
        element.click();
    }

    public static void clickOnInboxIcon() {
        WebElement element = driver.findElement(By.xpath("//*[contains(@class, 'xf-icon xf-inbox-icon xf-line-icons')]"));
        element.click();
    }


    public static void clickOnLupeForLeadDetail() {
        WebElement element = driver.findElement(By.xpath("/html/body/cp-app/cp-outletvehiclelist/div/div[2]/cp-vehiclelist-context/div[2]/div[1]/div[2]/p-datatable/div/div[1]/table/tbody/tr[1]/td[5]/span/button/span[1]"));
        element.click();
    }

    public static void clickOnLupeForLeadDetailOfTruck() {
        WebElement element = driver.findElement(By.xpath("/html/body/cp-app/cp-vehiclelist/div/div[2]/cp-vehiclelist-context/div[2]/div[1]/div[2]/p-datatable/div/div[1]/table/tbody/tr[1]/td[5]/span/button/span[1]"));
        element.click();
    }


    public static void closeDialogLeadDetails() {
        WebElement element = driver.findElement(By.xpath("/html/body/cp-app/cp-lead-details/p-dialog/div/div[1]/a/span"));
        element.click();
    }

    public static void clickOnIButton(){
        elementWithXpath("/html/body/cp-app/cp-outletvehiclelist/div/div[1]/div[1]/div[2]/button[1]/span[1]").click();

    }

    public static void closeSmartOnboardingDialog(){
        elementWithXpath("/html/body/div[10]/div[1]/button").click();
    }

}

