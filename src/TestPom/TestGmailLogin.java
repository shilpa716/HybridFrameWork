package TestPom;

import org.testng.annotations.Test;
import PomPackage.google_Login;

import GenericMethod.BaseTest;
import GenericMethod.XL;

public class TestGmailLogin extends BaseTest{
	@Test
	public void GmailLogin()
	{
		String username = XL.getdata(XL_PATH, "Sheet1", 1, 0);
		String password = XL.getdata(XL_PATH, "Sheet1", 1, 1);
		
		google_Login gl = new google_Login(driver);
		gl.username_method(username);
		gl.passwd_method(password);
		gl.signout_method();
		
	}
	
}
