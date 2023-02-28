package PolicyExecution;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Term_Policy.investmentPolicy1;
import Term_Policy.investmentPolicy2;

public class investmentPolicyExecution {

	public static void main(String[] args) {
		
	
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver.exe3");
		 WebDriver driver=new ChromeDriver();// object to call get method  
	
	  	driver.get("https://www.policybazaar.com");// which url is open
	  	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  	//driver.manage().window().maximize();
	  	
	  	investmentPolicy1 investmentPolicy1 = new investmentPolicy1(driver);
	  	investmentPolicy1.clickoninvestment();
	  	
	
	  	investmentPolicy2 investmentPolicy2 =new investmentPolicy2(driver);
	  	investmentPolicy2.custoname();
	  	
	  	investmentPolicy2.Mobno();
	  	investmentPolicy2.eMail();
	  	investmentPolicy2.viewplan();
	}
	
}
