package BrowserLaunch;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tutorialspt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    //driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);

	//	WebElement Element = driver.findElement(By.xpath("//button[@class='accordion-button collapsed']"));
		//Element.click();
		
		
		 driver.findElement(By.xpath("//span[@class='plus'][1]")).click();
		 driver.findElement(By.xpath("//span[@class='plus'][1]")).click();
		
		Thread.sleep(3000);
		
		
		List<WebElement> Cbox = driver.findElements(By.xpath("//ul[@id='bf_l_1']//input[@type='checkbox']"));//since there is list of element inside

		for (int i=2;i<4;i++)// 3 element and i starts at 2 ,since 3 elements are there 2and 3 will be checked
		{
			Cbox.get(i).click();
		}
		Thread.sleep(5000);
		


			
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	// int i = 0;
//	 for(WebElement f:CheckBox)//iterates through all checkbox
//	 {
//		
//		 i++;
//		 if(i==2||i==4) {
//		 f.click();
		
   // WebElement A = driver.findElement(By.xpath("//button[text()='Alerts, Frames & Windows']"));//question
		//A.click();
		
	//	WebElement Button=driver.findElement(By.xpath("//a[text()='Browser Windows']"));
		//Button.click();
		//Thread.sleep(3000);
	
	


