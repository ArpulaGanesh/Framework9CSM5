package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
// declaration
	@FindBy(id="cartIcon")
	private WebElement cartItem;
	
	// initialization
	public Cartpage(WebDriver driver) {     //cartpage is the constuctor,class and constuctor  name is same
		PageFactory.initElements(driver, this);
	}
	
	// utilization
	public String getCartItem() {
		return cartItem.getText();
		
	}
}
