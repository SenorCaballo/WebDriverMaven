package webDriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void doLogin() {
		
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("mkang80@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'initialView\']/footer/ul/li[1]/a")).click();
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}
}
