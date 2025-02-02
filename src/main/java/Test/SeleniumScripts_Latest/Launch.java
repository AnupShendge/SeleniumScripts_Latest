package Test.SeleniumScripts_Latest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Launch {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
				driver.get("https://www.google.com");
				driver.manage().window().maximize();
				String title=driver.getTitle();
				System.out.println("Title of the webpage is " + title);
				System.out.println("URL of the webpage is " + driver.getCurrentUrl());
				//System.out.println(driver.getPageSource());
				driver.close();

	}

}
