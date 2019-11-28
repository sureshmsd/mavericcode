package utils;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class driverutils {
	
	public  static WebDriver driver;
	

	public void driver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\muralim\\workspace\\scb\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	
}
