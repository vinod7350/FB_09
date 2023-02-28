package Term_Policy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class investmentPolicy1 {
	 @FindBy (xpath ="(//div[@class='shadowHandlerBox'])[3]") 
	 private WebElement investment;
	  
	  private WebDriver driver;
	
	  public investmentPolicy1(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver = driver;
		}
	  
	  
	  
	  public void clickoninvestment() {
//	  JavascriptExecutor javascriptExecutor= (JavascriptExecutor)driver;
//	  javascriptExecutor.executeScript("window.scrollBy(0,200");
		  
//		  
		  JavascriptExecutor js	=(JavascriptExecutor)driver; // object of Javascriptexecutor (interface)
          js.executeScript("window.scrollBy(0,300)"); //scroll down

          investment.click();
	  }
	 
	
	
	
	
	
}
