package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAddresspage {

	//Declaration
		@FindBy(xpath="//button[text()='Add Address']")
		private WebElement addAddressButton;
		@FindBy(xpath="//div[text()='successfully added']")
		private WebElement successmesssage;
		
		//initialization
			public myAddresspage(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}
			//utilization
			public void clickprofileButton() {
				addAddressButton.click();
			}
		    public String getsuccessmessage() {
		    	return successmesssage.getText();
		    }
			


}
