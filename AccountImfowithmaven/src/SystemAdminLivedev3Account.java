

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SystemAdminLivedev3Account extends AccountPage{
	
	//public PageObject obj =new PageObject();
	public AccountPage obj;
	private WebDriver driver;
	
	public SystemAdminLivedev3Account(){
		this.driver = new FirefoxDriver();
		obj=new AccountPage(driver);
		//this.obj=null;
	}
	
	
	void sysadminrun() throws InterruptedException{
		
		try{
		
			obj.SetWebSite("http://livedev3.streambox.com/ls/login.php");
			//obj.SetWebSite("http://75.101.135.145"); //this is d2-server
		//obj.SetWebSite("http://d2.streambox.com/ls/SLSLogin.php");
		obj.Login("HiroSysAdmin","demo");
		obj.run();
		}catch(Exception e){
			
			System.out.println("SysAdministrator Error");
			
		}
		
		
		
	}
	
	

}
