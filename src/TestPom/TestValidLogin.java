package TestPom;


import org.testng.annotations.Test;

import GenericMethod.BaseTest;
import GenericMethod.XL;
import PomPackage.EnterTimeTrackPage;
import PomPackage.actiTime_Login;

public class TestValidLogin extends BaseTest {
	@Test
	public void testValidLogin()
	{
		String name = XL.getdata(XL_PATH, "Sheet1", 3, 0);
		String pw_name = XL.getdata(XL_PATH, "Sheet1", 3, 1);
		String title = XL.getdata(XL_PATH, "Sheet1", 3, 2);
		
		actiTime_Login lp = new actiTime_Login(driver);
		lp.username_Method(name);
		lp.password_method(pw_name);
		lp.login_click();
		
		EnterTimeTrackPage etp = new EnterTimeTrackPage(driver);
		etp.verifyHPisDisplayed(driver, 5, title);
				
	}
	
	
}
