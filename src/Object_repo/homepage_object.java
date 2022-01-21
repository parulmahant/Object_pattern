package Object_repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage_object {

	
	WebDriver driver;
	public homepage_object(WebDriver driver) {
		
		this.driver=driver;
	}
	
By Searchbox=	By.xpath("//input[@id='srchword']");

By Searchbutton=By.cssSelector("input.newsrchbtn");

public WebElement Searchbox() {
	
	return driver.findElement(Searchbox);
}

public WebElement Searchbutton() {
	
	return driver.findElement(Searchbutton);
}
}
