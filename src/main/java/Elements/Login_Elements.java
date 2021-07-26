package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Elements {
	@FindBy(id="username") public static WebElement username;
	@FindBy(id="password") public static WebElement password;
	@FindBy(name="Login") public static WebElement loginButton;
	@FindBy(xpath="//input[@name='rememberUn']") public static WebElement remember;
	
	}
