package UITest;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

import java.util.concurrent.TimeUnit;


public class ScreenshotAuftragManagement_PKW {
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

            whoIsWho.selectTheLanguage(sprache[i]);

            whoIsWho.clickOnSaveButton();

            whoIsWho.clickOnLogoutButton();
            Thread.sleep(2000);


            driver.get(UIConstants.URL_XENTRY);
            Thread.sleep(5000);
            logIn_page.cookiesAkzep();

            logIn_page.clickOnsignInButton();

            logIn_page.enterUserName(UIConstants.USER_NAME);
            logIn_page.clickOnNextButton();

            logIn_page.enterPassWord(UIConstants.PASWORD);
            logIn_page.clickOnSubmitButton();
            home_page.clickOnLogoutButton();
            Thread.sleep(5000);

            driver.get(UIConstants.URL_XENTRY);
            Thread.sleep(5000);
            logIn_page.cookiesAkzep();


            logIn_page.clickOnsignInButton();

            logIn_page.enterUserName(UIConstants.USER_NAME);
            logIn_page.clickOnNextButton();

            logIn_page.enterPassWord(UIConstants.PASWORD);
            logIn_page.clickOnSubmitButton();




//Change Oulet name
            home_page.clickOnFrameOfOutletName();

            home_page.clickOnOutletMunich();

            home_page.clickOnChangeOutletButton();

            fleet_page.clickOnDataProtectionBanner();
            fleet_page.clickOnCookieBanner();
           // serviceManagement_2_page.closeCookies();

            fleet_page.clickOnInboxIcon();
            fleet_page.clickOnInboxIcon();
            auftrag_management_page.alleKachelAnzeige();
            Thread.sleep(2000);
            auftrag_management_page.waitForSpinnerNotAppears();



            auftrag_management_page.titleReplace();
            auftrag_management_page.gutenTag();

            screenshot.madeScreenshot(UIConstants.XO_XENTRY_ORDER, sprache[i]);


            auftrag_management_page.clickOnXentryOrder();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            auftrag_management_page.closeErrorAndHinweis_2();
            Thread.sleep(1000);

            auftrag_management_page.titleReplace();
            auftrag_management_page.replaceVorgangListPKW();

            screenshot.madeScreenshot(UIConstants.XO_VORGANG_LIST, sprache[i]);

            driver.navigate().refresh();
            auftrag_management_page.waitForSpinnerNotAppears();

            auftrag_management_page.searchWithText(UIConstants.KENNZEICHEN_PKW);
            Thread.sleep(2000);
            auftrag_management_page.clickOnTheOperation(UIConstants.KENNZEICHEN_PKW);
            auftrag_management_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis_2();

            auftrag_management_page.titleReplace();
            auftrag_management_page.replaceVorgangListPKW();
            auftrag_management_page.replaceVorgangOverlayPKW();


            screenshot.madeScreenshot(UIConstants.XO_VORGANG_LIST_OVERLAY,sprache[i]);
            Thread.sleep(1000);
            //S-WR3
            driver.get("https://xentry-int2.daimler.com/order/service-reception/141414145");

            auftrag_management_page.waitForSpinnerNotAppears();
            kundendialog_page.waitForLoadingScreen();
            Thread.sleep(5000);

            auftrag_management_page.titleReplace();
            auftrag_management_page.replaceVorgangDetailsPKW();
            //Notification
            auftrag_management_page.clickOnNotificationDetails();
            Thread.sleep(2000);




            screenshot.madeScreenshot(UIConstants.XO_NOTIFICATION, sprache[i]);


            auftrag_management_page.closeErrorAndHinweis_2();
            Thread.sleep(1000);
            auftrag_management_page.clickOnTextAuftragmanagement();
            screenshot.madeScreenshot(UIConstants.XO_VORGANG_OPEN, sprache[i]);

