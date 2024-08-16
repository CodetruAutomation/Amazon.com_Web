package com.codetru.Demo.Amazon.testcases;

import org.testng.annotations.Test;
import com.OpenMRS.constants.FrameworkConstants;
import com.OpenMRS.helpers.ExcelHelpers;
import com.OpenMRS.utils.JiraCreateIssue;
import com.codetru.common.BaseTest;

public class C_Tumbler_Test extends BaseTest {
	@JiraCreateIssue(isCreateIssue=	true)
	 @Test
    public void TC_Add_Tumbler_To_The_Cart() throws Exception {
		 
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
       
        getStep_1Page().AddTumbler();
 
	 }
}
