package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/auth/verify?ptype=auth&redirect=%2F%3Futm_content%3Dads%26utm_source%3DGooglePaid%26utm_medium%3Dsearch%26utm_campaign%3DSearch_Nykaa%26gad_source%3D1%26gclid%3DCj0KCQjwncWvBhD_ARIsAEb2HW-X_DibzL3fmWZ7iS55AMzaoDwe_H-OY4If4_eowngTxxlJChqfiRAaAnIyEALw_wcB");
		
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/section/div/form/div/div/input")).sendKeys("8762424605");
	
		

	}

}
