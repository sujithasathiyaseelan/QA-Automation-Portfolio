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

public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		
			// Switch to iframe because the datepicker is inside an iframe
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

//		//get current month 
		WebElement D=driver.findElement(By.xpath("//input[@class='hasDatepicker']"));
	D.click();
	
		//hover
		WebElement H=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));
	while(true) {
		 String CurrentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	 //System.out.println(CurrentMonth);
//	 

	 String CurrentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	// System.out.println(CurrentYear);
		 

////		// Use AND  operator to check if it matches
		if (CurrentMonth.equals("August") && CurrentYear.equals("2024")) {
	  // H.click();
         break;
		}
         H.click();}
////			// Select 10th August		    
   //driver.findElement(By.xpath("//a[text()='10']")).click();
		}}
