import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kruti\\eclipse-workspace\\SeleniumJavaFrameWork\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumhq.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

}
