package newwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTestCase {
	@Test
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.testng/testng");
		System.out.println("Successfully Launched");
		Assert.assertEquals(false, null);
		

	}

}

