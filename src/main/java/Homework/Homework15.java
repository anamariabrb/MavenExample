package Homework;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework15 extends BaseTest {
	
	@Test
	public void findBooksInCategories() throws InterruptedException {
		
		int nr_forest_found = 0;
		
		List <WebElement> categories = driver.findElements(By.cssSelector("div[id*='sc_tabs']>ul[class*='sc_tabs_titles']>li"));
		
		for(WebElement category : categories) {
			
			category.click();
			Thread.sleep(2000);
			
			List <WebElement> books = driver.findElements(By.cssSelector("h3[class*='sc_title']>a"));
			for(WebElement book : books) {
			
				if (book.getText().contains("The forest") && book.isDisplayed()) {
						
					nr_forest_found++;
						
					if(nr_forest_found==4) {
						book.click();
						Thread.sleep(2000);
						
						assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-forest/");	
					}	
				}
			}
		}
	}
}

