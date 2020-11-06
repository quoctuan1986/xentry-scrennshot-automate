package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class Checklisten_Editor_Page {
    public static WebDriver driver;

    public Checklisten_Editor_Page(WebDriver driver){this.driver = driver;}

    public static WebElement elementWithXpath(String xpath){
        WebElement ele = driver.findElement(By.xpath(xpath));
        return ele;
    }

    public static WebElement elementWithId(String id){
        WebElement ele = driver.findElement(By.id(id));
        return ele;
    }


    public static void moveTheCosorToElement(WebElement element){
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
    }

    public static void scrollDownThePageToZweiteSprache(){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-company-settings/div/div[1]/div[6]/div[2]/label"));
        moveTheCosorToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public static void zoomIn(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = '0.9'");
    }

    public static void zoomIn_2(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = '0.8'");
    }

    public static void zoomRelease(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = '1.0'");
    }

    public static void clickOn3PunktMenu(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/footer/xy-c-aux-menu/button").click();
    }

    public static void  clickOnSettingButton(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/xy-c-side-navigation/div/footer/xy-c-aux-menu/button/nav/button").click();
    }

    public static void clickOnBetriebSetting(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/ul/li[2]/button").click();
    }

    public static void clickOnMarktSetting(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/ul/li[3]/button").click();
    }

    public static void choiceChecklisteAnahmeProtokol() throws InterruptedException{
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-company-settings/div/div[2]/ma-cc-checklist-settings/div/div/div[1]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[2]/label").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-company-settings/div/div[2]/ma-cc-checklist-settings/div/div/div[1]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]/li/span").click();
        Thread.sleep(2000);
    }


    public static void choiceChecklisteAnahmeProtokolForVAN() throws InterruptedException{
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-company-settings/div/div[2]/ma-cc-checklist-settings/div/div/div[1]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[2]/label").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-company-settings/div/div[2]/ma-cc-checklist-settings/div/div/div[1]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[4]/div/ul/p-dropdownitem[4]/li/span").click();
        Thread.sleep(2000);
    }

    public static void choiceChecklisteAnahmeProtokolForLKW() throws InterruptedException{
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-company-settings/div/div[2]/ma-cc-checklist-settings/div/div/div[1]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[2]/label").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-company-settings/div/div[2]/ma-cc-checklist-settings/div/div/div[1]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[4]/div/ul/p-dropdownitem[6]/li/span").click();
        Thread.sleep(2000);
    }




    public static void choiceAllgemeineCheckliste() throws InterruptedException{
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-company-settings/div/div[2]/ma-cc-checklist-settings/div/div/div[1]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[2]/label").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-company-settings/div/div[2]/ma-cc-checklist-settings/div/div/div[1]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li/span").click();
        Thread.sleep(2000);
    }


    public static void choiceChecklisteAnahmeProtokolForMarkt() throws InterruptedException{
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-market-settings/div/div[2]/ma-cc-checklist-settings/div/div/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[2]/label").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-market-settings/div/div[2]/ma-cc-checklist-settings/div/div/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]/li").click();
        Thread.sleep(2000);
    }

    public static void choiceChecklisteAnahmeProtokolForMarktLKW() throws InterruptedException{
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-market-settings/div/div[2]/ma-cc-checklist-settings/div/div/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[2]/label").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-market-settings/div/div[2]/ma-cc-checklist-settings/div/div/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[4]/div/ul/p-dropdownitem[6]/li/span").click();
        Thread.sleep(2000);
    }

    public static void choiceChecklisteAnahmeProtokolForVANOfMarkt() throws InterruptedException{
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-market-settings/div/div[2]/ma-cc-checklist-settings/div/div/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[2]/label").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-market-settings/div/div[2]/ma-cc-checklist-settings/div/div/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[4]/div/ul/p-dropdownitem[4]/li/span").click();
        Thread.sleep(2000);
    }


    public static void choiceAllgemeineChecklisteForMarkt() throws InterruptedException{
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-company-settings/div/div[2]/ma-cc-checklist-settings/div/div/div[1]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/label").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-market-settings/div/div[2]/ma-cc-checklist-settings/div/div/div/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li/span").click();
        Thread.sleep(2000);
    }

    public static void clickOnButtonBearbeiten(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-company-settings/div/div[2]/ma-cc-checklist-settings/div/div/button").click();
    }

    public static void clickOnButtonBearbeitenInMarktSetting(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-market-settings/div/div[2]/ma-cc-checklist-settings/div/div/button").click();
    }


    public static void clickOnButtonSpeichern(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-cc-checklist-editor/xy-c-dialog-body/div/footer/div[2]/xy-c-spinner/div/button").click();
    }

    public static void clickOnPlusSymbolOfAussenSeite(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-cc-checklist-editor/xy-c-dialog-body/div/div/div/div[1]/div[1]/div[2]/button").click();
    }

    public static void choiceTypJaOrNein() throws InterruptedException{
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[3]/div/ma-cc-checkpoint-editor/xy-c-dialog-body/div/div/form/div[3]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[2]/label").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[3]/div/ma-cc-checkpoint-editor/xy-c-dialog-body/div/div/form/div[3]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li").click();
        Thread.sleep(2000);
    }

    public static void choiceTypIOOrNIO() throws InterruptedException{
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[3]/div/ma-cc-checkpoint-editor/xy-c-dialog-body/div/div/form/div[3]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/label").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[3]/div/ma-cc-checkpoint-editor/xy-c-dialog-body/div/div/form/div[3]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]/li").click();
        Thread.sleep(2000);
    }

    public static void closeDialogPruefEditor(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[3]/div/ma-cc-checkpoint-editor/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }

    public static void clickOnTextPruefEditor(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[3]/div/ma-cc-checkpoint-editor/xy-c-dialog-body/div/header/div[1]/h2").click();
    }

    public static void searchWithText(String text) throws InterruptedException{
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-reception-list/div/div/header/div/xy-c-search/div/button").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-reception-list/div/div/header/div/xy-c-search/div/div/input").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-reception-list/div/div/header/div/xy-c-search/div/div/input").sendKeys(text);
        Thread.sleep(2000);
    }

    public static void clickOnSearchButton(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-cc-reception-list/div/div/header/div/xy-c-search/div/button").click();
    }

    public static void clickOnBetriebPruefrik(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-cc-checklist-editor/xy-c-dialog-body/div/div/div/div[10]/div[1]/div[2]/div/h2").click();
    }

    public static void clickOnBetriebPruefrikLKW(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-cc-checklist-editor/xy-c-dialog-body/div/div/div/div[6]/div[1]/div[2]/div/h2").click();
    }

    public static void clickOnBetriebPruefrikForVan(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-cc-checklist-editor/xy-c-dialog-body/div/div/div/div[8]/div[1]/div[2]/div/h2").click();
    }

    public static void sendkeysInRubrikeditorOfLangbezeichnung() throws InterruptedException{
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[3]/div/ma-cc-category-editor/xy-c-dialog-body/div/div/form/div[2]/xy-c-input/xy-c-input-wrapper/div/div/input").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[3]/div/ma-cc-category-editor/xy-c-dialog-body/div/div/form/div[2]/xy-c-input/xy-c-input-wrapper/div/div/input").sendKeys(" ");
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[3]/div/ma-cc-category-editor/xy-c-dialog-body/div/header/div[1]/h2").click();
        Thread.sleep(2000);

    }

    public static void sendkeysInPruefEditorOfKurzbezeichnung(String text){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[3]/div/ma-cc-checkpoint-editor/xy-c-dialog-body/div/div/form/div[1]/xy-c-input/xy-c-input-wrapper/div/div/input"));
        element.click();
        element.sendKeys(text);
    }

    public static void sendkeysInPruefEditorOfLangbezeichnung(String text){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[3]/div/ma-cc-checkpoint-editor/xy-c-dialog-body/div/div/form/div[2]/xy-c-input/xy-c-input-wrapper/div/div/input"));
        element.click();
        element.sendKeys(text);
    }

    public static void clickOnButtonUebernehmen(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[3]/div/ma-cc-checkpoint-editor/xy-c-dialog-body/div/footer/div/xy-c-spinner/div/button").click();
    }

    public static void clickOnMarktRubrikAnlegen(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-cc-checklist-editor/xy-c-dialog-body/div/div/div/div[9]/div[1]/div[2]/div").click();
    }

    public static void clickOnMarktRubrikAnlegenVAN(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-cc-checklist-editor/xy-c-dialog-body/div/div/div/div[7]/div[1]/div[2]/div").click();
    }

    public static void clickOnMarktRubrikAnlegenLKW(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-cc-checklist-editor/xy-c-dialog-body/div/div/div/div[5]/div[1]/div[2]/div").click();

    }

    public static void sendkeysInRubrikEditorOfKurzbezeichnung(String text){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[3]/div/ma-cc-category-editor/xy-c-dialog-body/div/div/form/div[1]/xy-c-input/xy-c-input-wrapper/div/div/input"));
        for (int l=0; l<26; l++){
            element.sendKeys(Keys.BACK_SPACE);
        }
        element.click();
        element.sendKeys(text);
    }

    public static void sendkeysInRubrikEditorOfLangbezeichnung(String text){
        WebElement element = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[3]/div/ma-cc-category-editor/xy-c-dialog-body/div/div/form/div[2]/xy-c-input/xy-c-input-wrapper/div/div/input"));
        for (int l=0; l<40; l++){
            element.sendKeys(Keys.BACK_SPACE);
        }
        element.click();
        element.sendKeys(text);
    }

    public static void clickOnButtonUebernehmenForRubrikAnlegen(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[3]/div/ma-cc-category-editor/xy-c-dialog-body/div/footer/div/xy-c-spinner/div/button").click();
    }

    public static void clickOnCheckBoxAktiv(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[3]/div/ma-cc-checkpoint-editor/xy-c-dialog-body/div/div/form/div[5]/div/label").click();
    }

    public static void clickOnTextRubrikEditor(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[3]/div/ma-cc-category-editor/xy-c-dialog-body/div/header/div[1]/h2").click();
    }

    public static void closeRubrikEditor(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[3]/div/ma-cc-category-editor/xy-c-dialog-body/div/header/div[2]/xy-c-spinner/div/button").click();
    }


    public static void choiceSubOutlet() throws InterruptedException{
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-company-settings/div/div[2]/ma-cc-checklist-settings/div/div/div[2]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[2]/label").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-company-settings/div/div[2]/ma-cc-checklist-settings/div/div/div[2]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]/li").click();
        Thread.sleep(2000);
    }

    public static void choiceGesamtOutlet() throws InterruptedException{
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-company-settings/div/div[2]/ma-cc-checklist-settings/div/div/div[2]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[2]/label").click();
        Thread.sleep(2000);
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/div/div/ma-cc-company-settings/div/div[2]/ma-cc-checklist-settings/div/div/div[2]/xy-c-select-box/xy-c-input-wrapper/div/div/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li").click();
        Thread.sleep(2000);
    }

    public static void clickOnIButton(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-cc-checklist-editor/xy-c-dialog-body/div/div/div/div[1]/div[2]/div[3]/div[2]/div[1]/span[4]/xy-c-tooltip/div/button").click();
    }

    public static void deletePruefPunktOfSubOutlet(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-cc-checklist-editor/xy-c-dialog-body/div/div/div/div[1]/div[2]/div[3]/div[2]/div[2]/button").click();
    }


    public static void deletePruefPunktOfBetrieb(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-cc-checklist-editor/xy-c-dialog-body/div/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/button").click();
    }

    public static void deletePruefPunktOfMarkt(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-cc-checklist-editor/xy-c-dialog-body/div/div/div/div[1]/div[2]/div/div[2]/div[2]/button").click();
    }

    public static void clickOnButtonSpeichernInSetting(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/footer/button").click();
    }

    public static void closeSetting(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog/div[2]/ma-cc-settings/form/header/button").click();
    }

    public static void clickOnTextCheckListprotokoll(){
        elementWithXpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[3]/xy-c-dialog[2]/div[2]/ma-cc-checklist-editor/xy-c-dialog-body/div/header/div[1]/h2").click();
    }

}

