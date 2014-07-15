import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;



public class PageObject {

	protected WebDriver driver;
	
	public PageObject(){//constructor
		driver = null;
		
	}
	
	public PageObject(WebDriver driver){
		this.driver=driver;
		Dimension d = new Dimension(1200,1200);
		driver.manage().window().setSize(d);
		
		
	}
	
	public void Login(WebDriver driver){
		
		
	}
	
	
	
}//end of PageObject class
