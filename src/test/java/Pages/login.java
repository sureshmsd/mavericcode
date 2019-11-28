package Pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

import net.thucydides.core.annotations.findby.By;
import utils.driverutils;

import org.apache.log4j.Logger;


public class login extends driverutils {

	
		driverutils util =new driverutils();  	  	 
	public void Home() throws InterruptedException {
		util.driver();
		driver.get("https://s2bssotest.standardchartered.com/unifiedlogin/v2.0/login/index.html?language=en");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		loginpom obj =new loginpom(driver);
		obj.getUserID().sendKeys("user000015");
		obj.getGroupID().sendKeys("uatsgee1");
		obj.getRemCk().click();
		obj.getContBtn().click();
		obj.getPassword().sendKeys("dummyaaaa");
		obj.getLoginbtn().click();
		Thread.sleep(20000);
	}
	public void createpayee() throws InterruptedException
	{
		
		createPayee obja= new createPayee(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", obja.getMenuBtn());		
		obja.getCashBtn().click();
		obja.getCreateBtn().click();
		obja.getPayeeBtn().click();
		
	}

	
	
}