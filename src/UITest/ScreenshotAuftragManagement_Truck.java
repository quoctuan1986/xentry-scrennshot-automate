package UITest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

import java.util.UnknownFormatConversionException;
import java.util.concurrent.TimeUnit;


public class ScreenshotAuftragManagement_Truck {
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
            Checklisten_Editor_Page checklisten_editor_page = PageFactory.initElements(driver, Checklisten_Editor_Page.class);

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
            Thread.sleep(5000);

            fleet_page.clickOnDataProtectionBanner();
            fleet_page.clickOnCookieBanner();
            serviceManagement_2_page.closeCookies();
            Thread.sleep(5000);

            fleet_page.clickOnInboxIcon();
            fleet_page.clickOnInboxIcon();
            Thread.sleep(2000);
            auftrag_management_page.alleKachelAnzeige();
            Thread.sleep(2000);

            auftrag_management_page.titleReplace();
            auftrag_management_page.gutenTag();

            screenshot.madeScreenshot(UIConstants.TC_XENTRY_ORDER, sprache[i]);
            Thread.sleep(2000);


            auftrag_management_page.clickOnXentryOrder();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
//            auftrag_management_page.clickOnTextJobsInTheJobsListe();
            Thread.sleep(2000);

            auftrag_management_page.titleReplace();
            auftrag_management_page.replaceVorgangList();


            screenshot.madeScreenshot(UIConstants.TC_VORGANG_LIST, sprache[i]);
            Thread.sleep(2000);

            driver.navigate().refresh();
            kundendialog_page.waitForLoadingScreen();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(4000);


            auftrag_management_page.searchWithText("Auftrag");
            Thread.sleep(5000);
            if (sprache[i].equals("(de)")){
                auftrag_management_page.clickOnTheOperation(UIConstants.KENNZEICHEN);
            }
            else{
                auftrag_management_page.clickOnTheOperation(UIConstants.KENNZEICHEN_EN);
            }
            auftrag_management_page.waitForSpinnerNotAppears();

            auftrag_management_page.titleReplace();
            auftrag_management_page.replaceVorgangList();
            if (sprache[i].equals("(de)")){
                auftrag_management_page.replaceVorgangOverlay();
            }
            else{
                auftrag_management_page.replaceVorgangOverlay();
            }

            screenshot.madeScreenshot(UIConstants.TC_VORGANG_LIST_OVERLAY,sprache[i]);
            auftrag_management_page.closeOperationInTheList();
            Thread.sleep(2000);
            if (sprache[i].equals("(de)")){
               // auftrag_management_page.clickOnTheOperation(UIConstants.KENNZEICHEN_2);
                driver.get("https://xentry-int2.daimler.com/order/service-reception/1323628");
            }
            else{
               // auftrag_management_page.clickOnTheOperation(UIConstants.KENNZEICHEN_EN_2);
                driver.get("https://xentry-int2.daimler.com/order/service-reception/1313714");
            }
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(10000);
            auftrag_management_page.closeErrorAndHinweis_2();
            Thread.sleep(1000);
            auftrag_management_page.clickOnTextAuftragmanagement();
            Thread.sleep(1000);


            auftrag_management_page.titleReplace();
            if (sprache[i].equals("(de)")){
                auftrag_management_page.replaceVorgangDetails();
            }
            else{
                auftrag_management_page.replaceVorgangDetails();
            }

            auftrag_management_page.clickOnTextAuftragmanagement();
            screenshot.madeScreenshot(UIConstants.TC_VORGANG_OPEN, sprache[i]);

