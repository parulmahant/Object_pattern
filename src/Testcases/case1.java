package Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Object_repo.homepage_object;
import Object_repo.loginpage_objects;

public class case1 {

	@Test
	public static void case_1() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://mypage.rediff.com/login/dologin");
		loginpage_objects object1=new loginpage_objects(driver);
		
		object1.username().sendKeys("hello@gmail.com");
		object1.password().sendKeys("12345");
		
		object1.button().click();
		object1.Home().click();
		
		homepage_object object2=new homepage_object(driver);
		object2.Searchbox().sendKeys("bags");
		object2.Searchbutton().click();
	}

}
