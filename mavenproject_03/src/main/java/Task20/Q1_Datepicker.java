package Task20;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1_Datepicker {

	public static void main(String[] args) throws Exception {
		
		//select the date 
		
		String date = "22";
		
		//open jqueryui website
		
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		//switch to the iframe contain the datepicker
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();//click the datepicker box
		
		Thread.sleep(2000);
		
		//select the next month from the date picker
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
		
		//select the code 22 from the datepicker
		
		List<WebElement> data = driver.findElements(By.tagName("td"));
	    for(WebElement i : data) {
	    if(i.getText().equals(date)) 
	    {
	    	
	    	 i.click();
	    	 System.out.println(date);
	    	 break;
	    }
	    }
	   //close the browser and quit the window
		driver.close();
		driver.quit();
		
	}
}




