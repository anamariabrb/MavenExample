package curs16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JSAlertExample extends BaseTest {

	
	@Test
	public void simpleJsAlert(){
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.cssSelector("li>button[onclick='jsAlert()']"));
		
	
		driver.switchTo().alert().accept();
		
		WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
		
		
		
		
	}
	
	
	
}
