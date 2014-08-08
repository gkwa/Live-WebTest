package webdriver_archetypetest.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestBaseTest {

	// TestBase math = new TestBase();
	SystemAdminAccount systemadmin = new SystemAdminAccount();

	@Test
	public void test() throws InterruptedException {
		
		systemadmin.test();
		systemadmin.test2();
		systemadmin.test3();
		systemadmin.test4();
		
		assertEquals(0, systemadmin.sysadminrun());
		//System.out.println("Setwebsite(): "+systemadmin.ecount);
		
		//assertEquals(0,systemadmin.ecount);
		
		//systemadmin.destructor();
		
	}
		
		@Test
	public void test2() throws InterruptedException {
		// assertEquals(55,math.sum(1,2,3,4,5,6,7,8,9,10));

	
		System.out.println("login():"+systemadmin.elogin);
		assertEquals(0,systemadmin.elogin);
	
		systemadmin.destructor();
	
		assertEquals(0,systemadmin._Create_otherAccount());
		System.out.println("Create_otherAccount:"+systemadmin._Create_otherAccount());
		
	}
		@Test
		public void test3() throws InterruptedException {
			// assertEquals(55,math.sum(1,2,3,4,5,6,7,8,9,10));

			//assertEquals(0, systemadmin.sysadminrun());
					
			System.out.println("run(): "+systemadmin.erun);
			assertEquals(0,systemadmin.erun);
			
			systemadmin.destructor();
		}
		
}
