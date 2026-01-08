package BrowserLaunch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//RIGHT CLICK
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		Actions A=new Actions(driver);
//		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php//");
//		driver.manage().window().maximize();
//		
//		WebElement RightClick=driver.findElement(By.xpath("//button[text()='Right Click Me']"));
//		A.moveToElement(RightClick).perform();
//		A.contextClick().perform();
		
		         //DOUBLE CLICK
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions A=new Actions(driver);
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php//");
		driver.manage().window().maximize();
		
		WebElement DoubleClick=driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		//A.moveToElement(DoubleClick).doubleClick().perform();
		A.moveToElement(DoubleClick).perform();
	A.doubleClick().perform();

		
	}

}
