package UITest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

import java.util.concurrent.TimeUnit;


public class ScreenshotKundendialog_Truck {
    private static WebDriver driver = null;

    public static void main(String[] args) throws Exception {
        String pathToChromeforDriver = ".//ChromeDriver//chromedriver";
        String pathToChrome_Windows = ".//Win_ChromeDriver//chromedriver.exe";
        if (System.getProperty("os.name").startsWith("Windows")) {
            System.setProperty("webdriver.chrome.driver", pathToChrome_Windows);
        } else{
            System.setProperty("webdriver.chrome.driver", pathToChromeforDriver);
        }

        String[] sprache = {UIConstants.PREF_LANGUAGE_DE,  UIConstants.PREF_LANGUAGE_DA, UIConstants.PREF_LANGUAGE_EN,
                UIConstants.PREF_LANGUAGE_ES, UIConstants.PREF_LANGUAGE_FI, UIConstants.PREF_LANGUAGE_FR,
                UIConstants.PREF_LANGUAGE_IT, UIConstants.PREF_LANGUAGE_NL, UIConstants.PREF_LANGUAGE_NO,
                UIConstants.PREF_LANGUAGE_PL, UIConstants.PREF_LANGUAGE_PT, UIConstants.PREF_LANGUAGE_SL,
                UIConstants.PREF_LANGUAGE_SV, UIConstants.PREF_LANGUAGE_RO, UIConstants.PREF_LANGUAGE_SK,
                UIConstants.PREF_LANGUAGE_TR, UIConstants.PREF_LANGUAGE_BG, UIConstants.PREF_LANGUAGE_CS,
                UIConstants.PREF_LANGUAGE_EL, UIConstants.PREF_LANGUAGE_JA, UIConstants.PREF_LANGUAGE_KO,
                UIConstants.PREF_LANGUAGE_RU, UIConstants.PREF_LANGUAGE_ZH, UIConstants.PREF_LANGUAGE_HU};

        for(int i=1;i<2; i++) {
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
            auftrag_management_page.waitForSpinnerNotAppears();
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
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(5000);



//Change Oulet name
            home_page.clickOnFrameOfOutletName();
            Thread.sleep(5000);


            home_page.clickOnOutletReutlingen();
            Thread.sleep(5000);

            home_page.clickOnChangeOutletButton();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(5000);

            fleet_page.clickOnDataProtectionBanner();
            fleet_page.clickOnCookieBanner();
            Thread.sleep(5000);
            serviceManagement_2_page.closeCookies();

            fleet_page.clickOnInboxIcon();
            fleet_page.clickOnInboxIcon();
            Thread.sleep(2000);
           //KundenD-2036

            if (sprache[i].equals("(de)")){
                driver.get("https://xentry-int2.daimler.com/order/service-reception/141402336");
            }
            else {
                driver.get("https://xentry-int2.daimler.com/order/service-reception/141402675");
            }
            kundendialog_page.waitForLoadingScreen();
            kundendialog_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis_2();
            kundendialog_page.clickOnKundendialog();
            kundendialog_page.waitForLoadingScreen();
            kundendialog_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis_2();
            Thread.sleep(2000);

            kundendialog_page.titleReplace();
            if (sprache[i].equals("(de)")){
                kundendialog_page.replaceVorgangDetails();
            }
            else {
                kundendialog_page.replaceVorgangDetails();
            }
            kundendialog_page.clickOnTextKundendialog();

            auftrag_management_page.zoomIn_1();
            Thread.sleep(2000);

            screenshot.madeScreenshot(UIConstants.TC_KUNDEN_DIALOG_AUFTRAGMANAGEMENT, sprache[i]);
            auftrag_management_page.zoomRelease();
            Thread.sleep(2000);

            kundendialog_page.scrollDownThePageToAnnahme();
            kundendialog_page.clickOnHeadOfKundendialog();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.TC_KUNDEN_DIALOG_RCT, sprache[i]);
            kundendialog_page.closeVorgang();
            kundendialog_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);



            /////////KundenD-2037
            /////////
            if (sprache[i].equals("(de)")){
                driver.get("https://xentry-int2.daimler.com/order/service-reception/141413185");
            }
            else {
                driver.get("https://xentry-int2.daimler.com/order/service-reception/141409647");
            }
            kundendialog_page.waitForLoadingScreen();
            kundendialog_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis_2();
            Thread.sleep(2000);

            kundendialog_page.clickOnKundendialog();
            kundendialog_page.waitForLoadingScreen();
            kundendialog_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis_2();
            Thread.sleep(2000);

            kundendialog_page.titleReplace();
            if (sprache[i].equals("(de)")){
                kundendialog_page.replaceVorgangDetails();
            }
            else {
                kundendialog_page.replaceVorgangDetails();
            }
            kundendialog_page.clickOnTextKundendialog();
            Thread.sleep(2000);
            auftrag_management_page.zoomIn_1();
            Thread.sleep(2000);


            screenshot.madeScreenshot(UIConstants.TC_KUNDEN_DIALOG_AUFTRAGSPOSITION, sprache[i]);

            auftrag_management_page.zoomRelease();
            Thread.sleep(2000);

