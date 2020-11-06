package UITest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.TestNG;
import pageObjects.*;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class ServiceManagementOfferScreenshot {
    private static WebDriver driver = null;

    public static void main(String[] args) throws Exception {
        String pathToChromefoxDriver = ".//ChromeDriver//chromedriver";
        System.setProperty("webdriver.chrome.driver", pathToChromefoxDriver);

        String[] sprache = {UIConstants.PREF_LANGUAGE_BG, UIConstants.PREF_LANGUAGE_DE, UIConstants.PREF_LANGUAGE_CS, UIConstants.PREF_LANGUAGE_DA, UIConstants.PREF_LANGUAGE_EL,
                UIConstants.PREF_LANGUAGE_EN, UIConstants.PREF_LANGUAGE_ES, UIConstants.PREF_LANGUAGE_FI, UIConstants.PREF_LANGUAGE_FR, UIConstants.PREF_LANGUAGE_HU, UIConstants.PREF_LANGUAGE_IT,
                UIConstants.PREF_LANGUAGE_JA, UIConstants.PREF_LANGUAGE_KO, UIConstants.PREF_LANGUAGE_NL, UIConstants.PREF_LANGUAGE_NO, UIConstants.PREF_LANGUAGE_PL, UIConstants.PREF_LANGUAGE_PT,
                UIConstants.PREF_LANGUAGE_RO, UIConstants.PREF_LANGUAGE_RU, UIConstants.PREF_LANGUAGE_SK, UIConstants.PREF_LANGUAGE_SL, UIConstants.PREF_LANGUAGE_SV, UIConstants.PREF_LANGUAGE_TR};

        for(int i=22;i<sprache.length; i++) {
            ChromeDriver driver = new ChromeDriver();
            LogIn_Page logIn_page = PageFactory.initElements(driver, LogIn_Page.class);
            Home_Page home_page = PageFactory.initElements(driver, Home_Page.class);
            Fleet_Page fleet_page = PageFactory.initElements(driver, Fleet_Page.class);
            ServiceManagement_Page serviceManagement_page = PageFactory.initElements(driver, ServiceManagement_Page.class);
            ServiceManagement_2_Page serviceManagement_2_page = PageFactory.initElements(driver, ServiceManagement_2_Page.class);

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


/*
            //Change Oulet name
            home_page.clickOnFrameOfOutletName();
            Thread.sleep(5000);

            home_page.clickOnOutletHannover();
            Thread.sleep(5000);

            home_page.clickOnChangeOutletButton();
            Thread.sleep(5000);

            fleet_page.clickOnDataProtectionBanner();
            fleet_page.clickOnCookieBanner();
            Thread.sleep(5000);

            fleet_page.clickOnInboxIcon();
            fleet_page.clickOnInboxIcon();
            Thread.sleep(2000);

            screenshot.madeScreenshot(UIConstants.XP_START_PAGE, sprache[i]);
            Thread.sleep(2000);


            home_page.clickOnCockPit();
            Thread.sleep(5000);

            fleet_page.clickOnFleetList();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.PKW_COCKPIT_FLEET_LIST, sprache[i]);
*/

//Change Oulet name
            home_page.clickOnFrameOfOutletName();
            Thread.sleep(5000);

            home_page.clickOnOutletAugsburg();
            Thread.sleep(5000);

            home_page.clickOnChangeOutletButton();
            Thread.sleep(5000);

            fleet_page.clickOnDataProtectionBanner();
            fleet_page.clickOnCookieBanner();
            Thread.sleep(5000);

            fleet_page.clickOnInboxIcon();
            fleet_page.clickOnInboxIcon();
            Thread.sleep(2000);

            screenshot.madeScreenshot(UIConstants.XP_START_PAGE, sprache[i]);
            Thread.sleep(2000);


            home_page.clickOnCockPit();
            Thread.sleep(20000);


            fleet_page.clickOnInboxIcon();
            fleet_page.clickOnInboxIcon();
            Thread.sleep(2000);


            screenshot.madeScreenshot(UIConstants.PKW_COCKPIT_FAHRZEUG_LIST, sprache[i]);

            fleet_page.clickOnFilterButton();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PKW_FILTERMENÜ, sprache[i]);

            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_OFFER_SENT);
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.PKW_COCKPIT_BUENDELUNG, sprache[i]);
            Thread.sleep(2000);

            fleet_page.clickOnLupeForLeadDetail();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.PKW_COCKPIT_ANFRAGE_DETAILS, sprache[i]);
            fleet_page.closeDialogLeadDetails();
            Thread.sleep(2000);


            fleet_page.clickOnMoreInfoButton();
            Thread.sleep(2000);

            screenshot.madeScreenshot(UIConstants.PKW_ZUSATZINFORMATION, sprache[i]);
            Thread.sleep(2000);

            fleet_page.clickOnCustomerInfo();
            Thread.sleep(5000);

            screenshot.madeScreenshot(UIConstants.PKW_COCKPIT_KUNDENINFO, sprache[i]);
            fleet_page.closeDialogOfCustomerInfo();
            Thread.sleep(2000);

            fleet_page.clickOnMoreInfoButton();
            Thread.sleep(2000);
            fleet_page.clickOnTeleData();
            Thread.sleep(10000);

            screenshot.madeScreenshot(UIConstants.PKW_COCKPIT_TD_GRUNDDATEN, sprache[i]);
            fleet_page.closeDialogOfTeleData();
            Thread.sleep(3000);


            fleet_page.clickOnMoreInfoButton();
            Thread.sleep(2000);
            fleet_page.clickOnVehicleData();
            Thread.sleep(5000);

            screenshot.madeScreenshot(UIConstants.PKW_COCKPIT_FAHRZEUGDETAILS, sprache[i]);
            fleet_page.closeDialogOfVehicleData();
            Thread.sleep(3000);

            //////////////////////////
            fleet_page.clickOnTheFin(UIConstants.TEST_FIN);
            Thread.sleep(5000);
            fleet_page.clickOnOfferButton();
            Thread.sleep(30000);
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_MAßNAMHEN_SELEKTIEREN, sprache[i]);

            serviceManagement_2_page.clickOnSideNavigation();
            Thread.sleep(2000);
            serviceManagement_2_page.closeTheOffer();
            Thread.sleep(20000);

            //////////
            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_NOTIFICATION);
            Thread.sleep(5000);
            fleet_page.clickOnOfferButton();
            Thread.sleep(30000);
            serviceManagement_2_page.clickOnTelematikData();
            Thread.sleep(10000);
            serviceManagement_2_page.clickOnNotificationDetailsInTelematikData();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PkW_NOTIFICATION,sprache[i]);
            serviceManagement_2_page.closeTelematikData();
            Thread.sleep(2000);


            serviceManagement_2_page.clickOnSideNavigation();
            Thread.sleep(2000);
            serviceManagement_2_page.closeTheOffer();
            Thread.sleep(20000);



            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_OFFER_CREATED_2);
            Thread.sleep(5000);
            fleet_page.clickOnOfferButton();
            Thread.sleep(30000);
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_WIEDEREROEFFNUNG, sprache[i]);

            serviceManagement_2_page.clickOnSideNavigation();
            Thread.sleep(2000);
            serviceManagement_2_page.closeTheOffer();
            Thread.sleep(20000);

            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_OFFER_CREATED);
            Thread.sleep(5000);
            fleet_page.clickOnOfferButton();
            Thread.sleep(30000);

            serviceManagement_2_page.clickOnCustomerData();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_KUNDENINFO, sprache[i]);
            serviceManagement_2_page.closeOfferCustomerInfo();


            serviceManagement_2_page.clickOnVerhicleData();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_FAHRZEUGDATEN, sprache[i]);
            serviceManagement_2_page.clickOnServiceContractNumber();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.PKW_SERVICE_VERTRAGSDETAILS, sprache[i]);
            serviceManagement_2_page.closeOfferVehicleInfo();
            Thread.sleep(2000);

            serviceManagement_2_page.clickOnTelematikData();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_TELEMATIK, sprache[i]);
            Thread.sleep(2000);


            serviceManagement_2_page.clickOnXentryAppointment();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.PKW_XAA_TERMINVEREINBARUNG, sprache[i]);
            serviceManagement_2_page.closeXentryAppointment();
            Thread.sleep(10000);

            serviceManagement_2_page.clickOnCommunication();
            Thread.sleep(20000);
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_KOMMUNIKATION, sprache[i]);
            serviceManagement_2_page.closeCommunication();
            Thread.sleep(20000);

            serviceManagement_2_page.clickOnThreePointMenu();
            Thread.sleep(2000);
            serviceManagement_2_page.clickOnSettingInOffer();
            Thread.sleep(10000);

            serviceManagement_2_page.clickOnSettingBetriebTab();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PkW_SETTING_OUTLET, sprache[i]);
            serviceManagement_2_page.clickOnSettingMarketTab();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PkW_SETTING_MARKET, sprache[i]);
            Thread.sleep(2000);
            serviceManagement_2_page.clickOnSettingGlobalTab();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PkW_SETTING_GLOBAL, sprache[i]);
            serviceManagement_2_page.closeSettingDialogInOffer();


            serviceManagement_2_page.clickOnSideNavigation();
            Thread.sleep(2000);
            serviceManagement_2_page.closeTheOffer();
            Thread.sleep(20000);

            fleet_page.clickOnTheFin(UIConstants.TEST_FIN);
            Thread.sleep(5000);
            fleet_page.clickOnOfferButton();
            Thread.sleep(30000);

            serviceManagement_2_page.clickOnAMaintenance();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_MASSNAHMENDETAILS, sprache[i]);
            Thread.sleep(2000);

            serviceManagement_2_page.clickOnTheTabPackage();
            Thread.sleep(2000);
            serviceManagement_2_page.packageUnfold();
            Thread.sleep(2000);
            serviceManagement_2_page.moveTheCosorToTabPackage();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_PAKETE, sprache[i]);

            serviceManagement_2_page.addPackage();
            Thread.sleep(20000);
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_PACKAGE_ADD, sprache[i]);
            serviceManagement_2_page.closeAddPackageDialog();
            Thread.sleep(2000);

            serviceManagement_2_page.addManualOperation();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_MANUELLE, sprache[i]);
            serviceManagement_2_page.closeAddManualOperationDialog();
            Thread.sleep(2000);


            serviceManagement_2_page.clickOnEditButtonForPackage();
            Thread.sleep(2000);
            serviceManagement_2_page.changeThePriceOfPackage();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PKW_PAKETE_BEARBEITEN, sprache[i]);
            serviceManagement_2_page.closeEditPackageDialog();
            Thread.sleep(2000);


            serviceManagement_2_page.clickOnSideNavigation();
            Thread.sleep(2000);
            serviceManagement_2_page.closeTheOffer();
            Thread.sleep(20000);

            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_OFFER_IN_PROGRESS);
            Thread.sleep(5000);
            fleet_page.clickOnOfferButton();
            Thread.sleep(30000);

            serviceManagement_2_page.clickOnSummary();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_SUMMARY, sprache[i]);
            serviceManagement_2_page.clickOnStornoButton();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_STORNO, sprache[i]);
            serviceManagement_2_page.closeStornoDialog();
            Thread.sleep(2000);

            serviceManagement_2_page.clickOnSideNavigation();
            Thread.sleep(2000);
            serviceManagement_2_page.closeTheOffer();
            Thread.sleep(2000);
            serviceManagement_2_page.clickOnDiscardDialog();
            Thread.sleep(20000);

            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_OFFER_SENT_2);
            Thread.sleep(5000);
            fleet_page.clickOnOfferButton();
            Thread.sleep(10000);

            serviceManagement_2_page.clickOnSummary();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_KUNDENGESPRAECH, sprache[i]);

            serviceManagement_2_page.clickOnScheduleAppointmentButton();
            Thread.sleep(10000);
            serviceManagement_2_page.enterDeliveryDate();
            Thread.sleep(2000);
            serviceManagement_2_page.enterPickUpDate();
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_KUNDENGESPRAECH_ANGENOMMEN, sprache[i]);
            serviceManagement_2_page.closeXentryAppointment();
            Thread.sleep(2000);

            serviceManagement_2_page.clickOnRejectButton();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_KUNDENGESPRAECH_ABLEHNEN,sprache[i]);

            //
            //
            //
        /*
        fleet_page.clickOnNavbarAppdrawer();
        Thread.sleep(2000);

        fleet_page.clickOnArchivMenu();
        Thread.sleep(10000);

        fleet_page.changeToArchivOfferTab();
        Thread.sleep(5000);

        fleet_page.clickOnInboxIcon();
        fleet_page.clickOnInboxIcon();
        Thread.sleep(2000);

        screenshot.madeScreenshot(UIConstants.ARCHIV_ÜBERSICHT);
        */

            driver.quit();
        }
    }


}
