package Automation.peerxp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PeerxpRegister {

	
	WebDriver driver;
	public  PeerxpRegister(WebDriver driver) 
	    {
		
       this.driver=driver;
		}
	
	By Firstname=By.id("new_user_first_name");
	By Lastname=By.id("new_user_last_name");
	By Username=By.id("new_user_username");
	By NewEmail=By.id("new_user_email");
	By NewPassword=By.id("new_user_password");
	By RegisterButton=By.xpath("//input[@value='Register']");
	
	
	public WebElement FirstName()
	{
		return driver.findElement(Firstname);
	}
	
	public WebElement LastName()
	{
		return driver.findElement(Lastname);
	}
	
	public WebElement Username()
	{
		return driver.findElement(Username);
	}
	
	public WebElement NewEmail()
	{
		return driver.findElement(NewEmail);
	}
	
	
	public WebElement NewPassword()
	{
		return driver.findElement(NewPassword);
	}
	
	public WebElement RegisterButton()
	{
		return driver.findElement(RegisterButton);
	}
}
