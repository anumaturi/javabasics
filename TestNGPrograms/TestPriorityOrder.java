package selenium.testNG.programs;

import org.testng.annotations.Test;

public class TestPriorityOrder {
	
	public class TestPriority {

		@Test(priority=2)
		public void trail()
		{
		}
		@Test(priority=1)
		public void look()
		{
		}
		@Test(priority=3)
		public void buy()
		{
		}


		}

}
