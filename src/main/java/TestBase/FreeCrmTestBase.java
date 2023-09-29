package TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCrmTestBase {
	
	public static WebDriver driver ;
	public static Properties Prop;

	public FreeCrmTestBase() throws IOException {
		Prop=new Properties();     
	     String path="C:\\Users\\Dell\\eclipse-workspace\\SonalWithTestNg\\src\\main\\java\\Config\\crm\\credential\\Crm.Properties";
	     FileInputStream fis =new FileInputStream(path);
	     Prop.load(fis);
	}
	
public static void initilization() {
		
		String BrowserName=Prop.getProperty("browser");
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SonalWithTestNg\\driver\\chromedriver.exe");
			
			
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(Prop.getProperty("url"));

}
}
