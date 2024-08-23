package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateAmazon
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		//c1.findElement(By.name("email")).sendKeys("anushagoud866@gmail.com");
		WebElement un=driver.findElement(By.name("email"));
		un.sendKeys("anushagoud866@gmail.com");
		WebElement cont= driver.findElement(By.id("continue"));
		cont.click();
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("abxyz");
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();
	    
	}
	

}
