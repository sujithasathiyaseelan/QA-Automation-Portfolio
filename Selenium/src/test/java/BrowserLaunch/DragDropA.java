package BrowserLaunch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions A=new Actions(driver);
		driver.get("https://jqueryui.com/droppable///");
		driver.manage().window().maximize();
		     WebElement Drd=driver.findElement(By.xpath(" //div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
			WebElement Drd1=driver.findElement(By.xpath(" //div[@class='ui-widget-header ui-droppable']"));
			A.dragAndDrop(Drd, Drd1).perform();
			
		


//		
		
		///SELENIUM TUTORIAL PAGE
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		Actions A=new Actions(driver);
//		driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");
//		driver.manage().window().maximize();
//		
//		WebElement Drd=driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));//div[@id='draggable']
//		WebElement drd1=driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
//		A.dragAndDrop(Drd, drd1).perform();
			
			
			//AUTOMATION TUTORIAL PAGE
			
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
//			WebDriver driver=new ChromeDriver();
//			Actions A=new Actions(driver);
//			driver.get("https://testautomationpractice.blogspot.com/");
//			driver.manage().window().maximize();
//			     WebElement Drd=driver.findElement(By.xpath(" //div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
//				WebElement Drd1=driver.findElement(By.xpath(" //div[@class='ui-widget-header ui-droppable']"));
//				A.dragAndDrop(Drd, Drd1).perform();
	}
	}


