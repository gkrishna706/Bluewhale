package com.bluewhale.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.bluewhale.pom.HomePage;
import com.bluewhale.pom.LoginPage;
import com.bluewhale.pom.UserListPage;

public class Demo {
		@Test
		public void demo() {
			WebDriver driver=new ChromeDriver();
			driver.get("http://localhost/login.do");
			LoginPage lp=new LoginPage(driver);
			lp.login("admin","manager");
			HomePage hp=new HomePage(driver);
			hp.setUsers();
			UserListPage ulp=new UserListPage(driver);
			ulp.userList("Gopal","krishna","gkrishna21@gmail.com","gk113","gk123456","gk123456");
		}

	}
