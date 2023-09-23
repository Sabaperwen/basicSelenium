package login;

import org.testng.annotations.Test;

import generics.BaseClass;

public class DWS_Register_10_Test extends BaseClass {
	@Test
	 public void Register_with_valid_credential()
	 {
		 register.getRegisterBtn().click();
		 register.getGender().click();
		 register.getFirstName().sendKeys("saba");
		 register.getLastName().sendKeys("Perween");
		 register.getMyPswrd().sendKeys("saba8936");
		 register.getCnfrmPswrd().sendKeys("saba8936");
		 register.getRegisterBtn();
	 }
}
