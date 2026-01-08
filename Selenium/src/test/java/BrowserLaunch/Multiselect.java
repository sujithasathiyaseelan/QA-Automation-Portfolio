package BrowserLaunch;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.KnownElements;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Multiselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
		driver.manage().window().maximize();
		
//		 WebElement M=driver.findElement(By.xpath("//span[@class='mbsc-textfield-tags-placeholder mbsc-ios']"));
		//span[contains(@class,'mbsc-textfield mbsc-textfield-outline mbsc-select mbsc-textfield-stacked mbsc-textfield-outline-stacked mbsc-textarea')]
		WebElement DropDown = driver.findElement(By.xpath("//span[text()='Please select...']"));
        DropDown.click();
		

		List<WebElement>MS=driver.findElements(By.xpath("//span[@class='mbsc-flex-col mbsc-popup mbsc-popup-anchored mbsc-ios']"));//store the items in MS
		for( WebElement i:MS)
		{
		
		System.out.println(i.getText());
		}
		
			
		}
		
		
	

}
