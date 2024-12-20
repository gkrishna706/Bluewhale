package com.bluewhale.testscript;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.bluewhale.generic.BaseClass;
import com.bluewhale.pom.HomePage;
import com.bluewhale.pom.LoginPage;
import com.bluewhale.pom.UserListPage;

public class UserModule extends BaseClass {
	LoginPage l;
	HomePage h;
	@Test
	public void createUser() throws IOException {
		
		String url=f.getPropertyData("url");
		driver.get(url);
		String un = f.getPropertyData("un");
		String pwd = f.getPropertyData("pwd");
		l=new LoginPage(driver);
		l.login(un,pwd);
		h=new HomePage(driver);
		h.setUsers();
	}
}
