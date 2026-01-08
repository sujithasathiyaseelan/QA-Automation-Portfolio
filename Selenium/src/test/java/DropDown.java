

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
			driver.manage().window().maximize();
			
			WebElement d=driver.findElement(By.xpath("//select[@class='form-select']"));
			Select DropDown=new Select(d);
			DropDown.selectByVisibleText("Mrs.");
			//DropDown.selectByValue("3");
			//DropDown.selectByIndex(2);
			
			
	}

}
