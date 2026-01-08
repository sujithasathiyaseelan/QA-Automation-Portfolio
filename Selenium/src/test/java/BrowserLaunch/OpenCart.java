package BrowserLaunch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		
		//WebElement Market = driver.findElement(By.xpath("//a[text()='Marketplace']"));
		//Market.click();
		  //System.out.println("Current URL: " + driver.getCurrentUrl());
		
	WebElement Demo = driver.findElement(By.xpath("//a[text()='Demo']"));
	Demo.click();//ul[@class='nav navbar-nav']//a[normalize-space()='Demo']
//		
//		WebElement Blog = driver.findElement(By.xpath("//a[text()='Blog']"));
//		Blog.click();
//	Boolean Blog1 = driver.findElement(By.xpath("//a[text()='Blog']")).isDisplayed();
//	System.out.println("Element is matched ="+Blog1);
//	System.out.println(driver.getCurrentUrl());
		
		
		
//		WebElement Download = driver.findElement(By.xpath("//a[text()='Download']"));
//		Download.click();
//		Boolean Download1 = driver.findElement(By.xpath("//a[text()='Download']")).isDisplayed();
//		System.out.println("Element is matched ="+Download1);
//		System.out.println(driver.getCurrentUrl());
		
		
////////		
		
//		WebElement Login= driver.findElement(By.xpath("//a[@class='btn btn-link navbar-btn']"));
//		Login.click();
//		Boolean Login1 = driver.findElement(By.xpath("//a[text()='btn btn-link navbar-btn']")).isDisplayed();
//	System.out.println("Element is matched ="+Login1);
//	System.out.println(driver.getCurrentUrl());
						
//	WebElement Register= driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']"));
//	Register.click();
//	System.out.println("Element is matched ="+Register1);
//System.out.println(driver.getCurrentUrl());	
// 
		
//WebElement Start= driver.findElement(By.xpath("//a[@class='btn btn-success btn-xl']"));
//Start.click();
//
//	System.out.println(driver.getCurrentUrl());	

		
//	WebElement GetStarted= driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xl']"));
//	GetStarted.click();
//System.out.println(driver.getCurrentUrl());	


//	 WebElement FreeDownload = driver.findElement(By.xpath("//a[text()='View Demo']"));
//        FreeDownload.click();
////	       Boolean FreeDownload1 = driver.findElement(By.xpath("//a[text()='View Demo']")).isDisplayed();
//	       System.out.println(driver.getCurrentUrl());
//
////	        
//        System.out.println("Current URL: " + driver.getCurrentUrl());
//	        driver.quit();
	    }
	

	}


