package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\sts programs\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Gowri");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Kaushik");
		
				
	}

}
