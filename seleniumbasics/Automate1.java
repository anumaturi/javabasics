package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Automate1 {

	public static void main(String[] args) {
	//	ChromeDriver driver= new ChromeDriver();
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Naveen"); 
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//driver.findElement(By.name("q")).sendKeys("Naveen",Keys.ENTER);
		
		//driver.findElement(By.name("btnK")).click();
		//   driver.findElement(By.className("gNO89b")).click();
	}

}
