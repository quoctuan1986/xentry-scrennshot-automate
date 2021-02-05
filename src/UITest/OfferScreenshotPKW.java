package UITest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

import java.util.concurrent.TimeUnit;


public class OfferScreenshotPKW {
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

        for(int i=0;i<1; i++) {
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

            logIn_page.enterPassWord(UIConstants.PASWORD);
            logIn_page.clickOnSubmitButton();

            whoIsWho.clickOnUserModify();

            whoIsWho.clickOnPrefLanguageBox();
            Thread.sleep(5000);

            whoIsWho.selectTheLanguage(sprache[i]);

            whoIsWho.clickOnSaveButton();

            whoIsWho.clickOnLogoutButton();
            Thread.sleep(2000);


            driver.get(UIConstants.URL_XENTRY);

            logIn_page.clickOnsignInButton();

            logIn_page.enterUserName(UIConstants.USER_NAME);
            logIn_page.clickOnNextButton();

            logIn_page.enterPassWord(UIConstants.PASWORD);
            logIn_page.clickOnSubmitButton();

            home_page.clickOnLogoutButton();
            Thread.sleep(5000);

            driver.get(UIConstants.URL_XENTRY);

            logIn_page.clickOnsignInButton();

            logIn_page.enterUserName(UIConstants.USER_NAME);
            logIn_page.clickOnNextButton();

            logIn_page.enterPassWord(UIConstants.PASWORD);
            logIn_page.clickOnSubmitButton();


//Change Oulet name
            home_page.clickOnFrameOfOutletName();

            home_page.clickOnOutletAugsburg();

            home_page.clickOnChangeOutletButton();

          //  fleet_page.clickOnDataProtectionBanner();
          //  fleet_page.clickOnCookieBanner();
            fleet_page.closeCookies();

            fleet_page.clickOnInboxIcon();
            fleet_page.clickOnInboxIcon();
            auftrag_management_page.alleKachelAnzeige();
            Thread.sleep(2000);
            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.gutenTag();

            screenshot.madeScreenshot(UIConstants.XP_START_PAGE, sprache[i]);


            home_page.clickOnCockPit();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            fleet_page.clickOnVehicleList();
            serviceManagement_2_page.waitForSpinnerNotAppears();

            fleet_page.clickOnInboxIcon();
            fleet_page.clickOnInboxIcon();
            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceTheVehicleList();


            screenshot.madeScreenshot(UIConstants.PKW_COCKPIT_FAHRZEUG_LIST, sprache[i]);


            //Smart obboarding
            fleet_page.clickOnIButton();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PkW_SMART_ONBOARDING, sprache[i]);
            fleet_page.closeSmartOnboardingDialog();

