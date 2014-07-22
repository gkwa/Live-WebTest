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


public class test extends AccountPage {

	
	
	private static Object element1;


	public static void main(String args[]) throws Throwable{
		// Automated method Tab
		
		//System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
		//WebDriver driver = new ChromeDriver();
		
		//****************************************//
		/*
		WebDriver driver = new FirefoxDriver();
		Dimension d=new Dimension(1200,2000);
		driver.manage().window().setSize(d);
		*/
		//***************************************//
		
		
		System.out.println("/***TstCode***/");
		
		
		//PageObject [] baseobj = new PageObject[2];
/*
		PageObject baseobj = new PageObject();

		
		//baseobj.setPageObject(driver);
	baseobj.SetWebSite("http://d2.streambox.com/ls/SLSLogin.php");	
	baseobj.Login("admin", "demo");
	baseobj.run();	
	*/
	//baseobj[1].SetWebSite("http://www.yahoo.com");
		
	
	ContributerAccountLive contri= new ContributerAccountLive();
	
	contri.contributerun();
	
	OperatorAccountLive operat = new OperatorAccountLive();
	operat.operatorun();
	
		//driver.get("http://www.google.com");
		//driver.get("http://livedev2.streambox.com/ls/slsmap.php");
		//driver.get("http://live.streambox.com/ls/SLSLogin.php");
		
	
	//********************program for system admin*******************************************//
/*
	driver.get("http://d2.streambox.com/ls/SLSLogin.php");
		
		
		login(driver);// enter into the login page of streambox 
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		System.out.println("Before Share Page");
		
		
		To_Check_theAccount(driver);
		
		To_ChangeConfirmAccount(driver);
		
	*/
	//***************************************************************//
		
		try{
		
		//do{
			Thread.sleep(1000L);
		//WebElement element1=driver.findElement(By.xpath("//a[@class='ctn_pf_user_share file_page_share lsc_player_share']"));
		System.out.println(" Share action on the way");
		Thread.sleep(7000L);;
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//}while(element1==null);
		
		
		//driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		//element1.click();
		
		System.out.println("All through the Share action");
		
		
		Thread.sleep(1000L);
		
		//*********************************************************//
		/*
		driver.findElement(By.id("cmd_share_email")).click();
		System.out.println("click the email share");
		
		driver.findElement(By.className("sb_icon_facebook")).click();;
		System.out.println("clicked facebook share");
		
		*/
		//***********************************************************//
		
		
		}catch(Exception e){
			
			System.out.println("error occur in Share page");
		}finally{
			

			System.out.println("Inside finaly statemant in main program");
				
			
		}
		
		//**********************************
		//Retrieve_data(driver);
		
		
		System.out.println("All Program end");
		
}//end of main
	
	


