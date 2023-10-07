package sample;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCode {
	@Test
	public void lauchBrowser() throws Exception 
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\naralasettynikhila\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		AssertJUnit.assertTrue(driver.getTitle().contains("Google"));
		driver.get("https://www.jenkins.io");
		Thread.sleep(3000);
		driver.quit();
	}
}