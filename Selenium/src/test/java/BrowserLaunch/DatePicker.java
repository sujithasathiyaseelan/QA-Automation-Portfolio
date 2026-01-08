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
public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("datepicker")).click();
		// WebElement monthDropdown = driver.findElement(By.className("ui-datepicker-month"));
//
//	        // Use Select to choose 'August'
//	        Select selectMonth = new Select(monthDropdown);
//	        selectMonth.selectByValue("7");
	        
		 //WebElement date=driver.findElement(By.xpath("//div[@class='flatpickr-calendar hasTime animate open arrowTop arrowLeft']//select[@aria-label='Month']"));
		WebElement date=driver.findElement(By.xpath("//div[@class='flatpickr-calendar hasTime animate open arrowTop arrowLeft']//select[@aria-label='Month']"));
		 Select SelectMonth =new Select(date);
		 SelectMonth.selectByVisibleText("March");
		//div[@class='flatpickr-calendar hasTime animate arrowTop arrowLeft open']//input[@aria-label='Year']
		 
	
			 }
			 
		 
		 
	}









//JavascriptExecutor js = (JavascriptExecutor) driver;
//WebElement dateInput = driver.findElement(By.id("your-date-input-id")); // Replace with actual ID
//js.executeScript("arguments[0].value='2025-09-01';", dateInput);
