package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POLoginPage {
	WebDriver driver;

	public POLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(xpath="//input[@name='username']")
	WebElement UserName;
	
	private @FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	private @FindBy(xpath="//input[@value='login']")
	WebElement Login;
	
	
	
	public WebElement getUserName() {
		return UserName;
	}
	public WebElement getpassword() {
		return Password;
	}
	public WebElement getLoginButton() {
		return Login;
	}

}
