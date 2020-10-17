package Automation.peerxp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Loginpage {
	
	@Test(dataProvider="getData")
	public void Loginpage(String Email,String Password) throws InterruptedException
	{
	
		 System.setProperty("webdriver.chrome.driver", "D:\\File\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("http://gitlab.com/users/sign_in");
		 Thread.sleep(5000l);
		 PeerxpLogin px =new PeerxpLogin(driver);
		 px.EmailId().sendKeys(Email);
		 px.Password().sendKeys(Password);
		 px.SignIn().click();
		
	}
	
	
	@DataProvider
	public Object[][] getData()
	
	{
	
		Object[][] data=new Object[5][2];
		data[0][0]="usernametestpeerxp@gmail.com";    //Valid Email
		data[0][1]="positivelogin1";                  //Valid Password
		data[1][0]="usernametestpeerxp";              //Valid Username
		data[1][1]="positivelogin1";                  //Valid Password
		data[2][0]="usernametestpeerxp@gmail.com";    //Valid Email
		data[2][1]="ABCDE2";                          //Invalid Password
		data[3][0]="abcde3@test.com";                 //Invalid Email
		data[3][1]="positivelogin1";                  //Valid Password
		data[4][0]="";                                //No Email
		data[4][1]="";                               // No Password 
		
	
return data;
	}
		
	}
	


