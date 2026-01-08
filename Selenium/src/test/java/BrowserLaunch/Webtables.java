package BrowserLaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.KnownElements;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
public class Webtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/sql_update.asp");
		driver.manage().window().maximize();
		
		List<WebElement> Display=driver.findElements(By.xpath("//tr[td='México D.F.']/td[2]"));
		
	for (WebElement Customer:Display)
		//Because List<WebElement> does not have a .getText() method only individual webelement can be directly printed
	
	{
		System.out.println(Customer.getText());
		}
	}

}
