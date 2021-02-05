package UITest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

import java.util.concurrent.TimeUnit;


public class ScreenshotCarCheck_PKW {
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
                            UIConstants.PREF_LANGUAGE_SV, UIConstants.PREF_LANGUAGE_BG, UIConstants.PREF_LANGUAGE_CS,
                            UIConstants.PREF_LANGUAGE_EL,UIConstants.PREF_LANGUAGE_JA, UIConstants.PREF_LANGUAGE_KO,
                            UIConstants.PREF_LANGUAGE_RO, UIConstants.PREF_LANGUAGE_RU, UIConstants.PREF_LANGUAGE_SK,
                            UIConstants.PREF_LANGUAGE_TR, UIConstants.PREF_LANGUAGE_ZH,UIConstants.PREF_LANGUAGE_HU};

        for(int i=0;i<24; i++) {
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

            Thread.sleep(5000);


            logIn_page.enterUserName(UIConstants.USER_NAME_TOBI);
            logIn_page.clickOnNextButton();
            Thread.sleep(5000);

            logIn_page.enterPassWord(UIConstants.PASWORD_TOBI);
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


            driver.get(UIConstants.URL_XENTRY_PROD);
            Thread.sleep(5000);

            logIn_page.clickOnsignInButton();
            Thread.sleep(5000);

            logIn_page.enterUserName(UIConstants.USER_NAME_TOBI);
            logIn_page.clickOnNextButton();
            Thread.sleep(5000);

            logIn_page.enterPassWord(UIConstants.PASWORD_TOBI);
            logIn_page.clickOnSubmitButton();
            carCheck_page.waitForSpinnerNotAppears();
            carCheck_page.waitForLoadingScreen();
            Thread.sleep(2000);
            home_page.clickOnLogoutButton();
            Thread.sleep(5000);

            driver.get(UIConstants.URL_XENTRY_PROD);
            Thread.sleep(5000);

            logIn_page.clickOnsignInButton();
            Thread.sleep(5000);

            logIn_page.enterUserName(UIConstants.USER_NAME_TOBI);
            logIn_page.clickOnNextButton();
            Thread.sleep(5000);

            logIn_page.enterPassWord(UIConstants.PASWORD_TOBI);
            logIn_page.clickOnSubmitButton();
            carCheck_page.waitForSpinnerNotAppears();
            carCheck_page.waitForLoadingScreen();
            Thread.sleep(2000);



//Change Oulet name
            home_page.clickOnFrameOfOutletName();
            Thread.sleep(5000);

            home_page.clickOnOutletBoeblingen();
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



            driver.get("https://xentry-int2.daimler.com/car-check/service-reception/1383180");
            carCheck_page.waitForSpinnerNotAppears();
            carCheck_page.waitForLoadingScreen();
            carCheck_page.closeErrorAndHinweis();
            Thread.sleep(2000);
            ///////

            carCheck_page.clickOnTextAuftragsmanagement();
            ///////
            carCheck_page.titleReplace();
            auftrag_management_page.replaceVorgangDetailsPKW();
            auftrag_management_page.clickOnTextAuftragmanagement();

            screenshot.madeScreenshot(UIConstants.CC_VORGANG_OEFFNEN, sprache[i]);
            Thread.sleep(2000);
            carCheck_page.clickOnCarCheckReiter();
            carCheck_page.waitForLoadingScreen();
            carCheck_page.closeErrorAndHinweis();
            Thread.sleep(2000);

            carCheck_page.titleReplace();
            carCheck_page.replaceVorgangDetailsPKW();


            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_START, sprache[i]);
            carCheck_page.clickOnStartButton();
            carCheck_page.waitForSpinnerNotAppears();
            carCheck_page.waitForLoadingScreen();
            carCheck_page.closeErrorAndHinweis();

            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK, sprache[i]);

            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_ZUSTAND_AUSSEN, sprache[i]);

            carCheck_page.clickOnDreiPunktMenu();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_MENU, sprache[i]);


            carCheck_page.clickOnRissAndKratz();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_BEANSTANDUNG_POSITION, sprache[i]);
            carCheck_page.clickOnFahrzeugTuer();
            Thread.sleep(2000);
            carCheck_page.scrollDownThePageToImageCar();
            Thread.sleep(2000);

            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_BEANSTANDUNG_BESCHREIBEN, sprache[i]);
            carCheck_page.photoUploadForCar_1();
            carCheck_page.waitForSpinnerNotAppears();
            carCheck_page.waitForLoadingScreen();
            carCheck_page.photoUploadForCar_2();
            carCheck_page.waitForSpinnerNotAppears();
            carCheck_page.waitForLoadingScreen();
            carCheck_page.scrollDownThePageToImageCar();

            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_ANHANG_FOTO, sprache[i]);
            Thread.sleep(2000);
            carCheck_page.clickOnPhotoForCar_1();
            carCheck_page.waitForSpinnerNotAppears();
            carCheck_page.waitForLoadingScreen();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_ANHANG_FOTO_VIEWER_2, sprache[i]);
            carCheck_page.closePhotoDetailForCar();
            Thread.sleep(2000);
            carCheck_page.clickOnPhotoForCar_2();
            carCheck_page.waitForSpinnerNotAppears();
            carCheck_page.waitForLoadingScreen();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_ANHANG_FOTO_VIEWER_1, sprache[i]);
            carCheck_page.closePhotoDetailForCar();
            carCheck_page.scrollDownThePageToFrontscheibeForCar();
            Thread.sleep(2000);
            carCheck_page.clickOnXButtonVonFrontscheibeForCar();
            Thread.sleep(2000);
            carCheck_page.scrollDownThePageToFrontscheibeForCar();
            Thread.sleep(2000);
            carCheck_page.clickOnHakeVonWischerForCar();
            Thread.sleep(2000);
            carCheck_page.clickOnMotorraumDelegate();
            Thread.sleep(2000);
            carCheck_page.scrollDownThePageToFrontscheibeForCar();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_KM_IO_NIO_UEBERSICHT, sprache[i]);
            carCheck_page.scrollDownThePageToFahrzeuginnenraumForCar();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_KM_STAND, sprache[i]);
            carCheck_page.clickOnStiftSymbolBeiKilometerStandForCar();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_KM_STAND_ERFASSEN, sprache[i]);
            carCheck_page.closeKilometerStandDialogForCar();
            Thread.sleep(2000);

            ////
            carCheck_page.scrollDownThePageToFahrzeuginnenraumForCar();
            Thread.sleep(2000);
