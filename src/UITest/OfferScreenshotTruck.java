package UITest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

import java.util.concurrent.TimeUnit;


public class OfferScreenshotTruck {
    private static WebDriver driver = null;

    public static void main(String[] args) throws Exception {
        String pathToChromeforDriver = ".//ChromeDriver//chromedriver";
        String pathToChrome_Windows = ".//Win_ChromeDriver//chromedriver.exe";
        if (System.getProperty("os.name").startsWith("Windows")) {
            System.setProperty("webdriver.chrome.driver", pathToChrome_Windows);
        } else{
            System.setProperty("webdriver.chrome.driver", pathToChromeforDriver);
        }

        String[] sprache = {UIConstants.PREF_LANGUAGE_BG, UIConstants.PREF_LANGUAGE_DE, UIConstants.PREF_LANGUAGE_CS, UIConstants.PREF_LANGUAGE_DA, UIConstants.PREF_LANGUAGE_EL,
                UIConstants.PREF_LANGUAGE_EN, UIConstants.PREF_LANGUAGE_ES, UIConstants.PREF_LANGUAGE_FI, UIConstants.PREF_LANGUAGE_FR, UIConstants.PREF_LANGUAGE_HU, UIConstants.PREF_LANGUAGE_IT,
                UIConstants.PREF_LANGUAGE_JA, UIConstants.PREF_LANGUAGE_KO, UIConstants.PREF_LANGUAGE_NL, UIConstants.PREF_LANGUAGE_NO, UIConstants.PREF_LANGUAGE_PL, UIConstants.PREF_LANGUAGE_PT,
                UIConstants.PREF_LANGUAGE_RO, UIConstants.PREF_LANGUAGE_RU, UIConstants.PREF_LANGUAGE_SK, UIConstants.PREF_LANGUAGE_SL, UIConstants.PREF_LANGUAGE_SV, UIConstants.PREF_LANGUAGE_TR};

        for(int i=0;i<sprache.length; i++) {
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
            Thread.sleep(5000);

            screenshot.madeScreenshot(UIConstants.XP_START_PAGE, sprache[i]);
            Thread.sleep(2000);


            home_page.clickOnCockPit();
            Thread.sleep(15000);

            fleet_page.clickOnFleetList();
            Thread.sleep(20000);
            screenshot.madeScreenshot(UIConstants.TRUCK_COCKPIT_FLEET_LIST, sprache[i]);


//Click on a Fleet Name
          //  fleet_page.clickOnTheFleet(UIConstants.TRUCK_FLEET_NAME);
          //  Thread.sleep(10000);

          //  fleet_page.showAllVehicle();
          //  Thread.sleep(5000);
            fleet_page.clickOnVehicleList();
            Thread.sleep(30000);
            screenshot.madeScreenshot(UIConstants.TRUCK_COCKPIT_FAHRZEUG_LIST, sprache[i]);

            fleet_page.clickOnFilterButton();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.TRUCK_FILTERMENÜ, sprache[i]);

            fleet_page.clickOnTheFin(UIConstants.TRUCK_TEST_FIN_SENT);
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.TRUCK_COCKPIT_BUENDELUNG, sprache[i]);
            Thread.sleep(2000);

            fleet_page.clickOnLupeForLeadDetail();
            Thread.sleep(20000);
            screenshot.madeScreenshot(UIConstants.TRUCK_COCKPIT_ANFRAGE_DETAILS, sprache[i]);
            fleet_page.closeDialogLeadDetails();
            Thread.sleep(2000);


            fleet_page.clickOnMoreInfoButton();
            Thread.sleep(5000);

            screenshot.madeScreenshot(UIConstants.TRUCK_ZUSATZINFORMATION, sprache[i]);
            Thread.sleep(2000);

            fleet_page.clickOnCustomerInfoForTruck();
            Thread.sleep(10000);

            screenshot.madeScreenshot(UIConstants.TRUCK_COCKPIT_KUNDENINFO, sprache[i]);
            fleet_page.closeDialogOfCustomerInfoForTruck();
            Thread.sleep(2000);
            fleet_page.clickOnMoreInfoButton();
            Thread.sleep(2000);
            fleet_page.clickOnFahrzeugmeldungenForTruck();
            Thread.sleep(20000);

            screenshot.madeScreenshot(UIConstants.TRUCK_COCKPIT_FAHRZEUGMELDUNGEN, sprache[i]);
            fleet_page.closeDialogFahrzeugmeldungen();
            Thread.sleep(3000);



