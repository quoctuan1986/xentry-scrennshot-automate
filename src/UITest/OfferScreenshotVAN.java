package UITest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

import java.util.concurrent.TimeUnit;


public class OfferScreenshotVAN {
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

        for(int i=0;i<12; i++) {
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
            serviceManagement_2_page.waitForSpinnerNotAppears();

            driver.get(UIConstants.URL_XENTRY);

            logIn_page.clickOnsignInButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();

            logIn_page.enterUserName(UIConstants.USER_NAME);
            logIn_page.clickOnNextButton();

            logIn_page.enterPassWord(UIConstants.PASWORD);
            logIn_page.clickOnSubmitButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);


//Change Oulet name
            home_page.clickOnFrameOfOutletName();

            home_page.clickOnOutletNuerberg();

            home_page.clickOnChangeOutletButton();

            fleet_page.clickOnDataProtectionBanner();
            fleet_page.clickOnCookieBanner();
            fleet_page.closeCookies();

            fleet_page.clickOnInboxIcon();
            fleet_page.clickOnInboxIcon();

            auftrag_management_page.alleKachelAnzeige();
            Thread.sleep(2000);

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.gutenTag();


            screenshot.madeScreenshot(UIConstants.VAN_XP_START_PAGE, sprache[i]);
            Thread.sleep(2000);


            home_page.clickOnCockPit();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            fleet_page.clickOnVehicleList();
            serviceManagement_2_page.waitForSpinnerNotAppears();


            fleet_page.clickOnInboxIcon();
            fleet_page.clickOnInboxIcon();
            Thread.sleep(2000);


            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceTheVehicleListVAN();

            screenshot.madeScreenshot(UIConstants.VAN_COCKPIT_FAHRZEUG_LIST, sprache[i]);