	private static void Retrieve_data(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


	private static void To_ChangeConfirmAccount(WebDriver driver) {
		// TODO Auto-generated method stub
		
		try{
		
			//***************************This sentence is for opening the admon[System Admin of Admin]*************************************//
		//driver.findElement(By.xpath("//button[@class = 'btn dropdown-toggle']")).click();
		
		System.out.println("Now Page stay at the advanced mode");
		//driver.findElement(By.xpath("//a[@href='/ls/u/hiro']")).click();;
		
		//driver.navigate().back();
		
		//driver.findElement(By.xpath("//button[@class = 'btn dropdown-toggle']")).click();
		//driver.findElement(By.xpath("//a[@href='/ls/slsusers.php?user=178501']")).click();//enter into the page of account information page
		//driver.findElement(By.xpath("//a[@href='/ls/slsusers.php?user=180656']")).click();//enter into the page of account information page
		//driver.findElement(By.xpath("//a[@href='/ls/slsusers.php?user=1']")).click();//enter into the page of account information page
		
		System.out.println("Succeed in going to the Account Information");
		
		WebElement element1 = driver.findElement(By.xpath("//input[@id='uloc1']"));
		element1.clear();
		element1.sendKeys("bellevue");
		//element1.submit();
		
		//********send FirstName************//
		WebElement element2 = driver.findElement(By.xpath("//p[@class='controls']/input[@id='ufirst1']"));
		element2.clear();
		element2.sendKeys("hiro1");
		//***********************************//
		

		//********send LastName************//
		WebElement element3 = driver.findElement(By.xpath("//p[@class='controls']/input[@id='ulast1']"));
		element3.clear();
		element3.sendKeys("naka1");
		//***********************************//
		
		
		//********send CompanyName************//
		WebElement element4 = driver.findElement(By.xpath("//p[@class='controls']/input[@id='ucompany1']"));
		element4.clear();
		element4.sendKeys("streambox");
		//***********************************//
		
		
		//********send E-mail:************//
		WebElement element5 = driver.findElement(By.xpath("//p[@class='controls']/input[@id='uemail1']"));
		element5.clear();
		element5.sendKeys("streambox");
		//***********************************//
		
		//********send Phone:************//
		WebElement element6 = driver.findElement(By.xpath("//p[@class='controls']/input[@id='uphone1']"));
		element6.clear();
		element6.sendKeys("23425234");
		//***********************************//
		
		
		driver.findElement(By.xpath("//p[@class = 'controls']/input[@id = 'btn_user_save']")).click();
		
		driver.findElement(By.xpath("//button[@class = 'btn btn-cancel']")).click();
		System.out.println("Click the Save");
		
		Check_Application_form(driver);
		
		
		
		}catch(Exception e){
			
			
			System.out.println("Error");
			
		}

		
		
	}


	private static void Check_Application_form(WebDriver driver) {
		// TODO Auto-generated method stub
		
		System.out.println("In the Check_Application_form()...");
		
	

		//**************Check the Type Information*************************//
		//driver.findElement(By.xpath("//p[@class='controls']/select[@id='utype1']")).click();
		//driver.findElement(By.xpath("//option[@value='0']")).click();
		//**********************end****************************************
		
		
		//************************Retrieve the String From Application Form***********************************************//
		
		
		//*************************Check login Name**********************************************//
		
		WebElement element0 = driver.findElement(By.xpath("//fieldset/div[@class='span7']/p[@class='controls']/input[@id='uname1']"));
		//WebElement element0 = driver.findElement(By.xpath("//p[@class='controls']/input[@id='uname1']"));
		String LoginName=element0.getAttribute("value");
		String logpattern="admin";
		System.out.println("//*****Checking Login Name******// ");
		CheckString(LoginName,logpattern);
		
		//********************************end******************************************************//
		
		
		//************************Check the FirstName***************************************************//
		WebElement element7 = driver.findElement(By.xpath("//fieldset/div[@class='span7']/p[@class='controls']/input[@id='ufirst1']"));
		String FiUsername = element7.getAttribute("value");
		String FiUnamepattern = "hiro1";
		System.out.println("//*****Checking FastName******// ");
		CheckString(FiUsername,FiUnamepattern);
		//*******************************end**********************************************//
		
		
		//******************************Check LastName*******************************************//
		WebElement element5=driver.findElement(By.xpath("//fieldset/div[@class='span7']/p[@class='controls']/input[@id='ulast1']"));
		String LaUsername = element5.getAttribute("value");
		String LaUnamepattern = "naka1";
		System.out.println("//******Checking LastName****// ");
		CheckString(LaUsername,LaUnamepattern);
		//*******************************end**********************************************//
		
		
		
		//************************Check the Location*******************************************//
		WebElement element1 =driver.findElement(By.xpath("//fieldset/div[@class='span7']/p[@class='controls']/input[@id='uloc1']"));
		String LocationStr =element1.getAttribute("value");
		System.out.println("Location Information: "+ LocationStr);
		String lopattern = "bellevue";
		System.out.println("//*****Checking Location******// ");
		CheckString(LocationStr, lopattern);
		//*********************************end***************************************************//
		
		
		//**********************Checking Company name******************************//
		WebElement element3=driver.findElement(By.xpath("//fieldset/div[@class='span7']/p[@class='controls']/input[@id='ucompany1']"));
		String Companyname = element3.getAttribute("value");
		String copattern ="streambox";
		System.out.println("//*****Checking CompanyName******// ");
		CheckString(Companyname,copattern);
		//**********************end*******************************//
		
		
		//**********************Checking Email******************************//
		WebElement element=driver.findElement(By.xpath("//fieldset/div[@class='span7']/p[@class='controls']/input[@id='uemail1']"));
		String EmailAdd = element.getAttribute("value");
		String empattern ="streambox";
		System.out.println("//*****Checking Email Address******// ");
		CheckString(EmailAdd,empattern);
		//**********************end*******************************//
		
		
		//**********************Checking Phone******************************//
		WebElement element6=driver.findElement(By.xpath("//fieldset/div[@class='span7']/p[@class='controls']/input[@id='uphone1']"));
		String Phonenum = element6.getAttribute("value");
		String popattern ="23425234";
		System.out.println("//*****Checking Phone Number******// ");
		CheckString(Phonenum,popattern);
		//**********************end*******************************//
		
		
		//WebElement element2 =driver.findElement(By.xpath("//a[@href = 'http://store.streambox.com/streambox-live-data-package']"));
		//String Account_Information = element2.getText();
		
		
		driver.navigate().back();
		//************************************
		driver.findElement(By.xpath("//button[@class = 'btn dropdown-toggle']")).click();
		
		//System.out.println("Now Page stay at the advanced mode");
		
		driver.findElement(By.xpath("//a[@href='/ls/slsusers.php?user=5']")).click();
		
		//***********************************
		
		
		//CheckString(LocationStr,"bellevue");
		
		

		//System.out.println("The location is correct: "+ Account_Information + "  !!");// output the Live Enterprise
		
	
		System.out.println(" } End Check_Application_form()");
		
	}//end of Check_Application_form()

	
	private static boolean CheckString(char str1[],char pattern[], int first){
		if(str1.length!=pattern.length){
			System.out.println("The length is different!");
			return false;
		
		}
		
		if((str1[first]==pattern[first])&&(first<str1.length-1)){
			//System.out.println(str1[first]);
			CheckString(str1,pattern,++first);
			return true;
			
		}
		
		System.out.println("out of the loop");
		return false;
	}
	
	

	private static void CheckString(String str1, String pattern) {
		// TODO Auto-generated method stub
		
	System.out.println("//***********Checking String************************//");
		
		char[]str1cp=new char[str1.length()];
		char[]patterncp=new char[pattern.length()];
		
		for(int i=0;i<str1.length();i++){
		str1cp[i]= str1.charAt(i);
		patterncp[i]=pattern.charAt(i);
		}
		int first=0;
		
		if(CheckString(str1cp,patterncp,first)){
			
			System.out.println("String match succeed!!");
		}else{
			System.out.println("Warnning!!: blank matching fail!!");		
			//return false;
			}
			
			
		
		/*
		if(str1==pattern){
			//System.out.println("Location blank match!!");
			return true;
		}else{
		System.out.println("Warnning!!: Location blank matching fail!!");		
		return false;
		}
		*/
	}
	//end of Check String


	private static void To_Check_theAccount(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(10);
		System.out.println("Inside of func: To_Check...");
		
		try{
		
		//driver.findElement(By.className("btn dropdown-toggle")).click();
		//WebElement element1 = 
		//		driver.findElement(By.xpath("//div[@class = 'btn-group']/button[@class = 'btn dropdown-toggle']")).click();
		//element1.click();
		//driver.findElement(By.xpath("//a[@class='cmd_set_advanced']")).click();	
		//driver.findElement(By.xpath("//div[@class = 'ctn_header_login text-right style_auto_divider']/div[@class='btn-group']/button[@class='btn dropdown-toggle']")).click();
			//
			//************************************d2server admin page right header*****************************//
			driver.findElement(By.xpath("//div[@id='ctn_session_action']/div[@class='btn-group']/button[@class='btn dropdown-toggle']")).click();
		//("//div[@class='flex']/input[@id='password']"));
		
		//driver.findElement(By.xpath("//a[@class='cmd_set_advanced']")).click();
		//************************open the right header***********************************************//
			
			driver.findElement(By.xpath("//div[@id='ctn_session_action']/div[@class='btn-group open']/ul[@class='dropdown-menu pull-right']/li//a[@href='/ls/slsusers.php?user=5']")).click();
				//+ "//a[@class = 'cmd_manage_account']")).click();
				
		
		//driver.findElement(By.xpath("//a[@class='cmd_set_advanced']")).click();
		System.out.println("Succeeded in going advanced mode in account menue");
		
		}catch(Exception e){
			
			System.out.println("error occur in func: To_Check_the_account_..");
			
		}
		
		
	}


	public static void login(WebDriver driver){
		
		
		//driver.quit();
		
		//Fill the search word into textbox named "q"
		//and submit it to serach
		
		//WebElement element = driver.findElement(By.name("q"));
		//element.sendKeys("Streambox Inc");
		//element.sendKeys("Streambox Live Login");
		//element.submit();
		
				
		
		System.out.println("Page title is"+ driver.getTitle());
		//Google's search is rendered dynamically with JavaScript
		//element.getAttribute("chh");
		//element.sendKeys("serg");
		
		//element.isSelected();
		//element.submit();
		
		//This statement is the function to wait for 10 seconds at maximum 
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//
		//WebElement element2= driver.findElement(By.partialLinkText("Streambox Inc"));
		//WebElement element2= driver.findElement(By.partialLinkText("Streambox Live Login"));
		
		//WebDriver wait = new FluentWait<WebDriver>(driver,10,10);
		//element2.click();
		
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
		//element5.sendKeys("hiroo");
		//element5.sendKeys("hiro1");//LiveServer2
		element5.sendKeys("admin");//LiveServer2
		
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

