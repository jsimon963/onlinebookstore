package com.onlinebookstore;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import io.github.bonigarcia.wdm.WebDriverManager;


@SpringBootTest
class OnlineBookStoreApplicationTests {

	@Test
	void contextLoads() {
	}

	 @Test
	void uiLoginTest() {
		String onlinebookstoreURL="http://127.0.0.1:8080/onlinebookstore/AdminLogin.html";
		String xpathString="";
		String anotherStr="//input[@value='Login']";
		System.out.println("UI login test started");
		WebDriverManager.chromedriver().setup();
		System.out.println("Webdriver set");
		ChromeDriver driver = new ChromeDriver();
		System.out.println("Chrome driver started");
		driver.get(onlinebookstoreURL);
		System.out.println("Opened onlinebookstore successfully");
		driver.findElement(By.id("userName")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin");
		driver.findElement(By.xpath(xpathString)).click();
		System.out.println("Login successful");
		driver.close();
                System.out.println("Test ran successfully");
	}

}
