package recentprojecttaskspage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Recentprojecttasks {
	public WebDriver driver;
	public WebDriverWait wait;
	
	
	public void launchBrowserOnSimform() {

	    driver=new ChromeDriver();
		driver.get("https://zoho-dev.simform.solutions/");
		driver.findElement(By.id("email")).sendKeys("deep.p@simformsolutions.com");
		driver.findElement(By.id("password")).sendKeys("Simform@123");
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		

	}
	
	public void loginZohoClone() throws InterruptedException {
//		
//		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement workOverview=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Work Overview']")));
//		workOverview.click();
//		WebElement projectName=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Issues']")));
//		projectName.click();
//		WebElement submitIssuebutton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Submit Issue']")));
//		submitIssuebutton.click();
		
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Projects']")));
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Projects']")));
		element.click();
		
		WebElement element2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sc-bbSZdi SAcuI']/div[text()='Testing the document']")));
		element2.click();
		
		WebElement element1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Add Task')]")));
		element1.click();
		
		WebElement taskName=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("taskName")));
		taskName.sendKeys("Testing the Add Tasks is working");
		String file_path="zohoCloneDemoforSelenium/pictures/Issuecoloronzohoclone.png";
		
//		WebElement fileuploadtion=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Upload Files')]")));
//		fileuploadtion.sendKeys(file_path);
//		fileuploadtion.sendKeys("C:\\Users\\paresh\\Downloads\\APIFailing (1) (2).mp4");
		
		
		WebElement selectTasks=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tasklist")));
		selectTasks.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		selectTasks.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER);
		
		WebElement  temp = driver.findElement(By.xpath("//input[@id='owner']"));
		temp.click();
		temp.sendKeys("Deep patel", Keys.UP, Keys.ENTER);
	
		WebElement selectStartDate=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("startDate")));
		selectStartDate.sendKeys("2024-01-03",Keys.ENTER);
		
		WebElement selectDueDate=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dueDate")));
		selectDueDate.sendKeys("2024-01-05",Keys.ENTER);

		WebElement selectPriority=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("priority")));
		selectPriority.sendKeys(Keys.ENTER, Keys.DOWN, Keys.DOWN,Keys.ENTER);
		
		driver.findElement(By.xpath("//span[text()='Add']")).click();
//		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		WebElement button=driver.findElement(By.xpath("(//div[@id='dragButton']/button[@class='ant-btn css-c5l3jt ant-btn-text sc-gEvEer duUGEB sc-dAlyuH bnGnEl'])[1]"));
		button.click();
		Thread.sleep(2000);
	
}
	public String getValuesOfProjectId() throws InterruptedException {
		WebElement valueofTasksId=driver.findElement(By.xpath("(//span[@class='fz-14 text-neutral-400 nowrap ml-8 prefix-code sc-dAlyuH bnGnEl'])[1]"));
		String value1=valueofTasksId.getText();
		System.out.println(value1);
		return value1;
	}


	public String getValueOfProjectName() {
		WebElement valueofTasksName=driver.findElement(By.xpath("(//div[@class='sc-hknOHE fEGuYX d-flex ai-center gap-8']/a)[1]"));
		String value2=valueofTasksName.getText();
		System.out.println(value2);
		return value2;
	}


	public String getValueOfProjectCreatedDate() {
		WebElement valueoftasksOwner=driver.findElement(By.xpath("(//td)[13]"));
		String value3=valueoftasksOwner.getText();
		System.out.println(value3);
		return value3;
	}
	
	public String getValueOfProjectStatus() {
		WebElement valuetasksStatus=driver.findElement(By.xpath("(//td)[14]"));
		String value4=valuetasksStatus.getText();
		System.out.println(value4);
		return value4;
}
	
	public String getValueOfProjectSeverity() {
		WebElement valueofProproty=driver.findElement(By.xpath("(//td)[16]"));
		String value4=valueofProproty.getText();
		System.out.println(value4);
		return value4;
	}
	
	public String getValueOftaskscreatedby() {
		WebElement valueofCreatedBy=driver.findElement(By.xpath("(//td)[17]"));
		String value4=valueofCreatedBy.getText();
		System.out.println(value4);
		return value4;
	}
	
	

	public void closeBrowser() {
		driver.quit();
	}


}
