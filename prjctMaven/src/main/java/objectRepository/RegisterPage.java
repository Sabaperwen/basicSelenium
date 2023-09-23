package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BaseClass;

public class RegisterPage extends BaseClass {

	public RegisterPage(WebDriver driver)
	{
    PageFactory.initElements(driver,this);
}
	@FindBy(className ="ico-register")
	private WebElement registerBtn;
	
	@FindBy(id="gender-female")
	private WebElement gender;
	
	@FindBy(id="FirstName")
	private WebElement firstName;
	
	@FindBy(id="LastName")
	private WebElement lastName;
	
	@FindBy(id="Password")
	private WebElement myPswrd;
	
	@FindBy(id="ConfirmPassword")
	private WebElement cnfrmPswrd;
	
	@FindBy(id="register-button")
	private WebElement rgstrBtn;
	{
		

	}
	public WebElement getRegisterBtn() {
		return registerBtn;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getMyPswrd() {
		return myPswrd;
	}
	public WebElement getCnfrmPswrd() {
		return cnfrmPswrd;
	}
	public WebElement getRgstrBtn() {
		return rgstrBtn;
	}

}
