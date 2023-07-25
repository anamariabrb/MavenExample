package curs16;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class cssSelectors extends BaseTest {
		
	@Test
	public void cssSelectorExample(){
	
		WebElement selectedOption = driver.findElement (By.cssSelector("li[class*='sc_tabs_title'][aria-selected='true']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background:green; border:10px)
		
	}

}
