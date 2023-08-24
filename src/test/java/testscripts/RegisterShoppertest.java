package testscripts;

import java.util.Map;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import pompages.BaseClass1;

public class RegisterShoppertest extends BaseClass1{
@Test
	
	public void createAccountTest() throws InterruptedException {
		welcome.clickLoginButton();
		login.clickCreateAccountButton();
		
		
		Map<String,String> map =  excel.getData("Sheet1","Shopper Registration");
		int randomNum = jutil.generateRandomNum(100);
		map.get("First Name");
		map.get("Last Name");
		String email = randomNum + map.get("Email Address");
		String pwd = map.get("Password")+ randomNum;
				signUp.createUserAccount(map.get("First Name"),map.get("Last Name"), map.get("Gender"), map.get("Phone Number"),map.get("Email Address"),map.get("Password"));
		Thread.sleep(4000);
		welcome.clickLoginButton();
		login.loginToApp(email,pwd);
		Thread.sleep(2000);
		
		Assert.assertTrue(driver.getTitle().contains("Home"));
		
	}
}
