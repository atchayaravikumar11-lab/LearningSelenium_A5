package HandlingMouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleHiddenElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://demowebshop.tricentis.com/");

		// Steps To Perform Mouse operation
		// 1.Create an object for Actions
		Actions actionobj = new Actions(driver);

		WebElement ele1 = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Computers')]"));

		// 2. Using reff,call res non static method
		// 3. call the mandatory method
		
		//actionobj.moveToElement(ele1).perform();

		WebElement ele2 = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Desktops')]"));

		// actionobj.click(ele2).perform();

		actionobj.moveToElement(ele2).click().perform();

	}
}
