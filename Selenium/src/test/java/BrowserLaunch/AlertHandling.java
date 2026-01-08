package BrowserLaunch;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert; // This is Selenium's Alert class
import java.time.Duration;





	public class AlertHandling {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
			driver.manage().window().maximize();
			 
			
			         //DELAYED HANDLE
			//driver.findElement(By.xpath("//button[@onclick='myMessage()']")).click();
			
//			WebDriverWait wait = new WebDriverWait(driver, 10);//Explicit Wait 
//		wait.until(ExpectedConditions.alertIsPresent());
        //Alert  alert = driver.switchTo().alert();// switch to popup window
//		System.out.println( alert.getText());// get text
//		alert.accept();// click ok
//		 
		           //CONFIRM BOX
//		
//		driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();
//		
//		WebDriverWait wait = new WebDriverWait(driver, 10);//Explicit Wait 
//	wait.until(ExpectedConditions.alertIsPresent());
//	
//		Alert  alert = driver.switchTo().alert();// switch to popup window
//		System.out.println( alert.getText());// get text
//	//alert.accept();// click ok
//	alert.dismiss();
//		
			//PROMPT
	
	driver.findElement(By.xpath("//button[@onclick='myPromp()']")).click();
	
	//WebDriverWait wait =new WebDriverWait(driver,10);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.alertIsPresent());
	
	
	
	Alert alert=driver.switchTo().alert();
	alert.sendKeys("TEST");
	Thread.sleep(8000);
	//alert.accept();
	//Thread.sleep(3000);
	
	
	
			
    }

	}
    



