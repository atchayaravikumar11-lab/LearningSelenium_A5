package Learnwebvalidation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validatewebelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//a[@ href='/login']"));
			login.click();
			WebElement username = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
			username.sendKeys("atchaya");
			WebElement email = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
			email.sendKeys("atchayaravikumar11@gmail.com");
			WebElement signup = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
			signup.click();
			
			
			

	}

}
