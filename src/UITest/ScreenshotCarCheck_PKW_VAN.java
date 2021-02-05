package UITest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

import java.util.concurrent.TimeUnit;


public class ScreenshotCarCheck_PKW_VAN {
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

        for(int i=20;i<sprache.length; i++) {
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
            Thread.sleep(10000);
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

            home_page.clickOnOutletLandau();
            Thread.sleep(5000);

            home_page.clickOnChangeOutletButton();
            Thread.sleep(5000);

            fleet_page.clickOnDataProtectionBanner();
            fleet_page.clickOnCookieBanner();
            Thread.sleep(5000);

            fleet_page.clickOnInboxIcon();
            fleet_page.clickOnInboxIcon();
            Thread.sleep(2000);

            auftrag_management_page.clickOnXentryOrder();
            Thread.sleep(5000);
            auftrag_management_page.closeErrorAndHinweis();
            Thread.sleep(2000);
            ////Chay xong roi xoa

            driver.get("https://xentry-int2.daimler.com/car-check/service-reception/1388809");
            carCheck_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis();
            Thread.sleep(2000);
            ///////

            carCheck_page.clickOnCarCheckReiter();
            carCheck_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis();
            Thread.sleep(2000);
            carCheck_page.clickOnStartButton();
            carCheck_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis();
            /////////////

            carCheck_page.reifenBeurteilen();
            Thread.sleep(2000);
            carCheck_page.scrollDownThePageToReifenForCar();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_REIFEN_ZUSTAND, sprache[i]);
            carCheck_page.reifenBeurteilenDelete();
            Thread.sleep(2000);
            ///////


         /////
            carCheck_page.scrollDownThePageToFrontscheibeForCar();
            Thread.sleep(2000);

            carCheck_page.clickOnHakeVonWischerForCar_1();
            Thread.sleep(2000);
            carCheck_page.clickOnHakenVonKuehlMittelStand();
            Thread.sleep(2000);
            carCheck_page.scrollDownThePageToFrontscheibeForCar();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_KM_IO_NIO_UEBERSICHT, sprache[i]);



            /////
            carCheck_page.clickXSymbolVonKartenStandForCar();
            Thread.sleep(2000);
            ////
            carCheck_page.scrollDownThePageToKundenSpezifisch();
            Thread.sleep(2000);
            carCheck_page.clickOnHakenVonServiceAnzeige();
            Thread.sleep(2000);
            carCheck_page.clickOnHakenVonZusatzArbeitStaufilter();
            Thread.sleep(2000);
            carCheck_page.scrollDownThePageToKundenSpezifisch();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.CC_VORGANG_FAHRZEUG_CHECK_ZUSATZARBEIT, sprache[i]);

            carCheck_page.checkListDelete();
            carCheck_page.waitForSpinnerNotAppears();
            driver.quit();
        }
    }


}
