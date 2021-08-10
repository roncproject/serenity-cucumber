package starter.logon;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static Target TITLE = Target.the("productpage title").locatedBy("//span[contains(text(),'Products')]");
    //static Target USER_NAME = Target.the("user name").locatedBy("//input[@id='user-name']");
    //static Target USER_NAME = Target.the("user name").locatedBy("#et_pb_contact_name_0");
//    static Target PASSWORD = Target.the("password").locatedBy("#password");
//    static Target LOGIN_BUTTON = Target.the("login button").locatedBy("#login-button");
}
