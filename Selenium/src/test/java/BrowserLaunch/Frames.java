package BrowserLaunch;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.KnownElements;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
	
		driver.manage().window().maximize();
                  //NESTED FRAMES		
		WebElement ParentFrame=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(ParentFrame);
		
		WebElement parentText = driver.findElement(By.tagName("body"));//get parent frame text
	        System.out.println( parentText.getText());
		
		WebElement childFrame = driver.findElement(By.xpath("//iframe"));
	     driver.switchTo().frame(childFrame);
	        
	     WebElement childText = driver.findElement(By.tagName("p"));//get child frame text
	        System.out.println( childText.getText());
	        
	         driver.switchTo().defaultContent();// to come out of the frame

	         
	         
	         
	}

}
