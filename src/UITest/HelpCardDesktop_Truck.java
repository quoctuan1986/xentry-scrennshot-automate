package UITest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

import java.util.concurrent.TimeUnit;


public class HelpCardDesktop_Truck {
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

        for(int i=21;i<24; i++) {
            /*
            Map<String, String> mobileEmulation = new HashMap<>();

            mobileEmulation.put("deviceName", "iPad Pro");


            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

            driver = new ChromeDriver(chromeOptions);
            */

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

            home_page.clickOnOutletHannover();
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

            screenshot.madeScreenshot("22", sprache[i]);
            Thread.sleep(2000);

            auftrag_management_page.clickOnXentryOrder();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            auftrag_management_page.closeErrorAndHinweis_2();
            Thread.sleep(2000);


            auftrag_management_page.titleReplace();
            helpCard_page.replaceVorgangListTruck();

            screenshot.madeScreenshot("33", sprache[i]);
            Thread.sleep(2000);

            driver.navigate().refresh();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(4000);


            auftrag_management_page.searchWithText("HC-XO-12");
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            auftrag_management_page.clickOnTheOperation("HC-XO-12");
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            auftrag_management_page.titleReplace();
            auftrag_management_page.replaceVorgangListPKW();
            auftrag_management_page.replaceVorgangOverlay();
            auftrag_management_page.searchFieldClear();

            screenshot.madeScreenshot("44",sprache[i]);
            Thread.sleep(2000);
            auftrag_management_page.openOperation();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            auftrag_management_page.closeErrorAndHinweis_2();
            Thread.sleep(2000);


            auftrag_management_page.titleReplace();
            auftrag_management_page.replaceVorgangDetails();

            auftrag_management_page.clickOnTextAuftragmanagement();
            Thread.sleep(1000);


            screenshot.madeScreenshot("55", sprache[i]);
            Thread.sleep(2000);

            helpCard_page.clickOnTechnikBeanstandung();
            Thread.sleep(2000);

            auftrag_management_page.repalceTheServiceBeraterInVorgangDetail();
            auftrag_management_page.clickOnTextTechnischeBeanstandung();

            helpCard_page.zoomIn();
            Thread.sleep(2000);
            screenshot.madeScreenshot("66", sprache[i]);
            Thread.sleep(2000);
            helpCard_page.zommRelease();

            kundendialog_page.closeVorgang();
            Thread.sleep(2000);

            //iPad Pro
            //hochformat
            Dimension d3 = new Dimension(1024, 1366);
            //Querformat
            Dimension d2 = new Dimension(1366, 1147);
            //iPad
            //hochformat
            Dimension d5 = new Dimension(768, 1147);
            //Querformat
            Dimension d4 = new Dimension(1024, 891);

            driver.manage().window().setSize(d4);

            driver.get("https://xentry-int2.daimler.com/order/service-reception/1382901");
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            auftrag_management_page.closeErrorAndHinweis_2();
            Thread.sleep(2000);

            carCheck_page.clickOnCarCheckReiter();
            auftrag_management_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis_2();
            Thread.sleep(2000);


            carCheck_page.titleReplace();
            carCheck_page.replaceVorgangDetailsTruck();

            screenshot.madeScreenshot("01", sprache[i]);

            //  helpCard_page.clickOnStartButton();
            carCheck_page.clickOnStartButton();
            auftrag_management_page.waitForSpinnerNotAppears();
            auftrag_management_page.closeErrorAndHinweis_2();
            Thread.sleep(2000);


            carCheck_page.titleReplace();
            carCheck_page.replaceVorgangDetailsTruck();


            screenshot.madeScreenshot("02", sprache[i]);
            driver.manage().window().setSize(d5);
            screenshot.madeScreenshot("02_2", sprache[i]);
            driver.manage().window().setSize(d2);


            carCheck_page.scrollDownThePageToFahrzeuginnenraum();

            carCheck_page.hakenRausnehmenVonKurztest();
            Thread.sleep(2000);
            auftrag_management_page.closeErrorAndHinweis_2();


            carCheck_page.replaceVorgangDetailsTruck();


            carCheck_page.scrollDownThePageToFahrzeuginnenraum();
            Thread.sleep(1000);
            carCheck_page.clickOnStiftSymbolForWartungdaten();
            Thread.sleep(2000);
            carCheck_page.closeErrorAndHinweis();
            Thread.sleep(1000);
            carCheck_page.wartungKanalWahl_2();
            Thread.sleep(2000);
            carCheck_page.clickOnTextWartung();


            //  carCheck_page.zoomInWithFaktor("0.8");
            Thread.sleep(2000);

            screenshot.madeScreenshot("03", sprache[i]);
          //  carCheck_page.zoomRelease();
            Thread.sleep(2000);

            carCheck_page.closeWartungKanal();
            Thread.sleep(2000);

            driver.manage().window().setSize(d4);

            carCheck_page.scrollDownThePageToFahrzeuginnenraum();
            Thread.sleep(2000);
            helpCard_page.kurztestZuweisen();
            Thread.sleep(2000);
            screenshot.madeScreenshot("04", sprache[i]);
            helpCard_page.closeKurzTestReiter();

            carCheck_page.scrollDownThePageToFahrzeuginnenraum();
            Thread.sleep(2000);

            carCheck_page.replaceVorgangDetailsTruck();

            driver.manage().window().setSize(d2);

            carCheck_page.clickOnStiftSymbolForWartungdaten();
            Thread.sleep(2000);
            carCheck_page.closeErrorAndHinweis();
            Thread.sleep(1000);
            carCheck_page.wartungKanalWahl();
            Thread.sleep(2000);



            carCheck_page.scrollDownThePageInWartung();
            Thread.sleep(2000);

            screenshot.madeScreenshot("05", sprache[i]);


            carCheck_page.scrollDownThePageInWartungNachUnten();
            Thread.sleep(2000);

            screenshot.madeScreenshot("06", sprache[i]);

            carCheck_page.closeWartungKanal();
            Thread.sleep(2000);

            driver.manage().window().setSize(d4);


            carCheck_page.scrollDownThePageToFrontscheibe();
            Thread.sleep(1000);
            carCheck_page.clickOnXButtonVonFrontscheibe();
            Thread.sleep(1000);
            carCheck_page.scrollDownThePageToFrontscheibe();
            Thread.sleep(1000);
            carCheck_page.clickOnHakeVonWischer();
            Thread.sleep(1000);
            carCheck_page.scrollDownThePageToFrontscheibe();
            Thread.sleep(1000);
            carCheck_page.clickOnDelegateOfSignalhorn();
            carCheck_page.scrollDownThePageToFrontscheibe();
            Thread.sleep(1000);

            carCheck_page.replaceVorgangDetailsTruck();


            screenshot.madeScreenshot("07", sprache[i]);

            carCheck_page.clickOnKreisOnKartenstand();
            Thread.sleep(1000);
            carCheck_page.scrollDownThePageToFrontscheibe();
            Thread.sleep(1000);

            screenshot.madeScreenshot("08", sprache[i]);

            carCheck_page.checkListDelete();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            kundendialog_page.closeVorgang();
            auftrag_management_page.waitForSpinnerNotAppears();

            driver.manage().window().setSize(d5);

            driver.get("https://xentry-int2.daimler.com/order/service-reception/141415310");
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            auftrag_management_page.closeErrorAndHinweis();
            Thread.sleep(2000);

            kundendialog_page.clickOnKundendialog();
            auftrag_management_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            auftrag_management_page.closeErrorAndHinweis();
            Thread.sleep(2000);

            kundendialog_page.titleReplace();
            kundendialog_page.replaceVorgangDetails();
            kundendialog_page.clickOnTextKundendialog();


            screenshot.madeScreenshot("09", sprache[i]);

            kundendialog_page.scrollDownThePageToAblehnungAuftragposition();
            Thread.sleep(2000);
            screenshot.madeScreenshot("10", sprache[i]);

            driver.quit();
        }
    }


}
