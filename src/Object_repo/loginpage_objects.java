package Object_repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage_objects {

	WebDriver driver;
	

	public loginpage_objects(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
 

By username=	By.id("txtlogin");
By password =By.xpath("//input[@id='pass_box']");
By button= By.cssSelector("input[value='Login']");
By  Home =By.xpath("//a[@title='Rediff.com Home']");

public WebElement username() {
	
return	driver.findElement(username);
}

public WebElement password() {
	
	return driver.findElement(password);
}
public WebElement button() {
	
	return driver.findElement(button);
}

public WebElement Home() {
	
	return driver.findElement(Home);
}

}

