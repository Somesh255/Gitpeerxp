package Automation.peerxp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class NewProjectpage {
	
	@Test(dataProvider="getData1")
	
	
	public void Newproject(String ProjectName,String ProjectSlug) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\File\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("http://gitlab.com/users/sign_in");
		 Thread.sleep(5000l);
		 NewProject np=new NewProject(driver);
		 np.EmailId().sendKeys("usernametestpeerxp@gmail.com");
		 np.Password().sendKeys("positivelogin1");
		 np.SignIn().click();
		 np.NewProjectbutton().click();
		 np.createNewProject().click();
		 Thread.sleep(5000l);
         np.InputProjectfield().sendKeys(ProjectName);
         np.InputProjectslug().sendKeys(ProjectSlug);
         np.Submitbutton().click();
}
	
	
	@DataProvider
	public Object[][] getData1()
	{
		
		Object[][] data=new Object[2][2];
		data[0][0]="abcdez123";    
		data[0][1]="abcdez123";                  
		data[1][0]="xyz@_123455";             
		data[1][1]="xyz@_123455";  
		
		return data;
	}
	
}