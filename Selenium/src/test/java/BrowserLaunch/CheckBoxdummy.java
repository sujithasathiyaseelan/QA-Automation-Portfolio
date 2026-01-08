package BrowserLaunch;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.xml.transform.Source;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CheckBoxdummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    //driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		driver.get("https://practicesoftwaretesting.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@data-test='category-01JXDKE4RWPBM8Z1EVHPS4FKN1'][1]")).click();
		
		
//		WebElement S=driver.findElement(By.xpath("//input[@id='search-query']"));
//		S.sendKeys("Tool Cabinet");
//		WebElement Search=driver.findElement(By.xpath("//button[@type='submit']"));
//		Search.click();
		
		
		WebElement L=driver.findElement(By.xpath("//button[@id='language']"));
		L.click();
		//WebDriverWait w= new WebDriverWait(driver,10);
		WebDriverWait w = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
		
		 WebElement S = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='DE']")));
		 S.click();
		 
          TakesScreenshot A=(TakesScreenshot)driver;
          File  B=A.getScreenshotAs(OutputType.FILE);
          File Target=new File(System.getProperty("user.dir")+"\\screenshots\\dd.png");
          B.renameTo(Target);  
          
		
		
	}

}
