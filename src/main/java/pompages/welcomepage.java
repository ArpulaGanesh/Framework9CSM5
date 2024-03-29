package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class welcomepage {

	//Declaration
		@FindBy(id="loginBtn")
		private WebElement loginButton;
		
		//Initialization
		public welcomepage(WebDriver driver) {
			PageFactory.initElements( driver, this);
		}
		
		//Utilization
		public void clickloginButton() {
			loginButton.click();
		}

}
