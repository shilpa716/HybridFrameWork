package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTime_Login {
	@FindBy(id = "username")
	private WebElement user_name;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement login_Button;
	
	public actiTime_Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username_Method(String name)
	{
		user_name.sendKeys(name);
	}
	
	public void password_method(String pw_name)
	{
		password.sendKeys(pw_name);
	}
	
	public void login_click()
	{
		login_Button.click();
	}
	

}
