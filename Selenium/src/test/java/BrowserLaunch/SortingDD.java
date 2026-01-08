package BrowserLaunch;
import java.util.List;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
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
public class SortingDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicesoftwaretesting.com/");
		driver.manage().window().maximize();
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);//Explicit Wait 
		

		// ...

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement S = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='form-select']")));

        WebElement S = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='form-select']")));
	        
		Select DropDown=new Select(S);
		DropDown.selectByVisibleText("Name (Z - A)");
		
		
		 TakesScreenshot ts = (TakesScreenshot) driver;//creating an object for interface
         File source = ts.getScreenshotAs(OutputType.FILE);
         File Target=new File(System.getProperty("user.dir")+"\\screenshots\\image5.png");
         source.renameTo(Target);
         
	}

}
