package easye2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlist {

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
		
		// To click on Dropdown list
				driver.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[4]/a[1]")).click();
				Thread.sleep(5000);
				System.out.println("Dropdown list passed");
				
		// To select a day
				driver.findElement(By.xpath("//select[@id='select-demo']")).click();
				Thread.sleep(5000);
				System.out.println("select a day passed");
				
		// To select a week day from list
				WebElement staticDropdown = driver.findElement(By.id("select-demo"));
						Select dropdown = new Select(staticDropdown);
						dropdown.selectByIndex(1);
						Thread.sleep(5000);
						driver.findElement(By.id("select-demo")).click();
				Thread.sleep(5000);
				System.out.println("select a day passed");
				
				


		System.out.println("Post message milestone passed!");

		//driver.close();
	}
}
