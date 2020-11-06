package UITest;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

import java.util.concurrent.TimeUnit;


public class ScreenshotKundendialog_PKW {
    private static WebDriver driver = null;

    public static void main(String[] args) throws Exception {
        String pathToChromefoxDriver = ".//ChromeDriver//chromedriver";
        System.setProperty("webdriver.chrome.driver", pathToChromefoxDriver);

        String[] sprache = {UIConstants.PREF_LANGUAGE_DE,  UIConstants.PREF_LANGUAGE_DA, UIConstants.PREF_LANGUAGE_EN,
                UIConstants.PREF_LANGUAGE_ES, UIConstants.PREF_LANGUAGE_FI, UIConstants.PREF_LANGUAGE_FR,
                UIConstants.PREF_LANGUAGE_IT, UIConstants.PREF_LANGUAGE_NL, UIConstants.PREF_LANGUAGE_PL,
                UIConstants.PREF_LANGUAGE_PT, UIConstants.PREF_LANGUAGE_SL, UIConstants.PREF_LANGUAGE_SV,
                UIConstants.PREF_LANGUAGE_SK, UIConstants.PREF_LANGUAGE_TR, UIConstants.PREF_LANGUAGE_BG,
                UIConstants.PREF_LANGUAGE_EL, UIConstants.PREF_LANGUAGE_JA, UIConstants.PREF_LANGUAGE_KO,
                UIConstants.PREF_LANGUAGE_RU, UIConstants.PREF_LANGUAGE_ZH, UIConstants.PREF_LANGUAGE_HU,
                UIConstants.PREF_LANGUAGE_NO, UIConstants.PREF_LANGUAGE_RO, UIConstants.PREF_LANGUAGE_CS};

        for(int i=21;i<sprache.length; i++) {
            ChromeDriver driver = new ChromeDriver();
            LogIn_Page logIn_page = PageFactory.initElements(driver, LogIn_Page.class);
            Home_Page home_page = PageFactory.initElements(driver, Home_Page.class);
            Fleet_Page fleet_page = PageFactory.initElements(driver, Fleet_Page.class);
            ServiceManagement_Page serviceManagement_page = PageFactory.initElements(driver, ServiceManagement_Page.class);
            ServiceManagement_2_Page serviceManagement_2_page = PageFactory.initElements(driver, ServiceManagement_2_Page.class);
            Auftrag_Management_Page auftrag_management_page = PageFactory.initElements(driver, Auftrag_Management_Page.class);
            Kundendialog_Page kundendialog_page = PageFactory.initElements(driver, Kundendialog_Page.class);

            Screenshot screenshot = PageFactory.initElements(driver, Screenshot.class);
            WhoIsWho_Page whoIsWho = PageFactory.initElements(driver, WhoIsWho_Page.class);


            //Open Who_is_Who settings
            driver.get(UIConstants.URL_WHO_IS_WHO);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            Dimension d = new Dimension(1920, 1080);
            driver.manage().window().setSize(d);
            Thread.sleep(5000);


            logIn_page.enterUserName(UIConstants.USER_NAME);
            logIn_page.clickOnNextButton();
            Thread.sleep(5000);

            logIn_page.enterPassWord(UIConstants.PASWORD);
            logIn_page.clickOnSubmitButton();
            Thread.sleep(5000);

            whoIsWho.clickOnUserModify();
            Thread.sleep(5000);

            whoIsWho.clickOnPrefLanguageBox();
            Thread.sleep(5000);

            whoIsWho.selectTheLanguage(sprache[i]);
            Thread.sleep(5000);

            whoIsWho.clickOnSaveButton();
            Thread.sleep(2000);

            whoIsWho.clickOnLogoutButton();
            Thread.sleep(2000);


            driver.get(UIConstants.URL_XENTRY);
            Thread.sleep(5000);

            logIn_page.clickOnsignInButton();
            Thread.sleep(5000);

            logIn_page.enterUserName(UIConstants.USER_NAME);
            logIn_page.clickOnNextButton();
            Thread.sleep(5000);

            logIn_page.enterPassWord(UIConstants.PASWORD);
            logIn_page.clickOnSubmitButton();
            Thread.sleep(5000);
            home_page.clickOnLogoutButton();
            Thread.sleep(5000);

            driver.get(UIConstants.URL_XENTRY);
            Thread.sleep(5000);

            logIn_page.clickOnsignInButton();
            Thread.sleep(5000);

            logIn_page.enterUserName(UIConstants.USER_NAME);
            logIn_page.clickOnNextButton();
            Thread.sleep(5000);

            logIn_page.enterPassWord(UIConstants.PASWORD);
            logIn_page.clickOnSubmitButton();
            Thread.sleep(10000);



//Change Oulet name
            home_page.clickOnFrameOfOutletName();
            Thread.sleep(5000);

            home_page.clickOnOutletStuttgart();
            Thread.sleep(5000);

            home_page.clickOnChangeOutletButton();
            Thread.sleep(5000);

            fleet_page.clickOnDataProtectionBanner();
            fleet_page.clickOnCookieBanner();
            Thread.sleep(5000);

            fleet_page.clickOnInboxIcon();
            fleet_page.clickOnInboxIcon();
            Thread.sleep(2000);

            if(sprache[i].equals("(de)")){
                driver.get("https://xentry-int2.daimler.com/car-check/service-reception/1317285");
            }
            else{
                driver.get("https://xentry-int2.daimler.com/car-check/service-reception/1317290");
            }

            kundendialog_page.waitForSpinnerNotAppears();
            Thread.sleep(5000);
            auftrag_management_page.closeErrorAndHinweis();
            Thread.sleep(1000);
            kundendialog_page.clickOnKundendialog();
            kundendialog_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis();
            Thread.sleep(1000);
            kundendialog_page.clickOnKundendatenReiter();
            kundendialog_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis();
            Thread.sleep(1000);
            kundendialog_page.clickOnTextKundendaten();
            Thread.sleep(1000);
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_KUNDENDATEN, sprache[i]);
            kundendialog_page.clickOnStiftSymbolOfCustomerData();
            Thread.sleep(2000);
            kundendialog_page.clickOnTextKundendaten();
            Thread.sleep(1000);
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_KUNDENDATEN_EDIT, sprache[i]);
            kundendialog_page.clickOnSaveButtonOfCustomerData();
            Thread.sleep(2000);

