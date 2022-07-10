package Cucumber.stealmylogin;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import pageObjects.POHomePage;
import pageObjects.POLoginPage;
import resources.Base;

public class LoginIntoHomePage extends Base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(LoginIntoHomePage.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
	}
	
	@Test(dataProvider="getData")
		public void basePageNavigation(String UserName,String Password) throws IOException
		{
			log.info("Initialize the driver successfully");
			driver.get(prop.getProperty("url"));
			log.info("Navigate successfully");
			POLoginPage pl = new POLoginPage(driver);
			pl.getUserName().sendKeys(UserName);
			pl.getpassword().sendKeys(Password);
			log.info("Successfully entered username and password");
			pl.getLoginButton().click();
			log.info("Successfully navigate to Home page");
			POHomePage ph = new POHomePage(driver);
			
			if(ph.getheading().getText().equalsIgnoreCase("Example Domain")) {
				AssertJUnit.assertTrue(true);
				log.info("Showing the Heading Successfully");
			}
			else {
				AssertJUnit.assertFalse(false);
				log.info("Did not Showing the Heading");
			}
		}
	@AfterTest
	public void tearDown() {
		driver.close();
		log.info("Successfully close the browser");
	}

			
			
			

		
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "rupesh";
		data[0][1] = "rupesh123";
		
		
		data[1][0] = "kunal22";
		data[1][1] = "kunal789";
		
		
		return data;
				
	}
	}
