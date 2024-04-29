package testScenario;


import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testObjectRepository.Google_ElementsPage;
import userDefinedLibraries.*;

public class GoogleLinks{
	
	public static String browser;
	
	public static List<WebElement> linksList,searchOptionsList;
	
	public static WebDriver driver;
	
		
	

	
	public static void driverConfig(String browser) {
		
		//Instantiate driver
		
		driver=DriverSetup.getWebDriver(browser);
		
		
		
	}
	
	public static void noOfLinks() {
		
		//Finding number of links in the web page
		linksList=Google_ElementsPage.getAllLinks(driver);
		int linksCount=linksList.size();
		
		System.out.println("Number of links in the web page:"+linksCount);
		
	}
	
	public static void displayAllLinks() {
		
		//Displaying all the link names
		System.out.println("Links names:");
		for(WebElement l:linksList) {
			System.out.println(l.getText()+"-->"+l.getAttribute("href"));
		}
		
	}
	
	public static void insertTextInSearchBox() {
		
		//Inserting "Cognizant" in search text box
		
	   WebElement searchTextBox=Google_ElementsPage.getSearchTextBox(driver);
		
		searchTextBox.sendKeys("Cognizant");
		
	}
	
	public static void noOfSearchOptions()  {
		
		//Finding the number of search options displayed
		
		searchOptionsList=Google_ElementsPage.getSearchOptions(driver);
		int searchOptionsCount=searchOptionsList.size();
		
		System.out.println("Number of search options:"+searchOptionsCount);
		try {
		ScreenShot.getScreenShot(driver, "searchOptions_page.png");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void displayAllSearchOptions() {
		
		//Displaying all search options
		System.out.println("Search Options :");
		for(WebElement s:searchOptionsList) {
			System.out.println(s.getText());
		}
		
	}
	
	public static void clickOnGoogleSearch() {
		
		//Clicking on GoogleSearch button
		
		WebElement googleSearchButton=Google_ElementsPage.getGoogleSearch(driver);
		
		googleSearchButton.click();
		
	}
	
	public static void displayResults()  {
		
		//Displaying result
		try {
		WebElement result=Google_ElementsPage.getResult(driver);
		
		String res=result.getText();
		
		String[] str=res.split(" ");
		System.out.println("About for "+str[1]);
	
		}
		catch(Exception e) {
			System.out.println("Result text is not displayed");
		}
		
		//Capturing  screenshot of result page
		try {
			ScreenShot.getScreenShot(driver, "searchResultAll_page.png");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void clickOnImages() {
		
		//Clicking on "Images"
		
		WebElement images=Google_ElementsPage.getImages(driver);
		
		images.click();
		
		//Capturing  screenshot of result page
		try {
			ScreenShot.getScreenShot(driver, "images_page.png");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void clickOnNews(){
		
		//Clicking on "News"
		
		WebElement news=Google_ElementsPage.getNews(driver);
		
		news.click();
		
		//Capturing  screenshot of result page
		try {
		ScreenShot.getScreenShot(driver, "news_page.png");
		}
		catch(Exception e) {
			e.printStackTrace();;
		}
		
		
	}
	
	public static void clickOnVideos()  {
		
		//Clicking on "Videos"
		
		WebElement videos=Google_ElementsPage.getVideos(driver);
		
		videos.click();
		
		//Capturing  screenshot of result page
		try {
		ScreenShot.getScreenShot(driver, "videos_page.png");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void closeBrowser() {
		
		DriverSetup.driverTearDown();
		
		System.out.println("Closed the browser");
		
	}
	
	public static void main(String[] args)  {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter browser name(Chrome or Edge)");
			
	    browser=sc.nextLine();
		
		sc.close();
		
		
		driverConfig(browser);
		
		noOfLinks();
		
		displayAllLinks();
		
		insertTextInSearchBox();
		
		noOfSearchOptions();
		
		displayAllSearchOptions();
		
		clickOnGoogleSearch();
		
		displayResults();
		
		clickOnImages();
		
		clickOnNews();
		
		clickOnVideos();
		
		closeBrowser();
		
		
		
		
		
		
		
		
		
		

	}

}
