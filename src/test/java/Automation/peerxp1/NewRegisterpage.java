package Automation.peerxp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewRegisterpage {
	
	@Test
	
	public void Registerpage() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\File\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("http://gitlab.com/users/sign_in#register-pane");
		 Thread.sleep(5000l);
		 PeerxpRegister pr=new PeerxpRegister(driver);
		 pr.FirstName().sendKeys("Userfirsttest1");
		 pr.LastName().sendKeys("Userlasttest1");
		 pr.Username().sendKeys("Userfirstlast1");
		 pr.NewEmail().sendKeys("userfirstlastone@gmail.com");
		 pr.NewPassword().sendKeys("Password12345");
		 pr.RegisterButton().click();
		
	}

}
