package selenium.testNG.programs;

import org.testng.annotations.Test;

public class EnabledTestCase {

@Test                   //Default enabled=true
public void testcase1()
{
}
@Test(enabled=false)
public void testcase2()
{
}
@Test                    
public void testcase3()
{
}

}

