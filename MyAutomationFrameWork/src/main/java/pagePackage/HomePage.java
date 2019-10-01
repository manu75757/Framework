package pagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basePackage.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage(WebDriver driver) {
		
		super(driver);
	}
 
	
	public boolean title() {
	  
    boolean m= driver.findElement(By.xpath("/html/body/header/div[2]/h1/a/img")).isSelected();
	 
     return m;
	  
	  
	  
  }
}
