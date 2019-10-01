package commonPackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtil {
	
	final String config_file="C:/Users/singh/git/repository/MyAutomationFrameWork/Resources/Config.properties";
    public String URL;
    public String browser;
    
    
    public ConfigUtil() throws FileNotFoundException, IOException {
    	
    	Properties prop = new Properties();
    	prop.load(new FileReader(config_file));
    	browser =prop.getProperty("browser");
    	System.out.println("the browser is"+" "+ browser);
    	URL = prop.getProperty("URL");
    	System.out.println("the url is"+" "+ URL);
    	
    	}
    
    
    
 
}
	

	


