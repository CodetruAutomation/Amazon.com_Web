package com.codetru.Demo.Amazon.testcases;

import org.testng.annotations.Test;
import com.OpenMRS.constants.FrameworkConstants;
import com.OpenMRS.helpers.ExcelHelpers;
import com.OpenMRS.utils.JiraCreateIssue;
import com.codetru.common.BaseTest;

public class E_DeleteCart_Test extends BaseTest {
	@JiraCreateIssue(isCreateIssue=	true)
	 @Test
    public void TC_Delete_Items_From_the_Cart() throws Exception {
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
        
        getStep_3Page().Delete_Items();
    }
}
