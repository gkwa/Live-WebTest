package webdriver_archetypetest.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBaseTest {

	// TestBase math = new TestBase();
	SystemAdminAccount systemadmin = new SystemAdminAccount();

	@Test
	public void test() throws InterruptedException {
		// assertEquals(55,math.sum(1,2,3,4,5,6,7,8,9,10));

		assertEquals(0, systemadmin.sysadminrun());

	}

}
