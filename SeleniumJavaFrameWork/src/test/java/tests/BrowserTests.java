package tests;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import objectPages.GoogleSearchPage;

public class BrowserTests {

    static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kruti\\eclipse-workspace\\SeleniumJavaFrameWork\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.ca/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		GoogleSearchPage.textbox_search(driver).sendKeys("automation step by step");
		GoogleSearchPage.button_search(driver).click();

	}

}
