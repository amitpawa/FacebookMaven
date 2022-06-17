package test_class;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page_class.LoginPage;

public class Login_Test extends BaseTest{
	LoginPage pg;
	@BeforeClass
	public void openObject() {
		pg= new LoginPage(driver);
			
	}
	@Test
	public void login() {
		pg.login("7038162014", "Amitpawar");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
}
