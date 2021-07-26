package Pages;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import Elements.Lead_Elements;
import Elements.Login_Elements;
import base.base;

public class LoginPage extends base {
	
	public void openUrl() throws Exception
	{
		PageFactory.initElements(driver, Login_Elements.class);
		PageFactory.initElements(driver, Lead_Elements.class);
		try
		{
		exttest=report.createTest("Login-Page");
	
		URL u=new URL(prop.getProperty("url"));
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		con.connect();
		
		if(con.getResponseMessage().equalsIgnoreCase("OK"))
		{
			exttest.log(Status.PASS,"Url Working Properly");
			Thread.sleep(10000);
			driver.get(prop.getProperty("url"));
		
		}
		else
		{
			exttest.log(Status.FAIL,"Url Not Working Properly");
			
			
		}
		}
		catch(Exception ex)
		{
			exttest.log(Status.FAIL,"Failed");
		}
		
		
	}
	
	
	public void validlogin() throws Exception
	{
		Login_Elements.username.sendKeys("suchitra_mb-jjpg@force.com");
				
		Login_Elements.password.sendKeys("Dambal@123");
		
		Login_Elements.remember.click();
		
		Login_Elements.loginButton.click();
		Thread.sleep(10000);
		
		
	}
	
	}


