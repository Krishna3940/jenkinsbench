package tes.flipkart;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.TestCase;
import tes.flipkart.basepage;
import tes.flipkart.searchpage;
import tes.flipkart.signup;
import tes.flipkart.slide;
import tes.flipkart.refresh;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	static WebDriver driver;
	static FileInputStream fis = null;
    static Properties prop = new Properties();
    static {



        try {
             File file = new File("./resource/file.properties");
             fis = new FileInputStream(file);
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }
         try {
             prop.load(fis);
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    /*public AppTest( String testName )
    {
        super( testName );
    }*/
    @BeforeMethod
    public static void intializewebdriverandopenurl() {
    	String browserName=prop.getProperty("browser1");
		if(browserName.equals("chrome"))
		{
		System.setProperty(prop.getProperty("driver1"),prop.getProperty("path1"));
		ChromeOptions options=new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		driver=new ChromeDriver(options);
		}else if(browserName.equals("firefox"))
		{
		System.setProperty(prop.getProperty("driver2"),prop.getProperty("path2"));
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("headless");
		driver=new FirefoxDriver(options);
		
		}else if(browserName.equals("internet explorer"))
		{
		System.setProperty(prop.getProperty("driver3"),prop.getProperty("path3"));
		driver=new InternetExplorerDriver();
		}
		
		driver.get(prop.getProperty("url"));
		
	}
    @Test(priority=1)
	public static void login(){
		
		WebElement username=driver.findElement(basepage.username);
		username.sendKeys(prop.getProperty("username1"));
		WebElement password=driver.findElement(basepage.password);
		password.sendKeys(prop.getProperty("password1"));
		driver.findElement(basepage.Login).click();
		
	}
    @Test(priority=2) 
    public static void search(){
	   driver.findElement(searchpage.cross).click();
	   WebElement search=driver.findElement(searchpage.search);
	   search.sendKeys(prop.getProperty("searchitem"));
	   search.click();
   }
    @Test(priority=3)
    public static void refresh() {
    	 driver.findElement(searchpage.cross).click();
    	WebElement news=driver.findElement(refresh.fresh);
    	news.click();
    }
    @Test(priority=4)
    public static void newuser() {
    	driver.findElement(signup.signup).click();
    }
    @Test(priority=5)
    public static void slidech(){
    	driver.findElement(searchpage.cross).click();
    	WebElement slides=driver.findElement(slide.carts);
    			slides.click();
    	
    }
    @Test(priority=6)
    public static void slidess() {
    	driver.findElement(searchpage.cross).click();
    	WebElement slidel=driver.findElement(slide.div);
    			slidel.click();
    }
    
    
    /*@Test(priority=1)
    public static void test3() throws InterruptedException{
    	 driver.findElement(searchpage.cross).click();
  	   WebElement search=driver.findElement(searchpage.search);
  	   search.sendKeys(prop.getProperty("searchitem"));
  	   search.submit();
  	   driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
  	   WebElement ordering=driver.findElement(searchpage.orderin);
  	   ordering.submit();
  	   }*/
    @Test(priority=7)
    public static void appliances() {
    	driver.findElement(searchpage.cross).click();
    	WebElement search=driver.findElement(searchpage.search);
 	   search.sendKeys(prop.getProperty("searchitem1"));
 	   search.click();
    	
    }
    @Test(priority=8)
    public static void homes() {
    	driver.findElement(searchpage.cross).click();
    	WebElement search=driver.findElement(searchpage.search);
 	   search.sendKeys(prop.getProperty("searchitem2"));
 	   search.click();
    }
    @Test(priority=9)
    public static void twowheeler() {
    	driver.findElement(searchpage.cross).click();
    	WebElement search=driver.findElement(searchpage.search);
 	   search.sendKeys(prop.getProperty("searchitem3"));
 	   search.click();
    }
    @Test(priority=10)
    public static void travels() {
    	driver.findElement(searchpage.cross).click();
    	WebElement search=driver.findElement(searchpage.search);
 	   search.sendKeys(prop.getProperty("searchitem4"));
 	   search.click();
    }
    @Test(priority=11)
    public static void grocery() {
    	driver.findElement(searchpage.cross).click();
    	WebElement search=driver.findElement(searchpage.search);
 	   search.sendKeys(prop.getProperty("searchitem5"));
 	   search.click();
    }
    @Test(priority=12)
    public static void furniture() {
    	driver.findElement(searchpage.cross).click();
    	WebElement search=driver.findElement(searchpage.search);
 	   search.sendKeys(prop.getProperty("searchitem6"));
 	   search.click();
    }
    @Test(priority=13)
    public static void beauty() {
    	driver.findElement(searchpage.cross).click();
    	WebElement search=driver.findElement(searchpage.search);
 	   search.sendKeys(prop.getProperty("searchitem7"));
 	   search.click();
    }
    @Test(priority=14)
    public static void toys() {
    	driver.findElement(searchpage.cross).click();
    	WebElement search=driver.findElement(searchpage.search);
 	   search.sendKeys(prop.getProperty("searchitem8"));
 	   search.click();
    }
    @Test(priority=15)
    public static void drugs() {
    	driver.findElement(searchpage.cross).click();
    	WebElement search=driver.findElement(searchpage.search);
 	   search.sendKeys(prop.getProperty("searchitem9"));
 	   search.click();
    }
     @AfterMethod
	public static void closebrowser() {
		driver.quit();
	}
}
