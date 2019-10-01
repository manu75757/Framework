package baseTestPackage;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import commonPackage.ConfigUtil;
import commonPackage.WebUiDriver;

public class BaseTestClass {
	
	protected WebDriver driver;


		@BeforeSuite
		public void beforeSuit() throws FileNotFoundException, IOException {
	    ConfigUtil c = new ConfigUtil();
	    
	   this.driver = WebUiDriver.getDriver(c);
	    
	   
	

}
        @AfterSuite
        public void closingWindow() {
        	
        driver.quit();
	  
  }

}
