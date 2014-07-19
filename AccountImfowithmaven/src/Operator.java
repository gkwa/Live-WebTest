import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Operator extends PageObject{

	PageObject obj;
	private WebDriver driver;
	
	public Operator(){
		this.driver = new FirefoxDriver();
		obj = new PageObject(driver);
	}
	
	public void operatorun() throws InterruptedException{
		
		try{
		
			obj.SetWebSite("http://75.101.135.145");
		//obj.SetWebSite("http://d2.streambox.com/ls/SLSLogin.php");
		obj.Login("hiro2operator","demo");
		obj.run();
		}catch(Exception e){
			
			System.out.println("Operator Error");
			
		}
		
		
		
	}
	
}