            //
            kundendialog_page.clickOnMercedesmeIcon();
            kundendialog_page.waitForSpinnerNotAppears();
            kundendialog_page.selectEmailInKontextOfMmcR();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_MMCR_LINK_AUSWAHL, sprache[i]);
            kundendialog_page.clickOnSelectButtonInKontextOfMmcR();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_MMCR_MERGE, sprache[i]);
            Thread.sleep(2000);
            kundendialog_page.closeKontextOfMmcR();
            Thread.sleep(2000);
            //

            kundendialog_page.closeKundendatenReiter();
            kundendialog_page.clickOnZubehoer();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_MB_ZUBEHOER, sprache[i]);
            kundendialog_page.closeZubehoerDialog();
            Thread.sleep(1000);

            kundendialog_page.scrollDownThePageToAuftragposition();
            Thread.sleep(2000);
            kundendialog_page.clickOnTextAuftragposition();
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_TABELLE_AUFTRAG_POSITIONEN, sprache[i]);
            kundendialog_page.scrollDownThePageToAnnahme();
            Thread.sleep(2000);
            kundendialog_page.clickOnTextFahrzeugCheckErgebniss();
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_TABELLE_FAHRZEUG_CHECK, sprache[i]);
            kundendialog_page.scrollDownThePageToEmpfehlung();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_TABELLE_FAHRZEUG_UAT, sprache[i]);

            kundendialog_page.closeVorgang();
            kundendialog_page.waitForSpinnerNotAppears();

            //Change Oulet name
            home_page.clickOnFrameOfOutletName();
            Thread.sleep(5000);

            home_page.clickOnOutletAugsburg();
            Thread.sleep(5000);

            home_page.clickOnChangeOutletButton();
            kundendialog_page.waitForSpinnerNotAppears();
            Thread.sleep(5000);

            if(sprache[i].equals("(de)")){
                driver.get("https://xentry-int2.daimler.com/car-check/service-reception/1374227");
            }
            else{
                driver.get("https://xentry-int2.daimler.com/car-check/service-reception/1374143");
            }

            kundendialog_page.waitForSpinnerNotAppears();
            Thread.sleep(5000);
            auftrag_management_page.closeErrorAndHinweis();
            Thread.sleep(1000);
            kundendialog_page.clickOnKundendialog();
            kundendialog_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis();
            Thread.sleep(1000);
            kundendialog_page.clickOnTextKundendialog();
            Thread.sleep(1000);
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_UEBERSCHRIFT_ICON, sprache[i]);
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_HAUPTSEITE, sprache[i]);
            Thread.sleep(2000);

            kundendialog_page.clickOnKundendatenReiter();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_KUNDENDATEN_HINTERLEGT, sprache[i]);
            kundendialog_page.clickOnStiftSymbolOfCustomerData();
            Thread.sleep(2000);
            kundendialog_page.clickOnTextKundendaten();
            Thread.sleep(1000);
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_KUNDENDATEN_HINTERLEGT_EDIT, sprache[i]);
            kundendialog_page.clickOnTelematikReiter();
            kundendialog_page.waitForSpinnerNotAppears();
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_TELEMATIK, sprache[i]);
            kundendialog_page.clickOnCommunicationReiter();
            kundendialog_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis();
            Thread.sleep(1000);
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_COMMUNICATION, sprache[i]);
            kundendialog_page.closeCommunicationReiter();

            kundendialog_page.scrollDownThePageToEmpfehlung();
            kundendialog_page.clickOnServiceVertrag();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_UAT_SERVICEVERTRAG_DETAILS, sprache[i]);
            kundendialog_page.closeServicevertragDialog();
            Thread.sleep(1000);

            kundendialog_page.clickOnVernetzFahrzaugUAT();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_UAT, sprache[i]);
            kundendialog_page.closeUATDialog();
            kundendialog_page.closeVorgang();
            kundendialog_page.waitForSpinnerNotAppears();



            if(sprache[i].equals("(de)")){
                driver.get("https://xentry-int2.daimler.com/car-check/service-reception/1395231");
            }
            else{
                driver.get("https://xentry-int2.daimler.com/car-check/service-reception/1395128");
            }
            kundendialog_page.waitForSpinnerNotAppears();
            Thread.sleep(5000);
            auftrag_management_page.closeErrorAndHinweis();
            Thread.sleep(1000);
            kundendialog_page.clickOnKundendialog();
            kundendialog_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis();
            Thread.sleep(1000);

            kundendialog_page.clickOnKundendatenReiter();
            Thread.sleep(2000);
            kundendialog_page.clickOnMercedesmeIcon();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_KONTEXT_MMCR_LINK_FEHL, sprache[i]);
            kundendialog_page.closeMmcRFehlDialog();
            Thread.sleep(2000);

            kundendialog_page.closeVorgang();
            kundendialog_page.waitForSpinnerNotAppears();

            if(sprache[i].equals("(de)")){
                driver.get("https://xentry-int2.daimler.com/car-check/service-reception/1374234");
            }
            else{
                //Für Sprache NO RO CS
                driver.get("https://xentry-int2.daimler.com/car-check/service-reception/1395128");

           //     driver.get("https://xentry-int2.daimler.com/car-check/service-reception/1374151");
            }
            kundendialog_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            auftrag_management_page.closeErrorAndHinweis();
            Thread.sleep(1000);
            kundendialog_page.clickOnKundendialog();
            kundendialog_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis();



            kundendialog_page.scrollDownThePageToAblehnungAuftragposition();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_TABELLE_ABLEHNUNG_ANLIEGEN, sprache[i]);


            kundendialog_page.clickOnStiftSymbolForKundenUnterschrift();
            kundendialog_page.waitForSpinnerNotAppears();
            Thread.sleep(5000);

            kundendialog_page.scrollDownThePageOfSignaturToPageTwo();
            Thread.sleep(1000);
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_KUNDEN_UNTERSCHRIFT, sprache[i]);
            kundendialog_page.scrollDownThePageToSignaturVonKunden();
            Thread.sleep(2000);
            kundendialog_page.clickOnSignaturFeldForKunden();
            Thread.sleep(2000);
            kundendialog_page.drawingInSignaturField();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_KUNDEN_UNTERSCHRIFT_ERFASSUNG, sprache[i]);
            Thread.sleep(5000);
            kundendialog_page.clickOnSignButton();
            Thread.sleep(5000);
            kundendialog_page.clickOnFinishButton();
            kundendialog_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            kundendialog_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            auftrag_management_page.closeErrorAndHinweis();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_KUNDEN_AUFTRAG_VERSENDEN, sprache[i]);
            kundendialog_page.clickOnVerwerfenButton();
            Thread.sleep(2000);

            kundendialog_page.closeVorgang();
            kundendialog_page.waitForSpinnerNotAppears();


            //Change Oulet name
            home_page.clickOnFrameOfOutletName();
            Thread.sleep(5000);

            home_page.clickOnOutletMunich();
            Thread.sleep(5000);

            home_page.clickOnChangeOutletButton();
            kundendialog_page.waitForSpinnerNotAppears();
            Thread.sleep(5000);

            if(sprache[i].equals("(de)")){
                driver.get("https://xentry-int2.daimler.com/car-check/service-reception/1374243");
            }
            else{
                driver.get("https://xentry-int2.daimler.com/car-check/service-reception/1374140");
            }

            kundendialog_page.waitForSpinnerNotAppears();
            Thread.sleep(5000);
            auftrag_management_page.closeErrorAndHinweis();
            Thread.sleep(1000);
            kundendialog_page.clickOnKundendialog();
            kundendialog_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis();
            Thread.sleep(1000);

            kundendialog_page.clickOnKundendatenReiter();
            Thread.sleep(2000);
            kundendialog_page.clickOnMercedesmeIcon();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_KUNDENDATEN_FREIGABE, sprache[i]);
            Thread.sleep(2000);
            kundendialog_page.closeDialogMMCR();
            Thread.sleep(1000);
            kundendialog_page.closeKundendatenReiter();
            Thread.sleep(1000);

            kundendialog_page.scrollDownThePageToEmpfehlung();
            Thread.sleep(1000);
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_ANSICHT_UAT, sprache[i]);
            kundendialog_page.clickOnServiceSelectProgramm();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.KUNDEN_DIALOG_SERVICE_SELECT_UAT, sprache[i]);
            driver.quit();
        }
    }


}
