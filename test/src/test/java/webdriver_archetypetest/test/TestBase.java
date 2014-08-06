package webdriver_archetypetest.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.lang.Math;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;




public class TestBase {
	private static final String SCREENSHOT_FOLDER = "target/screenshots/";
	private static final String SCREENSHOT_FORMAT = ".png";

	protected WebDriver driver;

	protected String gridHubUrl;

	protected String baseUrl;

	int num=5;
	
	public int sum(int ...args){
		
		int ret=0;
		for(int i:args){
			
			ret+=i;
			
		}
		
		return ret;
	}
	
	
}