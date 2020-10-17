package Automation.peerxp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewProject {
	
	
	WebDriver driver;
	public  NewProject(WebDriver driver) 
	{
		
		this.driver=driver;
	}
		  By Email=By.id("user_login");
		  By Password=By.id("user_password");
		  By SignIn=By.xpath("//input[@type='submit']");
		  By NewProjectbutton=By.linkText("New project");
		  By createNewProject= By.xpath("//a[@data-qa-selector='blank_project_link']");
	      By InputProjectfield=By.xpath("//*[@id='project_name']");
		  By InputProjectslug=By.xpath("//*[@id='project_path']");
		  By Submitbutton=By.xpath(" //input[@type='submit']");
		  
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
	         
	         public WebElement NewProjectbutton()
			  {
				 return driver.findElement(NewProjectbutton);
			  }
	          
	         public WebElement createNewProject ()
			  {
				 return driver.findElement(createNewProject);
			  }
	         
	         public WebElement InputProjectfield()
			  {
				 return driver.findElement(InputProjectfield);
			  }
	         
	          public WebElement InputProjectslug()
			  {
				 return driver.findElement(InputProjectslug);
			  }
	          
	          public WebElement Submitbutton ()
			  {
				 return driver.findElement(Submitbutton);
			  }
}


