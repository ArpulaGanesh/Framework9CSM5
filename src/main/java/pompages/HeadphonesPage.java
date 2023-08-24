package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeadphonesPage {
 // declaration
	@FindBy(xpath="//span[text()='boat rockerz 450']/ancestor::div[@class='featuredProducts_cardFooter__qL8vT']/descendant::Button")
	private WebElement addToCartButton;
	@FindBy(xpath="//span[text()='boat rockerz 450']")
	private WebElement itemname;
	
	// initialization
	public HeadphonesPage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
	}
	
	// utilization
	public void clickAddToCart() {
		addToCartButton.click();
	}
	public String gatAddToCaString() {
		return addToCartButton.getText();
	}
}
