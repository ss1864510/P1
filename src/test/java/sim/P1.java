package sim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P1 {
	WebDriver driver;
	@Test
	public void s1() {
		
		ChromeOptions option=new ChromeOptions();
		driver =new ChromeDriver(option);
		driver.get("https://ssupdates123.blogspot.com/");
		
	}
	@Test
	public void s2() {
		String tes=driver.findElement(By.className("search-expand-text")).getText();
		Assert.assertEquals("SEARCH", tes);
		
	}

}
