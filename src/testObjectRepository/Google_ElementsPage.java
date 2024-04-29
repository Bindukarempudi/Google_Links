package testObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google_ElementsPage {
	public static WebElement element=null;
	public static WebDriver driver;
	
	public static List<WebElement> getAllLinks(WebDriver driver){
		List<WebElement> linksList=driver.findElements(By.tagName("a"));
		return linksList;
	} 
	
	public static WebElement getSearchTextBox(WebDriver driver) {
		
		element =driver.findElement(By.id("APjFqb"));
		
		return element;
	}
	
	public static List<WebElement> getSearchOptions(WebDriver driver){
		
		List<WebElement> searchOptionsList=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		return searchOptionsList;
		
	}
	
	public static WebElement getGoogleSearch(WebDriver driver) {
		
		element=driver.findElement(By.xpath("//div[@class='lJ9FBc' ]//input[@class='gNO89b']"));
		
		return element;
	}
	
	public static WebElement getResult(WebDriver driver) {
		
		element =driver.findElement(By.id("result-stats"));
		
		return element;
		
	}
	
	public static WebElement getNews(WebDriver driver) {
		
		element=driver.findElement(By.linkText("News"));
		
		return element;
	}
	
	public static WebElement getImages(WebDriver driver) {
		
		element= driver.findElement(By.linkText("Images"));
		
		return element;
	}
	
	public static WebElement getVideos(WebDriver driver) {
		
		element=driver.findElement(By.linkText("Videos"));
		
		return element;
	}
	
	
	
	

}
