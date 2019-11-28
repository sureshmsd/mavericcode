package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.driverutils;

public class createPayee extends driverutils{  

  @FindBy(how = How.XPATH, using = "//div[text()='Menu']")  
  private WebElement MenuBtn;	 

  @FindBy(how = How.XPATH, using = "//html/body/div[2]/div/div/div/aside/div/div/ul/li[2]/a/div/label/span/img")  
  private WebElement CashBtn;	 

  @FindBy(how = How.XPATH, using = "//label[text()='Create']")  
  private WebElement CreateBtn;	 

  @FindBy(how = How.XPATH, using = "//label[text()='Payee']")  
  private WebElement PayeeBtn;	 
  

  public createPayee(WebDriver driver){	
	this.driver = driver;
	PageFactory.initElements(driver, this);
  }
  
  public WebElement getMenuBtn() {
	return MenuBtn;
  }
  
  public WebElement getCashBtn() {
	return CashBtn;
  }
  
  public WebElement getCreateBtn() {
	return CreateBtn;
  }
  
  public WebElement getPayeeBtn() {
	return PayeeBtn;
  }
    
    
    
    
}