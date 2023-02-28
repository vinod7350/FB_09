package Term_Policy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class investmentPolicy2 {

	 @FindBy (xpath ="//input[@id='txtCustomerName']") 
	  private WebElement custoname ;
	
	 
	  @FindBy (xpath ="//input[@id='txtMobileNo']") 
	  private WebElement Mobno ;
	  
	  @FindBy (xpath ="//input[@id='txtEmail']") 
	  private WebElement eMail ;
	  
	  
	  @FindBy (xpath ="//button[text()='View Plans']") 
	  private WebElement viewplan ;
	  
	public investmentPolicy2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// scroll down
	
	public void custoname() {
		custoname.sendKeys("Bhumkar Vinod");
	}
	
	public void Mobno() {
		Mobno.sendKeys("7350627418");
	}
	public void eMail() {
		eMail.sendKeys("bhumkarvinod73@gmail.com");
	}
	public void viewplan() {
		viewplan.click();
	}
	
	
	
	
	
	
	
	
	
	
}
