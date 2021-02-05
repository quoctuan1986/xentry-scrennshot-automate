package UITest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

import java.util.concurrent.TimeUnit;


public class ScreenshotWorkshop_PKW {
    private static WebDriver driver = null;

    public static void main(String[] args) throws Exception {
        String pathToChromeforDriver = ".//ChromeDriver//chromedriver";
        String pathToChrome_Windows = ".//Win_ChromeDriver//chromedriver.exe";
        if (System.getProperty("os.name").startsWith("Windows")) {
            System.setProperty("webdriver.chrome.driver", pathToChrome_Windows);
        } else{
            System.setProperty("webdriver.chrome.driver", pathToChromeforDriver);
        }

        String[] sprache = {UIConstants.PREF_LANGUAGE_DE, UIConstants.PREF_LANGUAGE_EN,
                            UIConstants.PREF_LANGUAGE_ES, UIConstants.PREF_LANGUAGE_FR,
                            UIConstants.PREF_LANGUAGE_CS, UIConstants.PREF_LANGUAGE_EL};

        for(int i=4;i<6; i++) {
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
            Workshop_Page workshop_page = PageFactory.initElements(driver, Workshop_Page.class);



            //Open Who_is_Who settings
            driver.get(UIConstants.URL_WHO_IS_WHO_PROD);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            Dimension d = new Dimension(1920, 1200);
            driver.manage().window().setSize(d);
            Thread.sleep(5000);


            logIn_page.enterUserName(UIConstants.USER_NAME_TOBI);
            logIn_page.clickOnNextButton();
            Thread.sleep(5000);

            logIn_page.enterPassWord(UIConstants.PASWORD_TOBI);
            logIn_page.clickOnSubmitButton();
            Thread.sleep(5000);

            whoIsWho.clickOnUserModify();
            workshop_page.waitForSpinnerNotAppears();


            whoIsWho.clickOnPrefLanguageBox();

            workshop_page.waitForSpinnerNotAppears();

            whoIsWho.selectTheLanguage(sprache[i]);
            workshop_page.waitForSpinnerNotAppears();


            whoIsWho.clickOnSaveButton();
            Thread.sleep(2000);

            whoIsWho.clickOnLogoutButton();
            Thread.sleep(2000);


            driver.get(UIConstants.URL_XENTRY_PROD);
            Thread.sleep(5000);

            logIn_page.clickOnsignInButton();
            Thread.sleep(5000);

            logIn_page.enterUserName(UIConstants.USER_NAME_TOBI);
            logIn_page.clickOnNextButton();
            workshop_page.waitForSpinnerNotAppears();


            logIn_page.enterPassWord(UIConstants.PASWORD_TOBI);
            logIn_page.clickOnSubmitButton();
            workshop_page.waitForSpinnerNotAppears();
            home_page.clickOnLogoutButton();
            workshop_page.waitForSpinnerNotAppears();

            driver.get(UIConstants.URL_XENTRY_PROD);
            workshop_page.waitForSpinnerNotAppears();


            logIn_page.clickOnsignInButton();
            workshop_page.waitForSpinnerNotAppears();

            logIn_page.enterUserName(UIConstants.USER_NAME_TOBI);
            logIn_page.clickOnNextButton();
            Thread.sleep(5000);

            logIn_page.enterPassWord(UIConstants.PASWORD_TOBI);
            logIn_page.clickOnSubmitButton();
            workshop_page.waitForSpinnerNotAppears();




//Change Oulet name
            home_page.clickOnFrameOfOutletName();
            workshop_page.waitForSpinnerNotAppears();

            home_page.clickOnOutletBoeblingen();
            workshop_page.waitForSpinnerNotAppears();

            home_page.clickOnChangeOutletButton();
            workshop_page.waitForSpinnerNotAppears();

            fleet_page.clickOnDataProtectionBanner();
            fleet_page.clickOnCookieBanner();
            workshop_page.closeCookies();
            workshop_page.waitForSpinnerNotAppears();
            fleet_page.clickOnInboxIcon();
            fleet_page.clickOnInboxIcon();
            Thread.sleep(2000);
            workshop_page.alleKachelAnzeige();
            Thread.sleep(2000);

            workshop_page.clickOnDrawIcon();
            Thread.sleep(2000);
            workshop_page.textReplace_2_Aufruf_XIW();
            screenshot.madeScreenshot(UIConstants.WORKSHOP_AUFRUF_XIW, sprache[i]);

            workshop_page.clickOnControlPanelIcon();
            Thread.sleep(2000);
            workshop_page.textReplace_2_XENTRY_Portal_Rahmen();
            screenshot.madeScreenshot(UIConstants.WORKSHOP_XENTRY_PORTAL_RAHMEN, sprache[i]);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_EINSTELUNG_SIDEMENU, sprache[i]);


            workshop_page.clickOnOutletRahmen();
            Thread.sleep(2000);
            workshop_page.textReplace_2_Servicebetrieb_Wechseln();
            screenshot.madeScreenshot(UIConstants.WORKSHOP_SERVICEBETRIEB_WECHSELN, sprache[i]);
            workshop_page.clickOnCancelButtonOutletRahmen();
            Thread.sleep(2000);


            workshop_page.clickOnControlPanelIcon();
            Thread.sleep(2000);
            workshop_page.clickOnSupportIcon();
            Thread.sleep(2000);
            workshop_page.waitForSpinnerNotAppears();
            workshop_page.clickOnPlusButtonOnSupportDialog();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_SUPPORT_ANFRAGEN, sprache[i]);
            workshop_page.closeSupportDialog();
            Thread.sleep(2000);

