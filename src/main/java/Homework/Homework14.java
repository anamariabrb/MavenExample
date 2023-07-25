package Homework;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class Homework14 {

	public static void main (String[] args) {
		
	}
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		//selenium 3 varianta 1
		//System.setProperty("webdriver.chrome.driver", "..path catre chromedriver.exe");
		//driver = new ChromeDriver();
		
		//selenium 3 varianta 2
		// driver = WebDriverManager.chromedriver.create();
		
		//selenium 4
		driver = new ChromeDriver();
		driver.manage().window().maximize();//maximizeaza fereastra browserului
		
	}
	
	@Test
	public void webelementExample() {
		
		driver.get("https://keybooks.ro/");
		
		driver.findElement(By.id("menu_user"));
}
	
	@AfterClass
	public void teardown() {
	
		driver.quit();//inchide tot browserul cu toate taburile
		//driver.close();//inchide tabul curent
	}
}

