package Term_Policy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Policy {
	
	  @FindBy (xpath ="(//div[@class='shadowHandlerBox'])[1]") 
	  private WebElement term ;
	  
	  private WebDriver driver;
	
	  public Home_Policy(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver = driver;
		}
	  
	  
	  
	  public void term() {

		  JavascriptExecutor js	=(JavascriptExecutor)driver; // object of Javascriptexecutor (interface)
          js.executeScript("window.scrollBy(0,300)"); //scroll down

	 	term.click();
	  }
	
}
