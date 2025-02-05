package Test.SeleniumScripts_Latest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
public class File_Download {

    	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
        
        //Create an object of FirefoxProfile class
        FirefoxProfile profile = new FirefoxProfile();
        
        //Set the Key so that it will not show the file download pop up on the screen
        String key = "browser.helperApps.neverAsk.saveToDisk";
        
        //Set the type of file which you want to download
        String value = "application/x-zip-compressed";
        
        //using setPreference() method, change the setting
        profile.setPreference(key, value);
        
        // 0 - save to desktop, 1 - save to download folder( default), 2 - save to any other //location 
        profile.setPreference("browser.downloads.folderList", 2);
        
        //save the file to the given folder location
        profile.setPreference("browser.downloads.dir", "C:\\Users\\Anup\\Downloads\\Others");
        
       /* //Use DesiredCapabilities class to modify the firefox settings as shown below
        DesiredCapabilities cap = DesiredCapabilities.firefox();
        cap.setCapability(FirefoxDriver.PROFILE, profile);*/
        
        /*//Launch the firefox browser with the above modified settings
        WebDriver driver = new FirefoxDriver(cap);*/
        
        FirefoxOptions fo=new FirefoxOptions();
        fo.setProfile(profile);
        
        WebDriver driver=new FirefoxDriver(fo);
        //Enter selenium official website url
        driver.get("http://www.seleniumhq.org/download/");
        
        //Use following-sibling axes in Xpath to find the download link for selenium java 
        driver.findElement(By.xpath("//td[text()='Java']//following-sibling::td[3]/a")).click();
        Thread.sleep(3000);
    }}
