package week4;
import java.io.IOException;
import org.junit.Test;
public class OpenTapsWrapper extends GeneralWrapperClass {
	public void loginOpenTaps(String browser, String username, String password) {
		launchapp(browser, "http://demo1.opentaps.org/opentaps/control/main");
		enterById("username", username);
		enterById("password", password);
		clickByClassName("decorativeSubmit");
	}
}