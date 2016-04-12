package week3;
import org.junit.Test;
public class HwusingWrapper extends WrapperClass {
@Test
public void creaate() 
 {
launchApp("chrome", "http://demo1.opentaps.org/opentaps/control/main");
enterbyid("username","DemoSalesManager");
enterbyid("password","crmsfa");
clickbyclassname("decorativeSubmit");
clickbylinkText("CRM/SFA");
clickbylinkText("Create Lead");
enterbyid("createLeadForm_companyName","Fss");
enterbyid("createLeadForm_firstName","Sasi");
enterByXpath("//*[@id='createLeadForm_lastName']","devi");
clickByXpath("//input[@value='Create Lead']");
clickByXpath("//*[@id='ext-gen166']");
enterByXpath("//*[@id='ext-gen112']","Sasi");
enterByXpath("//*[@id='ext-gen114']","devi");
clickByXpath("//*[@id='ext-gen158']");
System.out.println("The contact has been created");
 }
}