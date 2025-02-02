package BasicSeleniumScripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser extends BaseClass {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("Title of the webpage is " + title);
		System.out.println("URL of the webpage is " + driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.close();
	}

}
