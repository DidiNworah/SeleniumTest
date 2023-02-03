package easye2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleformdemo {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// To get Selenium easy address
		driver.get("https://demo.seleniumeasy.com/");
		driver.manage().window().maximize();

		// To check that the correct site has been displayed
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		// To click on input form dropdown
		driver.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
		System.out.println("iput form Ine passed");
		
		//To click on the Simple form demo under Input forms dropdown list
		driver.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
		System.out.println("Simple form passed");
		
		//To enter message
		WebElement message = driver.findElement(By.id("user-message"));
		message.clear();
		message.sendKeys("LET LOVE LEAD");
		
		
		//To show message entered
		driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
		System.out.println("Simple form passed");
		
		
		//To enter field a value
				WebElement valuea = driver.findElement(By.id("sum1"));
				valuea.clear();
				valuea.sendKeys("8");
				
		//To enter field b value
				WebElement valueb = driver.findElement(By.id("sum2"));
				valueb.clear();
				valueb.sendKeys("7");	
				
				
		//To get total
				driver.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click();
				System.out.println("Simple form passed");
						


		System.out.println("Post message milestone passed!");

		//driver.close();

}
}
