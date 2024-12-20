package com.bluewhale.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {
	@FindBy (className="buttonText")
	private WebElement addUserBtn;
	@FindBy (id= "userDataLightBox")
	private WebElement userPopup;
	@FindBy (name="firstName")
	private WebElement firstNameTbx;
	@FindBy (name= "lastName")
	private WebElement lastNameTbx;
	@FindBy (name="email")
	private WebElement emailTbx;
	@FindBy (name="username")
	private WebElement usernameTbx;
	@FindBy (name="password")
	private WebElement passwordTbx;
	@FindBy (name= "passwordCopy")
	private WebElement passwordCopyTbx;
	@FindBy (id="userDataLightBox_commitBtn")
	private WebElement createUserBtn;
	@FindBy (xpath= "//input[contains(@class,'filterFieldInput')]")
	private WebElement searchTbx;
	@FindBy (className="highlightToken")
	private WebElement createdUser;
	
	public UserListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void userList(String fn, String ln, String email, String un, String pwd, String pwdc) {
		addUserBtn.click();
		userPopup.click();
		firstNameTbx.sendKeys(fn);
		lastNameTbx.sendKeys(ln);
		emailTbx.sendKeys(email);
		usernameTbx.sendKeys(un);
		passwordTbx.sendKeys(pwd);
		passwordCopyTbx.sendKeys(pwdc);
		createUserBtn.click();
		searchTbx.sendKeys(fn);
		createdUser.click();	
	}
	

}
