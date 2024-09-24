package inrtBanking_testcase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseUrl="https://demo.guru99.com/v4/";
	public String username="mngr164225";
	public String Password="jahetAp"; 
	public static WebDriver driver;	
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "C:\\selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}

}


