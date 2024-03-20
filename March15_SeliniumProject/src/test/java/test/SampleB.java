package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//checking for correct URL 
		
		String url = driver.getCurrentUrl();
		if(url.equals("https://demo.automationtesting.in/Register.html//")) {
			System.out.println("Correct Application");
		}
		else {
			System.out.println("Incorrect Application");
		}
		

	}

}