            fleet_page.clickOnMoreInfoButton();
            Thread.sleep(2000);
            fleet_page.clickOnTeleDataForTruck();
            Thread.sleep(20000);

            screenshot.madeScreenshot(UIConstants.TRUCK_COCKPIT_TD_GRUNDDATEN, sprache[i]);
            fleet_page.closeDialogOfTeleDataForTruck();
            Thread.sleep(3000);


            fleet_page.clickOnMoreInfoButton();
            Thread.sleep(2000);
            fleet_page.clickOnVehicleDataForTruck();
            Thread.sleep(20000);

            screenshot.madeScreenshot(UIConstants.TRUCK_COCKPIT_FAHRZEUGDETAILS, sprache[i]);
            fleet_page.closeDialogOfVehicleDataForTruck();
            Thread.sleep(3000);


           // fleet_page.clickOnFleetList();
           // Thread.sleep(10000);
           // screenshot.madeScreenshot(UIConstants.TRUCK_COCKPIT_FLEET_LIST, sprache[i]);


//Click on a Fleet Name
          //  fleet_page.clickOnTheFleet(UIConstants.TRUCK_FLEET_NAME);
          //  Thread.sleep(10000);

          //  fleet_page.showAllVehicle();
          //  Thread.sleep(5000);

            //////////////////////////
            fleet_page.clickOnTheFin(UIConstants.TRUCK_TEST_FIN);
            Thread.sleep(5000);
            fleet_page.clickOnOfferButton();
            Thread.sleep(30000);
            screenshot.madeScreenshot(UIConstants.TRUCK_OFFER_MAßNAMHEN_SELEKTIEREN, sprache[i]);

            serviceManagement_2_page.clickOnSideNavigation();
            Thread.sleep(2000);
            serviceManagement_2_page.closeTheOffer();
            Thread.sleep(30000);


            fleet_page.clickOnTheFin(UIConstants.TRUCK_TEST_FIN_SENT);
            Thread.sleep(5000);
            fleet_page.clickOnOfferButton();
            Thread.sleep(30000);
            screenshot.madeScreenshot(UIConstants.TRUCK_OFFER_WIEDEREROEFFNUNG, sprache[i]);

            serviceManagement_2_page.clickOnSideNavigation();
            Thread.sleep(2000);
            serviceManagement_2_page.closeTheOffer();
            Thread.sleep(30000);
            fleet_page.clickOnTheFin(UIConstants.TRUCK_TEST_FIN_SENT_2);
            Thread.sleep(5000);
            fleet_page.clickOnOfferButton();
            Thread.sleep(30000);

            serviceManagement_2_page.clickOnXentryAppointment();
            Thread.sleep(20000);
            screenshot.madeScreenshot(UIConstants.TRUCK_XAA_TERMINVEREINBARUNG, sprache[i]);
            serviceManagement_2_page.closeXentryAppointment();
            Thread.sleep(10000);

            serviceManagement_2_page.clickOnSideNavigation();
            Thread.sleep(2000);
            serviceManagement_2_page.closeTheOffer();
            Thread.sleep(30000);

            fleet_page.clickOnTheFin(UIConstants.TRUCK_TEST_FIN);
            Thread.sleep(5000);
            fleet_page.clickOnOfferButton();
            Thread.sleep(30000);

            serviceManagement_2_page.clickOnCustomerData();
            Thread.sleep(20000);
            screenshot.madeScreenshot(UIConstants.TRUCK_OFFER_KUNDENINFO, sprache[i]);
            serviceManagement_2_page.closeOfferCustomerInfo();


            serviceManagement_2_page.clickOnVerhicleData();
            Thread.sleep(20000);
            screenshot.madeScreenshot(UIConstants.TRUCK_OFFER_FAHRZEUGDATEN, sprache[i]);
            serviceManagement_2_page.closeOfferVehicleInfo();
            Thread.sleep(2000);

            serviceManagement_2_page.clickOnTelematikData();
            Thread.sleep(20000);
            screenshot.madeScreenshot(UIConstants.TRUCK_OFFER_TELEMATIK, sprache[i]);
            Thread.sleep(2000);
            serviceManagement_2_page.closeTelematikData();

            serviceManagement_2_page.clickOnThreePointMenu();
            Thread.sleep(2000);
            serviceManagement_2_page.clickOnSettingInOffer();
            Thread.sleep(10000);

