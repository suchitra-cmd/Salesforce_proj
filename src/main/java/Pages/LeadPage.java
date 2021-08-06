
package Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import Elements.Lead_Elements;
import base.base;


public class LeadPage extends base{
	
	public void clickLead() throws Exception
	{
		PageFactory.initElements(driver, Lead_Elements.class);
		//Lead_Elements.leads.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",Lead_Elements.leads);
	}
	public void clickNewLead() throws Exception 
	{
		Thread.sleep(5000);
		Lead_Elements.newLeadClick.click();
	}
	
	public void validateLeadForm()
	{   
		try
		{
		if(Lead_Elements.newLeadHeading.isDisplayed())
			{
			exttest.log(Status.PASS,"Lead form is displayed");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		} 
	}
	public void fillLeadDetails(String salutation,String lastname,String company)
	{
		Lead_Elements.salutation.sendKeys(salutation);
		Lead_Elements.salutation.sendKeys(Keys.ENTER);
		Lead_Elements.lastName.sendKeys(lastname);
		Lead_Elements.company.sendKeys(company);
		
		
		
	}
	public void clickSave() throws Exception
	{
		Lead_Elements.save.click();
	}
	
	public void clickDelete(String name) throws Exception 
	{
		
		Thread.sleep(5000);
		List<WebElement>list=Lead_Elements.leadList;
		System.out.println(list.size());
		for(int i=1;i<=list.size();i++)
		{
				WebElement element=driver.findElement(By.xpath("//tbody/tr["+i+"]/th[1]/span[1]/a"));
				if(element.getAttribute("title").equalsIgnoreCase(name))
				{
					JavascriptExecutor js1=(JavascriptExecutor)driver;
					js1.executeScript("arguments[0].click();",element);
					Thread.sleep(5000);
					Lead_Elements.delete1.click();
					Thread.sleep(5000);
					Lead_Elements.delete2.click();
					Thread.sleep(5000);
					
				}
				i++;
				Thread.sleep(10000);
		}
	}

	
	public void editlead(String x,String y,String z) throws Exception
	{
		Thread.sleep(5000);
		WebElement element=driver.findElement(By.xpath("//tbody/tr[1]/th[1]/span[1]/a"));
		System.out.println(element.getAttribute("title"));
			JavascriptExecutor js1=(JavascriptExecutor)driver;
				js1.executeScript("arguments[0].click();",element);	
				 Thread.sleep(10000);
		 
		 Lead_Elements.edit.click();
		 Thread.sleep(10000);
		 Lead_Elements.title.clear();
		 Lead_Elements.title.sendKeys(x);
		 Thread.sleep(5000);
		 Lead_Elements.email.clear();
		 Lead_Elements.email.sendKeys(y);
		 Thread.sleep(5000);
		 Lead_Elements.company.clear();
		 Lead_Elements.company.sendKeys(z);
		 Thread.sleep(5000);
		 Lead_Elements.editSave.click();
		 Thread.sleep(5000);
		
		}
	
	
	public void webToLead() throws Exception
	{
		try
		{
			((JavascriptExecutor) driver).executeScript("window.open()");
			ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(a.get(1));
			
			driver.get("file:///D:/MagnitiaDocs/webTo.html");
	
		WebElement e=driver.findElement(By.name("salutation"));
		Select sel=new Select(e);
		sel.selectByVisibleText("Mr.");;
		Thread.sleep(5000);
		Lead_Elements.first_name.sendKeys("sachin");
		Lead_Elements.last_name.sendKeys("Tendulkar");
		Lead_Elements.phone1.sendKeys("123456");
		Lead_Elements.email1.sendKeys("sachin@gmail.com");
		Lead_Elements.company1.sendKeys("sachin@gmail.com");
		Lead_Elements.city1.sendKeys("Mumbai");
		Lead_Elements.state.sendKeys("Maharashtra");
				
		Lead_Elements.submit1.click();
		
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
}




	


