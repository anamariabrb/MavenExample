package curs16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class isSelectedExample extends BaseTest{
	
	@Test
	public void isSelectedTest() {
		driver.findElement(By.cssSelector("li[class='menu_user_login']>a[href*='popup_login']"));
		
		WebElement username = driver.findElement(By.cssSelector("div[class='form_left'] input[id='log']"));
		System.out.println(username.isSelected());
		
		username.click();
		System.out.println("After click" + username.isSelected());
		
		System.out.println("------------------");
		
		WebElement rememberMe = driver.findElement(By.cssSelector("li[class='menu_user_login'] input[id='rememberme']"));
		rememberMe.click();
	}

}