            serviceManagement_2_page.clickOnSettingBetriebTab();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.TRUCK_SETTING_OUTLET, sprache[i]);
            serviceManagement_2_page.clickOnSettingMarketTab();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.TRUCK_SETTING_MARKET, sprache[i]);
            Thread.sleep(2000);
            serviceManagement_2_page.clickOnSettingGlobalTab();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.TRUCK_SETTING_GLOBAL, sprache[i]);
            serviceManagement_2_page.closeSettingDialogInOffer();


            serviceManagement_2_page.clickOnALead();
            Thread.sleep(20000);

            screenshot.madeScreenshot(UIConstants.TRUCK_OFFER_MASSNAHMENDETAILS, sprache[i]);
            Thread.sleep(2000);

            serviceManagement_2_page.clickOnTheTabPackage();
            Thread.sleep(20000);


            serviceManagement_2_page.addPackage();
            Thread.sleep(20000);
            screenshot.madeScreenshot(UIConstants.TRUCK_OFFER_PACKAGE_ADD, sprache[i]);
            serviceManagement_2_page.clickOnCheckBoxToAddPackage();
            serviceManagement_2_page.clickOnAssumeButton();
            Thread.sleep(2000);


            serviceManagement_2_page.packageUnfold();
            Thread.sleep(2000);
            serviceManagement_2_page.moveTheCosorToTabPackage();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.TRUCK_OFFER_PAKETE, sprache[i]);

            serviceManagement_2_page.addManualOperation();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.TRUCK_OFFER_MANUELLE, sprache[i]);
            serviceManagement_2_page.closeAddManualOperationDialog();
            Thread.sleep(2000);


            serviceManagement_2_page.clickOnDelegateButton();
            Thread.sleep(20000);
            screenshot.madeScreenshot(UIConstants.TRUCK_LEAD_DELEGATE, sprache[i]);
            serviceManagement_2_page.closeDelegateDialog();
            Thread.sleep(2000);

            serviceManagement_2_page.clickOnEditButtonForPackage();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.TRUCK_PAKETE_BEARBEITEN, sprache[i]);
            serviceManagement_2_page.closeEditPackageDialog();
            Thread.sleep(2000);


            serviceManagement_2_page.clickOnPlusButtonForAddMeasures();
            Thread.sleep(20000);
            screenshot.madeScreenshot(UIConstants.TRUCK_ADD_MAINTENANCE_ITEM,sprache[i]);
            serviceManagement_2_page.clickOnTabLegal();
            Thread.sleep(15000);
            screenshot.madeScreenshot(UIConstants.TRUCK_ADD_LEGAL_ITEM, sprache[i]);
            serviceManagement_2_page.closeDialogAddMeasures();
            Thread.sleep(2000);


            serviceManagement_2_page.clickOnSideNavigation();
            Thread.sleep(2000);
            serviceManagement_2_page.closeTheOffer();
            Thread.sleep(3000);
            serviceManagement_2_page.clickOnDiscardDialog();
            Thread.sleep(30000);

            fleet_page.clickOnTheFin(UIConstants.TRUCK_TEST_FIN_PROGRESS);
            Thread.sleep(5000);
            fleet_page.clickOnOfferButton();
            Thread.sleep(30000);

            serviceManagement_2_page.clickOnSummary();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.TRUCK_OFFER_SUMMARY, sprache[i]);
            serviceManagement_2_page.clickOnStornoButton();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.TRUCK_OFFER_STORNO, sprache[i]);
            serviceManagement_2_page.closeStornoDialog();
            Thread.sleep(2000);

            serviceManagement_2_page.clickOnSideNavigation();
            Thread.sleep(2000);
            serviceManagement_2_page.closeTheOffer();
            Thread.sleep(30000);

            fleet_page.clickOnTheFin(UIConstants.TRUCK_TEST_FIN_SENT_2);
            Thread.sleep(5000);
            fleet_page.clickOnOfferButton();
            Thread.sleep(30000);

            serviceManagement_2_page.clickOnSummary();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.TRUCK_OFFER_KUNDENGESPRAECH, sprache[i]);

            serviceManagement_2_page.clickOnScheduleAppointmentButtonTruck();
            Thread.sleep(20000);
            serviceManagement_2_page.enterDeliveryDate();
            Thread.sleep(5000);
            serviceManagement_2_page.enterPickUpDate();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.TRUCK_OFFER_KUNDENGESPRAECH_ANGENOMMEN, sprache[i]);
            serviceManagement_2_page.closeXentryAppointment();
            Thread.sleep(2000);

            serviceManagement_2_page.clickOnRejectButtonTruck();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.TRUCK_OFFER_KUNDENGESPRAECH_ABLEHNEN,sprache[i]);
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
