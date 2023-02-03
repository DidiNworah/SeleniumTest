package easye2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {
	
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

		
		//To click on radio button dropdown
		driver.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[3]/a[1]")).click();
		Thread.sleep(5000);
		System.out.println("Radio button dropdown passed");
		
		
		//To click on Male radio button
		driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[1]/div[2]/label[1]/input[1]")).click();
		Thread.sleep(5000);
		System.out.println("Male Radio button passed");
		
		
		//To click on Female radio button
			driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[1]/div[2]/label[2]")).click();
			Thread.sleep(5000);
			System.out.println("Female Radio button passed");
			
		//To click on button check
			driver.findElement(By.xpath("//button[@id='buttoncheck']")).click();
			Thread.sleep(5000);
			System.out.println("Button check passed");
			
		//To click on both Male and Age group
			driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[1]/label[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[2]/label[3]")).click();
			Thread.sleep(5000);
			System.out.println(" Male and age group radio button passed");
			
		//To click on Get values
			driver.findElement(By.xpath("//button[contains(text(),'Get values')]")).click();
			Thread.sleep(5000);
			System.out.println("Get values passed");	
			
		//To click on both Female and Age group
			driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[1]/label[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[2]/label[2]")).click();
			Thread.sleep(5000);
			System.out.println(" Male and age group radio button passed");
			
		//To click on Get values
			driver.findElement(By.xpath("//button[contains(text(),'Get values')]")).click();
			Thread.sleep(5000);
			System.out.println("Get values passed");	
			

		System.out.println("Post message milestone passed!");

		//driver.close();
	}

}
