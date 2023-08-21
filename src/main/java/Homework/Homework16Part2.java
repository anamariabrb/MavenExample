package Homework;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework16Part2 extends BaseTest{

@Test	
public void writeReview() throws InterruptedException {
		
		driver.findElement(By.cssSelector("a[href$='silence']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[href*='tab-reviews']")).click();
		
		Thread.sleep(1000);
		
		assertFalse(driver.findElement(By.cssSelector("input[id='wp-comment-cookies-consent']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id='submit']")).click();
		
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.cssSelector("a[class='star-5']")).click();
		driver.findElement(By.cssSelector("textarea[id='comment']")).sendKeys("I loved the book!");
		driver.findElement(By.cssSelector("input[id='author']")).sendKeys("Ana-Maria");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("anamaria@yahoo.com");
		driver.findElement(By.cssSelector("input[id='wp-comment-cookies-consent']")).click();
		driver.findElement(By.cssSelector("input[id='submit']")).click();
		
		Thread.sleep(2000);
		
		assertTrue(driver.findElement(By.cssSelector("em[class='woocommerce-review__awaiting-approval']")).
				getText().contains("Your review is awaiting approval"));
}

}