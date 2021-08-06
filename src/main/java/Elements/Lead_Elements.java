package Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Lead_Elements {
	@FindBy(xpath="//span[text()='Leads'][1]") public static WebElement leads;
	@FindBy(xpath="//div[@title='New']") public static WebElement newLeadClick;
	@FindBy(xpath="//h2[text()='New Lead']") public static WebElement newLeadHeading;
	 
	@FindBy(xpath="//input[@name='salutation']") public static WebElement salutation;
	@FindBy(xpath="//input[@name='firstName']") public static WebElement firstname; 
	@FindBy(xpath="//input[@name='firstName']") public static WebElement middleName; 
	@FindBy(xpath="//input[@name='lastName']") public static WebElement lastName;
	@FindBy(xpath="//span[text()='Lead Owner']") public static WebElement leadowner;
	@FindBy(name="Website") public static WebElement website;
	@FindBy(name="suffix") public static WebElement suffix;
	@FindBy(xpath="//input[@name='Title']") public static WebElement title;
	@FindBy(xpath="//input[@name='Company']") public static WebElement company;
	@FindBy(xpath="//input[@name='Email']") public static WebElement email;
	@FindBy(name="Phone") public static WebElement phone;
	@FindBy(name="MobilePhone") public static WebElement mobile;
	@FindBy(id="input-213") public static WebElement industry ;
	@FindBy(id="input-238") public static WebElement rating;
   @FindBy(name="NumberOfEmployees") public static WebElement noOfEmp;
   @FindBy(id="input-229") public static WebElement leadSource;
   @FindBy(id="input-260") public static WebElement address;
    @FindBy(name="street") public static WebElement street;
    @FindBy(name="city") public static WebElement city;
    @FindBy(name="province") public static WebElement province;
    @FindBy(name="postalCode") public static WebElement postalCode;
    @FindBy(name="country") public static WebElement country;
    
    @FindBy(xpath="//button[text()='Save']") public static WebElement save;
    
    @FindBy(xpath="//table[1]/tbody/tr") public static List<WebElement> leadList;
    @FindBy(xpath="//table[1]/tbody/tr[\"+i+\"]/td[2]/following::a") public static WebElement leadClick;
    		
    @FindBy(xpath="(//button[text()='Delete'])") public static WebElement delete1;
    @FindBy(xpath="//span[text()='Delete']") public static WebElement delete2;
    
    @FindBy(xpath="//button[text()='Edit']") public static WebElement edit;
    @FindBy(xpath="//button[text()='Save']") public static WebElement editSave;
    
   @FindBy(xpath="//input[@name='first_name']") public static WebElement first_name;
	@FindBy(xpath="//input[@name='last_name']") public static WebElement last_name;
	@FindBy(xpath="//input[@name='phone']") public static WebElement phone1;
	@FindBy(xpath="//input[@name='email']") public static WebElement email1;
	@FindBy(xpath="//input[@name='company']") public static WebElement company1;
	@FindBy(xpath="//input[@name='city']") public static WebElement city1;
	@FindBy(xpath="//input[@name='state']") public static WebElement state;
	@FindBy(xpath="//input[@name='submit']") public static WebElement submit1;
    
}
