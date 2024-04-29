package userDefinedLibraries;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public static String filePath=System.getProperty("user.dir")+"\\Screenshots\\";
	
	public static void getScreenShot(WebDriver driver,String fileName){
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des =new File(filePath+fileName);
		try {
			FileUtils.copyFile(src, des);
		}catch(IOException e) { 
			System.out.println(e.getMessage());
		} 
		
	}

}
