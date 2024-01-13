package Task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2_guvi {

	public static void main(String[] args) throws Exception {
		
		// open the browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.guvi.in/");
		
		//locate the signup button
		
		driver.findElement(By.xpath("//*[@id=\"accountGroup\"]/ul/li[2]")).click();
		
		// fill the signup form details
		
		driver.findElement(By.id("name")).sendKeys("akshara");
       
		driver.findElement(By.id("email")).sendKeys("aksh@yahoo.com");
		
		driver.findElement(By.id("password")).sendKeys("1234@asd#");
		
		driver.findElement(By.id("mobileNumber")).sendKeys("9876543210");
		
		//click on the signup button
		
		driver.findElement(By.xpath("//*[@id=\"signup-btn\"]")).click();
		
		 //wait for the page load and verfiy the user is registered
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		System.out.println("User is registered successfully");
		
		// locate the login button
	    driver.get("https://www.guvi.in/");
	 
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
	    driver.findElement(By.xpath("//*[@id=\"accountGroup\"]/ul/li[1]/a")).click();
	    
	    Thread.sleep(2000);
	    
	    //login form details
	   
	    driver.findElement(By.id("email")).sendKeys("aksh@yahoo.com");
	   
	    driver.findElement(By.id("password")).sendKeys("1234@asd#");
	    
	    driver.findElement(By.xpath("//*[@id=\"login-btn\"]")).click();	
	    
	    // wait for the login and user is logged
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	   
	     System.out.println("user logged in sucessfully");
	     
	     //close the browser
	    
	     driver.close();
	}
}
