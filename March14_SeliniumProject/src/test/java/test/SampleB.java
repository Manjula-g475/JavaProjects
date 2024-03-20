package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");

		
		//managing the windows browser
		
		//driver.manage().window().maximize();  //1
		//driver.manage().window().minimize();    //2
		driver.manage().window().fullscreen();  //3
		
		//navigation
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
		
		//closing
		
		//driver.close();
		driver.quit();
		
	}

}
