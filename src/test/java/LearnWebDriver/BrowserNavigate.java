package LearnWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.google.com/");
driver.navigate().to("https://www.myntra.com/");
driver.navigate().back();
driver.navigate().forward();
driver.close();
	}

}
