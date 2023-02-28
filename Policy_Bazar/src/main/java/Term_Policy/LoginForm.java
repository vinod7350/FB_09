package Term_Policy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginForm {

	 
	  @FindBy (xpath ="//input[@placeholder='Enter Your Name']") 
	  private WebElement custoname ;
	
	  @FindBy (xpath ="//input[@id='dob']") 
	  private WebElement DOB ;
	  
	  @FindBy (xpath ="//input[@id='mobileNo']") 
	  private WebElement Mobno ;
	  
	  @FindBy (xpath ="//span[text()='View Free Quotes ']") 
	  private WebElement viewplan ;
	  
	public LoginForm(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// scroll down
	
	public void custoname() {
		custoname.sendKeys("Bhumkar Vinod");
	}
	public void DOB() {
		DOB.sendKeys("23/02/1998");
	}
	public void Mobno() {
		Mobno.sendKeys("7350627418");
	}
	public void viewplan() {
		viewplan.click();
	}
}
