package testScript;

import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLabraries.BaseClass;

public class SendContactDetailsTest extends BaseClass {
	
	@Test
	
	public void sendContactDetailsTest() {
		SoftAssert soft = new SoftAssert();
		
		
		home.clickGearsTab();
		home.clickSkillraryDemoApp();
		web.handleChildBrowser();
		
		
		soft.assertTrue(demoApp.getLogoText().contains("ECommerce"));
		
		web.scrollToElement(demoApp.getContactUs());
		demoApp.getContactUs();
		
		
		soft.assertTrue(contact.getPageLogo().isDisplayed());
		
		home.chooseEnglish();
		Map<String,String> map = excel.readDataFromExcel("Sheet1");
		contact.sendDetails(map.get("FullName"), map.get("Email"),
				map.get("Subject"), map.get("Message"));
		
		soft.assertAll();
		
	}

}
