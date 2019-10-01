package commonPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebUiDriver {
	
	public WebUiDriver(ConfigUtil c) {
	
   getDriver(c);
   
	}
public static WebDriver getDriver(ConfigUtil c) {
	WebDriver driver = null;
	
	if((c.browser).equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:/Users/singh/git/repository/MyAutomationFrameWork/Resources/chromedriver.exe" );
	 driver = new ChromeDriver();
	 

	}
	else if((c.browser).equals("firefox")){
		System.setProperty("webdriver.gecko.driver","C:/Users/singh/git/repository/MyAutomationFrameWork/Resources/geckodriver.exe" );
		 driver = new FirefoxDriver();
		 
	
	}
	
	else if((c.browser).equals("Explorer")){
		System.setProperty("webdriver.msedge.driver","C:/Users/singh/git/repository/MyAutomationFrameWork/Resources/msedgedriver.exe" );
		 driver = new EdgeDriver();
		 
	}
	
	driver.get(c.URL);
	return driver;
}


}