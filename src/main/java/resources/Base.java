package resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public  WebDriver baseDriver;
	public WebDriver startUp(){
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		 baseDriver = new ChromeDriver();
		 
		 baseDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 return baseDriver;
		 
	}
	

}