            auftrag_management_page.clickOnThreePointMenu();
            auftrag_management_page.clickOnSetting();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.XO_EINSTELLUNG_ANWENDER, sprache[i]);
            auftrag_management_page.clickOnBetriebSetting();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.XO_EINSTELLUNG_BETRIEB, sprache[i]);
            auftrag_management_page.clickOnMarktSetting();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.XO_EINSTELLUNG_MARKT, sprache[i]);
            auftrag_management_page.clickOnAnreichungSetting();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.XO_EINSTELLUNG_ANREICHUNG, sprache[i]);
            auftrag_management_page.clickOnAnreichungAnwenderSetting();
            auftrag_management_page.waitForSpinnerNotAppears();
            auftrag_management_page.selectTheShortTestZuordnung();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.XO_EINSTELLUNG_ANREICHUNG_ANWENDER, sprache[i]);
            auftrag_management_page.closeSetting();

            auftrag_management_page.repalceTheServiceBeraterInVorgangDetail();


            auftrag_management_page.clickOnCustomerData();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            screenshot.madeScreenshot(UIConstants.XO_KUNDENDATEN, sprache[i]);
            auftrag_management_page.clickOnEditButtonForCustomerDataPKW();
            auftrag_management_page.clickOnTextKundendaten();
            screenshot.madeScreenshot(UIConstants.XO_KUNDENDATEN_EDIT, sprache[i]);
            auftrag_management_page.closeCustomerDataDialog();

            auftrag_management_page.clickOnVehicleData();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            auftrag_management_page.replaceFahrzeugInfoPKW();


            screenshot.madeScreenshot(UIConstants.XO_VEHICLE_DATA, sprache[i]);
            auftrag_management_page.vehicleEdit();

            auftrag_management_page.replaceFahrzeugInfoInEditPKW();

            auftrag_management_page.clickOnTextFahrzeuginformation();

            screenshot.madeScreenshot(UIConstants.XO_VEHICLE_DATA_EDIT, sprache[i]);
            auftrag_management_page.vehicleEdit();
            auftrag_management_page.clickOnServiceVertrafNumber();
            auftrag_management_page.waitForSpinnerNotAppears();

            auftrag_management_page.replaceServiceVertragNummerInServiceDetailPKW();


            screenshot.madeScreenshot(UIConstants.XO_VEHICLE_DATA_Service, sprache[i]);
            auftrag_management_page.closeServiceVertragDialog();
            auftrag_management_page.clickOnButtonErweiterteDatacard();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.XO_VEHICLE_DATACARD, sprache[i]);
            auftrag_management_page.closeErweiterteDatacardDialog();
            auftrag_management_page.clickOnTabHistorie();
            auftrag_management_page.navigateToTitelHistorie();
            screenshot.madeScreenshot(UIConstants.XO_VEHICLE_DATA_HISTORIE, sprache[i]);
            auftrag_management_page.closeVehicleDataDialog();

            auftrag_management_page.repalceTheServiceBeraterInVorgangDetail();


            auftrag_management_page.clickOnKommunikation();
            auftrag_management_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.XO_COMUNICATION, sprache[i]);
            auftrag_management_page.closeKommunikationReiter();

            auftrag_management_page.repalceTheServiceBeraterInVorgangDetail();


            auftrag_management_page.clickOnShortTestReiterForPKW();
            auftrag_management_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis_2();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.XO_SHORT_TEST, sprache[i]);
            auftrag_management_page.clickOnAShortTest();
            auftrag_management_page.waitForSpinnerNotAppears();
            auftrag_management_page.waitForSpinnerNotAppearsInKurztesDialogAnsicht();

            auftrag_management_page.replaceOnKurztestDetailPKW();


            screenshot.madeScreenshot(UIConstants.XO_SHORT_TEST_DETAIL, sprache[i]);
            auftrag_management_page.closeShortTestDialog();
            auftrag_management_page.closeShortTestReiterForPKW();



            auftrag_management_page.clickOnDocumentReiterForPKW();
            auftrag_management_page.waitForSpinnerNotAppears();

            auftrag_management_page.closeErrorAndHinweis();

            auftrag_management_page.repalceTheServiceBeraterInVorgangDetail();


            auftrag_management_page.clickOnTextDokumente();

            auftrag_management_page.replaceOnDoucumentReiterPKW();

            screenshot.madeScreenshot(UIConstants.XO_DOCUMENT, sprache[i]);
            auftrag_management_page.closeDocumentDialogForPKW();



            auftrag_management_page.clickOnBeanstandung();
            auftrag_management_page.closeErrorAndHinweis_2();

            auftrag_management_page.repalceTheServiceBeraterInVorgangDetail();


            auftrag_management_page.clickOnTextTechnischeBeanstandung();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.XO_KUNDENANLIEGEN_DETAILS, sprache[i]);
            auftrag_management_page.closeBeanstandungsdialog();


            auftrag_management_page.clickOnWartungForPKW();
            auftrag_management_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis_2();
            Thread.sleep(2000);

            auftrag_management_page.repalceTheServiceBeraterInVorgangDetail();

            auftrag_management_page.clickOnTextWartung();

            auftrag_management_page.zoomIn();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.XO_KUNDENANLIEGEN_WARTUNG, sprache[i]);
            auftrag_management_page.zoomRelease();
            Thread.sleep(2000);
            auftrag_management_page.editWartung();
            auftrag_management_page.zoomIn_1();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.XO_A_AUFTRAG_MANAGEMENT_WARTUNG, sprache[i]);
            auftrag_management_page.zoomRelease();
            Thread.sleep(2000);
            auftrag_management_page.closeWartungDialogForPKW();
            auftrag_management_page.clickOnWartungForPKW();
            auftrag_management_page.closeErrorAndHinweis_2();

            auftrag_management_page.repalceTheServiceBeraterInVorgangDetail();

            auftrag_management_page.clickOnTextWartung();

            auftrag_management_page.addPackage();
            auftrag_management_page.waitForSpinnerNotAppears();
            auftrag_management_page.unfoldPackage();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.XO_PAKETE, sprache[i]);
            auftrag_management_page.closeAddPackageDialog();
            auftrag_management_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis_2();
            auftrag_management_page.clickOnPlusButtonForTippsForPKW();
            auftrag_management_page.waitForSpinnerNotAppears();

            auftrag_management_page.titleReplace();
            auftrag_management_page.replaceInTipsDialogPKW();

            screenshot.madeScreenshot(UIConstants.XO_RECHERCHE, sprache[i]);
            auftrag_management_page.closeTippsDialog();
            auftrag_management_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis_2();
            auftrag_management_page.closeWartungDialog();

            kundendialog_page.closeVorgang();
            auftrag_management_page.waitForSpinnerNotAppears();

            auftrag_management_page.clickOnArchivBar();
            auftrag_management_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis_2();
            auftrag_management_page.sortiertArchivNachTermin();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            auftrag_management_page.titleReplace();
            auftrag_management_page.replaceArchivListPKW();

            screenshot.madeScreenshot(UIConstants.XO_ARCHIV_LIST, sprache[i]);


            driver.navigate().refresh();
            auftrag_management_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis_2();
            Thread.sleep(2000);
            kundendialog_page.ausgeklappNavigationleiste();
            auftrag_management_page.sortiertArchivNachTermin();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            auftrag_management_page.titleReplace();


            String fin_1 = driver.findElement(By.xpath("/html/body/ma-cc-car-check-app/div/xy-c-frame/div/div/div[1]/div[1]/div/div/div/ma-reception-list/div/div/div/div[1]/p-table/div/div/div/div[2]/table/tbody/tr[3]/td[4]")).getText();
            String fin = fin_1;

            auftrag_management_page.clickOnAArchiv();
            auftrag_management_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis_2();
            Thread.sleep(2000);

            auftrag_management_page.replaceArchivListPKW();
            auftrag_management_page.replaceVorgangUebersichtArchivPKW(fin);
            System.out.println("FIn is: "+fin);


            screenshot.madeScreenshot(UIConstants.XO_ARCHIV_LIST_OVERLAY, sprache[i]);
            auftrag_management_page.openOperation();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            auftrag_management_page.closeErrorAndHinweis_2();
            Thread.sleep(2000);

            auftrag_management_page.titleReplace();
            auftrag_management_page.replaceInArchivDetailPKW(fin);
            System.out.println("FIn is: "+fin);


            screenshot.madeScreenshot(UIConstants.XO_ARCHIV_OPEN, sprache[i]);
            driver.quit();
        }
    }


}
