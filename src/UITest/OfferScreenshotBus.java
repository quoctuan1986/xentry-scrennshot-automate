package UITest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

import java.util.concurrent.TimeUnit;


public class OfferScreenshotBus {
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

        for(int i=22;i<24; i++) {
            ChromeDriver driver = new ChromeDriver();
            LogIn_Page logIn_page = PageFactory.initElements(driver, LogIn_Page.class);
            Home_Page home_page = PageFactory.initElements(driver, Home_Page.class);
            Fleet_Page fleet_page = PageFactory.initElements(driver, Fleet_Page.class);
            ServiceManagement_Page serviceManagement_page = PageFactory.initElements(driver, ServiceManagement_Page.class);
            ServiceManagement_2_Page serviceManagement_2_page = PageFactory.initElements(driver, ServiceManagement_2_Page.class);
            Auftrag_Management_Page auftrag_management_page = PageFactory.initElements(driver, Auftrag_Management_Page.class);


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

            logIn_page.enterPassWord(UIConstants.PASWORD);
            logIn_page.clickOnSubmitButton();

            whoIsWho.clickOnUserModify();

            whoIsWho.clickOnPrefLanguageBox();

            whoIsWho.selectTheLanguage(sprache[i]);

            whoIsWho.clickOnSaveButton();

            whoIsWho.clickOnLogoutButton();
            Thread.sleep(2000);


            driver.get(UIConstants.URL_XENTRY);
            Thread.sleep(5000);

            logIn_page.clickOnsignInButton();

            logIn_page.enterUserName(UIConstants.USER_NAME);
            logIn_page.clickOnNextButton();

            logIn_page.enterPassWord(UIConstants.PASWORD);
            logIn_page.clickOnSubmitButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            home_page.clickOnLogoutButton();
            Thread.sleep(5000);

            driver.get(UIConstants.URL_XENTRY);

            logIn_page.clickOnsignInButton();

            logIn_page.enterUserName(UIConstants.USER_NAME);
            logIn_page.clickOnNextButton();

            logIn_page.enterPassWord(UIConstants.PASWORD);
            logIn_page.clickOnSubmitButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();



//Change Oulet name
            home_page.clickOnFrameOfOutletName();

            home_page.clickOnOutletEvoBus();

            home_page.clickOnChangeOutletButton();

            fleet_page.clickOnDataProtectionBanner();
            fleet_page.clickOnCookieBanner();

            fleet_page.clickOnInboxIcon();
            fleet_page.clickOnInboxIcon();
            serviceManagement_2_page.closeCookies();
            auftrag_management_page.alleKachelAnzeige();
            Thread.sleep(2000);

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.gutenTag();

            screenshot.madeScreenshot(UIConstants.XP_START_PAGE, sprache[i]);


            home_page.clickOnCockPit();


            fleet_page.clickOnInboxIcon();
            fleet_page.clickOnInboxIcon();

            fleet_page.clickOnFleetList();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceFleetList();
            screenshot.madeScreenshot(UIConstants.BUS_COCKPIT_FLEET_LIST, sprache[i]);

            fleet_page.clickOnVehicleList();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceTheVehicleListBUS();

            screenshot.madeScreenshot(UIConstants.BUS_COCKPIT_FAHRZEUG_LIST, sprache[i]);

            fleet_page.clickOnFilterButton();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.BUS_FILTERMENÜ, sprache[i]);

            serviceManagement_2_page.clickOnRefreshButtonOnTheVehicleList();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            fleet_page.clickOnTheFin(UIConstants.BUS_TEST_FIN_SENT);
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            serviceManagement_2_page.replaceTheVehicleListBUS();
            serviceManagement_2_page.replaceServiceNameOnLeadDetails();

            screenshot.madeScreenshot(UIConstants.BUS_COCKPIT_BUENDELUNG, sprache[i]);
            Thread.sleep(2000);

