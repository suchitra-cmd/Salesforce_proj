package Pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Elements.LeadOps_Elements;
import Elements.Lead_Elements;
import base.base;


public class LeadOpsPage extends base{
	public void convert() throws Exception
	{
		PageFactory.initElements(driver, Lead_Elements.class);
		PageFactory.initElements(driver, LeadOps_Elements.class);

		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",Lead_Elements.leads);
		Thread.sleep(5000);
		
		WebElement element=driver.findElement(By.xpath("//tbody/tr[1]/th[1]/span[1]/a"));
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].click();",element);		
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",LeadOps_Elements.converted);
		Thread.sleep(6000);	
		
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click();",LeadOps_Elements.selectConverted);
		Thread.sleep(5000);	
		
		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("arguments[0].click();",LeadOps_Elements.covertClick);
		Thread.sleep(6000);	
		
		JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("arguments[0].click();",LeadOps_Elements.goToLeads);
		Thread.sleep(6000);	
		
	}
	
	public void toImport() throws Exception
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",Lead_Elements.leads);
		Thread.sleep(5000);
		LeadOps_Elements.importClick.click();
		Thread.sleep(10000);
	
		driver.switchTo().frame(0);
		LeadOps_Elements.leadss.click();
		
		Thread.sleep(6000);
		LeadOps_Elements.addNewRecords.click();
	
		LeadOps_Elements.csv.click();
		JavascriptExecutor js5=(JavascriptExecutor)driver;
		js5.executeScript("arguments[0].scrollIntoView(true);", LeadOps_Elements.addNew);
		LeadOps_Elements.chooseFile.sendKeys("D:\\MagnitiaDocs\\ImportScenario.csv");
		
		LeadOps_Elements.next.click();
		Thread.sleep(5000);
		LeadOps_Elements.next.click();
		Thread.sleep(5000);
		LeadOps_Elements.startImport.click();
		
		Thread.sleep(5000);
		LeadOps_Elements.ok.click();
		Thread.sleep(5000);
	}
	
	public void validateIndustry() throws InterruptedException {
		
		/*Thread.sleep(5000);
		JavascriptExecutor js0=(JavascriptExecutor)driver;
		js0.executeScript("arguments[0].click();",LeadOps_Elements.setupGear);
		Thread.sleep(5000);*/
		//LeadOps_Elements.setupGear.click();
		//LeadOps_Elements.setupButton.click();
		//Thread.sleep(5000);
		
		ArrayList<String> ojbMgr=new ArrayList<String>();
		ArrayList<String> dropdown=new ArrayList<String>();
		
		WebElement e=driver.findElement(By.xpath("(//*[@class='slds-combobox_container'])[4]//child::div[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",e);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",e);
		List<WebElement> list=e.findElements(By.xpath("child::*[contains(@data-value,'')]/following-sibling::*//*[@class='slds-media__body']//*"));
		
		
		for(WebElement l:list)
		{
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);
			String x=(String)((JavascriptExecutor) driver).executeScript("return arguments[0].textContent;", l);
				x=x.trim();
				dropdown.add(x);
		}
		
		Collections.sort(dropdown);
		for(int i=0;i<dropdown.size();i++)
		{
			System.out.println(dropdown.get(i));
		}
		
		
		
		
		
	}

}