            fleet_page.clickOnFilterButton();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PKW_FILTERMENÜ, sprache[i]);

            serviceManagement_2_page.clickOnRefreshButtonOnTheVehicleList();
            serviceManagement_2_page.waitForSpinnerNotAppears();

            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_OFFER_SENT);
            Thread.sleep(2000);
            serviceManagement_2_page.replaceTheVehicleList();
            serviceManagement_2_page.replaceServiceNameOnLeadDetails();
            screenshot.madeScreenshot(UIConstants.PKW_COCKPIT_BUENDELUNG, sprache[i]);

            fleet_page.clickOnLupeForLeadDetail();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.PKW_COCKPIT_ANFRAGE_DETAILS, sprache[i]);
            fleet_page.closeDialogLeadDetails();


            fleet_page.clickOnMoreInfoButton();
            Thread.sleep(2000);

            screenshot.madeScreenshot(UIConstants.PKW_ZUSATZINFORMATION, sprache[i]);

            fleet_page.clickOnCustomerInfo();
            Thread.sleep(2000);
            serviceManagement_2_page.replaceKundenInfoInVehicle();
            screenshot.madeScreenshot(UIConstants.PKW_COCKPIT_KUNDENINFO, sprache[i]);
            fleet_page.closeDialogOfCustomerInfo();

            fleet_page.clickOnMoreInfoButton();
            fleet_page.clickOnTeleData();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            serviceManagement_2_page.waitForTelematikToDisplayedInCockpit();
            Thread.sleep(2000);
            serviceManagement_2_page.replaceTextOnTele();

            screenshot.madeScreenshot(UIConstants.PKW_COCKPIT_TD_GRUNDDATEN, sprache[i]);

            fleet_page.closeDialogOfTeleData();


            fleet_page.clickOnMoreInfoButton();
            fleet_page.clickOnVehicleData();
            Thread.sleep(2000);
            serviceManagement_2_page.replaceFinOnVehicleDetail();
            screenshot.madeScreenshot(UIConstants.PKW_COCKPIT_FAHRZEUGDETAILS, sprache[i]);
            fleet_page.closeDialogOfVehicleData();


            serviceManagement_2_page.clickOnRefreshButtonOnTheVehicleList();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            //////////////////////////
            fleet_page.clickOnTheFin(UIConstants.TEST_FIN);
            fleet_page.clickOnOfferButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            serviceManagement_2_page.closeErrorAndHinweis_1();
            serviceManagement_2_page.clickOnTextAnfrage();
            Thread.sleep(1000);

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceFinOnOfferDetail(UIConstants.TEST_FIN);

            screenshot.madeScreenshot(UIConstants.PKW_OFFER_MAßNAMHEN_SELEKTIEREN, sprache[i]);

            serviceManagement_2_page.clickOnSideNavigation();
            serviceManagement_2_page.closeTheOffer();
            serviceManagement_2_page.waitForSpinnerNotAppears();

            //////////
            fleet_page.clickOnTheFin("WDD2130421A466830");
            fleet_page.clickOnOfferButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            serviceManagement_2_page.closeErrorAndHinweis();
            Thread.sleep(1000);

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceFinOnOfferDetail("WDD2130421A466830");

            serviceManagement_2_page.clickOnTelematikData();
            Thread.sleep(20000);
           // serviceManagement_2_page.clickOnNotificationDetailsInTelematikData();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PkW_NOTIFICATION,sprache[i]);
            serviceManagement_2_page.closeTelematikData();

            serviceManagement_2_page.clickOnSideNavigation();
            serviceManagement_2_page.closeTheOffer();
            serviceManagement_2_page.waitForSpinnerNotAppears();



            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_OFFER_SENT);
            fleet_page.clickOnOfferButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            serviceManagement_2_page.closeHinweis();
            Thread.sleep(1000);

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceFinOnOfferDetail(UIConstants.TEST_FIN_OFFER_SENT);

            screenshot.madeScreenshot(UIConstants.PKW_OFFER_WIEDEREROEFFNUNG, sprache[i]);

            serviceManagement_2_page.clickOnSideNavigation();
            serviceManagement_2_page.closeTheOffer();
            serviceManagement_2_page.waitForSpinnerNotAppears();


            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_OFFER_CREATED);
            fleet_page.clickOnOfferButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            serviceManagement_2_page.closeErrorAndHinweis_1();
            Thread.sleep(1000);

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceFinOnOfferDetail(UIConstants.TEST_FIN_OFFER_CREATED);

            serviceManagement_2_page.clickOnCustomerData();
            Thread.sleep(1000);
            serviceManagement_2_page.replaceKundendatenInOffer();
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_KUNDENINFO, sprache[i]);
            serviceManagement_2_page.closeOfferCustomerInfo();


            serviceManagement_2_page.clickOnVerhicleData();
            Thread.sleep(1000);
            serviceManagement_2_page.replaceFahrzeugdatenInOffer();
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_FAHRZEUGDATEN, sprache[i]);
            serviceManagement_2_page.clickOnTabVehicleHistoryOfVehicleData();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PkW_FAHRZEUGDATEN_LEBENSLAUF, sprache[i]);
            serviceManagement_2_page.clickOnTabOverviewOfVehicleData();
            Thread.sleep(2000);
            serviceManagement_2_page.closeErrorAndHinweis_1();
            serviceManagement_2_page.clickOnServiceContractNumber();
            Thread.sleep(5000);
            serviceManagement_2_page.closeErrorAndHinweis_1();
            serviceManagement_2_page.replaceOnVetragdetail();
            screenshot.madeScreenshot(UIConstants.PKW_SERVICE_VERTRAGSDETAILS, sprache[i]);
            serviceManagement_2_page.closeOfferVehicleInfo();

            serviceManagement_2_page.clickOnTelematikData();
            Thread.sleep(2000);
            serviceManagement_2_page.replaceOnTelematikdataOnOffer();
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_TELEMATIK, sprache[i]);

            serviceManagement_2_page.clickOnXentryAppointment();
            serviceManagement_2_page.waitForSpinnerNotAppearsOnAppointment();
            serviceManagement_2_page.clickOnPlusButtonForNewAppointment();
            serviceManagement_2_page.waitForSpinnerNotAppearsOnAppointment();
            Thread.sleep(20000);
            screenshot.madeScreenshot(UIConstants.PKW_XAA_TERMINVEREINBARUNG, sprache[i]);
            serviceManagement_2_page.closeXentryAppointment();

            serviceManagement_2_page.clickOnCommunication();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            serviceManagement_2_page.closeFeatureGuideOnCommunication();
            Thread.sleep(1000);
            serviceManagement_2_page.closeEmailDialogOnComminication();
            Thread.sleep(1000);
            serviceManagement_2_page.replaceEmailListOnCommunication();
            Thread.sleep(1000);
            serviceManagement_2_page.neueEmailErfassen();
            Thread.sleep(1000);



            serviceManagement_2_page.replaceOnCommunication();
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_KOMMUNIKATION, sprache[i]);
            serviceManagement_2_page.closeCommunication();

            serviceManagement_2_page.clickOnThreePointMenu();
            serviceManagement_2_page.clickOnSettingInOffer();
