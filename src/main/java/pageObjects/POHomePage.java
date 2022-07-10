package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POHomePage {
	WebDriver driver;

	public POHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(xpath="//div/h1")
	WebElement Heading;
	
	public WebElement getheading() {
		return Heading;
	}
}
