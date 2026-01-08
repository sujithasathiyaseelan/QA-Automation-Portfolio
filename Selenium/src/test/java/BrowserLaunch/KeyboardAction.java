package BrowserLaunch;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.xml.transform.Source;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;


public class KeyboardAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    //driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		Actions A=new Actions(driver);
		WebElement K=driver.findElement(By.id("name"));
		K.sendKeys("Jack");

		// CONTROL Key
		 
//        A.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)  // Ctrl + A
//         .keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL)  // Ctrl + C
//         .perform();
//        
//        A.sendKeys(Keys.TAB).perform();
//        A.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
      
        //CAPSLOCK KEY
       
	}

}
