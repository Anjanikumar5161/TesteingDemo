package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase1 {
	
	@Test
   public static void users()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://in.dev.vibhohcm.com/");
		
		driver.findElement(By.id("username")).sendKeys("dev");
		driver.findElement(By.id("password")).sendKeys("root123");
		driver.findElement(By.className("login-signin")).click();
		
		
	}
}
