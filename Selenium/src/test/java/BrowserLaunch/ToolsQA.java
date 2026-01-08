package BrowserLaunch;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToolsQA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//Launches a new Chrome  window using Selenium WebDriver.


		driver.get("https://toolsqa.com/");//Navigates the browser to the ToolsQA homepage.


		driver.manage().window().maximize();//Maximizes the browser window to full screen.


		
//		        WebElement E = driver.findElement(By.xpath("//input[@id='subscriber-email']"));
//				E.sendKeys("test@gmail.com");
				
//				WebElement M = driver.findElement(By.xpath("//a[text()='contact-detail email']"));
//	            System.out.println("Test Message");
	            
	            WebElement DemoLink = driver.findElement(By.xpath("//a[text()='Demo Site']"));
				DemoLink.click();
				Thread.sleep(3000);
				
				Set<String>Windows=driver.getWindowHandles();
				List<String>Windows1=new ArrayList(Windows);
				for(String c:Windows1) {
					  driver.switchTo().window(c);//switch to the window 
					    String title = driver.getTitle();// get the title of the window  
					//String Title=driver.switchTo().window(c).getTitle();
					//System.out.println(title);
					if(title.equals("Tools QA"))//close parent window 
					{
						driver.close();
						break;//exit the loop immediately
						
					}}
					for(String c:driver.getWindowHandles()) {
						  driver.switchTo().window(c);
						  Thread.sleep(2000);
						    
						    System.out.println(driver.getTitle());
				}
	            }}


//String parentWindow = driver.getWindowHandle();
//System.out.println("Parent Window ID: " + parentWindow);//store parent windowhandle 
//System.out.println("Parent Title: " + driver.getTitle());
//
//driver.findElement(By.xpath("//button[@title='New Tab']")).click();//open multiple child window
//driver.findElement(By.xpath("//button[@title='New Window']")).click();

//for (String handle : allHandles) //loop to identify each window
//{
//    driver.switchTo().window(handle);
//    
//    String title = driver.getTitle();
//    String url = driver.getCurrentUrl();
//    
//    System.out.println("Window ID: " + handle);
//    System.out.println("Title: " + title);
//    System.out.println("URL: " + url);
//
//    // Example: Close a specific child window by title
//    if (title.contains("Some Child Title")) {
//        System.out.println("Closing Child with Title: " + title);
//        driver.close();
//    }
//}
//
//Set<String> allHandles = driver.getWindowHandles();//get all open windows
//	 catch (Exception e) {
       // System.out.println("Error occurred: " + e.getMessage());
   // }
	//}

	


