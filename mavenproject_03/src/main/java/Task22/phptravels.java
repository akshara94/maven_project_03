package Task22;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class phptravels {
	
   public static void main(String[] args) throws InterruptedException {
	   
	   //open the webpage
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://phptravels.com/demo/");
		
		// fill the form
		
		driver.findElement(By.name("first_name")).sendKeys("Akshara");
		
		driver.findElement(By.name("last_name")).sendKeys("santosh");
		
		driver.findElement(By.name("business_name")).sendKeys("Export Business");
		
		driver.findElement(By.name("email")).sendKeys("aksh@yahoo.com");
		
		Thread.sleep(3000);
		
		//page down keyword
		
	    Actions act = new Actions(driver);
	    act.sendKeys(Keys.PAGE_DOWN).build().perform();
	    
	    //The logic of sum verification and convert string to integer
		
		String a = driver.findElement(By.xpath("//span[@id='numb1']")).getText();// take the text of 1st value
		int b = Integer.parseInt(a);
		
	    String c =	driver.findElement(By.xpath("//span[@id=\"numb2\"]")).getText();//take the text of 2nd value
	    int d =Integer.parseInt(c);
        
        int e = b + d ;
        String s = Integer.toString(e);
       
        driver.findElement(By.xpath("//*[@id=\"number\"]")).sendKeys(s);//take the result value
        
        //submit the button
	    
	    driver.findElement(By.id("demo")).click();	
	    
	    //print the console
	    
	    System.out.println("page is submitted");
	
	    //screenshot method
	    try {
	    	
	    	Actions act2 = new Actions(driver);
	 	   act2.sendKeys(Keys.PAGE_UP).build().perform();
	 	   
	 	   Thread.sleep(3000);
	 	   
	 	  String location = System.getProperty("user.dir") + "/Screenshots/picture2.png";
		  
	    	
	    	TakesScreenshot ts = (TakesScreenshot)driver;
	    	
	    	File source = ts.getScreenshotAs(OutputType.FILE);
	    	
	    	File destination = new File(location);
	    	
	    	FileHandler.copy(source, destination);
	    	//
	    } catch (IOException e1 ) {
	    	
	    	e1.printStackTrace();
	    	
	   }
		  
	    
	}

}
