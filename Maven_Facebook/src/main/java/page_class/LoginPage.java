package page_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy (xpath="//input[@id='email']")
private WebElement user;

@FindBy (xpath="//input[@type='password']")
private WebElement pass;

@FindBy (xpath="//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selecte _51sy']")
private WebElement button;

//initialize the webelement variable
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	
}
public void login(String username, String passw) {
	user.sendKeys(username);
	pass.sendKeys(passw);
	button.click();
	
	
}

}
