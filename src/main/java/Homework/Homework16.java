package Homework;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework16 extends BaseTest {
	
	
	@Test
	public void contactUs() {
		
		driver.get("https://keybooks.ro/contacts/");	
	
		driver.findElement(By.cssSelector("input[name='your-name']")).sendKeys("Ana-Maria");
		driver.findElement(By.cssSelector("input[name='your-email']")).sendKeys("anamaria@yahoo.com");
		driver.findElement(By.cssSelector("input[name='your-s']")).sendKeys("Automation Testing");
		driver.findElement(By.cssSelector("textarea[name='your-message']")).sendKeys("I love Automation Testing");

		driver.findElement(By.cssSelector("input[value='Send Message']")).click();
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertTrue(driver.findElement(By.cssSelector("div[class='wpcf7-response-output']")).getText().equals("Thank you for your message. It has been sent."));
	
	
	}
}