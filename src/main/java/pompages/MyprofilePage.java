package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyprofilePage {
	 //Declaration
		@FindBy(xpath="//div[text()='my addresses']")
		private WebElement MyAddressesLink;
		
		//initialization
			public MyprofilePage(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}
			//utilization
			public void clickprofileButton() {
				MyAddressesLink.click();
				
			}
	
}