            kundendialog_page.scrollDownThePageToAblehnungAuftragposition();
            kundendialog_page.clickOnHeadOfKundendialog();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.TC_KUNDEN_DIALOG_ABLEHNUNG_AUFTRAGSPOSITION, sprache[i]);

            kundendialog_page.clickOnStiftSymbolForKundenUnterschrift();
            kundendialog_page.waitForSpinnerNotAppears();
            Thread.sleep(10000);
            kundendialog_page.scrollDownThePageOfSignaturToPageTwo();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.TC_KUNDEN_DIALOG_AUFTRAG_ERSTELLEN, sprache[i]);
            kundendialog_page.clickOnSignaturFeldForKunden();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.TC_KUNDEN_DIALOG_AUFTRAG_UNTERSCHREIBEN, sprache[i]);
            kundendialog_page.clickOnButtonSignCancel();
            Thread.sleep(2000);
            kundendialog_page.clickOnFinishButton();
            kundendialog_page.waitForSpinnerNotAppears();
            Thread.sleep(5000);
            kundendialog_page.waitForSpinnerNotAppears();
            Thread.sleep(5000);
            auftrag_management_page.closeErrorAndHinweis_2();


            if (sprache[i].equals("(de)")){
                kundendialog_page.replaceOnVersandDialog();
            }
            else {
                kundendialog_page.replaceOnVersandDialog();
            }

            screenshot.madeScreenshot(UIConstants.TC_KUNDEN_DIALOG_VERSAND_AUFTRAG, sprache[i]);

            kundendialog_page.clickOnVerwerfenButton();
            Thread.sleep(2000);

            kundendialog_page.closeVorgang();
            kundendialog_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);


            ///////////2039
            //////////
            if (sprache[i].equals("(de)")){
                driver.get("https://xentry-int2.daimler.com/order/service-reception/141414404");
            }
            else {
                driver.get("https://xentry-int2.daimler.com/order/service-reception/141414444");
            }
            kundendialog_page.waitForLoadingScreen();
            kundendialog_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis_2();
            Thread.sleep(2000);

            kundendialog_page.clickOnKundendialog();
            kundendialog_page.waitForLoadingScreen();
            kundendialog_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis_2();
            Thread.sleep(2000);

            kundendialog_page.titleReplace();
            if (sprache[i].equals("(de)")){
                kundendialog_page.replaceVorgangDetails();
            }
            else {
                kundendialog_page.replaceVorgangDetails();
            }

            kundendialog_page.clickOnTextKundendialog();
            screenshot.madeScreenshot(UIConstants.TC_KUNDEN_DIALOG__AUFTRAG_VERSAND, sprache[i]);

            kundendialog_page.scrollDownThePageToAnnahme();
            kundendialog_page.clickOnHeadOfKundendialog();
            Thread.sleep(2000);
            kundendialog_page.clickOnKundenOffenPunktHinweis();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.TC_KUNDEN_DIALOG_RCT_OFFEN_PRUFPUNKT, sprache[i]);
            kundendialog_page.closeKundenOffenPunktHinweis();
            Thread.sleep(2000);


            kundendialog_page.clickOnKundenDelegatePunktHinweis();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.TC_KUNDEN_DIALOG_RCT_DELEGATE_PRUFPUNKT, sprache[i]);
            kundendialog_page.closeKundenDelegatePunktHinweis();
            Thread.sleep(2000);

            kundendialog_page.clickOnZustandFahrzeugaussenseite();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.TC_KUNDEN_DIALOG_RCT_BILD_PRUFPUNKT, sprache[i]);
            kundendialog_page.closeZustandFahrzeugaussenseite();
            Thread.sleep(2000);



            kundendialog_page.clickOnWarnUndFunktionsleuchten();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.TC_KUNDEN_DIALOG_RCT_OK_NOK, sprache[i]);
            kundendialog_page.closeWarnUndFunktionsleuchten();
            Thread.sleep(2000);

            kundendialog_page.clickOnNaviKartenstand();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.TC_KUNDEN_DIALOG_RCT_NAVI_KARTE, sprache[i]);
            kundendialog_page.closeNaviKartenstand();
            Thread.sleep(2000);

            kundendialog_page.clickOnZustandUndProfil();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.TC_KUNDEN_DIALOG_RCT_RAEDER_REIFEN, sprache[i]);
            kundendialog_page.closeZustandUndProfil();
            Thread.sleep(2000);

            kundendialog_page.closeVorgang();
            kundendialog_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);


            /////////UAT-2038
            /////////
            if (sprache[i].equals("(de)")){
                driver.get("https://xentry-int2.daimler.com/order/service-reception/1372234");
            }
            else {
                driver.get("https://xentry-int2.daimler.com/order/service-reception/1372229");
            }
            kundendialog_page.waitForLoadingScreen();
            kundendialog_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis_2();
            Thread.sleep(2000);

            kundendialog_page.clickOnKundendialog();
            kundendialog_page.waitForLoadingScreen();
            kundendialog_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis_2();
            Thread.sleep(2000);

            kundendialog_page.titleReplace();
            if (sprache[i].equals("(de)")){
                kundendialog_page.replaceVorgangDetails();
            }
            else {
                kundendialog_page.replaceVorgangDetails();
            }
            kundendialog_page.clickOnTextKundendialog();


            kundendialog_page.scrollDownThePageToEmpfehlung();
            kundendialog_page.clickOnHeadOfKundendialog();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.TC_KUNDEN_DIALOG_UAT, sprache[i]);

            driver.quit();
        }
    }


}
