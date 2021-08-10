package starter.logon;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import starter.logon.LogForm;

public class LogOn {
    public static Performable username(String name) {
        return Task.where("{0} enters username '" + name + "'",
                Enter.theValue(name)
                        .into(LogForm.USER_NAME)
                       // .thenHit(Keys.TAB)
        );
    }

    public static Performable password(String pass) {
        return Task.where("{0} enters password '" + pass + "'",
                Enter.theValue(pass)
                        .into(LogForm.PASSWORD)
                        //.thenHit(Keys.ENTER)
        );
    }

    public static Performable login() {
        return Task.where("{0} clicks Login button",
                Click.on(LogForm.LOGIN_BUTTON)
        );
    }


}
