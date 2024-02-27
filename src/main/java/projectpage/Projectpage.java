package projectpage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//import io.github.bonigarcia.wdm.WebDriverManager;

public class Projectpage {
	public WebDriver driver;
	public WebDriverWait wait;
	
	public void launchBrowserOnSimform() {
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://zoho-dev.simform.solutions/");
		driver.findElement(By.id("email")).sendKeys("deep.p@simformsolutions.com");
		driver.findElement(By.id("password")).sendKeys("Simform@123");
		driver.findElement(By.xpath("//span[text()='Submit']")).click();

	}
	
	public void loginZohoClone() throws InterruptedException {
		
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Add Project')]")));
		element.click();
		
		WebElement element2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("projectTitle")));
		element2.sendKeys("Project testing by selenium");
		
		WebElement element1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("owner")));
		element1.sendKeys("deep patel");
		Thread.sleep(2000);
		element1.sendKeys(Keys.ENTER);
		
		WebElement taskName=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("groupId")));
		taskName.sendKeys(Keys.ENTER, Keys.DOWN, Keys.ENTER);
		
	
		WebElement selectStartDate=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("startDate")));
		selectStartDate.sendKeys("2024-01-03",Keys.ENTER);
		
		WebElement selectDueDate=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("endDate")));
		selectDueDate.sendKeys("2024-01-05",Keys.ENTER);

		WebElement csmUser=driver.findElement(By.id("csm"));
		csmUser.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		csmUser.sendKeys(Keys.DOWN,Keys.ENTER);
		
		WebElement modelSelection=driver.findElement(By.id("model"));
		modelSelection.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		modelSelection.sendKeys(Keys.DOWN,Keys.ENTER);
		
		WebElement flagSelection=driver.findElement(By.id("flag"));
		flagSelection.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		flagSelection.sendKeys(Keys.DOWN,Keys.ENTER);
		
		WebElement projectcodeSelection=driver.findElement(By.id("projectCode"));
		projectcodeSelection.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		projectcodeSelection.sendKeys(Keys.DOWN,Keys.ENTER);
		
//		driver.findElement(By.xpath("//span[text()='Add']")).click();
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
}
	
	public String getValuesOfProjectId() throws InterruptedException {
		WebElement valueofProjectId=driver.findElement(By.xpath("(//span[@class='fz-14 text-neutral-400 nowrap'])[1]"));
		String value1=valueofProjectId.getText();
		System.out.println(value1);
		return value1;
	}


	public String getValueOfProjectName() {
		WebElement valueofProjectName=driver.findElement(By.xpath("(//div[@class='d-flex ai-center gap-8']/a[@class='hover-text'])[1]"));
		String value2=valueofProjectName.getText();
		System.out.println(value2);
		return value2;
	}


	public String getValueOfProjectCreatedDate() {
		WebElement valueofCreatedDate=driver.findElement(By.xpath("(//td)[10]"));
		String value3=valueofCreatedDate.getText();
		System.out.println(value3);
		return value3;
	}
	
	public String getValueOfProjectStatus() {
		WebElement valueofStatus=driver.findElement(By.xpath("(//span[@class='status inprogress'])[1]"));
		String value4=valueofStatus.getText();
		System.out.println(value4);
		return value4;
}
	
	public String getValueOfProjectSeverity() {
		WebElement valueofSeverity=driver.findElement(By.xpath("(//td)[14]"));
		String value4=valueofSeverity.getText();
		System.out.println(value4);
		return value4;
	}
	

	public void closeBrowser() {
		driver.quit();
	}


}
