package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//to verify title of the application
		
		String title = driver.getTitle();
		if(title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			System.out.println("Correct Application");
			
		}
		else {
			System.out.println("InCorrect Application");
			
		}
		

	}

}
