package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.driverutils;

public class loginpom extends driverutils {

	@FindBy(how = How.XPATH, using = "//label[@for='userid_email-name']/parent::div/input")
	public WebElement UserID;

	@FindBy(how = How.XPATH, using = "//label[@for='group_id-name']/parent::div/input")
	private WebElement GroupID;

	@FindBy(how = How.XPATH, using = "//label[text()='Remember me']")
	private WebElement RemCk;

	@FindBy(how = How.XPATH, using = "//p[text()='CONTINUE']")
	private WebElement ContBtn;

	@FindBy(how = How.XPATH, using = "//label[@for='unified_password-name']/parent::div/input")
	private WebElement Password;

	@FindBy(how = How.XPATH, using = "//p[text()='LOGIN']")
	private WebElement Loginbtn;
	

	public loginpom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserID() {
		return UserID;
	}

	public WebElement getGroupID() {
		return GroupID;
	}

	public WebElement getRemCk() {
		return RemCk;
	}

	public WebElement getContBtn() {
		return ContBtn;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginbtn() {
		return Loginbtn;
	}

}
