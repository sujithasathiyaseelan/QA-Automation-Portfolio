package BrowserLaunch;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class LaunchingVideos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
       
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// WebElement Wt=driver.findElement(By.xpath("//button[@class='card-footer-item button is-primary']"));
		 //js.executeScript("arguments[0].scrollIntoView(true)", Wt);
	          driver.findElement(By.xpath("//button[@class='card-footer-item button is-primary']")).click();
	         
	         
	}

}
