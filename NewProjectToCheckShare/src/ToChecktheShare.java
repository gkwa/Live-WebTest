import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.jetty.html.Page;
//import org.apache.commons.io.FileUtiles
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;



public class ToChecktheShare {

	private static Object element1;


	public static void main(String args[]) throws Throwable{
		// Automated method Tab
		
		WebDriver driver = new FirefoxDriver();
		Dimension d=new Dimension(1200,2000);
		driver.manage().window().setSize(d);
		
		System.out.println("/***TstCode***/");
		
		driver.get("http://www.google.com");
		
		
		
		login(driver);// enter into the login page of streambox 
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		System.out.println("Before Share Page");
		
		
		
		try{
		
		//do{
			Thread.sleep(1000L);
		WebElement element1=driver.findElement(By.xpath("//a[@class='ctn_pf_user_share file_page_share lsc_player_share']"));
		System.out.println(" Share action on the way");
		Thread.sleep(7000L);;
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//}while(element1==null);
		
		
		//driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		element1.click();
		
		System.out.println("All through the Share action");
		
		}catch(Exception e){
			
			System.out.println("error");
		}
		
		Thread.sleep(1000L);
		
		driver.findElement(By.id("cmd_share_email")).click();
		System.out.println("click the email share");
		
		driver.findElement(By.className("sb_icon_facebook")).click();;
		System.out.println("clicked facebook share");
		
		
}//end of main
	
	
	public static void login(WebDriver driver){
		
		
		//driver.quit();
		
		//Fill the search word into textbox named "q"
		//and submit it to serach
		
		WebElement element = driver.findElement(By.name("q"));
		//element.sendKeys("Streambox Inc");
		element.sendKeys("Streambox Live Login");
		element.submit();
		
				
		
		System.out.println("Page title is"+ driver.getTitle());
		//Google's search is rendered dynamically with JavaScript
		//element.getAttribute("chh");
		//element.sendKeys("serg");
		
		//element.isSelected();
		//element.submit();
		
		//This statement is the function to wait for 10 seconds at maximum 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//
		//WebElement element2= driver.findElement(By.partialLinkText("Streambox Inc"));
		WebElement element2= driver.findElement(By.partialLinkText("Streambox Live Login"));
		
		//WebDriver wait = new FluentWait<WebDriver>(driver,10,10);
		element2.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//WebElement element3 =driver.findElement(By.partialLinkText("Streambox Live"));
		//WebElement element3 =driver.findElement(By.name("facebook"));
		//element3.click();
		
		//driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		////////////////////////////////////////////////////////////
		//input the username to the blank of username
		//
		
		WebElement element5=driver.findElement(By.className("entryfield"));
		
		System.out.println("on the way1");
		//WebElement element5=driver.findElement(By.className("entryfield"));
		//System.out.println(element5 +" " + driver.findElement(By.className("entryfield")) );
		element5.sendKeys("hiro");
		System.out.println("on the way1");
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//WebElement element6=driver.findElement(By.id("password").className("entryfield").name("sngPass"));
		//element6.click();
		
		
		///////////////////////////////////////////////////////////////////
		//input the password to the brank of password
		////By.name("flex").id("password");
		
		//By.className("flex");
		//WebElement element6=driver.findElement(By.className("entryfield").id("password"));
		WebElement element6=driver.findElement(By.xpath("//div[@class='flex']/input[@id='password']"));
		element6.sendKeys("demo");
		
			
				System.out.println("on the way: " + driver.findElement(By.id("password")));
		
		driver.findElement(By.xpath("//button[@id='btn_sb_login']")).click();
		
	/*
	
				//driver.get("http://live.streambox.com/ls/u/hiro");
	driver.findElement(By.className("btn_lsc_edit")).click();
	WebElement element7 = driver.findElement(By.className("input-block-level"));
	element7.clear();
	element7.sendKeys("hiro rename successful");
	
	System.out.println("Rename success");
	
	WebElement element8= driver.findElement(By.xpath("//div[@id='bts_prompt']/div[@class='modal-footer']/button[@class='btn btn-primary']"));
	System.out.println("Left thing is to push the submit");
	
	element8.click();
		
	*/
		
	}
	
}