            auftrag_management_page.clickOnThreePointMenu();
            Thread.sleep(2000);
            auftrag_management_page.clickOnSetting();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.TC_EINSTELLUNG_ANWENDER, sprache[i]);
            auftrag_management_page.clickOnBetriebSetting();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.TC_EINSTELLUNG_BETRIEB, sprache[i]);
            auftrag_management_page.clickOnMarktSetting();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.TC_EINSTELLUNG_MARKT, sprache[i]);
            auftrag_management_page.clickOnAnreichungSetting();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.TC_EINSTELLUNG_ANREICHUNG, sprache[i]);
            auftrag_management_page.clickOnAnreichungAnwenderSetting();
            Thread.sleep(5000);
            auftrag_management_page.selectTheShortTestZuordnung();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.TC_EINSTELLUNG_ANREICHUNG_ANWENDER, sprache[i]);
            auftrag_management_page.closeSetting();
            Thread.sleep(5000);

            auftrag_management_page.clickOnCustomerData();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            auftrag_management_page.repalceTheServiceBeraterInVorgangDetail();

            auftrag_management_page.clickOnTextKundendaten();
            Thread.sleep(1000);
            auftrag_management_page.replaceImKundendatenDialog();



            auftrag_management_page.zoomIn();
            Thread.sleep(1000);
            screenshot.madeScreenshot(UIConstants.TC_KUNDENDATEN, sprache[i]);
            auftrag_management_page.zoomRelease();
            Thread.sleep(1000);
            auftrag_management_page.clickOnEditButtonForCustomerData();
            Thread.sleep(2000);
            auftrag_management_page.repalceTheServiceBeraterInVorgangDetail();


            auftrag_management_page.replaceImKundendatenDialogInEdit();
            Thread.sleep(1000);
            auftrag_management_page.clickOnTextKundendaten();
            Thread.sleep(1000);
            auftrag_management_page.zoomIn();
            Thread.sleep(1000);
            screenshot.madeScreenshot(UIConstants.TC_KUNDENDATEN_EDIT, sprache[i]);
            auftrag_management_page.zoomRelease();
            Thread.sleep(1000);


            auftrag_management_page.clickOnButtonSpeichernOnKundendatenReiter();
            Thread.sleep(1000);
            auftrag_management_page.repalceTheServiceBeraterInVorgangDetail();
            auftrag_management_page.suchenInKundendaten();
            Thread.sleep(3000);
            auftrag_management_page.replaceInDatenAuswahl();
            screenshot.madeScreenshot(UIConstants.TC_KUNDENDATEN_CCDB_SEARCH, sprache[i]);

            auftrag_management_page.clickOnTabelleEintrag();
            Thread.sleep(1000);
            auftrag_management_page.clickOnButtonImportInKundendatenReiter();
            Thread.sleep(3000);
            auftrag_management_page.replaceImKundenDailogMerge();
            screenshot.madeScreenshot(UIConstants.TC_KUNDENDATEN_CCDB_MERGE, sprache[i]);

            auftrag_management_page.clickOnButtonAkzeptierenImKundendatendialog();
            Thread.sleep(5000);
            auftrag_management_page.repalceTheServiceBeraterInVorgangDetail();
            auftrag_management_page.clickOnTextKundendaten();
            auftrag_management_page.replaceImKundendatenDialog();
            screenshot.madeScreenshot(UIConstants.TC_KUNDENDATEN_CCDB_UEBERNOMMEN, sprache[i]);


       //     auftrag_management_page.closeDatenAuswahlDialog();
            Thread.sleep(3000);



            auftrag_management_page.closeCustomerDataDialog();
            Thread.sleep(2000);

            auftrag_management_page.clickOnVehicleData();
            Thread.sleep(5000);
            auftrag_management_page.clickOnTextFahrzeuginformation();
            Thread.sleep(1000);

            auftrag_management_page.replaceFahrzeugInfo();
            auftrag_management_page.repalceTheServiceBeraterInVorgangDetail();
            auftrag_management_page.clickOnTextFahrzeuginformation();


            screenshot.madeScreenshot(UIConstants.TC_VEHICLE_DATA, sprache[i]);
            auftrag_management_page.vehicleEdit();
            Thread.sleep(2000);
            auftrag_management_page.replaceFahrzeugInfoInEdit();


            auftrag_management_page.clickOnTextFahrzeuginformation();
            Thread.sleep(1000);
            screenshot.madeScreenshot(UIConstants.TC_VEHICLE_DATA_EDIT, sprache[i]);
            auftrag_management_page.clickOnServiceVertrafNumber();
            Thread.sleep(5000);

            auftrag_management_page.replaceServiceVertragNummerInServiceDetail();

            screenshot.madeScreenshot(UIConstants.TC_VEHICLE_DATA_Service, sprache[i]);
            auftrag_management_page.closeServiceVertragDialog();
            Thread.sleep(2000);
            auftrag_management_page.clickOnButtonErweiterteDatacard();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.TC_VEHICLE_DATACARD, sprache[i]);
            auftrag_management_page.closeErweiterteDatacardDialog();
            Thread.sleep(2000);
            auftrag_management_page.clickOnTabHistorie();
            Thread.sleep(2000);
            auftrag_management_page.clickOnTextFahrzeuginformation();
            Thread.sleep(1000);
            screenshot.madeScreenshot(UIConstants.TC_VEHICLE_DATA_HISTORIE, sprache[i]);
            auftrag_management_page.closeVehicleDataDialog();

            auftrag_management_page.clickOnShortTestReiter();
            auftrag_management_page.waitForSpinnerNotAppears();
           // auftrag_management_page.clickOnTextKurztest();
            Thread.sleep(1000);
            auftrag_management_page.closeErrorAndHinweis_2();

            auftrag_management_page.repalceTheServiceBeraterInVorgangDetail();
            auftrag_management_page.clickOnTextKurztest();


            screenshot.madeScreenshot(UIConstants.TC_SHORT_TEST, sprache[i]);
            auftrag_management_page.clickOnAShortTest();
            auftrag_management_page.waitForSpinnerNotAppears();
            auftrag_management_page.waitForSpinnerNotAppearsInKurztesDialogAnsicht();
            Thread.sleep(10000);

            auftrag_management_page.replaceOnKurztestDetail();

            auftrag_management_page.zoomInKurzTest();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.TC_SHORT_TEST_DETAIL, sprache[i]);
            auftrag_management_page.zoomReleaseKurzTest();
            Thread.sleep(2000);
            auftrag_management_page.clickOnSteuer();
            auftrag_management_page.waitForSpinnerNotAppears();
            screenshot.madeScreenshot(UIConstants.TC_SHORT_TEST_DETAIL_STEUER, sprache[i]);

            auftrag_management_page.clickOnTabKurzTestAnalyse();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.TC_KURZ_TEST_ANALYSE, sprache[i]);


            auftrag_management_page.closeShortTestDialog();
            auftrag_management_page.closeShortTestReiter();


            auftrag_management_page.clickOnDocumentReiter();
            Thread.sleep(5000);

            if (sprache[i].equals("(de)")){
                auftrag_management_page.replaceOnDoucumentReiter();
            }
            else{
                auftrag_management_page.replaceOnDoucumentReiter_2();
            }
            auftrag_management_page.repalceTheServiceBeraterInVorgangDetail();


            auftrag_management_page.clickOnTextDokumente();
            Thread.sleep(1000);
            screenshot.madeScreenshot(UIConstants.TC_DOCUMENT, sprache[i]);
            auftrag_management_page.closeDocumentDialog();

            auftrag_management_page.clickAKundendienst();
            auftrag_management_page.waitForSpinnerNotAppears();
            auftrag_management_page.repalceTheServiceBeraterInVorgangDetail();

            auftrag_management_page.clickOnTextKundendienstmassnahme();
            Thread.sleep(1000);


            screenshot.madeScreenshot(UIConstants.TC_KUNDENANLIEGEN, sprache[i]);
            auftrag_management_page.closeKundenAnliegeDialog();


            auftrag_management_page.clickOnWartung();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            auftrag_management_page.repalceTheServiceBeraterInVorgangDetail();

            auftrag_management_page.clickOnTextWartung();
            Thread.sleep(1000);


            screenshot.madeScreenshot(UIConstants.TC_KUNDENANLIEGEN_WARTUNG, sprache[i]);
            auftrag_management_page.addPackage();
            auftrag_management_page.waitForSpinnerNotAppears();
            auftrag_management_page.unfoldPaketTruck();
            Thread.sleep(2000);
            auftrag_management_page.clickOnTextPaketauswahl();
            Thread.sleep(1000);
            //Fehlt die Pakete
            screenshot.madeScreenshot(UIConstants.TC_PAKETE, sprache[i]);
            auftrag_management_page.closeAddPackageDialog();
            Thread.sleep(5000);
            auftrag_management_page.clickOnPlusButtonForTipps();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(10000);

            auftrag_management_page.titleReplace();
            auftrag_management_page.replaceInTipsDialog();

            screenshot.madeScreenshot(UIConstants.TC_RECHERCHE, sprache[i]);

            auftrag_management_page.closeTippsDialog();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(20000);
            auftrag_management_page.closeErrorAndHinweis_2();
            Thread.sleep(2000);


            auftrag_management_page.closeWartungDialog();
            Thread.sleep(2000);

            auftrag_management_page.titleReplace();
            if (sprache[i].equals("(de)")){
                auftrag_management_page.replaceVorgangDetails();
            }
            else{
                auftrag_management_page.replaceVorgangDetails();
            }

            auftrag_management_page.clickOnBeanstandung();
            auftrag_management_page.waitForSpinnerNotAppears();

            auftrag_management_page.repalceTheServiceBeraterInVorgangDetail();


            auftrag_management_page.clickOnTextTechnischeBeanstandung();
            Thread.sleep(1000);



            screenshot.madeScreenshot(UIConstants.TC_KUNDENANLIEGEN_BEANSTANDUNG, sprache[i]);
            auftrag_management_page.closeBeanstandungsdialog();
            Thread.sleep(2000);

            kundendialog_page.closeVorgang();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            if (sprache[i].equals("(de)")){
                // auftrag_management_page.clickOnTheOperation(UIConstants.KENNZEICHEN_3);
                driver.get("https://xentry-int2.daimler.com/order/service-reception/141402367");
            }
            else{
                // auftrag_management_page.clickOnTheOperation(UIConstants.KENNZEICHEN_EN_3);
                driver.get("https://xentry-int2.daimler.com/order/service-reception/141409649");
            }

            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(10000);
            auftrag_management_page.closeErrorAndHinweis_2();

            auftrag_management_page.titleReplace();
            if (sprache[i].equals("(de)")){
                auftrag_management_page.replaceVorgangDetails();
            }
            else{
                auftrag_management_page.replaceVorgangDetails();
            }

            auftrag_management_page.clickOnWartung();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            auftrag_management_page.repalceTheServiceBeraterInVorgangDetail();


            auftrag_management_page.clickOnEditButtonOnWartung();
            Thread.sleep(2000);



            screenshot.madeScreenshot(UIConstants.TC_WARTUNG_RUDIMENTAER, sprache[i]);

            auftrag_management_page.closeWartungDialogInEdit();
            Thread.sleep(2000);

            ///////////////

            kundendialog_page.closeVorgang();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            auftrag_management_page.clickOnSideNavigation();


            //Archiv
            auftrag_management_page.clickOnArchivBar();
            auftrag_management_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis();
            Thread.sleep(2000);
            auftrag_management_page.clickOnMoreLoad();
            Thread.sleep(2000);
         //   auftrag_management_page.scrollDownThePageToArchivJobInTheVorgangListe(UIConstants.TRUCK_FIN);
            Thread.sleep(2000);
         //   auftrag_management_page.clickOnTextJobsInTheJobsListe();
            kundendialog_page.ausgeklappNavigationleiste();
            Thread.sleep(1000);

            auftrag_management_page.titleReplace();
            auftrag_management_page.replaceArchivList();

            screenshot.madeScreenshot(UIConstants.TC_ARCHIV_LIST, sprache[i]);

            driver.navigate().refresh();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(20000);
            kundendialog_page.ausgeklappNavigationleiste();
            auftrag_management_page.titleReplace();



            auftrag_management_page.searchWithText(UIConstants.TRUCK_FIN_2);
            auftrag_management_page.waitForSpinnerNotAppears();
         //   auftrag_management_page.sortiertArchivNachTermin();
         //   auftrag_management_page.waitForSpinnerNotAppears();
            auftrag_management_page.clickOnAArchivOnTheList();
            auftrag_management_page.waitForSpinnerNotAppears();

            auftrag_management_page.replaceVorgangUebersichtArchiv(UIConstants.TRUCK_FIN_2);


            screenshot.madeScreenshot(UIConstants.TC_ARCHIV_LIST_OVERLAY, sprache[i]);
            auftrag_management_page.openOperation();
            auftrag_management_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis_2();
            Thread.sleep(2000);
            auftrag_management_page.clickOnTextArchiv();
            Thread.sleep(1000);


            auftrag_management_page.titleReplace();
            auftrag_management_page.replaceInArchivDetail(UIConstants.TRUCK_FIN_2);

            screenshot.madeScreenshot(UIConstants.TC_ARCHIV_OPEN, sprache[i]);





            driver.quit();
        }
    }


}
