package BrowserLaunch;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Javascriptexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		//driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		        JavascriptExecutor js = (JavascriptExecutor) driver;//syntax
                 //Button 
		        WebElement B=driver.findElement(By.xpath("//button[@class='start']"));
		        js.executeScript("arguments[0].click();",B);
		       
		        
		        
		        
//		        // Scroll down
//		        js.executeScript("window.scrollBy(0, 300);");
//
//		        // Set input value
//		        WebElement Email = driver.findElement(By.id("email"));
//		        js.executeScript("arguments[0].value='test@example.com';", Email);
//		        
//		        WebElement Name = driver.findElement(By.id("name"));
//		        js.executeScript("arguments[0].value='Sujitha';", Name);
//		        
//		        //Scroll to the bottom of the page
//		        
//		        js.executeScript("window.scrollTo(0,document.body.scrollHeights):");
		        
		        //Radio button
		       // WebElement Radiobutton=driver.findElement(By.xpath("//input[@value='igottwo']"));
		        //js.executeScript("arguments[0].click();",Radiobutton);
		        
//		        WebElement d=driver.findElement(By.xpath("//input[@value='option3']"));
//				
//				if(d.isEnabled()) {
//					System.out.println("The Radio button is Enabled");
//				}
//					else {
//						System.out.println("The Radio button is Disabled ");
//						
//					}
//				   js.executeScript("arguments[0].click();",d);
				   
				 

//		        // Click button using JS
//		        WebElement button = driver.findElement(By.xpath("////input[@value='Login']"));
//		        js.executeScript("arguments[0].click();", button);
		        
		        
		        
		        
		        
		        
		        
		        //To get the page title
//		        String title = (String) js.executeScript("return document.title;");
//				   System.out.println(title);

		       // driver.quit();
		    }
		

	}


