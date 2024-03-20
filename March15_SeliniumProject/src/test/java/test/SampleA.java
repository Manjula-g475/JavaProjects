package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//password validation
		
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		String type = pwd.getAttribute("type");
		
		if(type.equals("password"))
				{
			System.out.println("Password Field");
		}
		else {
			System.out.println("Text Field");
		}
			
		

	}

}
