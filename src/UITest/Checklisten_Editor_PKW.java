package UITest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

import java.util.concurrent.TimeUnit;


public class Checklisten_Editor_PKW {
    private static WebDriver driver = null;


    public static void main(String[] args) throws Exception {
        String pathToChromefoxDriver = ".//ChromeDriver//chromedriver";
        System.setProperty("webdriver.chrome.driver", pathToChromefoxDriver);

        String[] sprache = {UIConstants.PREF_LANGUAGE_DE,  UIConstants.PREF_LANGUAGE_DA, UIConstants.PREF_LANGUAGE_EN,
                            UIConstants.PREF_LANGUAGE_ES, UIConstants.PREF_LANGUAGE_FI, UIConstants.PREF_LANGUAGE_FR,
                            UIConstants.PREF_LANGUAGE_IT, UIConstants.PREF_LANGUAGE_NL, UIConstants.PREF_LANGUAGE_NO,
                            UIConstants.PREF_LANGUAGE_PL, UIConstants.PREF_LANGUAGE_PT, UIConstants.PREF_LANGUAGE_SL,
                            UIConstants.PREF_LANGUAGE_SV, UIConstants.PREF_LANGUAGE_BG, UIConstants.PREF_LANGUAGE_CS,
                            UIConstants.PREF_LANGUAGE_EL,UIConstants.PREF_LANGUAGE_JA, UIConstants.PREF_LANGUAGE_KO,
                            UIConstants.PREF_LANGUAGE_RO, UIConstants.PREF_LANGUAGE_RU, UIConstants.PREF_LANGUAGE_SK,
                            UIConstants.PREF_LANGUAGE_TR, UIConstants.PREF_LANGUAGE_ZH,UIConstants.PREF_LANGUAGE_HU};

        for(int i=18;i<sprache.length; i++) {
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
            Thread.sleep(10000);
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
            Thread.sleep(10000);

            if (sprache[i].equals("(de)")) {
                //Change Oulet name
                home_page.clickOnFrameOfOutletName();
                Thread.sleep(5000);

                home_page.clickOnOutletWarszawa();
                Thread.sleep(5000);

                home_page.clickOnChangeOutletButton();
                Thread.sleep(5000);

                fleet_page.clickOnDataProtectionBanner();
                fleet_page.clickOnCookieBanner();
                Thread.sleep(5000);

                fleet_page.clickOnInboxIcon();
                fleet_page.clickOnInboxIcon();
                Thread.sleep(2000);

                auftrag_management_page.clickOnXentryOrder();
                Thread.sleep(5000);
                auftrag_management_page.closeErrorAndHinweis();

                checklisten_editor_page.searchWithText("abcde");
                Thread.sleep(5000);

                checklisten_editor_page.clickOn3PunktMenu();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnSettingButton();
                auftrag_management_page.waitForSpinnerNotAppears();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnBetriebSetting();
                Thread.sleep(5000);
                auftrag_management_page.closeError();
                Thread.sleep(2000);
                checklisten_editor_page.scrollDownThePageToZweiteSprache();
                Thread.sleep(2000);
                screenshot.madeScreenshot(UIConstants.E_01_AUFRUF_EDITOR, sprache[i]);
                Thread.sleep(2000);

                checklisten_editor_page.choiceChecklisteAnahmeProtokol();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonBearbeiten();
                Thread.sleep(3000);
                checklisten_editor_page.clickOnTextCheckListprotokoll();
                Thread.sleep(1000);
                screenshot.madeScreenshot(UIConstants.E_02_GEOEFFNETE_CHECKLISTE, sprache[i]);
                Thread.sleep(2000);
                checklisten_editor_page.clickOnPlusSymbolOfAussenSeite();
                Thread.sleep(2000);
                checklisten_editor_page.sendkeysInPruefEditorOfLangbezeichnung(" ");
                Thread.sleep(2000);
                checklisten_editor_page.clickOnTextPruefEditor();
                Thread.sleep(2000);
                screenshot.madeScreenshot(UIConstants.E_05_PRUEFPUNKTEDITOR_IO_NIO, sprache[i]);
                Thread.sleep(2000);
                checklisten_editor_page.choiceTypJaOrNein();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnTextPruefEditor();
                Thread.sleep(2000);
                screenshot.madeScreenshot(UIConstants.E_06_PRUEFPUNKTEDITOR_JA_NEIN, sprache[i]);
                Thread.sleep(2000);
                checklisten_editor_page.closeDialogPruefEditor();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonSpeichern();
                Thread.sleep(5000);
                checklisten_editor_page.choiceAllgemeineCheckliste();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonSpeichernInSetting();
                Thread.sleep(2000);
                checklisten_editor_page.closeSetting();
                Thread.sleep(2000);

//Change Outlet
                home_page.clickOnFrameOfOutletName();
                Thread.sleep(5000);

                home_page.clickOnOutletPraha();
                Thread.sleep(5000);

                home_page.clickOnChangeOutletButton();
                Thread.sleep(5000);

                auftrag_management_page.closeErrorAndHinweis();
                Thread.sleep(2000);

                checklisten_editor_page.clickOnSearchButton();
                Thread.sleep(2000);
                checklisten_editor_page.searchWithText("abcde");
                Thread.sleep(5000);

                checklisten_editor_page.clickOn3PunktMenu();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnSettingButton();
                Thread.sleep(2000);


                checklisten_editor_page.clickOnMarktSetting();
                Thread.sleep(2000);
                checklisten_editor_page.choiceChecklisteAnahmeProtokolForMarkt();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonBearbeitenInMarktSetting();
                Thread.sleep(2000);

                //PrüfPunkt anlegen
                checklisten_editor_page.clickOnPlusSymbolOfAussenSeite();
                Thread.sleep(2000);
                checklisten_editor_page.choiceTypJaOrNein();
                Thread.sleep(2000);
                checklisten_editor_page.sendkeysInPruefEditorOfKurzbezeichnung(UIConstants.CHECKPUNKT_M_DE_KURZ);
                Thread.sleep(2000);
                checklisten_editor_page.sendkeysInPruefEditorOfLangbezeichnung(UIConstants.CHECKPUNKT_M_DE_LANG);
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonUebernehmen();
                Thread.sleep(2000);


                //Rubrik anlegen

                checklisten_editor_page.clickOnMarktRubrikAnlegen();
                Thread.sleep(2000);
                checklisten_editor_page.sendkeysInRubrikEditorOfKurzbezeichnung(UIConstants.RUBRIK_M_DE_KURZ);
                Thread.sleep(2000);
                checklisten_editor_page.sendkeysInRubrikEditorOfLangbezeichnung(UIConstants.RUBRIK_M_DE_LANG);

                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonUebernehmenForRubrikAnlegen();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonSpeichern();
                Thread.sleep(2000);

                checklisten_editor_page.clickOnBetriebSetting();
                Thread.sleep(2000);
                auftrag_management_page.closeError();
                Thread.sleep(2000);
                checklisten_editor_page.choiceChecklisteAnahmeProtokol();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonBearbeiten();
                Thread.sleep(2000);

                //Prüfpunkt anlegen
                checklisten_editor_page.clickOnPlusSymbolOfAussenSeite();
                Thread.sleep(2000);
                checklisten_editor_page.choiceTypJaOrNein();
                Thread.sleep(2000);
                checklisten_editor_page.sendkeysInPruefEditorOfKurzbezeichnung(UIConstants.CHECKPUNKT_R_DE_KURZ);
                Thread.sleep(2000);
                checklisten_editor_page.sendkeysInPruefEditorOfLangbezeichnung(UIConstants.CHECKPUNKT_R_DE_LANG);

                Thread.sleep(2000);
                checklisten_editor_page.clickOnCheckBoxAktiv();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonUebernehmen();
                Thread.sleep(2000);

                //Rubrik anlegen

                checklisten_editor_page.clickOnBetriebPruefrik();
                Thread.sleep(2000);
                checklisten_editor_page.sendkeysInRubrikEditorOfKurzbezeichnung(UIConstants.RUBRIK_R_DE_KURZ);
                Thread.sleep(2000);
                checklisten_editor_page.sendkeysInRubrikEditorOfLangbezeichnung(UIConstants.RUBRIK_R_DE_LANG);

                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonUebernehmenForRubrikAnlegen();
                Thread.sleep(2000);


                checklisten_editor_page.clickOnBetriebPruefrik();
                Thread.sleep(2000);
                checklisten_editor_page.sendkeysInRubrikeditorOfLangbezeichnung();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnTextRubrikEditor();
                Thread.sleep(2000);
                checklisten_editor_page.zoomIn();
                Thread.sleep(2000);
                screenshot.madeScreenshot(UIConstants.E_03_RUBRIKERDITOR, sprache[i]);
                checklisten_editor_page.zoomRelease();
                Thread.sleep(2000);
                checklisten_editor_page.closeRubrikEditor();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonSpeichern();
                Thread.sleep(5000);
                //Choice SubOutlet
                checklisten_editor_page.choiceSubOutlet();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonBearbeiten();
                Thread.sleep(2000);


                //CheckPunkt für SubOutlet anlegen
                checklisten_editor_page.clickOnPlusSymbolOfAussenSeite();
                Thread.sleep(2000);
                checklisten_editor_page.choiceTypJaOrNein();
                Thread.sleep(2000);

                checklisten_editor_page.sendkeysInPruefEditorOfKurzbezeichnung(UIConstants.CHECKPUNKT_S_DE_KURZ);
                Thread.sleep(2000);
                checklisten_editor_page.sendkeysInPruefEditorOfLangbezeichnung(UIConstants.CHECKPUNKT_S_DE_LANG);

                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonUebernehmen();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnTextCheckListprotokoll();
                Thread.sleep(1000);

                checklisten_editor_page.clickOnIButton();
                Thread.sleep(2000);
                checklisten_editor_page.zoomIn_2();
                Thread.sleep(2000);
                screenshot.madeScreenshot(UIConstants.E_04_CHECKLISTE_MIT_PRUEFPUNKTEN, sprache[i]);
                checklisten_editor_page.zoomRelease();
                Thread.sleep(2000);

                //Delete sublOutlet pruefpunkt
                checklisten_editor_page.deletePruefPunktOfSubOutlet();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonSpeichern();
                Thread.sleep(2000);



                checklisten_editor_page.choiceGesamtOutlet();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonBearbeiten();
                Thread.sleep(2000);
                checklisten_editor_page.deletePruefPunktOfBetrieb();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonSpeichern();
                Thread.sleep(2000);

                checklisten_editor_page.clickOnMarktSetting();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonBearbeitenInMarktSetting();
                Thread.sleep(2000);
                checklisten_editor_page.deletePruefPunktOfMarkt();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonSpeichern();
                Thread.sleep(2000);

            }
            else {
                //Change Oulet name
                home_page.clickOnFrameOfOutletName();
                Thread.sleep(5000);

                home_page.clickOnOutletBern();
                Thread.sleep(5000);

                home_page.clickOnChangeOutletButton();
                Thread.sleep(5000);

                fleet_page.clickOnDataProtectionBanner();
                fleet_page.clickOnCookieBanner();
                Thread.sleep(5000);

                fleet_page.clickOnInboxIcon();
                fleet_page.clickOnInboxIcon();
                Thread.sleep(2000);

                auftrag_management_page.clickOnXentryOrder();
                auftrag_management_page.waitForSpinnerNotAppears();
                auftrag_management_page.closeErrorAndHinweis();
                Thread.sleep(2000);

                checklisten_editor_page.searchWithText("abcde");
                Thread.sleep(5000);

                checklisten_editor_page.clickOn3PunktMenu();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnSettingButton();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnBetriebSetting();
                Thread.sleep(5000);
                auftrag_management_page.closeErrorAndHinweis();
                Thread.sleep(2000);
                checklisten_editor_page.scrollDownThePageToZweiteSprache();
                Thread.sleep(2000);
                screenshot.madeScreenshot(UIConstants.E_01_AUFRUF_EDITOR, sprache[i]);
                Thread.sleep(2000);

                checklisten_editor_page.choiceChecklisteAnahmeProtokolForVAN();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonBearbeiten();
                Thread.sleep(5000);
                screenshot.madeScreenshot(UIConstants.E_02_GEOEFFNETE_CHECKLISTE, sprache[i]);
                Thread.sleep(2000);
                checklisten_editor_page.clickOnPlusSymbolOfAussenSeite();
                Thread.sleep(2000);
                checklisten_editor_page.sendkeysInPruefEditorOfLangbezeichnung(" ");
                Thread.sleep(2000);
                checklisten_editor_page.clickOnTextPruefEditor();
                Thread.sleep(2000);
                screenshot.madeScreenshot(UIConstants.E_05_PRUEFPUNKTEDITOR_IO_NIO, sprache[i]);
                Thread.sleep(2000);
                checklisten_editor_page.choiceTypJaOrNein();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnTextPruefEditor();
                Thread.sleep(2000);
                screenshot.madeScreenshot(UIConstants.E_06_PRUEFPUNKTEDITOR_JA_NEIN, sprache[i]);
                Thread.sleep(2000);
                checklisten_editor_page.closeDialogPruefEditor();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonSpeichern();
                Thread.sleep(5000);
                checklisten_editor_page.choiceAllgemeineCheckliste();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonSpeichernInSetting();
                Thread.sleep(2000);
                checklisten_editor_page.closeSetting();
                Thread.sleep(2000);

//Change Outlet
                home_page.clickOnFrameOfOutletName();
                Thread.sleep(5000);

                home_page.clickOnOutletWackemut();
                Thread.sleep(5000);

                home_page.clickOnChangeOutletButton();
                Thread.sleep(5000);

                auftrag_management_page.closeErrorAndHinweis();
                Thread.sleep(2000);

                checklisten_editor_page.clickOnSearchButton();
                Thread.sleep(2000);
                checklisten_editor_page.searchWithText("abcde");
                Thread.sleep(5000);

                checklisten_editor_page.clickOn3PunktMenu();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnSettingButton();
                Thread.sleep(2000);


                checklisten_editor_page.clickOnMarktSetting();
                Thread.sleep(2000);
                checklisten_editor_page.choiceChecklisteAnahmeProtokolForVANOfMarkt();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonBearbeitenInMarktSetting();
                Thread.sleep(2000);

                //PrüfPunkt anlegen
                checklisten_editor_page.clickOnPlusSymbolOfAussenSeite();
                Thread.sleep(2000);
                checklisten_editor_page.choiceTypJaOrNein();
                Thread.sleep(2000);
                checklisten_editor_page.sendkeysInPruefEditorOfKurzbezeichnung(UIConstants.CHECKPUNKT_M_EN_KURZ);
                Thread.sleep(2000);
                checklisten_editor_page.sendkeysInPruefEditorOfLangbezeichnung(UIConstants.CHECKPUNKT_M_EN_LANG);

                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonUebernehmen();
                Thread.sleep(2000);


                //Rubrik anlegen

                checklisten_editor_page.clickOnMarktRubrikAnlegenVAN();
                Thread.sleep(2000);
                checklisten_editor_page.sendkeysInRubrikEditorOfKurzbezeichnung(UIConstants.RUBRIK_M_EN_KURZ);
                Thread.sleep(2000);
                checklisten_editor_page.sendkeysInRubrikEditorOfLangbezeichnung(UIConstants.RUBRIK_M_EN_LANG);

                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonUebernehmenForRubrikAnlegen();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonSpeichern();
                Thread.sleep(2000);

                checklisten_editor_page.clickOnBetriebSetting();
                Thread.sleep(2000);
                auftrag_management_page.closeError();
                Thread.sleep(2000);
                checklisten_editor_page.choiceChecklisteAnahmeProtokolForVAN();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonBearbeiten();
                Thread.sleep(2000);

                //Prüfpunkt anlegen
                checklisten_editor_page.clickOnPlusSymbolOfAussenSeite();
                Thread.sleep(2000);
                checklisten_editor_page.choiceTypJaOrNein();
                Thread.sleep(2000);
                checklisten_editor_page.sendkeysInPruefEditorOfKurzbezeichnung(UIConstants.CHECKPUNKT_R_EN_KURZ);
                Thread.sleep(2000);
                checklisten_editor_page.sendkeysInPruefEditorOfLangbezeichnung(UIConstants.CHECKPUNKT_R_EN_LANG);

                Thread.sleep(2000);
                checklisten_editor_page.clickOnCheckBoxAktiv();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonUebernehmen();
                Thread.sleep(2000);

                //Rubrik anlegen

                checklisten_editor_page.clickOnBetriebPruefrikForVan();
                Thread.sleep(2000);

                checklisten_editor_page.sendkeysInRubrikEditorOfKurzbezeichnung(UIConstants.RUBRIK_R_EN_KURZ);
                Thread.sleep(2000);
                checklisten_editor_page.sendkeysInRubrikEditorOfLangbezeichnung(UIConstants.RUBRIK_R_EN_LANG);

                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonUebernehmenForRubrikAnlegen();
                Thread.sleep(2000);


                checklisten_editor_page.clickOnBetriebPruefrikForVan();
                Thread.sleep(2000);
                checklisten_editor_page.sendkeysInRubrikeditorOfLangbezeichnung();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnTextRubrikEditor();
                Thread.sleep(2000);
                checklisten_editor_page.zoomIn();
                Thread.sleep(2000);
                screenshot.madeScreenshot(UIConstants.E_03_RUBRIKERDITOR, sprache[i]);
                checklisten_editor_page.zoomRelease();
                Thread.sleep(2000);
                checklisten_editor_page.closeRubrikEditor();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonSpeichern();
                Thread.sleep(5000);
                //Choice SubOutlet
                checklisten_editor_page.choiceSubOutlet();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonBearbeiten();
                Thread.sleep(2000);


                //CheckPunkt für SubOutlet anlegen
                checklisten_editor_page.clickOnPlusSymbolOfAussenSeite();
                Thread.sleep(2000);
                checklisten_editor_page.choiceTypJaOrNein();
                Thread.sleep(2000);
                checklisten_editor_page.sendkeysInPruefEditorOfKurzbezeichnung(UIConstants.CHECKPUNKT_S_EN_KURZ);
                Thread.sleep(2000);
                checklisten_editor_page.sendkeysInPruefEditorOfLangbezeichnung(UIConstants.CHECKPUNKT_S_EN_LANG);

                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonUebernehmen();
                Thread.sleep(2000);

                checklisten_editor_page.clickOnIButton();
                Thread.sleep(2000);
                checklisten_editor_page.zoomIn();
                Thread.sleep(2000);
                screenshot.madeScreenshot(UIConstants.E_04_CHECKLISTE_MIT_PRUEFPUNKTEN, sprache[i]);
                checklisten_editor_page.zoomRelease();
                Thread.sleep(2000);

                //Delete sublOutlet pruefpunkt
                checklisten_editor_page.deletePruefPunktOfSubOutlet();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonSpeichern();
                Thread.sleep(2000);



                checklisten_editor_page.choiceGesamtOutlet();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonBearbeiten();
                Thread.sleep(2000);
                checklisten_editor_page.deletePruefPunktOfBetrieb();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonSpeichern();
                Thread.sleep(2000);

                checklisten_editor_page.clickOnMarktSetting();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonBearbeitenInMarktSetting();
                Thread.sleep(2000);
                checklisten_editor_page.deletePruefPunktOfMarkt();
                Thread.sleep(2000);
                checklisten_editor_page.clickOnButtonSpeichern();
                Thread.sleep(2000);

            }





            driver.quit();
        }
    }


}
