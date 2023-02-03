package easye2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepickers {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// To get Selenium easy address
		driver.get("https://demo.seleniumeasy.com/");
		driver.manage().window().maximize();

		// To check that the correct site has been displayed
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		// To click on datepickers dropdown
		driver.findElement(By.cssSelector("div.container-fluid:nth-child(1) div.row:nth-child(2) nav.navbar.navbar-default div.container div.collapse.navbar-collapse ul.nav.navbar-nav:nth-child(1) li.dropdown:nth-child(2) > a.dropdown-toggle")).click();
		System.out.println("Datepicker passed");


		System.out.println("Post message milestone passed!");

		//driver.close();
	}

}
