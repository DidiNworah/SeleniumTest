package easye2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo {
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
		Thread.sleep(5000);
		System.out.println("iput form Ine passed");
		
		//To click on the Checkbox demo under Input forms dropdown list
		driver.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(5000);
		System.out.println("Simple form passed");
		
		//To click on the Checkbox icon
				driver.findElement(By.id("isAgeSelected")).click();
				Thread.sleep(5000);
				System.out.println("Checkbox passed");
			
		//To click on the Check All box icon
				driver.findElement(By.id("check1")).click();
				Thread.sleep(5000);
				System.out.println("Check All box passed");
				
				
		//To uncheck one check box icon
				//driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[2]/label[1]/input[1]")).click();
				//Thread.sleep(25000);
				//System.out.println("uncheck one box passed");
				
				
		//To click on UnCheck All box icon
				driver.findElement(By.id("check1")).click();
				Thread.sleep(5000);
				System.out.println("UnCheck All box passed");
						
			
					
		System.out.println("Post message milestone passed!");

		//driver.close();

}
	}