//            serviceManagement_2_page.closeError();
            Thread.sleep(1000);
            serviceManagement_2_page.clickOnSettingBenutzereinstellungen();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PkW_SETTING_BENUTZER_EINSTELLUNGEN, sprache[i]);
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
            serviceManagement_2_page.closeTheOffer();
            serviceManagement_2_page.waitForSpinnerNotAppears();

            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_OFFER_IN_PROGRESS);
            fleet_page.clickOnOfferButton();

            serviceManagement_2_page.waitForSpinnerNotAppears();
            serviceManagement_2_page.closeErrorAndHinweis_1();
            Thread.sleep(1000);

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceFinOnOfferDetail(UIConstants.TEST_FIN_OFFER_IN_PROGRESS);

            serviceManagement_2_page.clickOnAMaintenance();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_MASSNAHMENDETAILS, sprache[i]);

            serviceManagement_2_page.clickOnTheTabPackage();
            Thread.sleep(1000);

            serviceManagement_2_page.addPackage();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            serviceManagement_2_page.closeErrorPackage();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_PACKAGE_ADD, sprache[i]);
            serviceManagement_2_page.closeAddPackageDialog();

            serviceManagement_2_page.addManualOperation();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_MANUELLE, sprache[i]);
            serviceManagement_2_page.closeAddManualOperationDialog();

            serviceManagement_2_page.packageUnfold();
            Thread.sleep(2000);

            serviceManagement_2_page.moveTheCosorToTabPackage();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_PAKETE, sprache[i]);




//            serviceManagement_2_page.clickOnEditButtonForPackage();
//            Thread.sleep(2000);
            serviceManagement_2_page.clickOnTextMaintanceManagement();
            Thread.sleep(1000);
            screenshot.madeScreenshot(UIConstants.PKW_PAKETE_BEARBEITEN, sprache[i]);
            serviceManagement_2_page.changeThePriceOfPackage();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PkW_OFFER_PAKETE_PREIS_AUSWAHL, sprache[i]);
            serviceManagement_2_page.closeChangePriceDialog();
            serviceManagement_2_page.closeEditPackageDialog();

            serviceManagement_2_page.clickOnSummary();
            serviceManagement_2_page.clickOnVerwerfenButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            serviceManagement_2_page.replaceFinOnOfferDetailOfSummaryForEditing(UIConstants.TEST_FIN_OFFER_IN_PROGRESS);
            serviceManagement_2_page.replaceSummaryPage();

            screenshot.madeScreenshot(UIConstants.PKW_OFFER_SUMMARY, sprache[i]);
            serviceManagement_2_page.clickOnStornoButton();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_STORNO, sprache[i]);
            serviceManagement_2_page.closeStornoDialog();

            serviceManagement_2_page.clickOnSideNavigation();
            serviceManagement_2_page.closeTheOffer();