            workshop_page.openTheXentryWorkshop();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);


            workshop_page.clickOnTheSucheReiter();
            workshop_page.waitForSpinnerNotAppears();
            workshop_page.textReplace_2_Suche();
            screenshot.madeScreenshot(UIConstants.WORKSHOP_SUCHE, sprache[i]);

            workshop_page.clickOnJobauswahlReiter();
            workshop_page.waitForSpinnerNotAppears();
            driver.navigate().refresh();
            workshop_page.waitForSpinnerNotAppears();
            workshop_page.alleServiceBeraterAuswaehlen();
            Thread.sleep(2000);
            workshop_page.alleTechnikerAuswaehlen();
            Thread.sleep(2000);

            workshop_page.textReplace_2_Jobauswahl();
            screenshot.madeScreenshot(UIConstants.WORKSHOP_JOBAUSWAHL, sprache[i]);

            workshop_page.clickOnBlaueAugen();
            Thread.sleep(2000);
            workshop_page.waitForSpinnerNotAppears();
            workshop_page.textReplace_2_Vorganguebersicht_Popup();
            screenshot.madeScreenshot(UIConstants.WORKSHOP_VORGANGUEBERSICHT_POPUP, sprache[i]);
            workshop_page.closePopupVorganguebersicht();
            Thread.sleep(2000);

            workshop_page.clickOnBriefumschlag();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_MARKT_BENACHRICHTIGUNG, sprache[i]);

            workshop_page.clickOnJobauswahlReiter();
            workshop_page.waitForSpinnerNotAppears();
            workshop_page.filternach("WDD2130501A253633");
            workshop_page.waitForSpinnerNotAppears();
            workshop_page.clickOnTheJob("WDD2130501A253633");
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(5000);
//            workshop_page.closePopupByOpenJob();
            Thread.sleep(2000);
            workshop_page.textReplace_2_Inhalt_Job();
            workshop_page.clickOnModellText();
            workshop_page.waitForSpinnerNotAppears();
            screenshot.madeScreenshot(UIConstants.WORKSHOP_INHALT_JOB, sprache[i]);
            workshop_page.closeTheJob();
            Thread.sleep(2000);

            workshop_page.clickOnTheSucheReiter();
            workshop_page.waitForSpinnerNotAppears();
            workshop_page.suchennach("WDD2130501A253633");
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_FIN_EINGABE_POPUP, sprache[i]);

            workshop_page.clickOnCancelButtonBySearchOfJob();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_FIN_EINGABE, sprache[i]);


            workshop_page.clickOnButtonKurztestsuchen();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            workshop_page.clickOnDropdownforKurztest();
            Thread.sleep(2000);
            workshop_page.kurztestAuswahl();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_KURZTEST_ANFORDERN, sprache[i]);

            workshop_page.clickOnAkzeptierenButton();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            workshop_page.clickOnFehlerCodeSuchenTab();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            workshop_page.scrollDownThePageToFehlerCode();
            screenshot.madeScreenshot(UIConstants.WORKSHOP_SUCHE_FEHLERCODE,sprache[i]);

            workshop_page.clickOnTabSymptomsuche();
            Thread.sleep(2000);
            workshop_page.scrollDownThePageToAufbau();
            Thread.sleep(2000);
            workshop_page.clickOnPfeilStossfaenger();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_SUCHE_SYMPTOM, sprache[i]);

            workshop_page.clickOnTabStichwortsuche();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_SUCHE_STICHWORT, sprache[i]);


            workshop_page.clickOnButtonErstellungBeanstandung();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            workshop_page.symptomAuswahl();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            workshop_page.checkBoxTippsDocument();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_SUCHE_TIPS, sprache[i]);

            workshop_page.clickOnButtonErstellungBeanstandungInTipsDokument();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            workshop_page.markiereSSL();
            Thread.sleep(2000);
            workshop_page.markiereAlleArbeit();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_TIPS_DOKUMENT_ZUORDNEN, sprache[i]);


            workshop_page.tipsDocumentZuordnen();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            workshop_page.scrollDownThePageToAlleReduzieren();
            Thread.sleep(2000);
            workshop_page.alleReduzieren();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_BEANST_UEBERSICHT, sprache[i]);


            workshop_page.clickOnSideMenue();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_SIDE_NAVIGATION, sprache[i]);


            workshop_page.closeSideMenue();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            workshop_page.kundenaussageErweitern();
            Thread.sleep(4000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_KUNDENAUSSAGE, sprache[i]);


            workshop_page.kundenaussageErweitern();
            Thread.sleep(2000);
            workshop_page.scrollDownThePageToTipsDocument();
            Thread.sleep(2000);
            workshop_page.tipsErweitern();
            Thread.sleep(2000);
            workshop_page.paketErweitern();
            Thread.sleep(2000);
            workshop_page.premiumOelServiceBAuswahl();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_TIPS_PAKET, sprache[i]);

            workshop_page.tipsErweitern();
            Thread.sleep(2000);
            workshop_page.paketErweitern();
            Thread.sleep(2000);
            workshop_page.reparaturpaketeErweitern();
            Thread.sleep(2000);
            workshop_page.arbeitenErweitern();
            Thread.sleep(2000);
            workshop_page.scrollDownThePageToReparaturpakete();
            Thread.sleep(2000);
            workshop_page.reparaturpaketesuchen(sprache[i]);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_RPR, sprache[i]);

            workshop_page.clickOnButtonUebernehmen();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            workshop_page.kundenaussageErweitern();
            Thread.sleep(2000);
            workshop_page.scrollDownThePageToKundenaussage();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_RPR2, sprache[i]);

            workshop_page.scrollDownThePageToTeile();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_TEILE, sprache[i]);


            workshop_page.scrollDownThePageToReparaturpakete();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_ARBEITEN, sprache[i]);
