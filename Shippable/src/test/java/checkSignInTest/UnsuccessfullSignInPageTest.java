package checkSignInTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import checkSignIN.CommonGroups;
import checkSignIN.SignPage;

public class UnsuccessfullSignInPageTest {
	
	WebDriver driver = null;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",

				"C://Shippable-QA-Screening-Test/Shippable/src/resources/chromedriver.exe");
	 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.github.com");
	}
	@Test
	public void unsuccessfullSigin() throws InterruptedException {
		
		CommonGroups.navigateToSignPage(driver);
		SignPage.userNameInput(driver,"xyz");
		SignPage.passwordInput(driver,"PQR");
		SignPage.signInButtonClick(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.titleContains("Sign in to GitHub · GitHub"));
		Assert.assertEquals("Sign in to GitHub · GitHub", driver.getTitle());
		}
	
	
	
	
	
	@AfterTest
	public void endTest()
	{
		driver.quit();
	}

}