            //Smart obboarding
            fleet_page.clickOnIButton();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.VAN_SMART_ONBOARDING, sprache[i]);
            fleet_page.closeSmartOnboardingDialog();


            fleet_page.clickOnFilterButton();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.VAN_FILTERMENU, sprache[i]);

            serviceManagement_2_page.clickOnRefreshButtonOnTheVehicleList();
            serviceManagement_2_page.waitForSpinnerNotAppears();

            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_OFFER_SENT_VAN);
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            serviceManagement_2_page.replaceTheVehicleListVAN();
            serviceManagement_2_page.replaceServiceNameOnLeadDetails();

            screenshot.madeScreenshot(UIConstants.VAN_COCKPIT_BUENDELUNG, sprache[i]);

            fleet_page.clickOnLupeForLeadDetail();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.VAN_COCKPIT_ANFRAGE_DETAILS, sprache[i]);
            fleet_page.closeDialogLeadDetails();


            fleet_page.clickOnMoreInfoButton();
            Thread.sleep(2000);

            screenshot.madeScreenshot(UIConstants.VAN_ZUSATZINFORMATION, sprache[i]);

            fleet_page.clickOnCustomerInfo();


            serviceManagement_2_page.replaceKundenInfoInVehicle();


            screenshot.madeScreenshot(UIConstants.VAN_COCKPIT_KUNDENINFO, sprache[i]);
            fleet_page.closeDialogOfCustomerInfo();

          //  fleet_page.clickOnMoreInfoButton();
          //  Thread.sleep(2000);
          //  fleet_page.clickOnTeleData();
          //  Thread.sleep(10000);

          //  screenshot.madeScreenshot(UIConstants.VAN_COCKPIT_TD_GRUNDDATEN, sprache[i]);
          //  Thread.sleep(2000);
          //  fleet_page.closeDialogOfTeleData();
          //  Thread.sleep(3000);


            fleet_page.clickOnMoreInfoButton();
            fleet_page.clickOnVehicleData();

            serviceManagement_2_page.replaceFinOnVehicleDetail();


            screenshot.madeScreenshot(UIConstants.VAN_COCKPIT_FAHRZEUGDETAILS, sprache[i]);
            fleet_page.closeDialogOfVehicleData();


            serviceManagement_2_page.clickOnRefreshButtonOnTheVehicleList();
            serviceManagement_2_page.waitForSpinnerNotAppears();

            //////////////////////////
            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_VAN);
            serviceManagement_2_page.waitForSpinnerNotAppears();
            fleet_page.clickOnOfferButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            serviceManagement_2_page.closeErrorAndHinweis_1();
            serviceManagement_2_page.clickOnTextAnfrage();
            Thread.sleep(1000);

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceFinOnOfferDetailVAN(UIConstants.TEST_FIN_VAN);

            screenshot.madeScreenshot(UIConstants.VAN_OFFER_MAßNAMHEN_SELEKTIEREN, sprache[i]);


            //////////
            serviceManagement_2_page.clickOnTelematikData();
            Thread.sleep(5000);

            screenshot.madeScreenshot(UIConstants.VAN_NOTIFICATION,sprache[i]);
            serviceManagement_2_page.closeTelematikData();


            serviceManagement_2_page.clickOnSideNavigation();
            serviceManagement_2_page.closeTheOffer();
            serviceManagement_2_page.waitForSpinnerNotAppears();



            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_OFFER_SENT_VAN);
            serviceManagement_2_page.waitForSpinnerNotAppears();
            fleet_page.clickOnOfferButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            serviceManagement_2_page.closeError();
            Thread.sleep(2000);

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceFinOnOfferDetailVAN(UIConstants.TEST_FIN_OFFER_SENT_VAN);

            screenshot.madeScreenshot(UIConstants.VAN_OFFER_WIEDEREROEFFNUNG, sprache[i]);


            serviceManagement_2_page.clickOnSideNavigation();
            serviceManagement_2_page.closeTheOffer();
            serviceManagement_2_page.waitForSpinnerNotAppears();


            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_OFFER_CREATED_2_VAN);
            serviceManagement_2_page.waitForSpinnerNotAppears();
            fleet_page.clickOnOfferButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            serviceManagement_2_page.closeErrorAndHinweis_1();


            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceFinOnOfferDetailVAN(UIConstants.TEST_FIN_OFFER_CREATED_2_VAN);

            serviceManagement_2_page.clickOnCustomerData();
            Thread.sleep(2000);

            serviceManagement_2_page.replaceKundendatenInOffer();


            screenshot.madeScreenshot(UIConstants.VAN_OFFER_KUNDENINFO, sprache[i]);
            serviceManagement_2_page.closeOfferCustomerInfo();


            serviceManagement_2_page.clickOnVerhicleData();
            Thread.sleep(2000);
            serviceManagement_2_page.closeErrorAndHinweis_1();

            serviceManagement_2_page.replaceFahrzeugdatenInOfferVAN();


            screenshot.madeScreenshot(UIConstants.VAN_OFFER_FAHRZEUGDATEN, sprache[i]);
            serviceManagement_2_page.clickOnTabVehicleHistoryOfVehicleData();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.VAN_FAHRZEUGDATEN_LEBENSLAUF, sprache[i]);
            serviceManagement_2_page.clickOnTabOverviewOfVehicleData();
            serviceManagement_2_page.closeErrorAndHinweis();
            serviceManagement_2_page.clickOnServiceContractNumber();
            Thread.sleep(5000);

            serviceManagement_2_page.replaceOnVetragdetailVAN();


            screenshot.madeScreenshot(UIConstants.VAN_SERVICE_VERTRAGSDETAILS, sprache[i]);
            serviceManagement_2_page.closeOfferVehicleInfo();

           // serviceManagement_2_page.clickOnTelematikData();
           // serviceManagement_2_page.waitForSpinnerNotAppears();
           // Thread.sleep(10000);
           // screenshot.madeScreenshot(UIConstants.VAN_OFFER_TELEMATIK, sprache[i]);
           // Thread.sleep(2000);


            serviceManagement_2_page.clickOnXentryAppointment();
            serviceManagement_2_page.waitForSpinnerNotAppearsOnAppointment();
            serviceManagement_2_page.clickOnPlusButtonForNewAppointment();
            serviceManagement_2_page.waitForSpinnerNotAppearsOnAppointment();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.VAN_XAA_TERMINVEREINBARUNG, sprache[i]);
            serviceManagement_2_page.closeXentryAppointment();

            serviceManagement_2_page.clickOnCommunication();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            serviceManagement_2_page.closeErrorAndHinweis_1();
            serviceManagement_2_page.closeFeatureGuideOnCommunication();
            serviceManagement_2_page.closeEmailDialogOnComminication();
            serviceManagement_2_page.replaceEmailListOnCommunication();

            serviceManagement_2_page.neueEmailErfassen();
            Thread.sleep(2000);

            serviceManagement_2_page.replaceOnCommunicationVAN();


            screenshot.madeScreenshot(UIConstants.VAN_OFFER_KOMMUNIKATION, sprache[i]);
            serviceManagement_2_page.closeCommunication();

            serviceManagement_2_page.clickOnThreePointMenu();
            serviceManagement_2_page.clickOnSettingInOffer();
            serviceManagement_2_page.closeError();
            Thread.sleep(2000);
            serviceManagement_2_page.clickOnSettingBenutzereinstellungen();
            screenshot.madeScreenshot(UIConstants.VAN_SETTING_BENUTZER_EINSTELLUNGEN, sprache[i]);
            serviceManagement_2_page.clickOnSettingBetriebTab();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.VAN_SETTING_OUTLET, sprache[i]);
            serviceManagement_2_page.clickOnSettingMarketTab();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.VAN_SETTING_MARKET, sprache[i]);
            serviceManagement_2_page.clickOnSettingGlobalTab();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.VAN_SETTING_GLOBAL, sprache[i]);
            serviceManagement_2_page.closeSettingDialogInOffer();


            serviceManagement_2_page.clickOnSideNavigation();
            serviceManagement_2_page.closeTheOffer();
            serviceManagement_2_page.waitForSpinnerNotAppears();

            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_OFFER_IN_PROGRESS_VAN);
            serviceManagement_2_page.waitForSpinnerNotAppears();
            fleet_page.clickOnOfferButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            ServiceManagement_2_Page.closeErrorAndHinweis();

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceFinOnOfferDetailVAN(UIConstants.TEST_FIN_OFFER_IN_PROGRESS_VAN);


            serviceManagement_2_page.clickOnAMaintenance();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.VAN_OFFER_MASSNAHMENDETAILS, sprache[i]);

            serviceManagement_2_page.clickOnTheTabPackage();
            serviceManagement_2_page.packageUnfold();
            serviceManagement_2_page.moveTheCosorToTabPackage();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.VAN_OFFER_PAKETE, sprache[i]);

            serviceManagement_2_page.addPackage();
            serviceManagement_2_page.waitForSpinnerNotAppears();
         //   serviceManagement_2_page.closeErrorAndHinweis_1();
            serviceManagement_2_page.closeErrorPackage();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.VAN_OFFER_PACKAGE_ADD, sprache[i]);
            serviceManagement_2_page.closeAddPackageDialog();

            serviceManagement_2_page.addManualOperation();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.VAN_OFFER_MANUELLE, sprache[i]);
            serviceManagement_2_page.closeAddManualOperationDialog();