/*
            ////alle Screenshots ASRA wurden nicht erstellt
            workshop_page.teileRecherchieren();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_TEILE_XP_INFO, sprache[i]);

            workshop_page.clickOnGruppen_47();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            workshop_page.clickOnImageOfTeile_35();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            workshop_page.clickOnWarenkorbVonBauteil();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_TEILE_XP_INFO_2, sprache[i]);

            workshop_page.partsInfoVerlassen();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);


            workshop_page.scrollDownThePageToArbeiten();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_TEILE_HINZUFUEGEN, sprache[i]);

            workshop_page.scrollDownThePageToErsatzTeile();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_ERSATZTEILE, sprache[i]);
*/
            workshop_page.scrollDownThePageToAlleReduzieren();
            Thread.sleep(2000);
            workshop_page.alleReduzieren();
            Thread.sleep(2000);

            workshop_page.ursacheUndHilfeErweitern();
            Thread.sleep(2000);
            workshop_page.scrollDownThePageToUrsacheUndHilfe();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_URSACHE_HILFE, sprache[i]);


            workshop_page.anhangErweitern();
            Thread.sleep(2000);
            workshop_page.scrollDownThePageToUrsacheUndHilfe();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_ANHANG, sprache[i]);


            workshop_page.speichernUndSchliessenVorgang();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_INHALT, sprache[i]);


            workshop_page.clickOnTheLupe();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            screenshot.madeScreenshot(UIConstants.WORKSHOP_Suche_AUS_INHALT, sprache[i]);


            workshop_page.anforderungErstellen();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_SUCHE_KUNDENWUNSCH_ANFORDERUNG, sprache[i]);


            workshop_page.anforderungAbbrechen();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            workshop_page.clickOnOkButtonOnPopUp();
            Thread.sleep(2000);

            workshop_page.clickOnFahrzeugtestdaten();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            workshop_page.telediagnoseStarten();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_FAHRZEUG_TEST_DATEN, sprache[i]);

            workshop_page.kurztestanalyse();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_KURZTEST_ANALYSE, sprache[i]);


            workshop_page.kurztestAnalyseSchliessen();
            Thread.sleep(2000);
            workshop_page.kurztestDetails();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_KURZTEST_DETAILS, sprache[i]);

            workshop_page.kurztestDateilsSchliessen();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            workshop_page.gobackToJobDetailsFromKurztest();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);


            workshop_page.clickOnFahrzeugInformation();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_FAHRZEUG_INFO, sprache[i]);


            workshop_page.gobackToJobdetailsFromFahrzeugInfo();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            workshop_page.clickOnVorgangInfo();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_JOB_INFO, sprache[i]);


            workshop_page.gobackToJobdetailsFromJobInfo();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            workshop_page.clickOnReparaturPakete();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            workshop_page.reparaturPaketeSuchen_2(sprache[i]);
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_RPR_INHALT_UEBERSICHT, sprache[i]);
            workshop_page.gobackToJobdetailsFromReparaturPakete();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
