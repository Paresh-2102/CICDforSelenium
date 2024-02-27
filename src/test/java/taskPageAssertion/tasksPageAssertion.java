package taskPageAssertion;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import projectpage.Projectpage;
import recentprojecttaskspage.Recentprojecttasks;

public class tasksPageAssertion {
	
	String actualId="TT-T8";
	String actualProjectName="Testing the Add Tasks is working";
	String actualProjectDate="Deep Patel,Rutvik Bhimani";
	String actualProjectStatus="Re-Open";
	String actualProjectPriority="Medium";
	String actualCreatedBy="Deep Patel";

	Recentprojecttasks task=new Recentprojecttasks();
		
		@BeforeMethod
		public void launchBrowser() throws InterruptedException {
			
			task.launchBrowserOnSimform();;
		}
		

		@Test
		public void assetTaskaPage() throws InterruptedException {
			task.loginZohoClone();
//			task.creatTask();
//			
//			task.getValuesOfProjectId();
//			task.getValueOfProjectName();
//			task.getValueOfProjectCreatedDate();
//			task.getValueOfProjectStatus();
//			task.getValueOfProjectSeverity();
//			task.getValueOftaskscreatedby();
			Assert.assertEquals(actualId, task.getValuesOfProjectId(), "Error message if assertion fails");
			Assert.assertEquals(actualProjectName, task.getValueOfProjectName(), "Error message if assertion fails");
			Assert.assertEquals(actualProjectDate, task.getValueOfProjectCreatedDate(), "Error message if assertion fails status");
			Assert.assertEquals(actualProjectStatus, task.getValueOfProjectStatus(), "Error message if assertion fails");
			Assert.assertEquals(actualProjectPriority, task.getValueOfProjectSeverity(), "Error message if assertion fails");
			Assert.assertEquals(actualCreatedBy, task.getValueOftaskscreatedby(), "Error message if assertion fails");
//			System.out.println(issue.getValuesOfProjectId());
		}
		
		@AfterMethod
		public void closeBrowse1() {
			task.closeBrowser();
	}


}
