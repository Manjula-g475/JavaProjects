package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SapleA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		//text giving values
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Manjula");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("G");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("manjula@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("86252347897");
		
		//clicking on boxes
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		driver.findElement(By.xpath("//input[@value='Movies']")).click();
		
		//select with dropdown
		Select dropdownSkill = new Select(driver.findElement(By.xpath("//select[@ng-model='Skill']")));
		dropdownSkill.selectByIndex(9);
		
		Select dropdownYear = new Select(driver.findElement(By.xpath("//select[@placeholder='Year']")));
		dropdownYear.selectByValue("1999");
		
		Select dropdownMonth = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		dropdownMonth.selectByVisibleText("April");
		
		Select dropdownDay = new Select(driver.findElement(By.xpath("//select[@placeholder='Day']")));
		dropdownDay.selectByValue("18");
		
		
		//click with dropdown selection
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//a[text()='Dutch']")).click();
		driver.findElement(By.xpath("//a[text()='Czech']")).click();
		

		
		
		

	}

}
