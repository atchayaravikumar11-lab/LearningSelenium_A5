package HandlingJScode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnJScode {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
	JavascriptExecutor jsobj = (JavascriptExecutor)driver;
	//nav to app
	jsobj.executeScript("window.location=arguments[0]","https://automationexercise.com/");
	jsobj.executeScript("history.go(0)");
	System.out.println(jsobj.executeScript("return document.title"));
	System.out.println(jsobj.executeScript("return document.URL"));
	jsobj.executeScript("arguments[0].click()",driver.findElement(By.partialLinkText("Log")));
	jsobj.executeScript("arguments[0].value='atchayaa'",driver.findElement(By.name("name")));
	jsobj.executeScript("arguments[0].value='jack112233@gmail.com'",driver.findElement(By.xpath("//input[@data-qa='signup-email']")));
	jsobj.executeScript("arguments[0].click()",driver.findElement(By.xpath("//button[@data-qa='signup-button']")));
	
	jsobj.executeScript("arguments[0].scrollIntoView(false)",driver.findElement(By.xpath("//h2/b[text()='Address Information']")));
	Thread.sleep(2000);
	jsobj.executeScript("window.scrollBy(0,500)");
	driver.close();
}
}