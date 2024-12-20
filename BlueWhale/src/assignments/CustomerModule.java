package assignments;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait; 

public class CreateCustomer {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
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
