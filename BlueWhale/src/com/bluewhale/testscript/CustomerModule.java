package com.bluewhale.testscript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bluewhale.generic.BaseClass;
import com.bluewhale.pom.LoginPage; 

public class CustomerModule extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		String url=f.getPropertyData("url");
		driver.get(url);
		String un = f.getPropertyData("un");
		String pwd = f.getPropertyData("pwd");
		LoginPage l=new LoginPage(driver);
		l.login(un,pwd);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.linkText("TASKS")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='+ New Customer']")));
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys("apple");
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("This customer belong to USA");
	    driver.findElement(By.xpath("//button[contains(text(),'active')]")).click();
	    driver.findElement(By.linkText("Boston Chocolate")).click();
	    driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
	    driver.quit();
	    
	    
	}

}