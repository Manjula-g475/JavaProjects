package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//enable or disable
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		if(firstname.isEnabled()) {
			firstname.sendKeys("ABCDEF");
		}
		else {
			System.out.println("firstname is disabled");
		}

	}

}
