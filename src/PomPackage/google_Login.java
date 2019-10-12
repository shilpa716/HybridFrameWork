package PomPackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class google_Login {
	@FindBy(xpath="//input[@autocomplete=\"username\"]")
	private WebElement user_name;
	
	@FindBy(xpath="//div[@jscontroller='VXdfxd']")
	private WebElement username_next;
	
	@FindBy(xpath="//input[@autocapitalize=\"off\"]")
	private WebElement passwd;
	
	@FindBy(xpath="//div[@class=\"U26fgb O0WRkf zZhnYe e3Duub C0oVfc FliLIb DL0QTb M9Bg4d\"]")
	private WebElement passwd_next;
	
	@FindBy(xpath="//span[@class=\"gb_xa gbii\"]")
	private WebElement signout_logo;

	@FindBy(xpath="//a[contains(.,'Sign out')]")
	private WebElement signout;
	
	@FindBy(xpath="//div[@class=\"UXurCe\"]/div[contains(.,'Use another account')]")
	private WebElement another_account;
			
	public google_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void username_method(String username)
	{
		Reporter.log(username + "in BaseTest");
		user_name.sendKeys(username);
		username_next.click();
	}
	
	public void passwd_method(String password)
	{
		Reporter.log(password + "in BaseTest");
		passwd.sendKeys(password);
		//passwd_next.click();
		passwd_next.sendKeys(Keys.ENTER); //Using "Keys.Enter" because the "Next" button is getting blocked by dropdown box
	}
	
	public void signout_method()
	{
		signout_logo.click();
		signout.click();
		another_account.click();
	}
	
}