//            serviceManagement_2_page.clickOnEditButtonForPackage();
//            Thread.sleep(2000);
            serviceManagement_2_page.clickOnTextMaintanceManagement();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.VAN_PAKETE_BEARBEITEN, sprache[i]);
            serviceManagement_2_page.changeThePriceOfPackageVAN();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.VAN_OFFER_PAKETE_PREIS_AUSWAHL, sprache[i]);
            serviceManagement_2_page.closeChangePriceDialog();
            serviceManagement_2_page.closeEditPackageDialogVAN();


            serviceManagement_2_page.clickOnSummary();
            serviceManagement_2_page.clickOnVerwerfenButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);


            serviceManagement_2_page.replaceFinOnOfferDetailOfSummaryForEditingVAN(UIConstants.TEST_FIN_OFFER_IN_PROGRESS_VAN);
            serviceManagement_2_page.replaceSummaryPage();

            screenshot.madeScreenshot(UIConstants.VAN_OFFER_SUMMARY, sprache[i]);
            serviceManagement_2_page.clickOnStornoButton();
            Thread.sleep(5000);
            serviceManagement_2_page.closeErrorAndHinweis_1();
            screenshot.madeScreenshot(UIConstants.VAN_OFFER_STORNO, sprache[i]);
            serviceManagement_2_page.closeStornoDialog();

            serviceManagement_2_page.clickOnSideNavigation();
            serviceManagement_2_page.closeTheOffer();
            serviceManagement_2_page.waitForSpinnerNotAppears();
