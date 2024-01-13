package Task21;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3_nestedframe {

	public static void main(String[] args) {
		  
	        WebDriver driver = new ChromeDriver();
	       
	        driver.manage().window().maximize();
	        
	       // get the link
	        driver.get("https://the-internet.herokuapp.com/nested_frames");
	        
	        //switch to the top frame
	        driver.switchTo().frame("frame-top");
	        
	        driver.switchTo().parentFrame();
	      
	        //verify the three frames in the page
	        
	        System.out.println(driver.findElements(By.tagName("frame")).size());
	        
	        
	        driver.switchTo().frame("frame-top");
	       
	        driver.switchTo().frame("frame-left"); //switch to the left frame
	        
	        //get the text left
	        
	        WebElement leftFrame = driver.findElement(By.tagName("body"));
	        
	        String leftFrameText = leftFrame.getText();
	       
	        System.out.println(leftFrameText);
	       
	        driver.switchTo().parentFrame();//switch back to the top frame
	        
	        driver.switchTo().frame("frame-middle");//switch the middle frame
	       
	        //verify the middle frame has  the text "MIDDLE"
	        
	        WebElement middleFrame = driver.findElement(By.tagName("body"));
	       
	        String middleFrameText = middleFrame.getText();
	        
	        System.out.println(middleFrameText);
	    
	        driver.switchTo().parentFrame();   //switch back to the top frame
	        
	       
	        driver.switchTo().frame("frame-right"); //switch to the right frame
	        
		    // get the right text
	       
	        WebElement rightFrame = driver.findElement(By.tagName("body"));
		   
	        String rightFrameText = rightFrame.getText();
		    
	        System.out.println(rightFrameText);
		        
		    driver.switchTo().defaultContent(); //switch back to the parent of top and bottom.
		        
		    driver.switchTo().frame("frame-bottom"); //switch to the bottom frame
		        
		    System.out.println(driver.findElement(By.tagName("body")).getText()); // get bottom text
		        
		    System.out.println("Page Title is :" + "Frame");     //verify the page title
   }

  }
