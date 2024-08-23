package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
public static void main(String[] args) throws InterruptedException  {
	ChromeDriver c1= new ChromeDriver();
	c1.get("https:\\www.google.com");   //to go to particular site 
	Thread.sleep(2000);
	//c1.close();  //closes the parent window  
	//c1.quit(); //Closes parent and child
	System.out.println( c1.getWindowHandle()); //id of parent or window which has the control
	System.out.println( c1.getWindowHandles()); //id of both parent and child ->return type is Set<String> as each id will be unique 
	System.out.println(c1.getTitle());
	c1.manage().window().minimize();
	c1.manage().window().maximize();
	c1.findElement(By.name("q"));
}
}
