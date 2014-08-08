package webdriver_archetypetest.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		
		_Create_otherAccount();
		
		
		
		}catch(Exception e){
			
			System.out.println("SysAdministrator Error");
			
		}
		
		
		
	}
	
	void _Create_otherAccount(){
		
		driver.findElement(By.xpath("//div[@id='menu']/div[@class = 'navbar-inner']/div[@class = 'container-fluid']/div/div[@id = 'ctn_nav']/ul[@class = 'gradient level1 nav']/li[@class = 'dropdown']/a[@class = 'dropdown-toggle']")).click();
		
		//if(<=0)
		
		//driver.findElement(By.xpath("//div[@id='menu']/div[@class = 'navbar-inner']/div[@class = 'container-fluid']/div/div[@id = 'ctn_nav']/ul[@class = 'gradient level1 nav']/li[@class = 'dropdown open']/ul[@class = 'dropdown-menu']/li[@class = 'active']/a[@id = 'current']")).click();
		
		driver.findElement(By.xpath("//div[@id='menu']/div[@class = 'navbar-inner']/div[@class = 'container-fluid']/div/div[@id = 'ctn_nav']/ul[@class = 'gradient level1 nav']/li[@class = 'dropdown open']/ul[@class = 'dropdown-menu']/li/a[@href = 'slsusers.php']")).click();
		
		//************************Add Account**********************************************//
		driver.findElement(By.xpath("//div[@id='container']/div[@class = 'container-fluid']/ul[@id = 'submenu']/li[@id = 'submenu_addNewUser']/a[@class = 'submenu_control btn']")).click();
		
		
		
		//***************************Set up Login*********************************//
		WebElement element1 = driver.findElement(By.xpath("//p[@class='controls']/input[@id='uname1']"));
		element1.clear();
		element1.sendKeys("hiro1GroupAdmin");
		//***************************End Set up Login*********************************//
		

		//***************************Set up Pass*********************************//
		WebElement element2 = driver.findElement(By.xpath("//p[@class='controls']/input[@id='upass1']"));
		element2.clear();
		element2.sendKeys("demoGroupAdmin");
		//***************************End Set up Pass*********************************//
		

		//***************************Set up Pass*********************************//
		WebElement element2s = driver.findElement(By.xpath("//p[@class='controls']/input[@id='upass2']"));
		element2s.clear();
		element2s.sendKeys("demoGroupAdmin");
		//***************************End Set up Pass*********************************//

		
		//***************************Set up Group*********************************//
		WebElement element3 = driver.findElement(By.xpath("//p[@class='controls']/input[@id='udrm1']"));
		element3.clear();
		element3.sendKeys("hiro1");
		//***************************End Set up Group*********************************//
		
		obj.To_ChangeConfirmAccount(driver);
		
		
		
		

		//************************Show Account**********************************************//
		driver.findElement(By.xpath("//div[@id='container']/div[@class = 'container-fluid']/ul[@id = 'submenu']/li[@id = 'submenu_getRole']/a[@class = 'submenu_control btn']")).click();
		driver.findElement(By.xpath("//div[@id='container']/div[@class = 'container-fluid']/ul[@id = 'submenu']/li[@id = 'submenu_getUser']/a[@class = 'submenu_control btn']")).click();
	
		//*************************Serchbox****************************************//
		WebElement elementsearch = driver.findElement(By.xpath("//div[@id='menu']/div[@class = 'navbar-inner']/div[@class = 'container-fluid']/div/div[@class='navbar-form pull-right']/div[@id='searchBar']/form[@class = 'navbar-form input-append']/input[@id='flt']"));
		elementsearch.clear();
		elementsearch.sendKeys("hiro1");
		
		System.out.println("Delete the GroupAdministrator");
		driver.findElement(By.xpath("//div[@id='container']/div[@id='mainContent']/div[@id='ctn_users']/div[@id='dt_users_wrapper']/table[@id='dt_users']/tbody[@role='alert']/tr[@class ='odd']/td[@class ='']/div[@class = 'btn-group']/a[@class = 'btn btn-small']/span[@class='icon-trash']")).click();
		
		
		
	}
	
	
	
	
	

}//end of the class of system admin
