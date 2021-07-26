
package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LeadOps_Elements {
@FindBy(xpath="(//span[text()='Working'])[1]") public static WebElement working;
@FindBy(xpath="//span[text()='Nurturing']") public static WebElement Nurturing;
@FindBy(xpath="(//span[text()='Converted'])[1]") public static WebElement converted;
@FindBy(xpath="//span[text()='Select Converted Status']") public static WebElement selectConverted;
@FindBy(xpath="//span[text()='Convert']") public static WebElement covertClick;
@FindBy(xpath="//button[text()='Go to Leads']") public static WebElement goToLeads;

@FindBy(xpath="//div[@title='Import']") public static WebElement importClick ;
@FindBy(xpath="//table/tbody/tr[2]/td/a") public static WebElement leadss;
@FindBy(linkText="Add new records") public static WebElement addNewRecords ;
@FindBy(xpath="//span[text()='CSV']") public static WebElement csv;
@FindBy(linkText="Add new and update existing records") public static WebElement addNew ;
@FindBy(xpath="//input[@type='file']") public static WebElement chooseFile;
@FindBy(xpath="//a[text()='Next']") public static WebElement next;
@FindBy(xpath="//a[text()='Start Import']") public static WebElement startImport ;
@FindBy(xpath="//a[text()='OK']") public static WebElement ok;

//@FindBy(xpath="//div[@class='setupGear']") public static WebElement setupGear;
@FindBy(xpath="//*[@id='75:243;a']") public static WebElement setupGear;


@FindBy(xpath="//div[@role='menu']//li[1]") public static WebElement setupButton;
@FindBy(xpath="//span[text()='Object Manager']") public static WebElement objectManager;
@FindBy(xpath="//a[text()='Lead']") public static WebElement clickonlead;
@FindBy(xpath="//a[contains(text(),'Fields &')]") public static WebElement fieldsandrelations;
@FindBy(xpath="//h3[text()='Field Information']") public static WebElement fieldinfo;

}
