package com.automation.page;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkdinRemoveConnection {
	public static void main(String[] args) throws InterruptedException {
		try {
			System.setProperty("webdriver.chrome.driver", "src//test//resources//webdrivers//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get(
					"https://www.linkedin.com/uas/login?session_redirect=https%3A%2F%2Fwww%2Elinkedin%2Ecom%2Ffeed%2F&fromSignIn=true&trk=cold_join_sign_in");
			driver.findElement(By.id("username")).sendKeys("khimanichirag@gmail.com");
			driver.findElement(By.id("password")).sendKeys("Special@0");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.get("https://www.linkedin.com/mynetwork/invitation-manager/sent/?invitationType=&page=3");
			Thread.sleep(10000);
			List<WebElement> withdrawList = driver.findElements(By.xpath("//span[text()='Withdraw']"));

			for (WebElement webElement : withdrawList) {
				webElement.click();
				Thread.sleep(5000);
				WebElement element = driver.findElement(By.xpath("//span[text()='Withdraw']"));
				element.click();
				Thread.sleep(5000);
				withdrawList = driver.findElements(By.xpath("//span[text()='Withdraw']"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
