package Learnwebvalidation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFetchValues {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		//to get a title
		WebElement title = driver.findElement(By.xpath("//div[@class='login_logo']"));
		String text = title.getText();
		System.out.println(text);
		//tagname
		String tagname = title.getTagName();
		System.out.println(tagname);
		//attribute
		String attribute = title.getAttribute("class");
		System.out.println(attribute);
		//css property
		String cssval = title.getCssValue("font");
		System.out.println(cssval);
		//size
		Dimension asize = title.getSize();
		System.out.println(asize);
		int width = asize.getWidth();
		System.out.println(width);
		int heigth = asize.getHeight();
		System.out.println(heigth);
		//location
		Point location = title.getLocation();
		System.out.println(location);
		int xpos = location.getX();
		System.out.println(xpos);
		int ypos = location.getY();
		System.out.println(ypos);
		// compare actual and expected value
		String exptitle = "Swag Labs";
		String exptag = "div";
		String expcss = "font-family";
		String expatt = "login_logo";
		int exp_width = 1536;
		int exp_height = 10;
		if (text == exptitle && tagname == exptag && cssval == expcss && attribute == expatt && width == exp_width
				&& heigth == exp_height) {
			System.out.print(true);
		} else {
			System.out.print(false);
		}

		driver.close();
	}

}
