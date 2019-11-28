package Pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import net.thucydides.core.annotations.findby.By;

public class accounts extends login {
	public static String acc="";
	public static String bal="";
	public static String sts="";

	public void accounts() throws InterruptedException {
		
		
		Thread.sleep(2000);

		WebElement accountBtn = driver.findElement(By.xpath("//a[contains(text(),\"Accounts\")]"));
		accountBtn.click();
		logger.info("Accounts Section");
	}

	public void accountsOverview_checking(String srch,String balance,String Status) {
		WebElement accOverlbl = driver.findElement(By.xpath("//h3[contains(text(),\"Accounts Overview\")]"));

		Assert.assertEquals(accOverlbl.getText(), "Accounts Overview");

		WebElement showEntdpwn = driver.findElement(By.xpath("//select[@aria-controls='DataTables_Table_0']"));
		List<WebElement> showEntriesdpwn = new ArrayList<WebElement>();
		showEntriesdpwn = driver.findElements(By.xpath("//select[@aria-controls='DataTables_Table_0']/child::option"));

		Select howEntDrpw = new Select(showEntdpwn);

		for (WebElement el : showEntriesdpwn) {
			System.out.println();
			if (el.getText().equals("10")) {
				System.out.println("Dropdown Show 10 found");
				el.click();
				logger.info("Accounts Section-Show Entries: "+el.getText());
				break;
				}
			/* else if (el.getText().equals("25")) {
				System.out.println("Dropdown Show 25 found");
				el.click();
			} else if (el.getText().equals("50")) {
				System.out.println("Dropdown Show 50 found");
				el.click();
			} else if (el.getText().equals("100")) {
				System.out.println("Dropdown Show 100 found");
				el.click();
			}*/ else {

				logger.error("Accounts Section-Dropdown not displayed as expected");
				Assert.fail("Dropdown not displayed as expected");
			}
		}

		WebElement searchtxt = driver
				.findElement(By.xpath("//div[@id='DataTables_Table_0_filter']/child::label/input"));
		
		switch(srch)
		{
		case "Checking" :
			System.out.println("Search based on Checking");
			logger.info("Accounts Section-Search 'Checking'");
		
		searchtxt.sendKeys(srch);		
		
		List<WebElement> accoverTblHeader = new ArrayList<WebElement>();
	
		accoverTblHeader=driver.findElements(By.xpath("//div[@class='panel-body']/child::div/table/thead/tr/th"));

		for(WebElement el:accoverTblHeader)
		{
			String name =el.getText();
			
			if(name.equals("Account"))
			{
				acc=name;
				logger.info("Accounts Section-Accounts column found");
			}
			else if(name.equals("Balance"))
			{
				bal=name;
				logger.info("Accounts Section-Balance column found");
			}
			else if(name.equals("Status")) 
			{
				sts=name;
				logger.info("Accounts Section-Status column found");
			}
			else {
				
				logger.error("Accounts Section-Accounts Overview Table is not displayed as expected");
				Assert.fail("Accounts Overview Table is not displayed as expected");
			}
			
		}
		System.out.println("Header"+acc+"  "+"  "+bal+" "+sts);

		WebElement TblDataacc=driver.findElement(By.xpath("//div[@class=\"panel-body\"]/child::div/table/tbody/tr[1]/td[1]"));
		
		if(TblDataacc.getText().equals(srch))
		{
			System.out.println("Account Overview Table 'Account' data is matched as expected: "+srch);
			logger.info("Accounts Section-Account Overview Table 'Account' data is matched as expected: "+srch);
		}else {
			
			logger.error("Accounts Section-Account Overview Table 'Account' data not is matched as expected: "+srch);
			Assert.fail("Account Overview Table 'Account' data is not matched as expected: "+srch);
		}				
		WebElement TblDatabal=driver.findElement(By.xpath("//div[@class=\"panel-body\"]/child::div/table/tbody/tr[1]/td[2]"));
		
		if(TblDatabal.getText().equals(balance))
		{
			System.out.println("Account Overview Table 'Balance' data is matched as expected: "+balance);
			logger.info("Accounts Section-Account Overview Table 'Balance' data is matched as expected: "+balance);
		}else {
          
          logger.error("Accounts Section-Account Overview Table 'Balance' data not is matched as expected: "+balance);
          Assert.fail("Account Overview Table 'Balance' data is not matched as expected: "+balance);
		}
		
		WebElement TblDatasts=driver.findElement(By.xpath("//div[@class=\"panel-body\"]/child::div/table/tbody/tr[1]/td[3]"));
		
		if(TblDatasts.getText().equals(Status))
		{
			System.out.println("Account Overview Table 'Status' data is matched as expected: "+Status);
			logger.info("Accounts Section-Account Overview Table 'Status' data is matched as expected: "+balance);
		}else {
			
			 logger.error("Accounts Section-Account Overview Table 'Status' data not is matched as expected: "+Status);
			 Assert.fail("Account Overview Table 'Status' data is not matched as expected: "+Status);
		}
		
		
		break;
		}
	}

}
