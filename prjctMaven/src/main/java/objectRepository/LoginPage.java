package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage(WebDriver driver)
	{
    PageFactory.initElements(driver,this);
}
	 @FindBy(className="ico-login")
	private WebElement login;
	
	@FindBy(id = "Email")
	private WebElement emailTF;
	
	@FindBy(id="Password")
	private WebElement pswrdTF;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginBtn;

	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPswrdTF() {
		return pswrdTF;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
}
	
	
	
	
	
