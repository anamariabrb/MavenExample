package Homework;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;

public class Homework14 extends BaseTest {

	@Test
	public void findLoginButton() throws InterruptedException {
		
		WebElement loginButton = driver.findElement(By.className("menu_user_login"));
		assertTrue(loginButton.isDisplayed());
	
		WebElement loginField = driver.findElement(By.id("log"));
		WebElement passwordField = driver.findElement(By.id("password"));
		assertTrue(!loginField.isDisplayed() && !passwordField.isDisplayed());
		
		loginButton.click();
		Thread.sleep(2000);  //necesar pt a gasi elementele
		assertTrue(loginField.isDisplayed() && passwordField.isDisplayed());
	}
}
