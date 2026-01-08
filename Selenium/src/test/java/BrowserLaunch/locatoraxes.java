package BrowserLaunch;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.server.KnownElements;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//public class locatoraxes {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		//driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
//		driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
//		driver.manage().window().maximize();
//		
//		List<WebElement> LA=driver.findElements(By.xpath("//a[text()='cookies']/following-sibling::a"));
//		for(WebElement T:LA) {
//		if(T.getText().equals("IFrames")) {
//			T.click();
//			
//			 break;
//		}
//		}




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class locatoraxes {
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

       
        WebDriver driver = new ChromeDriver();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        driver.manage().window().maximize();

        // Find all <a> elements that are preceding siblings of "Mouse Over"

        List<WebElement> siblings = driver.findElements(By.xpath("//a[text()='Mouse over']/preceding-sibling::a"));

        for (WebElement el : siblings) {
            if (el.getText().equals("Dropdown menu")) {
                el.click(); // Only click if the text matches
                break;
            }
        }
           
        

    }}

