package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\sts programs\\\\selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("sakthiraj");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("aruchamy");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(1);		
		WebElement hotels = driver.findElement(By.id("hotels"));
		hotels.sendKeys("Hotel Creek");		
		WebElement room = driver.findElement(By.id("room_type"));
		room.sendKeys("Standard");		
		WebElement roomNumber = driver.findElement(By.id("room_nos"));
		roomNumber.sendKeys("2 - Two");		
		WebElement adult = driver.findElement(By.id("adult_room"));
		adult.sendKeys("2 - Two");		
		WebElement btnSubmit = driver.findElement(By.id("Submit"));
		btnSubmit.click();
		
		WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
		btnRadio.click();
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		
		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.sendKeys("Kaushik");
		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys("Sathyanarayanan");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Neelankari");
		WebElement ccNum = driver.findElement(By.id("cc_num"));
		ccNum.sendKeys("1234567890123456");
		WebElement ccType = driver.findElement(By.id("cc_type"));
		ccType.sendKeys("American Express");
		WebElement ccExpMonth = driver.findElement(By.id("cc_exp_month"));
		ccExpMonth.sendKeys("January");
		WebElement ccExpYear = driver.findElement(By.id("cc_exp_year"));
		ccExpYear.sendKeys("2022");
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("1234");
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		
		Thread.sleep(5000);
		
		WebElement orderNo = driver.findElement(By.id("order_no"));
		System.out.println(orderNo.getAttribute("value"));
		
		WebElement search = driver.findElement(By.id("search_hotel"));
		search.click();
		
		Thread.sleep(3000);
		
		WebElement location1 = driver.findElement(By.id("location"));
		Select s1 = new Select(location1);
		s1.selectByIndex(2);		
		WebElement hotels1 = driver.findElement(By.id("hotels"));
		hotels1.sendKeys("Hotel Sunshine");		
		WebElement room1 = driver.findElement(By.id("room_type"));
		room1.sendKeys("Double");		
		WebElement roomNumber1 = driver.findElement(By.id("room_nos"));
		roomNumber1.sendKeys("3 - Three");		
		WebElement adult1 = driver.findElement(By.id("adult_room"));
		adult1.sendKeys("3 - Three");		
		WebElement btnSubmit1 = driver.findElement(By.id("Submit"));
		btnSubmit1.click();
		
		WebElement btnRadio1 = driver.findElement(By.id("radiobutton_0"));
		btnRadio1.click();
		WebElement cont1 = driver.findElement(By.id("continue"));
		cont1.click();
		
		WebElement firstName1 = driver.findElement(By.id("first_name"));
		firstName1.sendKeys("Janani");
		WebElement lastName1 = driver.findElement(By.id("last_name"));
		lastName1.sendKeys("sathyanaryanan");
		WebElement address1 = driver.findElement(By.id("address"));
		address1.sendKeys("thoraipakam");
		WebElement ccNum1 = driver.findElement(By.id("cc_num"));
		ccNum1.sendKeys("1234567890123456");
		WebElement ccType1 = driver.findElement(By.id("cc_type"));
		ccType1.sendKeys("VISA");
		WebElement ccExpMonth1 = driver.findElement(By.id("cc_exp_month"));
		ccExpMonth1.sendKeys("February");
		WebElement ccExpYear1 = driver.findElement(By.id("cc_exp_year"));
		ccExpYear1.sendKeys("2022");
		WebElement cvv1 = driver.findElement(By.id("cc_cvv"));
		cvv1.sendKeys("1234");
		WebElement book1 = driver.findElement(By.id("book_now"));
		book1.click();
		
		Thread.sleep(5000);
		
		WebElement orderNo1 = driver.findElement(By.id("order_no"));
		System.out.println(orderNo1.getAttribute("value"));

		WebElement search1 = driver.findElement(By.id("search_hotel"));
		search1.click();
		
		Thread.sleep(3000);
		
		WebElement location2 = driver.findElement(By.id("location"));
		location2.sendKeys("Adelaide");	
		WebElement hotels2 = driver.findElement(By.id("hotels"));
		hotels2.sendKeys("Hotel Hervey");		
		WebElement room2 = driver.findElement(By.id("room_type"));
		room2.sendKeys("Deluxe");		
		WebElement roomNumber2 = driver.findElement(By.id("room_nos"));
		roomNumber2.sendKeys("4 - Four");		
		WebElement adult2 = driver.findElement(By.id("adult_room"));
		adult2.sendKeys("4 - Four");		
		WebElement btnSubmit2 = driver.findElement(By.id("Submit"));
		btnSubmit2.click();
		
		WebElement btnRadio2 = driver.findElement(By.id("radiobutton_0"));
		btnRadio2.click();
		WebElement cont2 = driver.findElement(By.id("continue"));
		cont2.click();
		
		WebElement firstName2 = driver.findElement(By.id("first_name"));
		firstName2.sendKeys("sathyanaraynan");
		WebElement lastName2 = driver.findElement(By.id("last_name"));
		lastName2.sendKeys("r");
		WebElement address2 = driver.findElement(By.id("address"));
		address2.sendKeys("ECR");
		WebElement ccNum2 = driver.findElement(By.id("cc_num"));
		ccNum2.sendKeys("1234567890123456");
		WebElement ccType2 = driver.findElement(By.id("cc_type"));
		ccType2.sendKeys("Master Card");
		WebElement ccExpMonth2 = driver.findElement(By.id("cc_exp_month"));
		ccExpMonth2.sendKeys("March");
		WebElement ccExpYear2 = driver.findElement(By.id("cc_exp_year"));
		ccExpYear2.sendKeys("2022");
		WebElement cvv2 = driver.findElement(By.id("cc_cvv"));
		cvv2.sendKeys("1234");
		WebElement book2 = driver.findElement(By.id("book_now"));
		book2.click();
		
		Thread.sleep(5000);
		
		WebElement orderNo2 = driver.findElement(By.id("order_no"));
		System.out.println(orderNo2.getAttribute("value"));
		
		

		
	}
}