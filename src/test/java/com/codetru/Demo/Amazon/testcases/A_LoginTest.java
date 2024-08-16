package com.codetru.Demo.Amazon.testcases;

import org.testng.annotations.Test;

import com.OpenMRS.constants.FrameworkConstants;
import com.OpenMRS.helpers.ExcelHelpers;
import com.OpenMRS.utils.JiraCreateIssue;
import com.codetru.common.BaseTest;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;

@Epic("Regression Test CMS")
@Feature("Login Test")
public class A_LoginTest extends BaseTest {
	 
	@JiraCreateIssue(isCreateIssue=	true)
    @Test(priority = 1)
    public void Launching_URL() {
        getLoginPage().Launch_Url();
    }

	@JiraCreateIssue(isCreateIssue=	true)
    @Test(priority = 2)
    public void TC_LoginSuccess_With_Valid_Credentials() throws Exception {
    	ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
        getLoginPage().Valid_Username_Password();
    }
}
