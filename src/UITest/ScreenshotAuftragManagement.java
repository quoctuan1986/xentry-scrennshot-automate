package UITest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

import java.util.concurrent.TimeUnit;


public class ScreenshotAuftragManagement {
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
            Thread.sleep(10000);

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
            Thread.sleep(10000);

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

            home_page.clickOnOutletMunich();
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
            screenshot.madeScreenshot(UIConstants.TC_XENTRY_ORDER, sprache[i]);
            Thread.sleep(2000);


            auftrag_management_page.clickOnXentryOrder();
            Thread.sleep(5000);
            auftrag_management_page.closeError();
            Thread.sleep(2000);
            auftrag_management_page.clickOnMoreLoad();
            screenshot.madeScreenshot(UIConstants.TC_VORGANG_LIST, sprache[i]);
            Thread.sleep(2000);
            auftrag_management_page.clickOnMoreLoad();
            Thread.sleep(2000);
            auftrag_management_page.clickOnTheOperation(UIConstants.KENNZEICHEN);
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.TC_VORGANG_LIST_OVERLAY,sprache[i]);
            auftrag_management_page.closeOperationInTheList();
            Thread.sleep(2000);


            auftrag_management_page.clickOnTheOperation(UIConstants.KENNZEICHEN_2);
            Thread.sleep(5000);
            auftrag_management_page.openOperation();
            Thread.sleep(10000);

            auftrag_management_page.closeError();
            Thread.sleep(2000);
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
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.TC_EINSTELLUNG_ANREICHUNG, sprache[i]);
            auftrag_management_page.clickOnAnreichungAnwenderSetting();
            Thread.sleep(5000);
            auftrag_management_page.selectTheShortTestZuordnung();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.TC_EINSTELLUNG_ANREICHUNG_ANWENDER, sprache[i]);
            auftrag_management_page.closeSetting();
            Thread.sleep(5000);

            auftrag_management_page.clickOnCustomerData();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.TC_KUNDENDATEN, sprache[i]);
            auftrag_management_page.clickOnEditButtonForCustomerData();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.TC_KUNDENDATEN_EDIT, sprache[i]);
            auftrag_management_page.closeCustomerDataDialog();
            Thread.sleep(2000);

            auftrag_management_page.clickOnVehicleData();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.TC_VEHICLE_DATA, sprache[i]);
            auftrag_management_page.vehicleEdit();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.TC_VEHICLE_DATA_EDIT, sprache[i]);
            auftrag_management_page.clickOnServiceVertrafNumber();
            Thread.sleep(5000);
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
            screenshot.madeScreenshot(UIConstants.TC_VEHICLE_DATA_HISTORIE, sprache[i]);
            auftrag_management_page.closeVehicleDataDialog();

            auftrag_management_page.clickOnShortTestReiter();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.TC_SHORT_TEST, sprache[i]);
            auftrag_management_page.clickOnAShortTest();
            Thread.sleep(20000);
            screenshot.madeScreenshot(UIConstants.TC_SHORT_TEST_DETAIL, sprache[i]);
            auftrag_management_page.scrollDownThePage();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.TC_SHORT_TEST_DETAIL_2, sprache[i]);
            auftrag_management_page.clickOnSteuer();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.TC_SHORT_TEST_DETAIL_STEUER, sprache[i]);
            auftrag_management_page.closeShortTestDialog();
            auftrag_management_page.closeShortTestReiter();


            auftrag_management_page.clickOnDocumentReiter();
            Thread.sleep(5000);
            screenshot.madeScreenshot(UIConstants.TC_DOCUMENT, sprache[i]);
            auftrag_management_page.closeDocumentDialog();

            auftrag_management_page.clickAKundendienst();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.TC_KUNDENANLIEGEN, sprache[i]);
            auftrag_management_page.closeKundenAnliegeDialog();


            auftrag_management_page.clickOnWartung();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.TC_KUNDENANLIEGEN_WARTUNG, sprache[i]);
            auftrag_management_page.addPackage();
            Thread.sleep(10000);
            //Fehlt die Pakete
            screenshot.madeScreenshot(UIConstants.TC_PAKETE, sprache[i]);
            auftrag_management_page.closeAddPackageDialog();
            Thread.sleep(2000);
            auftrag_management_page.closeWartungDialog();
            Thread.sleep(2000);

            auftrag_management_page.clickOnBeanstandung();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.TC_KUNDENANLIEGEN_BEANSTANDUNG, sprache[i]);
            auftrag_management_page.clickOnPlusButtonForTipps();
            Thread.sleep(10000);
            screenshot.madeScreenshot(UIConstants.TC_RECHERCHE, sprache[i]);

            driver.quit();
        }
    }


}
