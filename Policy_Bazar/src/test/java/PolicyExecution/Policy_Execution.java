package PolicyExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Term_Policy.Home_Policy;
import Term_Policy.LoginForm;

public class Policy_Execution {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe3");
 		 WebDriver driver=new ChromeDriver();// object to call get method  
 		
 	  	driver.get("https://www.policybazaar.com");// which url is open
 	  	driver.manage().window().maximize();
 	  	
 	  	Home_Policy	home_Policy =new Home_Policy(driver);
		 
 	  	home_Policy.term();
 	  	
 	  	LoginForm loginForm =new LoginForm(driver);
		
 	  	loginForm.custoname();
 	  	loginForm.DOB();
 	  	loginForm.Mobno();
 	  	loginForm.viewplan();		
		
	}
}
