package Handlingsynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learningseleniumwait {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30l));

		driver.get("https://www.shoppersstack.com/");
		WebElement title = driver.findElement(By.xpath("//h3[text()='Welcome to ShoppersStack. Enjoy shopping with us.']"));
		String text = title.getText();
		System.out.println(text);
	   WebElement login= driver.findElement(By.cssSelector("#loginBtn"));
	   login.click();
	   driver.close();
	   
	}

}