//            serviceManagement_2_page.clickOnDiscardDialog();

            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_OFFER_CREATED_2_VAN);
            fleet_page.clickOnOfferButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            serviceManagement_2_page.closeErrorAndHinweis_1();

            serviceManagement_2_page.clickOnSummary();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            serviceManagement_2_page.closeErrorAndHinweis_1();
            Thread.sleep(1000);

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceFinOnOfferDetailOfSummaryForSentVAN(UIConstants.TEST_FIN_OFFER_CREATED_2_VAN);
            serviceManagement_2_page.replaceKundengespaechPage();

            screenshot.madeScreenshot(UIConstants.VAN_OFFER_KUNDENGESPRAECH, sprache[i]);

            serviceManagement_2_page.clickOnScheduleAppointmentButton();
            serviceManagement_2_page.waitForSpinnerNotAppearsOnAppointment();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.VAN_OFFER_TERMINLISTE, sprache[i]);


            serviceManagement_2_page.clickOnATerminOnTheList();
            serviceManagement_2_page.waitForSpinnerNotAppearsOnAppointment();
            Thread.sleep(20000);
            screenshot.madeScreenshot(UIConstants.VAN_OFFER_TERMIN_HINZUFUEGEN, sprache[i]);
            serviceManagement_2_page.closeTerminVereinbarenDialog();
            Thread.sleep(2000);

            serviceManagement_2_page.clickOnPlusButtonForNewAppointment();
            serviceManagement_2_page.waitForSpinnerNotAppearsOnAppointment();
            serviceManagement_2_page.enterDeliveryDate();
            serviceManagement_2_page.enterPickUpDate();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.VAN_OFFER_KUNDENGESPRAECH_ANGENOMMEN, sprache[i]);
            serviceManagement_2_page.closeXentryAppointment();

            serviceManagement_2_page.clickOnRejectButton();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.VAN_OFFER_KUNDENGESPRAECH_ABLEHNEN,sprache[i]);


            serviceManagement_2_page.closeAblehnungDialog();


            serviceManagement_2_page.clickOnSideNavigation();
            serviceManagement_2_page.closeTheOffer();
            serviceManagement_2_page.waitForSpinnerNotAppears();

            fleet_page.clickOnTheFin(UIConstants.TEST_FIN_TERMIN_VEREINBAREN_VAN);
            serviceManagement_2_page.waitForSpinnerNotAppears();
            fleet_page.clickOnOfferButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            serviceManagement_2_page.closeErrorAndHinweis();


            serviceManagement_2_page.clickOnSummary();
            serviceManagement_2_page.waitForSpinnerNotAppears();

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceFinOnOfferDetailOfSummaryForSentVAN(UIConstants.TEST_FIN_TERMIN_VEREINBAREN_VAN);
            serviceManagement_2_page.replaceKundengespaechPage();

            screenshot.madeScreenshot(UIConstants.VAN_OFFER_TERMIN_VEREINBAREN, sprache[i]);

            serviceManagement_2_page.clickOnSideNavigation();
            serviceManagement_2_page.closeTheOffer();
            serviceManagement_2_page.waitForSpinnerNotAppears();


            //Change Oulet name
            home_page.clickOnFrameOfOutletName();

            home_page.clickOnOutletReutlingen();

            home_page.clickOnChangeOutletButton();
            serviceManagement_2_page.waitForSpinnerNotAppears();


            fleet_page.clickOnFleetList();
            Thread.sleep(5000);
            serviceManagement_2_page.replaceFleetList();


            screenshot.madeScreenshot(UIConstants.VAN_COCKPIT_FLEET_LIST, sprache[i]);


            fleet_page.clickOnVehicleList();
            serviceManagement_2_page.waitForSpinnerNotAppears();

            fleet_page.clickOnTheFin("WDB9072331N000918");

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceTheVehicleListVAN();

            fleet_page.clickOnMoreInfoButton();
            Thread.sleep(2000);

            fleet_page.clickOnFahrzeugmeldungenForTruck();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(1000);

            screenshot.madeScreenshot(UIConstants.VAN_COCKPIT_FAHRZEUGMELDUNGEN, sprache[i]);
            fleet_page.closeDialogFahrzeugmeldungen();
            Thread.sleep(2000);

            ///
            fleet_page.clickOnMoreInfoButton();
            Thread.sleep(2000);
            fleet_page.clickOnTeleData_Pro();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(5000);
            serviceManagement_2_page.replaceTextOnTeleVAN();


            screenshot.madeScreenshot(UIConstants.VAN_COCKPIT_TD_GRUNDDATEN, sprache[i]);
            Thread.sleep(2000);
            fleet_page.closeDialogOfTeleData();

            //Change Oulet name
            home_page.clickOnFrameOfOutletName();

            home_page.clickOnOutletNuerberg();

            home_page.clickOnChangeOutletButton();
            Thread.sleep(5000);



            driver.get("https://xentry-int2.daimler.com/offer/archive/?sort=modificationDate,desc&page=1");
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(4000);


            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceArchivListVAN();

            screenshot.madeScreenshot(UIConstants.VAN_ANGEBOT_ARCHIV, sprache[i]);

            driver.navigate().refresh();


            serviceManagement_2_page.clickOnArchivDetailForVan();
            serviceManagement_2_page.waitForSpinnerNotAppears();
            Thread.sleep(4000);

            serviceManagement_2_page.titleReplace();
            serviceManagement_2_page.replaceOnArchivDetailVAN();

            screenshot.madeScreenshot(UIConstants.VAN_ANGEBOT_ARCHIV_DETAILS, sprache[i]);


            driver.quit();
        }
    }


}
