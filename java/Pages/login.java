package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

import net.thucydides.core.annotations.findby.By;
import projectcucumber.baseclass.log.Log;
import projectcucumber.baseclass.log.propertymanager;

import org.apache.log4j.Logger;


public class login {

	public static WebDriver driver;
	final Logger logger = Log.getLogData(Log.class.getName());
	  
	  
	 
	public void Home() throws InterruptedException {
		
		

		String path = System.getProperty("user.dir") + "\\chromedriver.exe";
		System.out.println(path);

		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		logger.info("Browser initialized");	
		  //String baseURL = propertymanager.getInstance().getURL();
		//driver.get("http://elastic.rapidtestpro.com:4391");
		  
		  String URL=System.getProperty("URL");
		driver.get(URL);
		logger.info("Url:(http://elastic.rapidtestpro.com:4391)-loaded successfully");
		driver.manage().window().maximize();
		
		
	}

	
	public void loginHome(String login,String pass) throws InterruptedException {
		Thread.sleep(2000);
		logger.info("Home page-loaded successfully");
	WebElement loginId =driver.findElement(By.xpath("//input[@id=\"name\"]"));
	loginId.sendKeys(login);
	logger.info("User Id Entered");
	WebElement password =driver.findElement(By.xpath("//input[@id=\"password\"]"));
	password.sendKeys(pass);	
	logger.info("Password Entered");
	WebElement loginbtn =driver.findElement(By.xpath("//div[contains(text(),\"LOGIN\")]"));
	loginbtn.click();
	logger.info("User Logged in successfully");
	}
	
	/*public void transfer() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement transferbtn =driver.findElement(By.xpath("//a[contains(text(),\"Transfers\")]"));
		transferbtn.click();
	
	}
	
	public void billing() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement billingBtn =driver.findElement(By.xpath("//a[contains(text(),\"Billing\")]"));
		billingBtn.click();
	
	}
	
	public void financialAnalysis() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement financialAnalysisBtn =driver.findElement(By.xpath("//a[contains(text(),\"Financial Analysis\")]"));
		financialAnalysisBtn.click();
	
	}
	
	public void management() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement managementBtn =driver.findElement(By.xpath("//a[contains(text(),\"Management\")]"));
		managementBtn.click();
	
	}*/
}