            fleet_page.clickOnLupeForLeadDetail();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.BUS_COCKPIT_ANFRAGE_DETAILS, sprache[i]);
            fleet_page.closeDialogLeadDetails();


            fleet_page.clickOnMoreInfoButton();
            Thread.sleep(2000);

            screenshot.madeScreenshot(UIConstants.BUS_ZUSATZINFORMATION, sprache[i]);

            fleet_page.clickOnCustomerInfoForTruck();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            serviceManagement_2_page.replaceKundenInfoInVehicleBUS();

            screenshot.madeScreenshot(UIConstants.BUS_COCKPIT_KUNDENINFO, sprache[i]);
            fleet_page.closeDialogOfCustomerInfoForTruck();

            fleet_page.clickOnMoreInfoButton();
            fleet_page.clickOnFahrzeugmeldungenForTruck();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.BUS_COCKPIT_FAHRZEUGMELDUNGEN, sprache[i]);
            fleet_page.closeDialogFahrzeugmeldungen();



            fleet_page.clickOnMoreInfoButton();
            Thread.sleep(2000);
            fleet_page.clickOnTeleDataForTruck();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            serviceManagement_2_page.waitForTelematikToDisplayedInCockpit();
            Thread.sleep(2000);

            serviceManagement_2_page.replaceTextOnTeleBUS();


            screenshot.madeScreenshot(UIConstants.BUS_COCKPIT_TD_GRUNDDATEN, sprache[i]);
            fleet_page.closeDialogOfTeleDataForTruck();


            fleet_page.clickOnMoreInfoButton();
            fleet_page.clickOnVehicleDataForTruck();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            serviceManagement_2_page.replaceFinOnVehicleDetailBUS();


            screenshot.madeScreenshot(UIConstants.BUS_COCKPIT_FAHRZEUGDETAILS, sprache[i]);
            fleet_page.closeDialogOfVehicleDataForTruck();
            //
            //
            //

            serviceManagement_2_page.clickOnRefreshButtonOnTheVehicleList();
            serviceManagement_2_page.waitForSpinnerNotAppears();

            fleet_page.clickOnTheFin(UIConstants.BUS_TEST_FIN);
            serviceManagement_2_page.waitForSpinnerNotAppears();
            fleet_page.clickOnOfferButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            serviceManagement_2_page.closeErrorAndHinweis_1();
            Thread.sleep(2000);

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceFinOnOfferDetailBUS(UIConstants.BUS_TEST_FIN);

            screenshot.madeScreenshot(UIConstants.BUS_OFFER_MAßNAMHEN_SELEKTIEREN, sprache[i]);

            //////////


            serviceManagement_2_page.clickOnSideNavigation();
            serviceManagement_2_page.closeTheOffer();
            serviceManagement_2_page.waitForSpinnerNotAppears();


            fleet_page.clickOnTheFin(UIConstants.BUS_TEST_FIN_SENT);
            fleet_page.clickOnOfferButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            serviceManagement_2_page.closeError_1();
            Thread.sleep(2000);

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceFinOnOfferDetailBUS(UIConstants.BUS_TEST_FIN_SENT);

            screenshot.madeScreenshot(UIConstants.BUS_OFFER_WIEDEREROEFFNUNG, sprache[i]);

            serviceManagement_2_page.clickOnTelematikData();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(5000);

            serviceManagement_2_page.replaceOnTelematikdataOnOfferBUS();


            screenshot.madeScreenshot(UIConstants.BUS_OFFER_TELEMATIK, sprache[i]);
            serviceManagement_2_page.closeTelematikData();

            serviceManagement_2_page.clickOnSideNavigation();
            serviceManagement_2_page.closeTheOffer();
            serviceManagement_2_page.waitForSpinnerNotAppears();

            fleet_page.clickOnTheFin(UIConstants.BUS_TEST_FIN_SENT_2);
            fleet_page.clickOnOfferButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            serviceManagement_2_page.closeErrorAndHinweis_1();


            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceFinOnOfferDetailBUS(UIConstants.BUS_TEST_FIN_SENT_2);

            serviceManagement_2_page.clickOnCustomerData();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            serviceManagement_2_page.replaceKundendatenInOfferBUS();


            screenshot.madeScreenshot(UIConstants.BUS_OFFER_KUNDENINFO, sprache[i]);
            serviceManagement_2_page.closeOfferCustomerInfo();


            serviceManagement_2_page.clickOnVerhicleData();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            serviceManagement_2_page.replaceFahrzeugdatenInOfferBUS();


            screenshot.madeScreenshot(UIConstants.BUS_OFFER_FAHRZEUGDATEN, sprache[i]);
            serviceManagement_2_page.clickOnTabVehicleHistoryOfVehicleData();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.BUS_FAHRZEUGDATEN_LEBENSLAUF, sprache[i]);
            serviceManagement_2_page.clickOnTabOverviewOfVehicleData();
            serviceManagement_2_page.closeErrorAndHinweis();
            serviceManagement_2_page.clickOnServiceContractNumber();
            Thread.sleep(10000);
            serviceManagement_2_page.closeErrorAndHinweis();
            Thread.sleep(2000);
            serviceManagement_2_page.replaceOnVetragdetailBUS();
            screenshot.madeScreenshot(UIConstants.BUS_SERVICE_VERTRAGSDETAILS, sprache[i]);
            serviceManagement_2_page.closeOfferVehicleInfo();

           // serviceManagement_2_page.clickOnTelematikData();
           // Thread.sleep(10000);
           // screenshot.madeScreenshot(UIConstants.BUS_OFFER_TELEMATIK, sprache[i]);
           // Thread.sleep(2000);


            serviceManagement_2_page.clickOnXentryAppointment();
            serviceManagement_2_page.waitForSpinnerNotAppearsOnAppointment();
            serviceManagement_2_page.clickOnPlusButtonForNewAppointment();
            serviceManagement_2_page.waitForSpinnerNotAppearsOnAppointment();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.BUS_XAA_TERMINVEREINBARUNG, sprache[i]);
            serviceManagement_2_page.closeXentryAppointment();

            serviceManagement_2_page.clickOnThreePointMenu();
            serviceManagement_2_page.clickOnSettingInOffer();
            Thread.sleep(5000);
            serviceManagement_2_page.closeErrorAndHinweis_1();
            serviceManagement_2_page.clickOnSettingBenutzereinstellungen();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.BUS_SETTING_BENUTZER_EINSTELLUNGEN, sprache[i]);
            serviceManagement_2_page.clickOnSettingBetriebTab();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.BUS_SETTING_OUTLET, sprache[i]);
            serviceManagement_2_page.clickOnSettingMarketTab();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.BUS_SETTING_MARKET, sprache[i]);
            serviceManagement_2_page.clickOnSettingGlobalTab();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.BUS_SETTING_GLOBAL, sprache[i]);
            serviceManagement_2_page.closeSettingDialogInOffer();


            serviceManagement_2_page.clickOnSideNavigation();
            serviceManagement_2_page.closeTheOffer();
            serviceManagement_2_page.waitForSpinnerNotAppears();

            fleet_page.clickOnTheFin(UIConstants.BUS_TEST_FIN);
            fleet_page.clickOnOfferButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(3000);

            serviceManagement_2_page.closeErrorAndHinweis_1();

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceFinOnOfferDetailBUS(UIConstants.BUS_TEST_FIN);

            serviceManagement_2_page.clickOnALead();
            Thread.sleep(5000);

            screenshot.madeScreenshot(UIConstants.BUS_OFFER_MASSNAHMENDETAILS, sprache[i]);

            serviceManagement_2_page.clickOnTheTabPackage();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.BUS_OFFER_PAKETE, sprache[i]);

            serviceManagement_2_page.addManualOperation();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.BUS_OFFER_MANUELLE, sprache[i]);
            serviceManagement_2_page.addManualOperationWithText();

            serviceManagement_2_page.clickOnDelegateButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.BUS_LEAD_DELEGATE, sprache[i]);
            serviceManagement_2_page.closeDelegateDialog();

           // serviceManagement_2_page.clickOnEditButtonForPackage();
           // Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.BUS_PAKETE_BEARBEITEN, sprache[i]);
            serviceManagement_2_page.closeEditPackageDialog();


            serviceManagement_2_page.clickOnPlusButtonForAddMeasures();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            serviceManagement_2_page.closeErrorAndHinweis_1();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.BUS_ADD_MAINTENANCE_ITEM,sprache[i]);
            serviceManagement_2_page.clickOnTabLegal();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.BUS_ADD_LEGAL_ITEM, sprache[i]);
            serviceManagement_2_page.closeDialogAddMeasures();


            serviceManagement_2_page.clickOnSideNavigation();
            serviceManagement_2_page.closeTheOffer();
            Thread.sleep(3000);
            serviceManagement_2_page.clickOnDiscardDialog();
            serviceManagement_2_page.waitForSpinnerNotAppears();

            fleet_page.clickOnTheFin(UIConstants.BUS_TEST_FIN_PROGRESS);
            fleet_page.clickOnOfferButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(3000);
            serviceManagement_2_page.closeErrorAndHinweis_1();


            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceFinOnOfferDetailBUS(UIConstants.BUS_TEST_FIN_PROGRESS);

            serviceManagement_2_page.clickOnTelematikData();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(5000);
           // serviceManagement_2_page.clickOnNotificationDetailsInTelematikData();
           // Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.BUS_NOTIFICATION,sprache[i]);
            serviceManagement_2_page.closeTelematikData();

            serviceManagement_2_page.clickOnSummary();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(3000);

            serviceManagement_2_page.replaceFinOnOfferDetailOfSummaryForEditingBUS(UIConstants.BUS_TEST_FIN_PROGRESS);
            serviceManagement_2_page.replaceSummaryPageBUS();


            screenshot.madeScreenshot(UIConstants.BUS_OFFER_SUMMARY, sprache[i]);
            serviceManagement_2_page.clickOnStornoButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(3000);
            screenshot.madeScreenshot(UIConstants.BUS_OFFER_STORNO, sprache[i]);
            serviceManagement_2_page.closeStornoDialog();

            serviceManagement_2_page.clickOnSideNavigation();
            serviceManagement_2_page.closeTheOffer();
            serviceManagement_2_page.waitForSpinnerNotAppears();

            fleet_page.clickOnTheFin(UIConstants.BUS_TEST_FIN_SENT_2);
            fleet_page.clickOnOfferButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(3000);
            serviceManagement_2_page.closeErrorAndHinweis_1();

            serviceManagement_2_page.clickOnSummary();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceFinOnOfferDetailOfSummaryForSentBUS(UIConstants.BUS_TEST_FIN_SENT_2);
            serviceManagement_2_page.replaceKundengespaechPageBUS();

            screenshot.madeScreenshot(UIConstants.BUS_OFFER_KUNDENGESPRAECH, sprache[i]);

            serviceManagement_2_page.clickOnScheduleAppointmentButtonTruck();
            serviceManagement_2_page.waitForSpinnerNotAppearsOnAppointment();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.BUS_OFFER_TERMINLISTE, sprache[i]);

            serviceManagement_2_page.clickOnPlusButtonForNewAppointment();
            serviceManagement_2_page.waitForSpinnerNotAppearsOnAppointment();
            Thread.sleep(2000);

            serviceManagement_2_page.enterDeliveryDate();
            serviceManagement_2_page.enterPickUpDate();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.BUS_OFFER_KUNDENGESPRAECH_ANGENOMMEN, sprache[i]);
            serviceManagement_2_page.closeXentryAppointment();

            serviceManagement_2_page.clickOnRejectButton();
            Thread.sleep(3000);
            screenshot.madeScreenshot(UIConstants.BUS_OFFER_KUNDENGESPRAECH_ABLEHNEN,sprache[i]);
            serviceManagement_2_page.closeAblehnungDialog();

            serviceManagement_2_page.clickOnSideNavigation();
            serviceManagement_2_page.closeTheOffer();
            serviceManagement_2_page.waitForSpinnerNotAppears();


            fleet_page.clickOnTheFin(UIConstants.BUS_TEST_FIN_VEREINBAREN);
            fleet_page.clickOnOfferButton();

            serviceManagement_2_page.waitForSpinnerNotAppears();
            serviceManagement_2_page.closeErrorAndHinweis_1();
            Thread.sleep(1000);

            serviceManagement_2_page.clickOnSummary();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);


            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceFinOnOfferDetailOfSummaryForSentBUS(UIConstants.BUS_TEST_FIN_VEREINBAREN);
            serviceManagement_2_page.replaceKundengespaechPageBUS();


            screenshot.madeScreenshot(UIConstants.BUS_OFFER_TERMIN_VEREINBAREN, sprache[i]);
            Thread.sleep(1000);

            driver.get("https://xentry-int2.daimler.com/offer/archive/?sort=modificationDate,desc&page=0");
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceArchivListBUS();

            screenshot.madeScreenshot(UIConstants.BUS_ANGEBOT_ARCHIV, sprache[i]);

            serviceManagement_2_page.clickOnArchivDetailForBus();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(5000);

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceOnArchivDetailBUS();


            screenshot.madeScreenshot(UIConstants.BUS_ANGEBOT_ARCHIV_DETAILS, sprache[i]);

            driver.quit();
        }
    }


}
