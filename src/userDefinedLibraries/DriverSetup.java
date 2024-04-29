package userDefinedLibraries;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverSetup {
	
	public static  WebDriver driver;
	public static String baseUrl="https://www.google.com/";
	
	public static WebDriver getWebDriver(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			 
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			
			
			driver=new EdgeDriver();
		}
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		return driver;
		
		
	}
	
	public static void driverTearDown() {
		driver.quit();
	}

}
