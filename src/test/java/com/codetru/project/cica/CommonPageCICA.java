package com.codetru.project.cica;

import static com.OpenMRS.keywords.WebUI.clickElement;
import static com.OpenMRS.keywords.WebUI.getTextElement;
import static com.OpenMRS.keywords.WebUI.setText;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import com.codetru.Demo.Amazon.pages.*;


public class CommonPageCICA {

	private A_LoginPage loginCICA;
	private B_Watch_Page homePage;
	private C_Tumbler_Page step_1Page;
	private D_Airpods_Page step_2Page;
	private E_DeleteCart_Page step_3Page;
//	private F_Transfer_TO_Ward_Page step_4Page;
//	private I_SystemAdministration_Page step_5Page;
//	private G_PatientCondition_Page step_6Page;
//	private H_Allergy_Page step_7Page;


	public A_LoginPage getLoginPage() {
		if (loginCICA == null) {
			loginCICA = new A_LoginPage();
		}
		return loginCICA;
	}
	
	public B_Watch_Page getHomePage() {
		if (homePage == null) {
			homePage = new B_Watch_Page();
		}
		return homePage;
	}

	public C_Tumbler_Page getStep_1Page() {
		if (step_1Page == null) {
			step_1Page = new C_Tumbler_Page();
		}
		return step_1Page;
	}

	public D_Airpods_Page getStep_2Page() {
		if (step_2Page == null) {
			step_2Page = new D_Airpods_Page();
		}
		return step_2Page;
	}

	public E_DeleteCart_Page getStep_3Page() {
		if (step_3Page == null) {
			step_3Page = new E_DeleteCart_Page();
		}
		return step_3Page;
	}

//	public F_Transfer_TO_Ward_Page getStep_4Page() {
//		if (step_4Page == null) {
//			step_4Page = new F_Transfer_TO_Ward_Page();
//		}
//		return step_4Page;
//	}
//
//	public I_SystemAdministration_Page getStep_5Page() {
//		if (step_5Page == null) {
//			step_5Page = new I_SystemAdministration_Page();
//		}
//		return step_5Page;
//	}
//
//	public G_PatientCondition_Page getStep_6Page() {
//		if (step_6Page == null) {
//			step_6Page = new G_PatientCondition_Page();
//		}
//		return step_6Page;
//	}
//	
//	public H_Allergy_Page getStep_7Page() {
//		if (step_7Page == null) {
//			step_7Page = new H_Allergy_Page();
//		}
//		return step_7Page;
//	}
	
	
	
//  ------------------------------------------------------------------------------------------------------------------

	private By menuProducts = By.xpath("//span[normalize-space()='Products']");
	private By messageNotify = By.xpath("//span[@data-notify='message']");
	private By buttonEdit = By.xpath("(//a[@title='Edit'])[1]");
	private By buttonSave = By.xpath("//button[normalize-space()='Save']");
	private By inputSearch = By.xpath("//input[@id='search']");
	public By avatarProfile = By.xpath("//span[contains(@class,'avatar avatar-sm')]");
	public By buttonCookies = By.xpath("//button[normalize-space()='Ok. I Understood']");

	public void enterDataOnSearchDataTable(String value) {
		setText(inputSearch, value, Keys.ENTER);
	}

	public void clickEditButton() {
		clickElement(buttonEdit);
	}

	public void clickSaveButton() {
		clickElement(buttonSave);
	}

	public String getMessageNotify() {
		return getTextElement(messageNotify);
	}

	public CommonPageCICA clickMenuProducts() {
		clickElement(menuProducts);
		return this;
	}


}
