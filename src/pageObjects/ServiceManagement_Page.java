package pageObjects;

import org.openqa.selenium.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ServiceManagement_Page {
    private static WebDriver driver;

    public ServiceManagement_Page(WebDriver driver) {
        this.driver = driver;
    }

    public static boolean errorMsgExists() {
        boolean errExists = driver.findElements(By.id("agg-msg-error-0")).size() != 0;
        return errExists;
    }

    public static WebElement closeButton() {
        WebElement close = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/section/div[2]/span[1]/div/div[2]/form/div/button[1]/span"));
        return close;
    }

    public static void closeEnrichmentDialog() {
        if (errorMsgExists() == true) {
            closeButton().click();
        }

    }

    public static WebElement nextButtonInSelectActions() {
        WebElement next = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/section/div[2]/form[2]/div[2]/div[2]/div[2]/div/button[1]/span"));
        return next;
    }

    public static void clickOnNextButtonInSelectActions() {
        nextButtonInSelectActions().click();
    }

    public static WebElement nextButtonInEditOffer() {
        WebElement next = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/section/div[2]/form[2]/div[2]/div[2]/span[1]/div[2]/span/div/button[2]/span"));
        return next;
    }

    public static void clickOnNextButtonInEditOffer() {
        nextButtonInEditOffer().click();
    }

    public static WebElement nextButtonInOfferCheck() {
        WebElement next = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/section/div[2]/form[2]/div[2]/div[2]/span[1]/div/div[2]/div[2]/button[2]/span"));
        return next;
    }

    public static void clickOnNextButtonInOfferCheck() {
        nextButtonInOfferCheck().click();
    }


    public void waitingForAvailabilityIconNotVisible() throws Exception {
        String xpath = "//*[@class='availability-icon']";
        while (driver.findElement(By.xpath(xpath)).isDisplayed()) {
            Thread.sleep(200);
            xpath = "//*[@class='availability-icon']";
        }
    }

    public static void clickOnCookieBannerInSM() {
        boolean elements = driver.findElements(By.xpath("//*[contains(@class, 'rc-cookie-message-button ui-button ui-widget ui-state-default ui-button-text-only ui-primary ui-button-secondary')]")).size() !=0;
        if (elements == true) {
            WebElement element = driver.findElement(By.xpath("//*[contains(@class, 'rc-cookie-message-button ui-button ui-widget ui-state-default ui-button-text-only ui-primary ui-button-secondary')]"));
            element.click();
        }
    }

    public static WebElement triangleButton() {
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/section/div[2]/form[2]/div[2]/div[1]/ul/li[1]/span/button/span[1]"));
        return element;
    }

    public static void clickOnTriangleButton() {
        boolean element = driver.findElement(By.xpath("//*[contains(@class, 'ui-button-icon-right ui-icon ui-c ui-icon-triangle-1-s')]")).isDisplayed();
        if(element == true){
            triangleButton().click();

        }
    }

    public static void clickOnVehicleHistoryLink() {
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/section/div[2]/form[2]/div[2]/div[1]/ul/li[5]/a/span[2]"));
        element.click();
    }
    /*/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/section/div[2]/form[2]/div[2]/div[1]/ul/li[4]/a/span[2]
     */

    /*/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/section/div[2]/form[2]/div[2]/div[1]/ul/li[5]/a/span[2]*/

    public static void closeDialogOfVehicleHistory() {
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/section/div[2]/div[5]/div[2]/form/div[2]/button/span"));
        element.click();
    }

    public static void clickOnStornoLink() {
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/section/div[2]/form[2]/div[2]/div[1]/ul/li[3]/a/span[2]"));
        element.click();
    }

    public static void clickOnBackButton() {
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/section/div[2]/form[2]/div[2]/div[2]/span[2]/div/button[1]/span"));
        element.click();
    }


    public static void clickOnCustomerConversationButton() {
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/section/div[2]/form[2]/div[2]/div[2]/span[1]/div/div[2]/div[2]/span/button/span[2]"));
        element.click();
    }

    public static void selectAccept() {
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/section/div[2]/form[2]/div[2]/div[2]/span[1]/div/div[2]/div[2]/span/div/ul/li[1]/a/span"));
        element.click();
    }

    public static void selectReject() {
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/section/div[2]/form[2]/div[2]/div[2]/span[1]/div/div[2]/div[2]/span/div/ul/li[2]/a/span"));
        element.click();
    }

    public static WebElement textBoxDateInCustomerConversation() {
        WebElement element = driver.findElement(By.xpath("*//section/div[2]/form[2]/div[2]/div[2]/span[1]/div[3]/div/div/span/ul/li[2]/span/input"));
        return element;
    }

    public static void enterAgreedAppointment() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy, HH:MM");
        Date date = new Date();
        String agreedAppointment = dateFormat.format(date);
        System.out.println(agreedAppointment);

        textBoxDateInCustomerConversation().click();
        textBoxDateInCustomerConversation().sendKeys(agreedAppointment);

        WebElement commentsBox = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/section/div[2]/form[2]/div[2]/div[2]/span[1]/div[3]/div/div/span/div/div[2]"));
        commentsBox.click();

    }

    public static void openToggleSPView(){
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/section/div[2]/form[2]/div[2]/div[2]/span[1]/div[2]/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[1]"));
        element.click();
    }

    public static void clickOnLinOfferPositionInsert(){
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/section/div[2]/form[2]/div[2]/div[2]/span[1]/div[2]/div/div/div[1]/ul/li[5]/a/span[2]"));
        element.click();
    }

    public static void clickOnSaveAppointmentButton(){
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/section/div[2]/form[2]/div[2]/div[2]/span[2]/div/button[2]/span"));
        element.click();
    }


    public static void clickOnArchivOfferButton(){
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/section/div[2]/form[2]/div[2]/div[2]/span[2]/div/button[3]/span"));
        element.click();
    }

    public static void clickOnCancellationReasonArrow(){
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/section/div[2]/form[2]/div[2]/div[2]/span[1]/div[3]/div/div/span/ul/li[3]/div/div[3]/span"));
        element.click();
    }

}
