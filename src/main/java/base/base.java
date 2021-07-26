package base;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	
	public static ExtentHtmlReporter exthtml;
    public static ExtentTest exttest;
    public static ExtentReports report;
    	
	@BeforeSuite
	public void setUp()
		{
	     prop=new Properties();
		try
		{
			prop.load(new FileInputStream("src/main/java/config/config.properties"));
		}
		catch(Exception ex)
		{}
		
		
			if(prop.getProperty("browsername").matches("firefox"))
			{
				driver=new FirefoxDriver();
			}
			else if(prop.getProperty("browsername").matches("chrome"))
			{
				ChromeOptions co=new ChromeOptions();
	    		String[] s=new String[] {"enable-automation"};
	    		co.setExperimentalOption("excludeSwitches",s);
	    		co.addArguments("--disable-notifications");
	    		//chrome_opt = webdriver.ChromeOptions()
	    		Map<String, Object> prefs = new HashMap<String, Object>();
	    		prefs.put("credentials_enable_service", false);
	    		prefs.put("profile.password_manager_enabled", false);

	    		co.setExperimentalOption("prefs", prefs);

	    		
	    		WebDriverManager.chromedriver().setup();
	    		
	    		driver=new ChromeDriver(co);
				
				
			}
			
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    
   	wait=new WebDriverWait(driver, 120);
   	exthtml = new ExtentHtmlReporter(prop.getProperty("reportlocation"));
	   report = new ExtentReports();
	   report.attachReporter(exthtml);
	   report.setSystemInfo("Host Name", "krs");  //name of the system
	   report.setSystemInfo("Environment", "Test Env");
	   report.setSystemInfo("User Name", "Suchitra");
	   
	   exthtml.config().setDocumentTitle("Salefore");
	   exthtml.config().setReportName("Saleforce Functional Testing");
	   exthtml.config().setTestViewChartLocation(ChartLocation.TOP);
	   exthtml.config().setTheme(Theme.STANDARD);
}
	public void takeScreenshot(String imagename) throws Exception
    {
    	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{FileUtils.copyFile(f,new File(prop.getProperty("screenshots")+imagename));
		    exttest.addScreenCaptureFromPath(prop.getProperty("screenshots")+imagename);}catch(Exception e) {}
    }
   	
		

	@AfterSuite
		public void close()
		{
		
		//driver.close();
		//report.flush();
		try {
		Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");
		Runtime.getRuntime().exec("taskkill /f /im geckodriver.exe");}catch(Exception e) {}
			}

		}
	


