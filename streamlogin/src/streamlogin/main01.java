package streamlogin;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;


import java.util.concurrent.TimeUnit;

import org.openqa.jetty.html.Page;
//import org.apache.commons.io.FileUtiles;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;


public class main01 {


	public static void main(String args[]){
		
		// Automated method Tab
		
		WebDriver driver = new FirefoxDriver();
		
		System.out.println("/***TstCode***/");
		
		driver.get("http://www.google.com");
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
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
	//WebElement element4=driver.findElement(By.partialLinkText("Sign Up Now"));
		
		//WebElement element4=driver.findElement(By.linkText("Live Login"));
		//element4.click();
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
		
	
	
				//driver.get("http://live.streambox.com/ls/u/hiro");
	driver.findElement(By.className("btn_lsc_edit")).click();
	WebElement element7 = driver.findElement(By.className("input-block-level"));
	element7.clear();
	element7.sendKeys("hiro rename successful");
	
	System.out.println("Rename success");
	
	WebElement element8= driver.findElement(By.xpath("//div[@id='bts_prompt']/div[@class='modal-footer']/button[@class='btn btn-primary']"));
	System.out.println("Left thing is to push the submit");
	
	element8.click();
	
	//driver.findElement(By.xpath("//div[@class=modal-footer]/button[@class='btn btn-primary']")).click();
	
	
	
	
	
		System.out.println("Finish");
		
		//driver.quit();
		
	}
	
}
