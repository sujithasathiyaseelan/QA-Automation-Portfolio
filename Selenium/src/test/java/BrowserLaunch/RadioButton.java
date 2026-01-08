package BrowserLaunch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@value='igottwo']")).click();// Select Yes
		
		//driver.findElement(By.xpath("//input[@value='igotthree']")).click();//Select No
		
		WebElement d=driver.findElement(By.xpath("//input[@value='option3']"));
		
		if(d.isEnabled()) {
			System.out.println("The Radio button is Enabled");
		}
			else {
				System.out.println("The Radio button is Disabled ");
				
			}
		}
	}
	


