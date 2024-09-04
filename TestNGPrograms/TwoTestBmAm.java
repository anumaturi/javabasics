package selenium.testNG.programs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TwoTestBmAm {
	
@Test
public void SearchingProduct()
{
	System.out.println("Searching the Product");
}
@Test
public void SearchingCart()
{
	System.out.println("Searching to Cart");

}

@BeforeMethod
public void LaunchBrowser()
{
	System.out.println("Launch the Browser");

}
@AfterMethod
public void QuitBrowser()
{
	System.out.println("Quitting Browser");

}
}


