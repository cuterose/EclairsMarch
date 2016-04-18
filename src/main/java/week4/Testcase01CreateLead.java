//Program to Create Lead
package week4;
import org.junit.Test;
public class Testcase01CreateLead extends OpenTapsWrapper  {
	@Test
	public void Lead() {
		
		for (int i = 1; i <= 2; i++) {
			String dataSheetName = "TC01_CreateLead";
			String username = readCellFromExcel(dataSheetName, i, 1);
			String password= readCellFromExcel(dataSheetName, i, 2);
			String CompanyName = readCellFromExcel(dataSheetName, i, 3);
			String FirstName = readCellFromExcel(dataSheetName, i, 4);
			String LastName = readCellFromExcel(dataSheetName, i, 5);
			String Source = readCellFromExcel(dataSheetName, i, 6);
			String MarketingCampaign = readCellFromExcel(dataSheetName, i,7);
			String Phone = readCellFromExcel(dataSheetName, i, 8);
			String Email = readCellFromExcel(dataSheetName, i, 9);
		 	loginOpenTaps("chrome", username, password);
			clickByLinkText("CRM/SFA");
		    clickByLinkText("Create Lead");
		    enterById("createLeadForm_companyName",CompanyName);
		    enterById("createLeadForm_firstName",FirstName);
		    enterById("createLeadForm_lastName",LastName);
		    selectValueVisibleTextById("createLeadForm_dataSourceId",Source);
		    selectValueVisibleTextById("createLeadForm_marketingCampaignId",MarketingCampaign);
		    enterById("createLeadForm_primaryPhoneNumber",Phone);
		    enterById("createLeadForm_primaryEmail",Email);
		    clickByXpath("//input[@value='Create Lead']");
		    String text=getTextById("viewLead_companyName_sp");
		    System.out.println("Lead Id is:"+text);
				}
			}
	 }
