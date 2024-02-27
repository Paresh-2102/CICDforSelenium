package workOverviewIssueAssertion;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import workOverviewIssueModule.workOverviewIssueModule;

public class workOverviewAssertionIssue {
	
	workOverviewIssueModule issue=new workOverviewIssueModule();
//
//	Issuepage issue=new Issuepage();
	String actualId="TT-I9";
	String actualProjectName="IssueVI04";
	String actualProjectDate="21 Feb 2024";
	String actualProjectStatus="Open";
	String actualProjectPriority="Show stopper";
	
	
	@BeforeMethod
	public void launchbrowser() throws InterruptedException {
		issue.launchBrowser("paresh.mali@simformsolutions.com","Simform@123");
	}
	@Test
	public void creatingIssue() throws InterruptedException {
		issue.creatIssue();
		issue.getValuesOfProjectId();
		Assert.assertEquals(actualId, issue.getValuesOfProjectId(), "Error message if assertion fails");
		Assert.assertEquals(actualProjectName, issue.getValueOfProjectName(), "Error message if assertion fails");
		Assert.assertEquals(actualProjectDate, issue.getValueOfProjectCreatedDate(), "Error message if assertion fails");
		Assert.assertEquals(actualProjectStatus, issue.getValueOfProjectStatus(), "Error message if assertion fails");
		Assert.assertEquals(actualProjectPriority, issue.getValueOfProjectSeverity(), "Error message if assertion fails");
		System.out.println(issue.getValuesOfProjectId());
	
}
	
//	For the testing the run test ng using method
//	@Test
//	public void solidIssue() throws InterruptedException {
//		issue.creatIssue();
//		issue.getValuesOfProjectId();
//		Assert.assertEquals(actualId, issue.getValuesOfProjectId(), "Error message if assertion fails");
//		Assert.assertEquals(actualProjectName, issue.getValueOfProjectName(), "Error message if assertion fails");
//	}
//	
	@AfterMethod
	public void closingBrowser() {
		issue.closeBrowser();	
	}

}

