package projectassertionpage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import projectpage.Projectpage;

public class Projectassrtionpage {
	
	String actualId="PR-1484";
	String actualProjectName="Project testing by selenium";
	String actualProjectDate="20 Feb 2024";
	String actualProjectStatus="Active";
	String actualProjectPriority="Mihir Kacha";
	Projectpage tasks=new Projectpage();
	
	@BeforeMethod
	public void launchBrowser() throws InterruptedException {
		
		tasks.launchBrowserOnSimform();
	}
	
	@Test
	public void assetTaskaPage() throws InterruptedException {
		tasks.loginZohoClone();
//		task.creatTask();
//		tasks.getValuesOfProjectId();
//		tasks.getValueOfProjectName();
//		tasks.getValueOfProjectCreatedDate();
//		tasks.getValueOfProjectStatus();
//		tasks.getValueOfProjectSeverity();
		Assert.assertEquals(actualId, tasks.getValuesOfProjectId(), "Error message if assertion fails");
		Assert.assertEquals(actualProjectName, tasks.getValueOfProjectName(), "Error message if assertion fails");
		Assert.assertEquals(actualProjectDate, tasks.getValueOfProjectCreatedDate(), "Error message if assertion fails");
		Assert.assertEquals(actualProjectStatus, tasks.getValueOfProjectStatus(), "Error message if assertion fails");
		Assert.assertEquals(actualProjectPriority, tasks.getValueOfProjectSeverity(), "Error message if assertion fails");
//		System.out.println(issue.getValuesOfProjectId());
		
		
	}
	
	@AfterMethod
	public void closeBrowse1() {
		tasks.closeBrowser();
}

}
