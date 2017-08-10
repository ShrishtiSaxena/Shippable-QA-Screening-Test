package checkSignIN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignPage {

	  public static By signInLink=By.xpath("//a[text()='Sign in']");
	
	  public static By userNameField=By.xpath("//input[@name='login']");
	  public static By passwordField=By.xpath("//input[@name='password']");
	  public static By signInButton=By.xpath("//input[@type='submit']");
	  public static By flashMessage=By.className("flash flash-full flash-error");
	
	public static void signInLinkClick(WebDriver driver)
	{
		
		driver.findElement(signInLink).click();
	}
	
	public static void userNameInput(WebDriver driver,String username)
	{
		
		driver.findElement(userNameField).sendKeys(username);
	}
	
	public static void passwordInput(WebDriver driver,String password)
	{
		
		driver.findElement(passwordField).sendKeys(password);
	}
	public static void signInButtonClick(WebDriver driver)
	{
		
		driver.findElement(signInButton).click();
	}
	
	public static void flashMessageGetText(WebDriver driver)
	{
		
		System.out.println(driver.findElement(flashMessage).getText());
	}
}
