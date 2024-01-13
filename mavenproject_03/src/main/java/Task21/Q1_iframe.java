package Task21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1_iframe {

	public static void main(String[] args) throws Exception {
	 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//get the URL 
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		//switch to the frame
	
		driver.switchTo().frame(0);
		
		Thread.sleep(1000);
		
		//clear the text page
		
		driver.findElement(By.tagName("p")).clear();
		
		Thread.sleep(1000);
		
		// enter the hello people
		
		driver.findElement(By.tagName("p")).sendKeys("Hello people");
		
		//close the browser
		
		driver.close();
		
		
	}
	
	}


