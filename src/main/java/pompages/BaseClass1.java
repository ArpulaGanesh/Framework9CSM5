package pompages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import genericLibraries2.ExcelUtility;
import genericLibraries2.IConstantPath;
import genericLibraries2.WebdriverUtility;
import genericLibraries2.javaUtility;
import genericLibraries2.propertiesUtility2;

public class BaseClass1 {
	protected propertiesUtility2 property;
	protected ExcelUtility excel;
	protected javaUtility jutil;
	protected WebdriverUtility webUtil;
	public WebDriver driver;
	public static WebDriver sdriver;
	protected welcomepage welcome;
	protected shopperloginpage login;
	protected HomePage home;
	protected signupPage signUp;
	protected MyprofilePage myProfile;
	protected myAddresspage myAddress;
	protected HeadphonesPage headphone;
	protected Cartpage cart;
	protected AddressFormPage address;
	
	//@BeforeSuite
	//@BeforeTest
	
	@BeforeClass
	public void classConfiguration() {
		property=new propertiesUtility2();
		excel=new ExcelUtility();
		jutil=new javaUtility();
		webUtil=new WebdriverUtility();
		
		property.propertiesInit(IConstantPath.PROPERTIES_PATH);
		excel.excelInit(IConstantPath.EXCEL_PATH);
	}
	@BeforeMethod
	public void methodConfiguration() {
		driver=webUtil.navigaToApp(property.getData("Browser"),property.getData("url"),Long.parseLong((String) property.getData("time")));
	    sdriver=driver;
	    login=new shopperloginpage(driver);
	    home=new HomePage();
	    signUp=new signupPage(driver);
	    myProfile=new MyprofilePage(driver);
	    myAddress=new myAddresspage(driver);
	    headphone=new HeadphonesPage(driver);
	    cart=new Cartpage(driver);
	    address=new AddressFormPage(driver);
	}
	@AfterMethod
	public void methodTeardown() {
		home.clickProfileButton();
		home.clicklogout();
		
		}
	@AfterClass
	public void  classTeardown() {
		
	}
}
