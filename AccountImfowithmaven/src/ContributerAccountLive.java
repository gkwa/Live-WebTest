import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ContributerAccountLive extends AccountPage{
	
	//public PageObject obj =new PageObject();
	public AccountPage obj;
	private WebDriver driver;
	
	public ContributerAccountLive(){
		this.driver = new FirefoxDriver();
		obj=new AccountPage(driver);
		//this.obj=null;
	}
	
	
	void contributerun() throws InterruptedException{
		
		try{
		
		obj.SetWebSite("http://75.101.135.145");
		//obj.SetWebSite("http://d2.streambox.com/ls/SLSLogin.php");
		obj.Login("hiro1contributer","demo");
		obj.run();
		}catch(Exception e){
			
			System.out.println("Contributer Error");
			
		}
		
		
		
	}
	
	

}
