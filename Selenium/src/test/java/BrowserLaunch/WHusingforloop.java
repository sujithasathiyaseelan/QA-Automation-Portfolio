package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class WHusingforloop  {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows"); // Example site
        driver.manage().window().maximize();

        String parentWindow = driver.getWindowHandle();  // Save the parent window

        driver.findElement(By.id("tabButton")).click(); // Click to open new tab
        Thread.sleep(2000); // Wait for new tab to open

        // Get all windows
        Set<String> allWindows = driver.getWindowHandles();

        // Loop through each window
        for (String handle : allWindows) {
            driver.switchTo().window(handle);  // Switch to the current handle

            // Print title of each window
            System.out.println("Window Title: " + driver.getTitle());

            // Optional: Close the child window, keep parent open
            if (!handle.equals(parentWindow)) {
                driver.close();  // Close the child
            }
        }

        // Switch back to parent
        driver.switchTo().window(parentWindow);
        System.out.println("Back to Parent: " + driver.getTitle());

        driver.quit();  // Close all
    }
}

