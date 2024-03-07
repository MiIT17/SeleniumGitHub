package SearchPageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import objectPages.SearchPageObjects;


public class SearchPageTest {
	 static WebDriver driver = null;
	public static void googleSearchTest() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kruti\\eclipse-workspace\\SeleniumJavaFrameWork\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		SearchPageObjects searchobjpage = new SearchPageObjects(driver);
		searchobjpage.setTextSearchBox("automation step by step");
		searchobjpage.clickSearchButton();
		
		
		
	}

}
