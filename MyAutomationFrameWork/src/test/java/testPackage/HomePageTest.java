package testPackage;





import org.junit.BeforeClass;
import org.testng.annotations.Test;

import baseTestPackage.BaseTestClass;
import pagePackage.HomePage;

public class HomePageTest extends BaseTestClass {
	
	private HomePage hp;
	
	@BeforeClass
	public void beforeClass() {
	
	hp =new HomePage(driver);
	
	}	
   @Test
   public void titleText() {
	   hp.title();
	   
	
	
	
	 
	
	  

	   
	  
      
    
   
   }  
}
