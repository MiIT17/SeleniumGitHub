/*
 * Changes for Release1
 * */
package objectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPageObjects {
 
	WebDriver driver = null;
	By textbox_search = By.id("lst-id");
	By button_search =  By.name("BtnK");
	
	
	public SearchPageObjects(WebDriver driver) {
		
		this.driver = driver;
	}
	public void setTextSearchBox(String text) {
		
		driver.findElement(textbox_search).sendKeys(text);
	}
	
	public void clickSearchButton() {
		driver.findElement(button_search).click();
		
	}
	
}
