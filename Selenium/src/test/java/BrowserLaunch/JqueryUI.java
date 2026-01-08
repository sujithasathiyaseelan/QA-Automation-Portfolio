package BrowserLaunch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com//");
		driver.manage().window().maximize();
		
//		WebElement Search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
//		 Search.click();
//	     Search.sendKeys("Test");
 
//	     WebElement Demo = driver.findElement(By.xpath("//a[text()='Demos']"));
//		 Demo.click();
//		 System.out.println(driver.getCurrentUrl());
		 
//		 WebElement Download = driver.findElement(By.xpath("//a[text()='Download']"));
//		 Download.click();
//		 System.out.println(driver.getCurrentUrl());
//		 
//          WebElement API = driver.findElement(By.xpath("//a[text()='API Documentation']"));
//       	 API.click();
//		 System.out.println(driver.getCurrentUrl());
//		 
		 WebElement Theme = driver.findElement(By.xpath("//a[text()='Themes']"));
		 Theme.click();
		// System.out.println(driver.getCurrentUrl());
		 
		 WebElement CheckBox = driver.findElement(By.xpath("//label[@for='radio3']"));
	 CheckBox.click();
	// System.out.println(driver.getCurrentUrl());
	 
	 WebElement Cntrl = driver.findElement(By.xpath("//label[@for='transmission-standard']"));
	 Cntrl.click();
	 //System.out.println(driver.getCurrentUrl());
	 
	 WebElement Tabs = driver.findElement(By.xpath("//a[@id='ui-id-12']"));
	 Tabs.click();
	 //System.out.println(driver.getCurrentUrl());
	 
	 WebElement Calender = driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active ui-state-hover']"));
	 Calender.click();
	// System.out.println(driver.getCurrentUrl());
	 
	 WebElement SelectM = driver.findElement(By.xpath("//span[@='ui-selectmenu-text']"));//span[@id='selectmenu-button']
	 SelectM.click();
	
////}
		 
//	  WebElement RoadMap = driver.findElement(By.xpath("//a[text()='Roadmap']"));
////	 RoadMap.click();
////	 System.out.println(driver.getCurrentUrl());
////}
//		 
////		
//	

	}}
