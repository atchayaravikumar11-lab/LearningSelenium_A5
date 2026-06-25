package HandlingScreenshot;


import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.v146.page.model.FileHandler;
import org.openqa.selenium.io.FileHandler;

public class HandleScreenshot {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempath= ts.getScreenshotAs(OutputType.FILE);
		File permanentpath = new File("./src/test/resources/TestScreenshot/screenshot.png");
		try {
			FileHandler.copy(tempath, permanentpath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.close();
		// TODO: handle exception
		}


	

}


