package first_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_class {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://127.0.0.1:5500/index.html");

		driver.findElement(By.id("one1")).sendKeys("saeedabed@gmail.com");
		driver.findElement(By.id("two1")).sendKeys("saeed123");
		driver.findElement(By.id("three1")).sendKeys("6/6/2000");
		driver.findElement(By.id("four1")).sendKeys("5454654634");
		driver.findElement(By.tagName("button")).click();

	}

}
