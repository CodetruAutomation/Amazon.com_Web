package com.codetru.Demo.Amazon.pages;

import com.OpenMRS.constants.FrameworkConstants;
import com.codetru.project.cica.CommonPageCICA;
import static com.OpenMRS.keywords.WebUI.*;
import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.By;

public class A_LoginPage extends CommonPageCICA {
	
//	private By signin_page = By.xpath("//span[text() = 'Hello, sign in']") ;				
	private By signin_btn= By.xpath( "//span[@id='nav-link-accountList-nav-line-1']");
	private By Email_field= By.xpath("//input[@id='ap_email']");
	private By Continue_btn= By.xpath("//input[@id='continue']");
	private By Password_field= By.xpath("//input[@id='ap_password']");
	private By Login_btn= By.xpath("//input[@id='signInSubmit']");


	public void openLoginPage() {
		openWebsite(FrameworkConstants.URL_CMS_USER);
		waitForPageLoaded();
	}
	
	public void Launch_Url() {
		openWebsite(FrameworkConstants.URL_CMS_USER);
		waitForPageLoaded();
	}

	public void Valid_Username_Password() throws Exception {

		sleep(2);
		clickElement(signin_btn); 
		setText(Email_field, "codetruteamlead@gmail.com");
		clickElement(Continue_btn);
		sleep(1);
		
		Robot robot = new Robot();
        robot.mouseMove(938,332);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
        setText(Password_field, "Codetru@007");
		clickElement(Login_btn);
		waitForPageLoaded();
		sleep(1);
		
	}


}


