package BrowserLaunch;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Implicit Wait
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Selenium 4
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
		
		WebElement C=driver.findElement(By.id("name"));
		C.sendKeys("Test");
		
		WebElement A=driver.findElement(By.id("email"));
		A.sendKeys("test@gmail.com");
		
//		
//		WebElement B=driver.findElement(By.id("phone"));
//		B.sendKeys("3033433434");
//		
//		WebElement D=driver.findElement(By.id("phone"));
//		D.sendKeys("3033433434");
//		
//		WebElement E=driver.findElement(By.id("textarea"));
//		E.sendKeys("123 E keystone blvd , Parker Co-80134");
//		
////		WebElement F=driver.findElement(By.id("male"));// what will happen if i chose name as gender ??
////		F.click();
//		
//		WebElement F=driver.findElement(By.name("gender"));// what will happen if i chose name as gender ?? automatically it choose male
//		F.click();
//		
////		WebElement G=driver.findElement(By.id("female"));// not commenting on male radio button but automatically chose female
////		G.click();
//		
//		WebElement H=driver.findElement(By.id("sunday"));
//		H.click();
//		
//		WebElement I=driver.findElement(By.id("wednesday"));
//		I.click();
//		
//		WebElement J=driver.findElement(By.id("thursday"));
//		J.click();
//		
//		WebElement K=driver.findElement(By.id("monday"));
//		K.click();
//		 
//		WebElement L=driver.findElement(By.className("start"));
//		L.click();
//		
//		
//		
		
		
		
		
		
		
		
		
		}

}
