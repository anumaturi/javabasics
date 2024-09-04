package selenium.testNG.programs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBsAsAm {
@Test
public void testcase()
{
	System.out.println("test");
}
@Test
public void testcase1()
{
	System.out.println("test1");
}
@Test
public void testcase2()
{
	System.out.println("test2");
}
@BeforeSuite
public void testcase3()
{
	System.out.println("beforesuite");
}
@AfterSuite
public void testcase4()
{
	System.out.println("aftersuite");
}
@AfterMethod
public void testcase5()
{
	System.out.println("aftermethod");
}
}
