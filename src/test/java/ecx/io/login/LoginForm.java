package ecx.io.login;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

public class LoginForm {
    static Target USER_FIELD = Target.the("username field")
                                       .locatedBy("#user-name");
    static Target PASSWORD_FIELD = Target.the("password field")
                                       .locatedBy("#password");

    public static Performable enterUsernameAndPassword(String username, String password) {
        return Task.where("{0} enter username '" + username + "' and password '" + password + "'",
                Enter.theValue(username).into(USER_FIELD)
                .then(Enter.theValue(password).into(PASSWORD_FIELD)
                .thenHit(Keys.ENTER))
        );
    }

}
