package UITest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

import java.util.concurrent.TimeUnit;


public class OfferScreenshotVAN_Cockpit {
    private static WebDriver driver = null;

    public static void main(String[] args) throws Exception {
        String pathToChromefoxDriver = ".//ChromeDriver//chromedriver";
        System.setProperty("webdriver.chrome.driver", pathToChromefoxDriver);

        String[] sprache = {UIConstants.PREF_LANGUAGE_DE,  UIConstants.PREF_LANGUAGE_DA, UIConstants.PREF_LANGUAGE_EN,
                UIConstants.PREF_LANGUAGE_ES, UIConstants.PREF_LANGUAGE_FI, UIConstants.PREF_LANGUAGE_FR,
                UIConstants.PREF_LANGUAGE_IT, UIConstants.PREF_LANGUAGE_NL, UIConstants.PREF_LANGUAGE_NO,
                UIConstants.PREF_LANGUAGE_PL, UIConstants.PREF_LANGUAGE_PT, UIConstants.PREF_LANGUAGE_SL,
                UIConstants.PREF_LANGUAGE_SV, UIConstants.PREF_LANGUAGE_BG, UIConstants.PREF_LANGUAGE_CS,
                UIConstants.PREF_LANGUAGE_EL,UIConstants.PREF_LANGUAGE_JA, UIConstants.PREF_LANGUAGE_KO,
                UIConstants.PREF_LANGUAGE_RO, UIConstants.PREF_LANGUAGE_RU, UIConstants.PREF_LANGUAGE_SK,
                UIConstants.PREF_LANGUAGE_TR, UIConstants.PREF_LANGUAGE_ZH,UIConstants.PREF_LANGUAGE_HU};

        for(int i=23;i<sprache.length; i++) {
            ChromeDriver driver = new ChromeDriver();
            LogIn_Page logIn_page = PageFactory.initElements(driver, LogIn_Page.class);
            Home_Page home_page = PageFactory.initElements(driver, Home_Page.class);
            Fleet_Page fleet_page = PageFactory.initElements(driver, Fleet_Page.class);
            ServiceManagement_Page serviceManagement_page = PageFactory.initElements(driver, ServiceManagement_Page.class);
            ServiceManagement_2_Page serviceManagement_2_page = PageFactory.initElements(driver, ServiceManagement_2_Page.class);
            Auftrag_Management_Page auftrag_management_page = PageFactory.initElements(driver, Auftrag_Management_Page.class);
            Kundendialog_Page kundendialog_page = PageFactory.initElements(driver, Kundendialog_Page.class);
            CarCheck_Page carCheck_page = PageFactory.initElements(driver, CarCheck_Page.class);
            HelpCard_Page helpCard_page = PageFactory.initElements(driver, HelpCard_Page.class);

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
            Thread.sleep(5000);


//Change Oulet name
            home_page.clickOnFrameOfOutletName();
            Thread.sleep(5000);

            home_page.clickOnOutletNuerberg();
            Thread.sleep(5000);

            home_page.clickOnChangeOutletButton();
            Thread.sleep(5000);

            fleet_page.clickOnDataProtectionBanner();
            fleet_page.clickOnCookieBanner();
            Thread.sleep(5000);

            fleet_page.clickOnInboxIcon();
            fleet_page.clickOnInboxIcon();
            Thread.sleep(2000);

            auftrag_management_page.alleKachelAnzeige();
            Thread.sleep(2000);

            screenshot.madeScreenshot(UIConstants.VAN_XP_START_PAGE, sprache[i]);
            Thread.sleep(2000);


            home_page.clickOnCockPit();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            fleet_page.clickOnVehicleList();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);


            fleet_page.clickOnInboxIcon();
            fleet_page.clickOnInboxIcon();
            Thread.sleep(2000);


            screenshot.madeScreenshot(UIConstants.VAN_COCKPIT_FAHRZEUG_LIST, sprache[i]);

            //Smart obboarding
            fleet_page.clickOnIButton();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.VAN_SMART_ONBOARDING, sprache[i]);
            fleet_page.closeSmartOnboardingDialog();
            Thread.sleep(2000);


            fleet_page.clickOnFilterButton();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.VAN_FILTERMENU, sprache[i]);

            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_OFFER_SENT_VAN);
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.VAN_COCKPIT_BUENDELUNG, sprache[i]);
            Thread.sleep(2000);

            fleet_page.clickOnLupeForLeadDetail();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.VAN_COCKPIT_ANFRAGE_DETAILS, sprache[i]);
            fleet_page.closeDialogLeadDetails();
            Thread.sleep(2000);


            fleet_page.clickOnMoreInfoButton();
            Thread.sleep(2000);

            screenshot.madeScreenshot(UIConstants.VAN_ZUSATZINFORMATION, sprache[i]);
            Thread.sleep(2000);

            fleet_page.clickOnCustomerInfo();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            screenshot.madeScreenshot(UIConstants.VAN_COCKPIT_KUNDENINFO, sprache[i]);
            fleet_page.closeDialogOfCustomerInfo();
            Thread.sleep(2000);

            fleet_page.clickOnMoreInfoButton();
            Thread.sleep(2000);
            fleet_page.clickOnVehicleData();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            screenshot.madeScreenshot(UIConstants.VAN_COCKPIT_FAHRZEUGDETAILS, sprache[i]);
            fleet_page.closeDialogOfVehicleData();
            Thread.sleep(2000);
/*
            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_TERMIN_VEREINBAREN_VAN);
            Thread.sleep(5000);
            fleet_page.clickOnMoreInfoButton();
            Thread.sleep(2000);
            fleet_page.clickOnTeleData();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            serviceManagement_2_page.scrollDownThePageToWartungsdaten();
            serviceManagement_2_page.zoomIn();
            Thread.sleep(2000);

            screenshot.madeScreenshot(UIConstants.VAN_COCKPIT_TD_GRUNDDATEN, sprache[i]);
            serviceManagement_2_page.zommRelease();
            Thread.sleep(2000);
            fleet_page.closeDialogOfTeleData();
            Thread.sleep(3000);*/
            //////////////////////////


            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_OFFER_CREATED_2_VAN);
            Thread.sleep(5000);
            fleet_page.clickOnOfferButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            serviceManagement_2_page.closeErrorAndHinweis();

            serviceManagement_2_page.clickOnSummary();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.VAN_OFFER_KUNDENGESPRAECH, sprache[i]);

            serviceManagement_2_page.clickOnScheduleAppointmentButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(10000);
          //  screenshot.madeScreenshot(UIConstants.VAN_OFFER_TERMINLISTE, sprache[i]);
            serviceManagement_2_page.clickOnPlusButtonForNewAppointment();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(10000);
            serviceManagement_2_page.enterDeliveryDate();
            Thread.sleep(2000);
            serviceManagement_2_page.enterPickUpDate();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.VAN_OFFER_KUNDENGESPRAECH_ANGENOMMEN, sprache[i]);
            serviceManagement_2_page.closeXentryAppointment();
            Thread.sleep(2000);


            serviceManagement_2_page.clickOnSideNavigation();
            Thread.sleep(2000);
            serviceManagement_2_page.closeTheOffer();
            serviceManagement_2_page.waitForSpinnerNotAppears();

            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_TERMIN_VEREINBAREN_VAN);
            Thread.sleep(5000);
            fleet_page.clickOnOfferButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            serviceManagement_2_page.closeErrorAndHinweis();

            serviceManagement_2_page.clickOnSummary();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.VAN_OFFER_TERMIN_VEREINBAREN, sprache[i]);
            Thread.sleep(1000);

            driver.quit();
        }
    }


}
