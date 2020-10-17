package Automation.peerxp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PeerxpLogin {
	
	WebDriver driver;
	public  PeerxpLogin(WebDriver driver) 
	{
		
		this.driver=driver;
	}
		  By Email=By.id("user_login");
		  By Password=By.id("user_password");
		  By SignIn=By.xpath("//input[@type='submit']");
		  
		  
		  
		  public WebElement EmailId()
		  {
			 return driver.findElement(Email);
		  }


	         public WebElement Password()
	         {
	        	return driver.findElement(Password);
	         }
	         
	         public WebElement SignIn()
			  {
				 return driver.findElement(SignIn);
			  }
}