package week2.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	//CONTACTS TAB

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			WebElement userName = driver.findElement(By.id("username"));
			userName.sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Contacts")).click();
			driver.findElement(By.linkText("Create Contact")).click();
			
			WebElement firstname =driver.findElement(By.id("firstNameField"));
			firstname.sendKeys("Divya");
			String emailValue=firstname.getAttribute("value");
			System.out.println(emailValue);
			
			driver.findElement(By.id("lastNameField")).sendKeys("V");
			driver.findElement(By.className("smallSubmit")).click();
			
			
			String title = driver.getTitle();
			System.out.println(title);

		    driver.close();



			
		}

	}

