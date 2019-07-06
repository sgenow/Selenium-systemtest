package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		String os = System.getProperty("os.name").toLowerCase();
		WebDriver driver = new ChromeDriver();

		if (os.contains("mac")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		} else {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		}

		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("sgenow@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(2000);
		String at = driver.getTitle();
		String et = "gmail";
		driver.close();
		if (at.equalsIgnoreCase(et)) {
			System.out.println("Test Successful");
		} else {
			System.out.println("Test Failed");
		}

	}

}
