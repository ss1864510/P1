package sim;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	@Test 
	public void s3() {
		ChromeOptions option=new ChromeOptions();
		WebDriver driver =new ChromeDriver(option);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> ls=
				driver.findElements
				(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']/table/tbody/tr[2]"));
		
		for(WebElement l:ls) {
			System.out.println(l.getText());
		}
	}
		@Test
		public void s4() {
		ChromeOptions option=new ChromeOptions();
		WebDriver driver =new ChromeDriver(option);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> ls=
				driver.findElements
				(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']/table/tbody/tr/td[1]"));
		
		for(WebElement l:ls) {
			System.out.println(l.getText());
		
	}}

}