/*            carCheck_page.hakenRausnehmenVonKurztest();
            Thread.sleep(2000); */
            carCheck_page.clickOnStiftSymbolForWartungdatenForCar();
            Thread.sleep(2000);
            carCheck_page.closeErrorAndHinweis();
            Thread.sleep(2000);
 /*           screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_WARTUNG_ANLEGEN, sprache[i]);
            carCheck_page.clickOnButtonErstellenInWartungDialog();
            carCheck_page.waitForSpinnerNotAppears();
            carCheck_page.closeErrorAndHinweis();
            Thread.sleep(2000);
            carCheck_page.oelqualitaetWaehlen();
            Thread.sleep(2000);
            carCheck_page.clickOnSaveButtonOnWartungDialog();
            carCheck_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            carCheck_page.closeErrorAndHinweis();
            carCheck_page.packageWaehlen();
            carCheck_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis();
            carCheck_page.clickOnStiftSymbolOnWartungDialog();
            Thread.sleep(2000);
      */      screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_25N_WARTUNG_ERFASSEN, sprache[i]);
            carCheck_page.closeWartungDialogForCar();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_24N_WARTUNG, sprache[i]);


            /////
            carCheck_page.scrollDownThePageToKartedatenstandForCar();

            carCheck_page.clickXSymbolVonKartenStandForCar();
            Thread.sleep(1000);
            carCheck_page.scrollDownThePageToKartedatenstandForCar();
            Thread.sleep(1000);

            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_NAVI_NICHT_OK, sprache[i]);

            ////
            carCheck_page.scrollDownThePageToKartedatenstandForCar();

            carCheck_page.clickOnHakenVonServiceAnzeige();
            Thread.sleep(2000);
            carCheck_page.scrollDownThePageToKartedatenstandForCar();
            Thread.sleep(1000);
            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_JA_NEIN_UEBERSICHT, sprache[i]);
            carCheck_page.clickOnHakenVonZusatzArbeitStaufilter();
            Thread.sleep(2000);
            carCheck_page.scrollDownThePageToKundenSpezifisch();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_ZUSATZARBEIT, sprache[i]);

            carCheck_page.checkListDelete();
            carCheck_page.waitForSpinnerNotAppears();
            kundendialog_page.closeVorgang();
            carCheck_page.waitForSpinnerNotAppears();



            driver.get("https://xentry-int2.daimler.com/car-check/service-reception/1382508");
            carCheck_page.waitForSpinnerNotAppears();
            carCheck_page.waitForLoadingScreen();
            carCheck_page.closeErrorAndHinweis();
            Thread.sleep(2000);
            carCheck_page.clickOnCarCheckReiter();
            carCheck_page.waitForSpinnerNotAppears();
            carCheck_page.waitForLoadingScreen();
            carCheck_page.closeErrorAndHinweis();
            Thread.sleep(2000);
            carCheck_page.clickOnStartButton();
            carCheck_page.waitForSpinnerNotAppears();
            carCheck_page.closeErrorAndHinweis();

            ///////

            carCheck_page.titleReplace();
            carCheck_page.replaceVorgangDetailsPKW();

            carCheck_page.scrollDownThePageToReifenCheckForCar();
            Thread.sleep(2000);
            carCheck_page.zoomInWithFaktor("0.8");
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_PROFIL_REIFENDRUCK, sprache[i]);
            carCheck_page.zoomRelease();
            Thread.sleep(2000);


            carCheck_page.scrollDownThePageToReifenGanzRechtsCar();
            Thread.sleep(2000);
            carCheck_page.zoomInWithFaktor("0.8");
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_PROFIL_REIFENDRUCK_2, sprache[i]);
            carCheck_page.zoomRelease();


            carCheck_page.clickOnStiftSymbolForRaderForCar();
            Thread.sleep(2000);

            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_ACHSEN_AUSWAHL, sprache[i]);
            carCheck_page.closeDialogForRader();
            Thread.sleep(2000);

            carCheck_page.scrollDownThePageToReifenCheck();
            carCheck_page.positionierenAnReifenLinkVorneForCar();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_BEFUND_POSITION, sprache[i]);




            carCheck_page.clickOnReifenGanzLinkUnten();
            Thread.sleep(1000);


            carCheck_page.enterProfilTiefe("4");
            Thread.sleep(2000);
            carCheck_page.enterReifenDruckForCar("3");
            Thread.sleep(2000);

            carCheck_page.scrollDownThePageToReifenGanzRechtsCar();
/*
            carCheck_page.clickOnCrosshairForProfilTiefeForCar();
            Thread.sleep(2000);
            carCheck_page.positionierenAnReifenLinkVorneForCar();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_BEFUND_POSITION, sprache[i]);
            Thread.sleep(2000);
            carCheck_page.clickOnReifenLinkVorneForCar();
            Thread.sleep(2000);
            carCheck_page.clickOnCrosshairReifenDruckForCar();
            Thread.sleep(2000);
            carCheck_page.clickOnReifenLinkVorneForCar();
            Thread.sleep(2000);


            carCheck_page.scrollDownThePageToReifenGanzRechtsCar();
 */           Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_REIFENDRUCK_ERFASSEN, sprache[i]);
            Thread.sleep(2000);

            /////////////

            carCheck_page.scrollDownThePageToReifenLinksUnterForCar();
            Thread.sleep(2000);
            carCheck_page.reifenBeurteilen();
            Thread.sleep(2000);
            carCheck_page.scrollDownThePageToReifenLinksUnterForCar();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_REIFEN_ZUSTAND, sprache[i]);
//            carCheck_page.reifenBeurteilenDelete();
            Thread.sleep(2000);

            carCheck_page.checkListDelete();
            driver.quit();
        }
    }


}
