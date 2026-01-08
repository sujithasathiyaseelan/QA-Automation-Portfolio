package BrowserLaunch;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert; 
import java.time.Duration;


public class AlertButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		driver.manage().window().maximize();
		 
		
		
		driver.findElement(By.xpath("//button[text()='Alert']")).click();//pop up alert 
		
		
		

		//WebDriverWait wait = new WebDriverWait(driver,  10);//Explicit Wait 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());

		Alert  alert = driver.switchTo().alert();// switch to popup window
		System.out.println( alert.getText());// get text
		alert.accept();// click ok
		driver.close();


		
		
	}

}
