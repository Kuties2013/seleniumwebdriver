package newwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.testng/testng");
		System.out.println("Successfully Launched");
		

	}

}

