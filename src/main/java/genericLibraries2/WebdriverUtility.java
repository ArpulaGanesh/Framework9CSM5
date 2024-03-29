package genericLibraries2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {

	  private WebDriver driver;
	  public void navigaToApp(String browser,String url,long time)
	  {
		  switch (browser) {
		  case  "edge":
			  driver=new EdgeDriver();
			  break;
		  case "firebox":
			  driver=new FirefoxDriver();
		       break;
		  case "chrome":
			  System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			  driver=new ChromeDriver();
		       break;
		       default:
		    	   System.out.println("invalid browser info");
		  }
		  driver.manage().window().maximize();
		  driver.get(url);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));	  
	  }
	  public WebElement explicitWait(long time,WebElement element) {
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		  return wait.until(ExpectedConditions.visibilityOf(element));
	  }
	  public WebElement explicitWait(WebElement element,long time) {
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		  return wait.until(ExpectedConditions.elementToBeClickable(element));
	  }
	  public Boolean explicitWait(long time,String title) {
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		  return wait.until(ExpectedConditions.titleContains(title));
	  }
	  public void mouseHover(WebElement element) {
		  Actions actions = new Actions(driver);
		  actions.moveToElement(element).perform();
	  }
	  public void doubleClickOnElement(WebElement element) {
		  Actions actions = new Actions(driver);
		  actions.doubleClick(element).perform();
	  }
	  public void rightClick(WebElement element) {
		  Actions actions = new Actions(driver);
		  actions.contextClick(element).perform();
		  
	  }
	  public void dragAnddropAnelement(WebElement element,WebElement target) {
		  Actions actions = new Actions(driver);
		  actions.dragAndDrop(element, target).perform();
		  
	  }
	  public void selectFromDropdown(WebElement element,int index) {
		  Select select = new Select(element);
		  select.selectByIndex(index);
	  }
	  public void selectFromDropdown(WebElement element,String index) {
		  Select select = new Select(element);
		  select.selectByValue(index);
	  }
	  public void selectFromDropdown(String text,WebElement element) {
		  Select select = new Select(element);
		  select.selectByVisibleText(text);
	  }
	  public void switchToFrame(int index) {
		  driver.switchTo().frame(index);
	  }
	  public void switchToFrame(String idOrName) {
		  driver.switchTo().frame(idOrName);
	  }
	  public void switchToFrame(WebElement frameElement) {
		  driver.switchTo().frame(frameElement);
	  }
	  public void switchBackFromFrame() {
		  driver.switchTo().defaultContent();
	  }
	  public void scrollTillelemnet(WebElement element) {
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].scrollIntoView(true)", element);
	  }
	  public void handleAlert(String status) {
		  Alert al = driver.switchTo().alert();
		  if(status.equalsIgnoreCase("ok"))
			  al.accept();
		  else
			  al.dismiss();	  
	  }
	  public void switchToChildBrowser() {
		  Set<String> set = driver.getWindowHandles();
		  for (String s : set) {
			  driver.switchTo().window(s);
		  }
	  }
	  public void switchToWindow(String id) {
		  driver.switchTo().window(id);
	  }
	  public String getParenntWindowID(){
		  return driver.getWindowHandle();
	  }
	 
	 public void closeSingleBrowser() {
		 driver.close();
	 }
	 public void closeallBrowser() {
		 driver.quit();
	 }

}
