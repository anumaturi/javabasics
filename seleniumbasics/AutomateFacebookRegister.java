package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebookRegister 
{
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement createaccnt=driver.findElement(By.linkText("Create new account"));
		createaccnt.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement fn=driver.findElement(By.name("firstname"));
		fn.sendKeys("Anusha");
		WebElement sn=driver.findElement(By.name("lastname"));
		sn.sendKeys("maturi");
		WebElement mobno=driver.findElement(By.name("reg_email__"));
		mobno.sendKeys("9989065451");
		WebElement newpwd=driver.findElement(By.id("password_step_input"));
		newpwd.sendKeys("anu@@15");
	}

}
