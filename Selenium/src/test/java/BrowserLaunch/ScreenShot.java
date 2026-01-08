package BrowserLaunch;

import java.util.List;

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

//import com.google.common.io.Files;

import java.io.File;
//import java.io.OutputStream;

public class ScreenShot {

	public static void main(String[] args)  {
		 //TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicesoftwaretesting.com/");
		driver.manage().window().maximize();
		//input[@value='01JX9GZ3QSM75PX34QWBMJQGE9']
		 //driver.findElement(By.xpath("//div[@class='input-group mb-3']")).click();
		 
		WebElement dd= driver.findElement(By.xpath("//a[text()=' Categories ']"));//store the items in M			 MS.C
				dd.click();
			
         
          TakesScreenshot ts = (TakesScreenshot) driver;//creating an object for interface
          File source = ts.getScreenshotAs(OutputType.FILE);// Takes the screenshot
     
          		
          		//File dest = new File("C:\\Users\\sujit\\Downloads\\screenshots\\image2.png");
          		
          		File dest = new File(System.getProperty ("user.dir")+"\\screenshots\\image4.png");//copy the screen shot to the the desired loc
          		
         source.renameTo(dest);//storing in target
          
          
		
	}
}
