package PomPackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class EnterTimeTrackPage {
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyHPisDisplayed(WebDriver driver, long ETO, String title)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver,ETO);
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("HomePageIsDisplayed", true);
		}
		catch(Exception e)
		{
			Reporter.log("HomePageIsNotDisplayed", true);
			Assert.fail();	//intentionally failing the testcase
		}
	}
}
