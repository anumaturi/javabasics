package selenium.testNG.programs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBsBm {
	@Test
	public void testcase()
	{
		System.out.println("test");
	}
	@BeforeSuite
	public void testcase1()
	{
		System.out.println("Beforesuite");
	}
	@BeforeMethod
	public void testcase2()
	{
		System.out.println("beforemethod");
	}
	}

