package pages;

import Utilities.CommonMethods;

public class LoginAjinkya {

    public static void loginTestWciAdmin() {
        LoginPom login = new LoginPom();
        login.selectJurisdictionandLangaugeForCalifornia();
        login.loginWithValidCredentials_WCIAdmin();
        CommonMethods common = new CommonMethods();
        common.handlesecurityQuestion();
    }

    public static void loginTestAdmin() {
        LoginPom login = new LoginPom();
        login.selectJurisdictionandLangaugeForCalifornia();
        login.loginWithValidCredentials_Admin_Quebec();
        CommonMethods common = new CommonMethods();
        common.handlesecurityQuestion();
    }

    public static void loginTestAuthority() {
        LoginPom login = new LoginPom();
        login.selectJurisdictionandLangaugeForCalifornia();
        login.loginWithValidCredentials_Authority_Quebec();
        CommonMethods common = new CommonMethods();
        common.handlesecurityQuestion();
    }

    public static void loginTestAr1() {
        LoginPom login = new LoginPom();
        login.selectJurisdictionandLangaugeForCalifornia();
        login.loginWithValidCredentials_AR1();
        CommonMethods common = new CommonMethods();
        common.handlesecurityQuestion();
    }

    public static void loginTestAr2() {
        LoginPom login = new LoginPom();
        login.selectJurisdictionandLangaugeForCalifornia();
        login.loginWithValidCredentials_AR2();
        CommonMethods common = new CommonMethods();
        common.handlesecurityQuestion();
    }

    public static void loginTestRegistrar() {
        LoginPom login = new LoginPom();
        login.selectJurisdictionandLangaugeForCalifornia();
        login.loginWithValidCredentials_Registrar();
        CommonMethods common = new CommonMethods();
        common.handlesecurityQuestion();
    }
}
