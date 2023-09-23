package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;
import objectRepository.RegisterPage;

public class BaseClass {
	public static WebDriver driver;
	public static JavaScriptUtility js=new JavaScriptUtility() ;
public static PropertyUtility utility=new PropertyUtility();
public static LoginPage login;
public static RegisterPage register;
@BeforeClass
		public void launchingTheBrowser()
		{
			if(utility.readingDataFromPropertyFile("browser").equalsIgnoreCase("chrome"))
			{
//				WebDriverManager.chromedriver().clearDriverCache().setup();
//				WebDriverManager.chromedriver().clearResolutionCache().setup(); 
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		}
		else if(utility.readingDataFromPropertyFile("browser").equalsIgnoreCase("firefox")){
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
        }
		else if(utility.readingDataFromPropertyFile("browser").equalsIgnoreCase("Edge")){
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login=new LoginPage(driver);
		register=new RegisterPage(driver);
		}

		  
		@BeforeMethod
		public void navigatingToApplication()
		{
			driver.get(utility.readingDataFromPropertyFile("url"));
		}
		@AfterClass
		public void tearDownTheBrowser()
		{
	     driver.quit();
		}
		}
		
 

