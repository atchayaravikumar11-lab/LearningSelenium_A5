package LearningLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnid {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://sauce-demo.myshopify.com/");
		 driver.manage().window().maximize();

	        //driver.get("https://www.saucedemo.com/");

	        WebElement untxtfld = driver.findElement(By.id("user-name"));
	        untxtfld.sendKeys("standard_user");
	        WebElement ptxtfld = driver.findElement(By.id("password"));
	        ptxtfld.sendKeys("secret_sauce");
	        WebElement login = driver.findElement(By.id("login-button"));
	        login.click();
	        driver.close();
	       
	}

}