/*
            workshop_page.clickOnWis();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_WARTUNG_SERVICE, sprache[i]);

*/



//Kurztest entkoppeln
            workshop_page.clickOnFahrzeugtestdaten();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            workshop_page.kurztestEntkoppeln();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);




            workshop_page.vorgangSchliessen();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            workshop_page.clickOnJobauswahlReiter();
            workshop_page.waitForSpinnerNotAppears();
            workshop_page.alleServiceBeraterAuswaehlen();
            Thread.sleep(2000);
            workshop_page.alleTechnikerAuswaehlen();
            Thread.sleep(2000);

            workshop_page.filternach("WDD2130421A467952");
            workshop_page.waitForSpinnerNotAppears();
            workshop_page.clickOnTheJob("WDD2130421A467952");
            Thread.sleep(4000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_JOB_ENRICHMENT, sprache[i]);
            workshop_page.waitForSpinnerNotAppears();

            workshop_page.clickOnPfeilButtonInJobDetails();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_PFEIL_AUSKLAPP, sprache[i]);



            workshop_page.vorgangSchliessen();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            workshop_page.clickOnJobauswahlReiter();
            workshop_page.waitForSpinnerNotAppears();
            workshop_page.alleServiceBeraterAuswaehlen();
            Thread.sleep(2000);
            workshop_page.alleTechnikerAuswaehlenAlsUser();
            Thread.sleep(2000);
            workshop_page.filternach("WDD2130501A253633");
            workshop_page.waitForSpinnerNotAppears();

            workshop_page.vorgangArchivieren();
            workshop_page.waitForSpinnerNotAppears();
            screenshot.madeScreenshot(UIConstants.WORKSHOP_ARCHIVIEREN_POPUP, sprache[i]);
            workshop_page.vorgangArchivierenJa();
            Thread.sleep(2000);

            workshop_page.clickOnArchivTab();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_ARCHIV, sprache[i]);

            workshop_page.archivPopup();
            screenshot.madeScreenshot(UIConstants.WORKSHOP_ARCHIV_POPUP, sprache[i]);

            workshop_page.closeArchivPopup();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);

            workshop_page.clickOnEinstellungButton();
            workshop_page.waitForSpinnerNotAppears();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_EINSTELUNG, sprache[i]);

            workshop_page.scrollDownThePageInSettingNachUntenToEmail();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_EINSTELUNG_EMAIL_BENACH, sprache[i]);

            workshop_page.scrollDownThePageInSettingNachUntenToGarantie();
            Thread.sleep(2000);
            screenshot.madeScreenshot(UIConstants.WORKSHOP_EINSTELUNG_VORGANG, sprache[i]);




            driver.quit();
        }
    }


}
