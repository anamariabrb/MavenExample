package Homework;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework17  extends BaseTest {
	
	//Homework1
	@Test
	public void searchBook() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.findElement(By.cssSelector("button[title='Open search']")).click();
		driver.findElement(By.cssSelector("input[class='search_field']")).sendKeys("king");
		driver.findElement(By.linkText("The Wicked King")).click();
		
		assertTrue(driver.findElement(By.cssSelector("span[class='posted_in']")).getText().contains("New releases"));
		assertTrue(driver.findElement(By.cssSelector("span[class='product_id']")).getText().contains("1709"));
		
		List <WebElement> imagesList =  driver.findElements(By.cssSelector("figure[class='woocommerce-product-gallery__wrapper']>div>a"));
	
		assertTrue(imagesList.get(0).getAttribute("href").contains("TheWickedKing1.png"));
		assertTrue(imagesList.get(1).getAttribute("href").contains("TheWickedKing3.png"));
		assertTrue(imagesList.get(2).getAttribute("href").contains("TheWickedKing4.png"));
		assertTrue(imagesList.get(3).getAttribute("href").contains("TheWickedKing2.png"));
	}
	//Homework2
	@Test
	public void singleAuthorPage() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://keybooks.ro/");
		
		driver.findElements(By.cssSelector("ul[id='menu_main']>li")).get(5).click();
		
		assertTrue(driver.findElement(By.cssSelector("div[class='sc_skills_count']>div[data-stop='95']"))
				.getAttribute("data-stop").contains("95"));
		assertTrue(driver.findElement(By.cssSelector("div[class='sc_skills_count']>div[data-stop='75']"))
				.getAttribute("data-stop").contains("75"));
		assertTrue(driver.findElement(By.cssSelector("div[class='sc_skills_count']>div[data-stop='82']"))
				.getAttribute("data-stop").contains("82"));
		
		
		
		
		
	}

}

	