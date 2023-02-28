package TestNG1;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Term_Policy.Home_Policy;
import Term_Policy.LoginForm;
import Term_Policy.investmentPolicy1;
import Term_Policy.investmentPolicy2;

public class TermTestNG {

	WebDriver driver;
	 
	@BeforeClass
	public void openBrowser() {
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe3");
	    driver = new ChromeDriver();// object to call get method  
	  	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
		driver.get("https:www.policybazaar.com");// which url is open
 	  	//driver.manage().window().maximize();
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	
	
	@ Test (priority=2)
	public void investmentPolicy() throws InterruptedException {
		System.out.println("test 2");

		investmentPolicy1 investmentPolicy1 = new investmentPolicy1(driver);
	  	investmentPolicy1.clickoninvestment();
	  	
	
	  	investmentPolicy2 investmentPolicy2 =new investmentPolicy2(driver);
 	  	Thread.sleep(3000);

	  	investmentPolicy2.custoname();
	  	
	  	investmentPolicy2.Mobno();
	  	investmentPolicy2.eMail();
	  	investmentPolicy2.viewplan();
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method");
		ArrayList<String> child = new ArrayList<String>(driver.getWindowHandles() );
	 	driver.switchTo().window(child.get(0));
	 	
		
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("after class");
		
	}
	
	
}
