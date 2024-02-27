package workOverviewIssueModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class workOverviewIssueModule {
		public WebDriver driver;
//	 	public WebDriver driver;
		public Action actions;
		public String var;
		public WebDriverWait wait;
		By loginUser=By.id("email");
		By loginPassword=By.id("password");
		public String launchBrowser(String username, String userPassword) throws InterruptedException {

			driver=new ChromeDriver();
			driver.get("https://zoho-dev.simform.solutions/");
			Thread.sleep(2000);
			driver.findElement(loginUser).sendKeys(username);
			Thread.sleep(2000);
			driver.findElement(loginPassword).sendKeys(userPassword);
			Thread.sleep(2000);
			wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement submitbutton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Submit']")));
			submitbutton.click();
			return null;
		}
		
		public void creatIssue() throws InterruptedException {
			wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement workOverview=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Work Overview']")));
			workOverview.click();
			WebElement projectName=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Issues']")));
			projectName.click();
			WebElement submitIssuebutton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Submit Issue']")));
			submitIssuebutton.click();
			WebElement enterProjectName=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='project']")));
			enterProjectName.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			enterProjectName.sendKeys(Keys.ENTER,Keys.DOWN,Keys.DOWN,Keys.ENTER);
			WebElement issueName=driver.findElement(By.xpath("//input[@id='issuetitle']"));
			issueName.sendKeys("Testing the issue");
			WebElement enterAssigneeId=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='assignee']")));
			enterAssigneeId.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			enterAssigneeId.sendKeys(Keys.DOWN,Keys.ENTER);
			Thread.sleep(2000);
			var="Add";
			driver.findElement(By.xpath("//span[text()='"+var+"']")).click();
			Thread.sleep(3000);
			WebElement button=driver.findElement(By.xpath("(//div[@id='dragButton']/button[@class='ant-btn css-c5l3jt ant-btn-text sc-gEvEer duUGEB sc-dAlyuH bnGnEl'])[1]"));
			button.click();
			Thread.sleep(2000);
		
		}


		public String getValuesOfProjectId() throws InterruptedException {
			WebElement valueofProjectId=driver.findElement(By.xpath("(//span[@class='fz-14 text-neutral-400 nowrap ml-8 prefix-code'])[1]"));
			String value1=valueofProjectId.getText();
			System.out.println(value1);
			return value1;
		}


		public String getValueOfProjectName() {
			WebElement valueofProjectName=driver.findElement(By.xpath("(//div[@class='first-col d-flex ai-start']/a[@class='hover-text ml-8'])[1]"));
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
			WebElement valueofStatus=driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[1]"));
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