//            serviceManagement_2_page.clickOnDiscardDialog();
            serviceManagement_2_page.waitForSpinnerNotAppears();

            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_OFFER_SENT_2);
            fleet_page.clickOnOfferButton();

            serviceManagement_2_page.waitForSpinnerNotAppears();
            serviceManagement_2_page.closeErrorAndHinweis_1();

            serviceManagement_2_page.clickOnSummary();
            serviceManagement_2_page.waitForSpinnerNotAppears();

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceFinOnOfferDetailOfSummaryForSent(UIConstants.TEST_FIN_OFFER_SENT_2);
            serviceManagement_2_page.replaceKundengespaechPage();


            screenshot.madeScreenshot(UIConstants.PKW_OFFER_KUNDENGESPRAECH, sprache[i]);

            serviceManagement_2_page.clickOnScheduleAppointmentButton();
            serviceManagement_2_page.waitForSpinnerNotAppearsOnAppointment();
            Thread.sleep(20000);


            screenshot.madeScreenshot(UIConstants.PkW_OFFER_TERMINLISTE, sprache[i]);

            serviceManagement_2_page.clickOnATerminOnTheList();
            serviceManagement_2_page.waitForSpinnerNotAppearsOnAppointment();
            Thread.sleep(20000);
            screenshot.madeScreenshot(UIConstants.PkW__OFFER_TERMIN_HINZUFUEGEN, sprache[i]);
            serviceManagement_2_page.closeTerminVereinbarenDialog();



            serviceManagement_2_page.clickOnPlusButtonForNewAppointment();
            serviceManagement_2_page.waitForSpinnerNotAppearsOnAppointment();
            serviceManagement_2_page.enterDeliveryDate();
            serviceManagement_2_page.enterPickUpDate();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_KUNDENGESPRAECH_ANGENOMMEN, sprache[i]);
            serviceManagement_2_page.closeXentryAppointment();

            serviceManagement_2_page.clickOnRejectButton();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.PKW_OFFER_KUNDENGESPRAECH_ABLEHNEN,sprache[i]);
            serviceManagement_2_page.closeAblehnungDialog();


            serviceManagement_2_page.clickOnSideNavigation();
            serviceManagement_2_page.closeTheOffer();
            serviceManagement_2_page.waitForSpinnerNotAppears();


            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_TERMIN_VEREINBAREN);
            fleet_page.clickOnOfferButton();

            serviceManagement_2_page.waitForSpinnerNotAppears();
            serviceManagement_2_page.closeErrorAndHinweis_1();

            serviceManagement_2_page.clickOnSummary();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceFinOnOfferDetailOfSummaryForSent(UIConstants.TEST_FIN_TERMIN_VEREINBAREN);
            serviceManagement_2_page.replaceKundengespaechPage();


            screenshot.madeScreenshot(UIConstants.PkW_OFFER_TERMIN_VEREINBAREN, sprache[i]);
            Thread.sleep(1000);

            driver.get("https://xentry-int2.daimler.com/offer/archive/?sort=modificationDate,desc&page=0");
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceArchivList();


            screenshot.madeScreenshot(UIConstants.PkW_ANGEBOT_ARCHIV, sprache[i]);

            serviceManagement_2_page.clickOnArchivDetail();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);


            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceOnArchivDetail();

            screenshot.madeScreenshot(UIConstants.PkW_ANGEBOT_ARCHIV_DETAILS, sprache[i]);
            driver.quit();
        }
    }


}
