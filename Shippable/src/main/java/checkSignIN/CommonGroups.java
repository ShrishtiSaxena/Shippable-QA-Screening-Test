package checkSignIN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class CommonGroups {

	
	public static void navigateToSignPage(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(SignPage.signInLink));
		SignPage.signInLinkClick(driver);
		wait.until(ExpectedConditions.titleContains("Sign in to GitHub · GitHub"));
		Assert.assertEquals("Sign in to GitHub · GitHub", driver.getTitle());
	}
}
