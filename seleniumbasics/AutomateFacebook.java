package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebook 
{
	public static void main(String[] args) 
	{
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://www.facebook.com");
		c1.findElement(By.name("email")).sendKeys("anushagoud866@gmail.com");
	    c1.findElement(By.name("pass")).sendKeys("1234");
		c1.findElement(By.name("login")).sendKeys(Keys.ENTER);
	}

}
