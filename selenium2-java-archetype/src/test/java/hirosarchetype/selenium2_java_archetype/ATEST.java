package hirosarchetype.selenium2_java_archetype;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class ATEST extends TestCase{

	@Test
	public void test() {
		
		System.out.println("TEST Class executed");
		
		
		SystemAdminLivedev3Account sysadmin = new SystemAdminLivedev3Account();
		try {
			sysadmin.sysadminrun();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fail("Not yet implemented");
		
		
	}

}
