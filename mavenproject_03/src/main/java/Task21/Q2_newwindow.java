package Task21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2_newwindow {

	public static void main(String[] args) throws Exception {
         
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		//find the click here location
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
		
		Thread.sleep(2000);
        
		//switch to the newly opened window
		driver.switchTo().newWindow(WindowType .WINDOW);
		Thread.sleep(2000);
		
		//close the new window
		driver.close();
		Thread.sleep(2000);
		
		//quit the browser
		
		driver.quit();
 }

}
