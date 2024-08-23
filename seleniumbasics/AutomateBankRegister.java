
package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateBankRegister {
	
	public static void main(String[] args)
			{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/userdrivenregdetails.htm");
	     driver.navigate().refresh();
	    
		driver.manage().window().maximize();
		WebElement accountno=driver.findElement(By.name("accountNo"));
		accountno.sendKeys("1234567654");
		WebElement cifno=driver.findElement(By.name("cifNo"));
		cifno.sendKeys("998975");
		WebElement branchcode=driver.findElement(By.name("branchCode"));
		branchcode.sendKeys("99999");
		WebElement countrycode=driver.findElement(By.name("country_Code1"));
		countrycode.sendKeys("+91");
		WebElement mobileno=driver.findElement(By.name("mobileNo"));
		mobileno.sendKeys("9885318296");
	
	}

}
