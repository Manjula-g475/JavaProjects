package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		String alert = driver.switchTo().alert().getText();
		
		if(alert.equals("Please enter your good name")) {
			Thread.sleep(6000);
			driver.switchTo().alert().sendKeys("User 2");
			
			driver.switchTo().alert().accept();
		}
		else {
			System.out.println("You are in wrong pop up alert");
			
			
		}	

	}

}
