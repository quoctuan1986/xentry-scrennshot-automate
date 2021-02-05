package UITest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class ScreenshotCarCheck_Truck {
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

        for(int i=22;i<24; i++) {
            ChromeDriver driver = new ChromeDriver();


            LogIn_Page logIn_page = PageFactory.initElements(driver, LogIn_Page.class);
            Home_Page home_page = PageFactory.initElements(driver, Home_Page.class);
            Fleet_Page fleet_page = PageFactory.initElements(driver, Fleet_Page.class);
            ServiceManagement_Page serviceManagement_page = PageFactory.initElements(driver, ServiceManagement_Page.class);
            ServiceManagement_2_Page serviceManagement_2_page = PageFactory.initElements(driver, ServiceManagement_2_Page.class);
            Auftrag_Management_Page auftrag_management_page = PageFactory.initElements(driver, Auftrag_Management_Page.class);
            Kundendialog_Page kundendialog_page = PageFactory.initElements(driver, Kundendialog_Page.class);
            CarCheck_Page carCheck_page = PageFactory.initElements(driver, CarCheck_Page.class);

            Screenshot screenshot = PageFactory.initElements(driver, Screenshot.class);
            WhoIsWho_Page whoIsWho = PageFactory.initElements(driver, WhoIsWho_Page.class);


            //Open Who_is_Who settings
            driver.get(UIConstants.URL_WHO_IS_WHO);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            Dimension d = new Dimension(1920, 1080);
            driver.manage().window().setSize(d);
           // driver.manage().window().maximize();

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
            carCheck_page.waitForSpinnerNotAppears();
            carCheck_page.waitForLoadingScreen();
            Thread.sleep(2000);
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
            carCheck_page.waitForSpinnerNotAppears();
            carCheck_page.waitForLoadingScreen();
            Thread.sleep(2000);



//Change Oulet name
            home_page.clickOnFrameOfOutletName();
            Thread.sleep(5000);

            home_page.clickOnOutletMunich();
            Thread.sleep(5000);

            home_page.clickOnChangeOutletButton();
            Thread.sleep(5000);

            fleet_page.clickOnDataProtectionBanner();
            fleet_page.clickOnCookieBanner();
            serviceManagement_2_page.closeCookies();
            Thread.sleep(5000);

            fleet_page.clickOnInboxIcon();
            fleet_page.clickOnInboxIcon();
            Thread.sleep(2000);



            driver.get("https://xentry-int2.daimler.com/order/service-reception/141409651");
            carCheck_page.waitForSpinnerNotAppears();
            carCheck_page.waitForLoadingScreen();
            carCheck_page.closeErrorAndHinweis();


            carCheck_page.clickOnCarCheckReiter();
            carCheck_page.waitForSpinnerNotAppears();
            carCheck_page.waitForLoadingScreen();
            carCheck_page.closeErrorAndHinweis();
            Thread.sleep(1000);

            carCheck_page.titleReplace();
            carCheck_page.replaceVorgangDetailsTruck();

            screenshot.madeScreenshot(UIConstants.TC_CHECK_Liste, sprache[i]);
            carCheck_page.clickOnStartButton();
            carCheck_page.waitForSpinnerNotAppears();
            carCheck_page.waitForLoadingScreen();
            carCheck_page.closeErrorAndHinweis();

            carCheck_page.titleReplace();
            carCheck_page.replaceVorgangDetailsTruck();


            screenshot.madeScreenshot(UIConstants.TC_CHECK_UBERSICHT, sprache[i]);
            carCheck_page.clickOnDreiPunktMenu();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.TC_CHECK_Menu, sprache[i]);
            carCheck_page.clickOnDelleKontext();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.TC_CHECK_AUSSENSEITE, sprache[i]);
            carCheck_page.clickOnFahrzeugBeiFahrerTuer();
            Thread.sleep(2000);
            carCheck_page.scrollDownThePageToDell();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.TC_CHECK_AUSSENSEITE_NOK, sprache[i]);


            carCheck_page.scrollDownThePageToRadCheckPunkt();
            Thread.sleep(2000);
            carCheck_page.clickOnStiftSymbolForRader();
            Thread.sleep(5000);
            carCheck_page.bereifungChange();
            carCheck_page.waitForLoadingScreen();
            carCheck_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            carCheck_page.titleReplace();
            carCheck_page.replaceVorgangDetailsTruck();


            carCheck_page.zoomInWithFaktor("0.8");
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.TC_CHECK_RADER, sprache[i]);
            carCheck_page.zoomRelease();
            Thread.sleep(2000);

            carCheck_page.scrollDownThePageToRadOfRadCheckPunkt();
            Thread.sleep(2000);
            carCheck_page.zoomInWithFaktor("0.8");
            screenshot.madeScreenshot(UIConstants.TC_CHECK_RADER_2, sprache[i]);
            carCheck_page.zoomRelease();



            carCheck_page.clickOnStiftSymbolForRader();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.TC_CHECK_RADER_AENDERUNG_ACHSEN, sprache[i]);
            carCheck_page.closeDialogForRader();
            Thread.sleep(2000);
            carCheck_page.enterProfilTiefe("1");
            Thread.sleep(000);
            carCheck_page.enterReifenDruck("7,8");
            Thread.sleep(000);
            carCheck_page.scrollDownThePageToRadCheckPunkt_3();

            carCheck_page.replaceVorgangDetailsTruck();


            carCheck_page.clickOnCrosshairForProfilTiefe();
            Thread.sleep(2000);
            carCheck_page.positionierenAnReifenLinkVorne();
            Thread.sleep(2000);
          //  carCheck_page.zoomInWithFaktor("0.8");
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.TC_CHECK_RADER_BEFUND_POSITION, sprache[i]);
            carCheck_page.zoomRelease();
            Thread.sleep(2000);
            carCheck_page.clickOnReifenLinkVorne();
            Thread.sleep(2000);
            carCheck_page.clickOnCrosshairReifenDruck();
            Thread.sleep(2000);
            carCheck_page.clickOnReifenLinkVorne();
            Thread.sleep(2000);
            carCheck_page.scrollDownThePageToRadOfRadCheckPunkt();
            Thread.sleep(2000);

            carCheck_page.replaceVorgangDetailsTruck();


            screenshot.madeScreenshot(UIConstants.TC_CHECK_RADER_REIFENDRUCK_ERFASSEN, sprache[i]);
            Thread.sleep(2000);
            carCheck_page.scrollDownThePageToRadOfRadCheckPunkt_2();
            Thread.sleep(2000);
            carCheck_page.clickOnXSymbolForReifenCheck_1();
            Thread.sleep(2000);
            carCheck_page.clickOnReifenLinkVorne();
            Thread.sleep(2000);
            carCheck_page.scrollDownThePageToReifen();
            Thread.sleep(2000);
            carCheck_page.chooseAktionForReifenBeanstandung();
            Thread.sleep(2000);
            carCheck_page.photoUpload_1();
            carCheck_page.waitForSpinnerNotAppears();
            carCheck_page.waitForLoadingScreen();
            carCheck_page.closeErrorAndHinweis();
            Thread.sleep(2000);
            carCheck_page.scrollDownThePageToRadCheckPunkt_1();

            carCheck_page.replaceVorgangDetailsTruck();


            screenshot.madeScreenshot(UIConstants.TC_CHECK_RADER_ZUSTAND_DOKUMENT, sprache[i]);
            //
            carCheck_page.clickOnPhoto();
            Thread.sleep(3000);
            screenshot.madeScreenshot(UIConstants.TC_CHECK_RADER_FOTO_DETAIL, sprache[i]);
            carCheck_page.closePhotoDetail();

            //
            carCheck_page.scrollDownThePageToFrontscheibe();
            Thread.sleep(2000);
            carCheck_page.clickOnXButtonVonFrontscheibe();
            Thread.sleep(1000);
            carCheck_page.beanstandungVonFrontscheibeWahl();
            Thread.sleep(1000);
            carCheck_page.clickOnHakeVonWischer();
            Thread.sleep(1000);
            carCheck_page.clickOnDelegateButtonOnKartenstand();
            Thread.sleep(1000);
            carCheck_page.scrollDownThePageToFrontscheibe();
            Thread.sleep(1000);

            carCheck_page.replaceVorgangDetailsTruck();


            screenshot.madeScreenshot(UIConstants.TC_CHECK_FAHRZEUG_DATEN_FRONT_SCHEIBE_OK_NOK, sprache[i]);

            carCheck_page.scrollDownThePageToKartedatenstand();
            Thread.sleep(1000);
            carCheck_page.clickXSymbolVonKartenStand();
            Thread.sleep(1000);
            carCheck_page.aktionVonKartenStandWahl();
            Thread.sleep(2000);
            carCheck_page.scrollDownThePageToKartedatenstand();
            carCheck_page.clickOnTextKarteStand();
            Thread.sleep(1000);

            carCheck_page.replaceVorgangDetailsTruck();


            screenshot.madeScreenshot(UIConstants.TC_CHECK_FAHRZEUG_DATEN_NAVIGATION, sprache[i]);
            Thread.sleep(2000);





            carCheck_page.scrollDownThePageToWartungdaten();
            Thread.sleep(2000);

            carCheck_page.replaceVorgangDetailsTruck();


            carCheck_page.clickOnStiftSymbolForWartungdaten();
            Thread.sleep(2000);
            carCheck_page.closeErrorAndHinweis();
            Thread.sleep(1000);
            carCheck_page.wartungKanalWahl();
            Thread.sleep(2000);
            carCheck_page.scrollDownThePageInWartung();
            Thread.sleep(2000);



            carCheck_page.zoomInWithFaktor("0.8");
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.TC_CHECK_WARTUNG_AKT, sprache[i]);
            carCheck_page.zoomRelease();
            Thread.sleep(2000);
            carCheck_page.closeWartungKanal();
            Thread.sleep(2000);

            carCheck_page.hakenRausnehmenVonKurztest();
            Thread.sleep(2000);

            carCheck_page.replaceVorgangDetailsTruck();


            carCheck_page.clickOnStiftSymbolForWartungdaten();
            Thread.sleep(2000);
            carCheck_page.closeErrorAndHinweis();
            Thread.sleep(1000);
            carCheck_page.wartungKanalWahl_2();
            Thread.sleep(2000);
            carCheck_page.clickOnTextWartung();
            carCheck_page.zoomInWithFaktor("0.8");
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.TC_CHECK_WARTUNG_MANUELL, sprache[i]);
            carCheck_page.zoomRelease();
            Thread.sleep(2000);
            carCheck_page.closeWartungKanal();
            Thread.sleep(2000);
            Thread.sleep(2000);
            carCheck_page.checkListDelete();
            carCheck_page.waitForLoadingScreen();
            carCheck_page.waitForSpinnerNotAppears();

            carCheck_page.clickOnStartButtonForAllgemeinProtokollCheck();
            carCheck_page.waitForLoadingScreen();
            carCheck_page.waitForSpinnerNotAppears();
            carCheck_page.closeErrorAndHinweis();

            carCheck_page.kurztestZuweisen();
            Thread.sleep(2000);
            carCheck_page.scrollDownThePageToFahrzeuginnenraum();
            Thread.sleep(2000);


            carCheck_page.titleReplace();
            carCheck_page.replaceVorgangDetailsTruck();


            carCheck_page.zoomInWithFaktor("0.9");
            screenshot.madeScreenshot(UIConstants.TC_CHECK_FAHRZEUG_DATEN_AKT, sprache[i]);
            carCheck_page.zoomRelease();

            carCheck_page.checkListDelete();
            carCheck_page.waitForLoadingScreen();
            carCheck_page.waitForSpinnerNotAppears();


            driver.quit();
        }
    }


}
