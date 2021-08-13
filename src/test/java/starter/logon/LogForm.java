package starter.logon;

import net.serenitybdd.screenplay.targets.Target;

public class LogForm {

    static Target LOGIN_LOGO = Target.the("login logo").locatedBy("//div[@class = 'login_logo']");
    public static Target LOGIN_CRED = Target.the("login cred").locatedBy("//div[@id = 'login_credentials' and @class = 'login_credentials']");
    public static Target LOGIN_PASS = Target.the("login pass").locatedBy("//div[@class = 'login_password']");

    static Target USER_NAME = Target.the("user name").locatedBy("#user-name");
    static Target PASSWORD = Target.the("password").locatedBy("#password");
    static Target LOGIN_BUTTON = Target.the("login button").locatedBy("#login-button");
}
