package LearnWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// step:1 open browser
		WebDriver driver = new ChromeDriver();
// step :2 navigate to browser
		driver.get("https://www.google.com/");
		//step:3 pass expected url
		String exp_url = "https://www.naukri.com/";
		String act_url = driver.getCurrentUrl();
		//step:4 comapres
		if (exp_url.equals(act_url)) {

			System.out.println("url verified-pass");
		} else {
			System.out.println("url verified-fail");
		}
		//step:5 close 
		driver.close();
	}

}
