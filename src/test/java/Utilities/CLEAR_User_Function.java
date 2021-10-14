package Utilities;




import java.io.FileInputStream;
import java.io.FileReader;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.cucumber.listener.Reporter;


public class CLEAR_User_Function {
	
	static Logger log = Logger.getLogger(CLEAR_User_Function.class.getName());
	public static WebDriver driver;
	public static String driverPath;
	public static Properties prop;
	static String starttimeStamp;
	static String endtimeStamp;
	static WebDriverWait wait;
	public static String fileDownloadpath = "C:\\Users\\Downloads";
	public static Properties prop1;
	public static String parentWindow;
	public static String selectedtype;


	
	
	
	public static void geturl(String url)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Test\\Clear_PCTenants\\Driver_File\\chromedriver.exe");
		//ChromeOptions object
		
//		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
//	    chromePrefs.put("profile.default_content_settings.popups", 0);
//	    //chromePrefs.put("download.default_directory", downloadFilepath);
//	    ChromeOptions options = new ChromeOptions();
//	    HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
//	    options.setExperimentalOption("prefs", chromePrefs);
//	 
//	    options.addArguments("--test-type");
//	    options.addArguments("--enable-extensions"); //to disable browser extension popup
//	    options.addArguments("start-maximized");
//	    options.addArguments("--disable-notifications");
//		options.addArguments("--disable-infobars");		
//		//options.addArguments("--headless");
//		 //String pathToExtension = "C:\\sers\\laxmesh.andoor\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\kpoecbkildamnnchnlgoboipnblgikpn\\4.0.2.5_0";
//		    //options.addArguments("load-extension=" + pathToExtension);
//
//	    DesiredCapabilities cap = DesiredCapabilities.chrome();
//	    cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
//	    cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//	    cap.setCapability(ChromeOptions.CAPABILITY, options);
//	   
//	    driver = new ChromeDriver(cap);
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
		//driver.get("chrome://settings/clearBrowserData");
		//driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
		//wait = new WebDriverWait(driver, 2000);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-infobars");	
		options.addArguments("--disable-notifications");
	    options.addArguments("--start-maximized");
	    options.addArguments("--test-type");	
	    driver = new ChromeDriver(options);	
		driver.get(url);
		
	}
	
	
	
	
public static void AcceptAsperaPopup()
	{
driver.switchTo().alert();

	String alertMessage= driver.switchTo().alert().getText(); // capture alert message

	System.out.println(alertMessage); // Print Alert Message
	}

	
	public static void clicktab(String locator, String type) throws Throwable {
        try {
            WebElement tab = driver.findElement(By.xpath(prop.getProperty(locator)));
            tab.sendKeys(Keys.TAB);
        } catch (Exception e) 
        {
            // TODO: handle exception
        }
	}
	
	
	public static void HandleUnexpectedAlert() {
	    try {
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
	    } catch (NoAlertPresentException ignore) {
	        // This is the way to know it wasn't there
	    }
	}

	//Double click on element
	public static void Doubleclick(String xpath)
	{
		Actions act = new Actions(driver);
	WebElement ele = driver.findElement(By.xpath(xpath));
	act.doubleClick(ele).perform();
	}
	
	
	public static String inserttext(String xpath, String value) throws InterruptedException
	{
		
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath(xpath));
		HighlightMe1(driver.findElement(By.xpath(xpath)));
		
		text.sendKeys(value);
		return value;
		
	}
	
	
	public static void HighlightMe(String xpath) throws InterruptedException
	{
	JavascriptExecutor js = (JavascriptExecutor) driver;

	for(int i=0 ; i<3 ; i++)
	{
		js.executeScript("arguments[0].style.border='5px groove Blue'", xpath);
		Thread.sleep(1000);
		js.executeScript("arguments[0].style.border=''", xpath);
	}
	}
	
	public static void HighlightMe1(WebElement xpath) throws InterruptedException
	{
	JavascriptExecutor js = (JavascriptExecutor) driver;

	for(int i=0 ; i<3 ; i++)
	{
		js.executeScript("arguments[0].style.border='5px groove Blue'", xpath);
		Thread.sleep(1000);
		js.executeScript("arguments[0].style.border=''", xpath);
	}
	}
	
	public static String sendkeys(String xpath, String value) throws InterruptedException
	{
		
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath(xpath));
		HighlightMe1(driver.findElement(By.xpath(xpath)));
		text.sendKeys(value);
		return value;	
		
	}
	public static String Inputtext(String xpath) throws InterruptedException 
	{
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath(xpath));
		HighlightMe1(driver.findElement(By.xpath(xpath)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath(xpath)));
		// text.clear();
		System.out.println("" +selectedtype);

		text.sendKeys(selectedtype);
		return selectedtype;

	}
	
	public static void hscroll(String xpath) throws InterruptedException
	{
		WebElement scroll = driver.findElement(By.xpath(xpath));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", scroll);
	}
	
	
	public static void sendtabkeys(String xpath) throws InterruptedException
	{
		
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath(xpath));
		HighlightMe1(driver.findElement(By.xpath(xpath)));
		text.sendKeys(Keys.TAB);			
	}
	
	
	public static void clickf2(String xpath) throws InterruptedException
	{
		
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath(xpath));
		HighlightMe1(driver.findElement(By.xpath(xpath)));
		text.click();
		text.sendKeys(Keys.F2);			
	}
	

	public static void click(String xpath)
	{
		
		try {
			Thread.sleep(1000);
			WebElement text = driver.findElement(By.xpath(xpath));
			HighlightMe1(text);
			text.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void clickwithouthighlight(String xpath)
	{
		
		try {
			Thread.sleep(1000);
			WebElement text = driver.findElement(By.xpath(xpath));
			text.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void clickenter(String xpath)
	{
		
		try {
			Thread.sleep(1000);
			HighlightMe1(driver.findElement(By.xpath(xpath)));
			WebElement text = driver.findElement(By.xpath(xpath));
			text.click();
			text.sendKeys(Keys.ENTER);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void javaclick(String xpath) throws InterruptedException
	{
		CLEAR_User_Function.waitFor();
		WebElement text = driver.findElement(By.xpath(xpath));
		JavascriptExecutor js=  (JavascriptExecutor) driver;
		HighlightMe1(driver.findElement(By.xpath(xpath)));
		js.executeScript("arguments[0].click();", text);
		
	}
	
	public static void waitFor() 
	{
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
	
	
	public static void waitFor120() {
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
	}
	
	
	public static void Explicitwait(String xpath) 
	{
		
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	
	}
	
	public static void sleep(Integer time)
	{
	driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	}
	
	public static void mousemove(String xpath) throws InterruptedException
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath(xpath))).build().perform();
	    
	    //After mouse hover, element form dropdown is appeared, then click on it.
	    WebElement role = driver.findElement(By.xpath(xpath));
	    role.click();
	    HighlightMe1(role);
	  
//		WebElement text = driver.findElement(By.xpath(xpath));
//		HighlightMe1(driver.findElement(By.xpath(xpath)));
//		actions.moveToElement(text);
//		HighlightMe1(driver.findElement(By.xpath(xpath)));
//		text.click();		
//		Star_User_Function.sleep(400);
	}
	
	public static void extentReportScreenShot() throws Exception 
	{
		String screenshotPath = takeScreenshot();

		Reporter.addScreenCaptureFromPath(screenshotPath, "Scenario Failed");
		Reporter.addScreenCast(screenshotPath);
	}
	
	static String takeScreenshot() throws IOException
	{
		String dateName = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destFile = System.getProperty("user.dir") + "\\Screenshots\\screenshot_" + dateName + ".png";
		FileUtils.copyFile(scrFile, new File(destFile));
		return destFile;
	}
	
	
	static void WebElementslistclick(String xpath) throws InterruptedException
	{
		List<WebElement> asset = driver.findElements(By.xpath(xpath));
		for(int i=0; i<asset.size(); i++)
		{
			HighlightMe1(driver.findElement(By.xpath(xpath)));
			asset.get(i).click();
		}
		
		}
	
	
	public static void validateElement(String xpath, String Value) throws Throwable 
    {
        try {
        
        	WebElement alert = driver.findElement(By.xpath(xpath));
            HighlightMe1(driver.findElement(By.xpath(xpath)));            
            org.junit.Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(),Value);
            Reporter.addStepLog("Expected Element is - "+driver.findElement(By.xpath(xpath)).getText()+", But Actual Element is - "+Value+", is Matching");
            log.info("Expected Element is - "+driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - " +Value+ ", is Matching");
        }

 

        catch (Throwable e)
        {
        	org.junit.Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(),Value);
        	log.info("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - "+Value+", is not Matching");
            log.error("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - " +Value+", is not Matching");
            Reporter.addStepLog("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()  + ", But Actual Element is - "+Value+", is not Matching");
           
        }

 

    }
	
	public static String validateElement2(String xpath, String Value) throws Throwable 
    {
        try {
        
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            HighlightMe1(driver.findElement(By.xpath(xpath)));
            org.junit.Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(),Value);
            Reporter.addStepLog("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText() +", But Actual Element is - "+Value +", is Matching");
            log.info("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - " + Value + ", is Matching");
        }

 

        catch (Throwable e) 
        {
        	org.junit.Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(),Value);
        	log.info("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - "+Value +", is not Matching");
            log.error("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - " +Value +", is not Matching");
            Reporter.addStepLog("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()  + ", But Actual Element is - "+Value +", is not Matching");
        }

        return Value;
 

    }
	
	public static void validateAttributestring(String xpath, String Value) throws Throwable 
    {
        try {
        
            org.junit.Assert.assertEquals(xpath,Value);
            Reporter.addStepLog("Expected Element is - " +xpath+", But Actual Element is - "+Value+", is Matching");
            log.info("Expected Element is - " +xpath+ ", But Actual Element is - " +Value+ ", is Matching");
        }

 

        catch (Throwable e)
        {
        	org.junit.Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(),Value);
        	log.info("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - "+Value +", is not Matching");
            log.error("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - " +Value +", is not Matching");
            Reporter.addStepLog("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()  + ", But Actual Element is - "+Value +", is not Matching");
        }

 

    }
	
	
	public static Integer validateAttributestring2(Integer a,Integer b,Integer c)
	{
		a=5;
		b=2;
		c=a/b;
		System.out.println(c);
		return  c;
	}
	
	public static void validateAttributebyclass(String xpath, String Value) throws Throwable 
    {
        try {
        
            org.junit.Assert.assertEquals(xpath,Value);
            Reporter.addStepLog("Expected Element is - " +xpath+", But Actual Element is - "+Value+", is Matching");
            log.info("Expected Element is - " +xpath+ ", But Actual Element is - " +Value+ ", is Matching");
        }

 

        catch (Throwable e) 
        {
        	org.junit.Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(),Value);
        	log.info("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - "+Value +", is not Matching");
            log.error("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()+ ", But Actual Element is - " +Value +", is not Matching");
            Reporter.addStepLog("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()  + ", But Actual Element is - "+Value +", is not Matching");
        }

 

    }
	
	
	public static void validateRFElement(String xpath, String Value) throws Throwable 
    {
        try {
        
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            HighlightMe1(driver.findElement(By.xpath(xpath)));
            org.junit.Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), Value);
            Reporter.addStepLog("Expected " + driver.findElement(By.xpath(xpath)).getText() + " Asset should display."   + 
            ", But Actual is - " + Value + " Asset is displaying."  + ", is Matching");
            log.info("Expected " + driver.findElement(By.xpath(xpath)).getText() + " Asset should display."   + 
                    ", But Actual is - " + Value + " Asset is displaying."  +  ", is Matching");
        }

 

        catch (Throwable e) 
        {
        	org.junit.Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(),Value);
        	Reporter.addStepLog("Expected : " + driver.findElement(By.xpath(xpath)).getText() + " Asset should display."   + 
                    ", But Actual is - " + Value + " Asset is displaying."  + ", Not is Matching");
                    log.info("Expected " + driver.findElement(By.xpath(xpath)).getText() + " Asset should display."   + 
                            ", But Actual is - " + Value + " Asset is displaying."  +  ", Not is Matching");
        }

 

    }
	
	public static void quit()
	{
		driver.close();
	}
	
	public static void linktext(String ltext)
	{
		sleep(100);
		driver.findElement(By.linkText(ltext));
	}
	
	
	public static String gettext(String xpath) throws InterruptedException
	{
		String s = driver.findElement(By.xpath(xpath)).getText();
		HighlightMe1(driver.findElement(By.xpath(xpath)));
		System.out.println("Text captured form the portal is : " +s);
		return s; 
	}
	
	
	public static String getAttribute(String xpath)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
                driver.findElement(By.xpath(xpath)));
		String cfn = driver.findElement(By.xpath(xpath)).getAttribute("value");
		return cfn; 
	}
	
	public static String getAttributetitle(String xpath)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
                driver.findElement(By.xpath(xpath)));
		String cfn = driver.findElement(By.xpath(xpath)).getAttribute("title");
		return cfn; 
	}
	
	public static String getAttributebytitle(String xpath)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
                driver.findElement(By.xpath(xpath)));
		String cfn = driver.findElement(By.xpath(xpath)).getAttribute("title");
		return cfn; 
	}
	
	public static String getAttributebyclass(String xpath)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
                driver.findElement(By.xpath(xpath)));
		String cfn = driver.findElement(By.xpath(xpath)).getAttribute("class");
		return cfn; 
	}
	
	public static void navigateto(String url)
	{
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 2000);
		driver.navigate().to(url);
	}
	
	
	public static void Writetofile(String type, String key, String value) throws Throwable
	{
		File file = new File("D:\\Automation_Test\\Clear_PCTenants\\src\\test\\resources\\Data\\Temp1.properties");
		String fileContext = FileUtils.readFileToString(file);
		if (type.equals(key + "=")) {
			System.out.println(key + " : " + value);
			fileContext = fileContext.replaceAll(type + "(.*)", type + value);
			FileUtils.write(file, fileContext);
		}
	}
	
	
	public static String getvalue(String value) throws IOException {
        FileInputStream supplierdetailprop = new FileInputStream(
                new File("D:\\Automation_Test\\Clear_PCTenants\\src\\test\\resources\\Data\\Temp1.properties"));
        Properties prop1 = new Properties();
        prop1.load(supplierdetailprop);

 

        return prop1.getProperty(value);

 

    }
	
	
	public static void readfile1(String xpath1,String xpath2) throws IOException, InterruptedException 
	{
		
				
		File file = new File("C:\\Users\\amruthesh.girirao\\git\\repository2\\CLEAR PC\\src\\test\\resources\\Data\\Temp1.properties");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st;
		String temp2 = null;
		st = br.readLine();
		System.out.println(st);
		  if (st != null)
			  temp2 = st.substring(4,st.length());
		 WebElement data1 = driver.findElement(By.xpath(xpath1));
		 data1.sendKeys(temp2);
		 CLEAR_User_Function.sleep(1000);
		 WebElement data2 = driver.findElement(By.xpath(xpath2));
		 CLEAR_User_Function.HighlightMe1(data2);
		 CLEAR_User_Function.sleep(1000);
	}
	
	
	
	public static String readfile2(String xpath1) throws Throwable 
	{
		
				
		File file = new File("C:\\Users\\amruthesh.girirao\\git\\repository2\\CLEAR PC\\src\\test\\resources\\Data\\Temp1.properties");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st;
		st = br.readLine();
		System.out.println(st);
		  if (st != null)
			st.substring(4,st.length());
		 String s = driver.findElement(By.xpath(xpath1)).getText();
		 CLEAR_User_Function.sleep(1000);
		 return s; 
		 
	}
	
	public static void readfile3(String xpath1,String xpath2) throws IOException, InterruptedException 
	{
		
				
		File file = new File("D:\\Automation_Test\\Automation_CLEAR_PC\\src\\test\\resources\\Data\\Temp1.properties");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st;
		String temp2 = null;
		StringBuffer sb=new StringBuffer(); 
		st = br.readLine();
		System.out.println(st);
		  if ((st=br.readLine()) != null)
		  {
			  {  
				  sb.append(st);      //appends line to string buffer  
				  sb.append("\n");     //line feed   
				  }  
		  
			  
			 // temp2 = st.substring(11,21);
		 WebElement data1 = driver.findElement(By.xpath(xpath1));
		 data1.sendKeys(temp2);
		 CLEAR_User_Function.sleep(2000);
		
		  }
	}
	
	
	public static void dd(String xpath , String value) throws InterruptedException 

	{
			WebElement identifier = driver.findElement(By.xpath(xpath));
			Select select = new Select(identifier);
			select.selectByVisibleText(value); 
	}
	
	
//	public static void dropdownWithoutSelect(String locator, String type, String value) throws Throwable {
//		try {
//
//			WebElement dropdownWithSelect = locatorIdentifier(prop.getProperty(locator), type);
//			Select sl = new Select(dropdownWithSelect);
//			System.out.println("Selected Option : " + sl.getFirstSelectedOption());
//			java.util.List<WebElement> options = dropdownWithSelect.findElements(By.tagName("option"));
//
//			for (WebElement option : options) {
//				if (option.equals(prop.getProperty(value))) {
//					// Reporter.addStepLog(prop.getProperty(value) + " is
//					// clicked from dropdown box...");
//					option.click();
//				}
//			}
//		} catch (Exception e) {
//			System.out.println("Element not available for Insert operation...");
//		}
//	}
	
	
//	public static WebElement locatorIdentifier(String locator, String type) throws Throwable {
//
//		switch (type) {
//		case "xpath":
//			if (FindElementSafe(By.xpath(locator)) != null) {
//				// Reporter.addStepLog("Element identified with XPath : " +
//				// locator);
//
//				return driver.findElement(By.xpath(locator));
//			}
//			break;
//		case "id":
//			if (FindElementSafe(By.id(locator)) != null) {
//				// Reporter.addStepLog("Element identified with ID : " +
//				// locator);
//				return driver.findElement(By.id(locator));
//			}
//			break;
//		case "name":
//			if (FindElementSafe(By.name(locator)) != null) {
//				// Reporter.addStepLog("Element identified with Name : " +
//				// locator);
//				return driver.findElement(By.name(locator));
//			}
//			break;
//		case "className":
//			if (FindElementSafe(By.className(locator)) != null) {
//				// Reporter.addStepLog("Element identified with ClassName : " +
//				// locator);
//				return driver.findElement(By.className(locator));
//			}
//			break;
//		case "cssSelector":
//			if (FindElementSafe(By.cssSelector(locator)) != null) {
//				// Reporter.addStepLog("Element identified with cssSelector : "
//				// + locator);
//				return driver.findElement(By.cssSelector(locator));
//			}
//			break;
//		case "linktext":
//			waitFor();
//			if (FindElementSafe(By.linkText(locator)) != null) {
//				// Reporter.addStepLog("Element identified with LinkText : " +
//				// locator);
//				return driver.findElement(By.linkText(locator));
//			}
//			break;
//		case "tagName":
//			if (FindElementSafe(By.tagName(locator)) != null) {
//				// Reporter.addStepLog("Element identified with TagName : " +
//				// locator);
//				return driver.findElement(By.tagName(locator));
//			}
//			break;
//		case "partialLinkText":
//			if (FindElementSafe(By.partialLinkText(locator)) != null) {
//				// Reporter.addStepLog("Element identified with Partial LinkText
//				// : " + locator);
//				return driver.findElement(By.partialLinkText(locator));
//			}
//			break;
//		default:
//			// Reporter.addStepLog("Element not available for do action....");
//			System.out.println("Element not available....");
//		}
//		return null;
//	}

	public static WebElement FindElementSafe(By locator) throws InterruptedException {

		try {

			HighlightMe1(driver.findElement(locator));
			return driver.findElement(locator);

		} catch (NoSuchElementException e) {
			waitFor();
			FindElementSafe(locator);
		}
		return null;
	}
	
	public static String Insertdata(String xpath, String value) throws InterruptedException {
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath(xpath));
		HighlightMe1(driver.findElement(By.xpath(xpath)));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath(xpath)));
		text.clear();
		Thread.sleep(1000);
		text.sendKeys(value);
		return value;

	}
	
	public static void ScrolltillElement(String id) throws InterruptedException
	{
	WebElement element = driver.findElement(By.id(id));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	Thread.sleep(500); 
	}
	
	
	public static void scrollToWebElement(String xpath, String type1) throws Throwable {
		WebElement element = driver.findElement(By.xpath(xpath));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}
	
	
	public static void scrollToWebElement(String xpath) 
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath(xpath)));
	}
	
		
	public static void MoveMousePointer (String xpath) throws InterruptedException{
		
		WebElement dropdown = driver.findElement(By.xpath(xpath));

		Actions act = new Actions(driver); 
		act.moveToElement(dropdown);
		Thread.sleep(2000);

		act.click().build().perform();



	}
	
public static void Onhover(String xpath) throws InterruptedException{
		
		WebElement dropdown = driver.findElement(By.xpath(xpath));

		Actions act = new Actions(driver); 
		act.moveToElement(dropdown);
		Thread.sleep(2000);

		act.build().perform();



	}
	
	
	
	
	
	public static String gettitle()
	{
		try
		{
		return driver.getTitle();
		
	}
		catch(Exception  e)
	
		{
			sleep(1000);
			gettitle();
		}
		
		return driver.getTitle();
	}
	
	
	public static void clear(String xpath)
	{
			sleep(1000);
			driver.findElement(By.xpath(xpath)).clear();
			sleep(1000);

	}
	
	
	public static String Substring(String S,Integer m, Integer n)
	{
		
		String t = S.substring(m,n);
		return t;
		
	}
	
	
	public static void validateContentType(String xpath, String value) throws Throwable
	{
		Thread.sleep(100);
		try {
			
			HighlightMe1(driver.findElement(By.xpath((xpath))));
			org.junit.Assert.assertEquals(driver.findElement(By.xpath(xpath)).getAttribute("conttype"), value);
			Reporter.addStepLog("Expected Content Type asset is - " + driver.findElement(By.xpath(xpath)).getAttribute("conttype")+ ", and Actual Content Type asset displayed is - " + value + ", is  Matching");
			log.info("Expected Content Type asset is - " + driver.findElement(By.xpath(xpath)).getAttribute("conttype")+ ", and Actual Content Type asset displayed is - " + value + ", is Matching");
		} 
		catch (Throwable e)
		{
			org.junit.Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(),value);
			Reporter.addStepLog("Expected Content Type asset is - " + driver.findElement(By.xpath(xpath)).getAttribute("conttype")
					+ ", But Actual Content Type asset displayed is - " + value + ", is not Matching");
			log.error("Expected Content Type asset is - " + driver.findElement(By.xpath(xpath)).getAttribute("conttype")
					+ ", But Actual Content Type asset displayed is - " + value + ", is not Matching");
		}
	}
	
	
	public static void validatevalue(String xpath, String value) throws Throwable
	{
		Thread.sleep(100);
		try {			
			HighlightMe1(driver.findElement(By.xpath((xpath))));
			org.junit.Assert.assertEquals(driver.findElement(By.xpath(xpath)).getAttribute("value"), value);
			Reporter.addStepLog("Expected Content Type asset is - " + driver.findElement(By.xpath(xpath)).getAttribute("value")+ ", and Actual Content Type asset displayed is - " + value + ", is  Matching");
			log.info("Expected Content Type asset is - " + driver.findElement(By.xpath(xpath)).getAttribute("value")+ ", and Actual Content Type asset displayed is - " + value + ", is Matching");
		} 
		catch (Throwable e)
		{
			org.junit.Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(),value);
			Reporter.addStepLog("Expected Content Type asset is - " + driver.findElement(By.xpath(xpath)).getAttribute("value")
					+ ", But Actual Content Type asset displayed is - " + value + ", is not Matching");
			log.error("Expected Content Type asset is - " + driver.findElement(By.xpath(xpath)).getAttribute("value")
					+ ", But Actual Content Type asset displayed is - " + value + ", is not Matching");
	        
		}
	}
	
	
	public static boolean isFileDownloaded(String fileDownloadpath, String fileName) throws Throwable {
		 boolean flag = false;
		 
		 File directory = new File(fileDownloadpath);
		 File[] content = directory.listFiles();
		 for (int i = 0; i < content.length; i++) { if (content[i].getName().equals(fileName)) return flag=true; 
		 else 
			 //Assert.assertTrue(isFileDownloaded(fileDownloadpath, "check aspera.mp4"
		 
		 CLEAR_User_Function.validateElement(CLEAR_User_Function.getvalue("CFN"),"check aspera.mp4");
		 } 
		 return flag; 
		 }
	
	public static String randomtext (String xpath) throws InterruptedException
	{
		String Input = "abcdef";
		String Text = RandomStringUtils.random(6, Input);
		 // Create object of SimpleDateFormat class and decide the format
		 DateFormat dateFormat = new SimpleDateFormat("hh_mm_ss");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
		 
		WebElement data = driver.findElement(By.xpath(xpath));
		
		data.sendKeys("QAFolder_"+date1);
		return ("QAFolder_"+date1);
	}
	
	//Alert handling 
		public static String GetAlertMSG () throws InterruptedException
		{
			// Switching to Alert        
	        Alert alert = driver.switchTo().alert();		
	        		
	        // Capturing alert message.    
	        String alertMessage= alert.getText();		
	        		
	        // Displaying alert message		
	        System.out.println(alertMessage); 		
	       		
			return alertMessage;
		}
		
		
		public static void WaitForElementToAppear(String Xpath)
		{
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
					.withTimeout(30, TimeUnit.SECONDS) 			
					.pollingEvery(5, TimeUnit.SECONDS) 			
					.ignoring(NoSuchElementException.class);

			WebElement Element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Xpath)));
			 
		}
		
		
		public static void EnterkeyforAsperaPopup() throws Throwable
		{
			// native key strokes for CTRL, V and ENTER keys
	        Robot robot = new Robot();
	        robot.keyPress(KeyEvent.VK_RIGHT);
	        Thread.sleep(1000);
	        robot.keyPress(KeyEvent.VK_ENTER);
	    }
		
		
		public static void selectFileToUpload(String Upload) throws Throwable {

			 

	        StringSelection ss = new StringSelection(Upload);
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	        Thread.sleep(2000);
	        // native key strokes for CTRL, V and ENTER keys
	        Robot robot = new Robot();

	 

	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        Thread.sleep(1000);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	    }
		
		public static void sendDownArrowkeys(String xpath) throws InterruptedException
		{
			
			Thread.sleep(2000);
			WebElement text = driver.findElement(By.xpath(xpath));
			HighlightMe1(driver.findElement(By.xpath(xpath)));
			text.sendKeys(Keys.ARROW_DOWN);	
			text.sendKeys(Keys.ARROW_DOWN);
			text.sendKeys(Keys.ARROW_DOWN);
			text.sendKeys(Keys.ENTER);
		}
		
		public static void validatedownloadstatus(String xpath, String value, String value1,String value2) throws InterruptedException 
		{	
			
				String text = driver.findElement(By.xpath(xpath)).getText();
				System.out.println("HTTP STATUS is -" +text);
				HighlightMe1(driver.findElement(By.xpath((xpath))));
				
				if (text.equalsIgnoreCase(value)) 
				{
					System.out.println("Incase HTTP upload is passed");
					
					Reporter.addStepLog("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()
							+ ", But Actual Element is - " + value + ", is  Matching");
					log.info("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()
							+ ",But Actual Element is - " + value + ",is Matching");
				}

				else if(text.equalsIgnoreCase(value1)) 
				{
					System.out.println("Incase HTTP upload is Failed");
					Reporter.addStepLog("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()
							+ ", But Actual Element is - " + value1 + ", is Matching");
					log.info("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()
							+ ", But Actual Element is - " + value1 + ", is Matching");
				}
				else
				{
					System.out.println("Incase HTTP upload is In-Progress");
					Reporter.addStepLog("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()
							+ ", But Actual Element is - " + value2 + ", is in progress");
					log.info("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()
							+ ", But Actual Element is - " + value2 + ", is in progress");
				}
					
		}
		public static void validateuploadstatus(String xpath, String value, String value1,String value2) throws InterruptedException 
		{	
			  
				String text = driver.findElement(By.xpath(xpath)).getText();
				System.out.println("HTTP STATUS is -" +text);
				HighlightMe1(driver.findElement(By.xpath((xpath))));
				
				if (text.equalsIgnoreCase(value)) 
				{
					System.out.println("Incase HTTP upload is passed");
					
					Reporter.addStepLog("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()
							+ ", But Actual Element is - " + value + ", is  Matching");
					log.info("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()
							+ ",But Actual Element is - " + value + ",is Matching");
				}

				else if(text.equalsIgnoreCase(value1)) 
				{
					System.out.println("Incase HTTP upload is Failed");
					Reporter.addStepLog("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()
							+ ", But Actual Element is - " + value1 + ", is Matching");
					log.info("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()
							+ ", But Actual Element is - " + value1 + ", is Matching");
				}
				else
				{
					System.out.println("Incase HTTP upload is In-Progress");
					Reporter.addStepLog("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()
							+ ", But Actual Element is - " + value2 + ", is in progress");
					log.info("Expected Element is - " + driver.findElement(By.xpath(xpath)).getText()
							+ ", But Actual Element is - " + value2 + ", is in progress");
				}
					
		}
		
		public static void PopUpExists(String xpath,String xpath2) throws InterruptedException 
		{
			//WebDriverWait wait = new WebDriverWait(driver, 30 /*timeout in seconds*/);			
			WebElement Popup = driver.findElement(By.xpath(xpath));  			
	
			if(Popup.isDisplayed())
			{
				CLEAR_User_Function.waitFor();
				driver.findElement(By.xpath(xpath2)).click();		
				System.out.println("Clicked on Yes button and file is deleted succesffully");
				Reporter.addStepLog("Clicked on Yes button and file is deleted succesffully");
			
				
			} 
			else 
			{
				Thread.sleep(2000);
				System.out.println("File is not deleted in the portal");
				Reporter.addStepLog("File is not deleted in the portal");
			} 
		

		}
		
		public static void dynamicalert(String xpath) throws Throwable {
			Thread.sleep(3000);
			// Switching to Alert
			Alert alert = driver.switchTo().alert();

			// Capturing alert message.
			String alertMessage = driver.switchTo().alert().getText();
			System.out.println("Alert is displayed : " + alertMessage);
		}
		
		public static void validateAttributeValue(String xpath, String status) throws Throwable {

			
			HighlightMe(xpath);
			if (driver.findElement(By.xpath(xpath)).getText().equalsIgnoreCase(status)) {

	

				HighlightMe1(driver.findElement(By.xpath((xpath))));
				// org.junit.Assert.assertEquals(driver.findElement(By.xpath(xpath)).getAttribute("conttype"),
				// status);
				Reporter.addStepLog(
						"Actual upload status captured from portal is -" + driver.findElement(By.xpath(xpath)).getText()
								+ ", and Expected upload status is - " + status + ", is  Matching");
				log.info("Actual upload status captured from portal is -" + driver.findElement(By.xpath(xpath)).getText()
						+ ", and Expected upload status is - " + status + ", is  Matching");
			}

			else {
				org.junit.Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(),status);
				Reporter.addStepLog(
						"Actual upload status captured from portal is -" + driver.findElement(By.xpath(xpath)).getText()
						+ ", and Expected upload status is - " + status + ", is  Matching");
				log.info("Actual upload status captured from portal is -" + driver.findElement(By.xpath(xpath)).getText()
						+ ", and Expected upload status is - " + status + ", is  Matching");
				
			}
		}
		
		public static String Isdisplay(String xpath) throws Throwable 
		
		{
			WebElement result = driver.findElement(By.xpath(xpath));
			HighlightMe1(result);
			
			boolean result1 = driver.findElement(By.xpath(xpath)).isDisplayed();
			

			String Element = driver.findElement(By.xpath(xpath)).getText();

			System.out.println("Text is displayed Successfully -" +result1);
			Reporter.addStepLog("Text is displayed Successfully -" +result1);

			System.out.println("Test captured from portal and displayed is -" +Element);
			Reporter.addStepLog("Test captured from portal and displayed is -" +Element);
			return Element;

		}
		
public static void Mousehower(String xpath) throws Throwable 
		
		{	
	
			WebElement Player_controls = driver.findElement(By.xpath(xpath));
		Actions tooltip = new Actions(driver);
		tooltip.moveToElement(Player_controls).build().perform();
		
		tooltip.click(Player_controls);
		//After this, U can then try to get the element in that tooltip
		}

public static void playerclick(String xpath) throws InterruptedException {

	WebElement icons = driver.findElement(By.xpath(xpath));

	for (int i = 0; i < 4; i++)

	{
		HighlightMe1(icons);
		icons.click();
	}	

}
public static void listdd(String xpath) throws InterruptedException 
{
	List<WebElement> AllQuality = driver.findElements(By.xpath(xpath));

	for (WebElement product : AllQuality) 
	{
		System.out.println("Drop down list consists : " +product.getAttribute("innerText"));

	}
}
public static void Move(String xpath) throws InterruptedException 
		{
			//Locating the Main Menu (Parent element)
			WebElement mainMenu = driver.findElement(By.xpath(xpath));
			
			//Instantiating Actions class
			Actions actions = new Actions(driver);
			
			//Hovering on main menu
			actions.moveToElement(mainMenu);
			
			//Locating the element from Sub Menu
			//WebElement subMenu = driver.findElement(By.xpath(xpath1));
			
			//To mouseover on sub menu
			//actions.moveToElement(subMenu);
			
			//build()- used to compile all the actions into a single step 
			actions.click().build().perform();
		}

public static void Alertisdisplayed(String xpath) throws InterruptedException 
{
	//WebDriverWait wait = new WebDriverWait(driver, 5 /*timeout in seconds*/);
	if (driver.findElement(By.xpath(xpath)).isDisplayed())
	{
		//WebDriverWait alert = new WebDriverWait(driver, 10);
		
		String alertmessage = driver.findElement(By.xpath(xpath)).getText();

		System.out.println("Validation is successsful and Alert displayed is : " + alertmessage);
		Reporter.addStepLog("Validation is successsful and Alert displayed is : " + alertmessage);
	} else 
	{
		System.out.println("This step is skipped");
	}
			
}
public static String getattributehtml(String xpath) throws InterruptedException {
	Thread.sleep(1000);
	
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
			driver.findElement(By.xpath(xpath)));
	WebElement cfn = driver.findElement(By.xpath((xpath)));
	HighlightMe1(cfn);
	String text = driver.findElement(By.xpath(xpath)).getAttribute("value");

	Reporter.addStepLog("Text detected in the portal : " + text);
	System.out.println("Text detected in the portal : " + text);
	return text;

}

public static boolean ElementVisisble(String xpath,String xpath1) throws InterruptedException {
		try{
				
		    if(driver.findElement(By.xpath(xpath)).isDisplayed()==true)
		    {
		        System.out.println("Rename Alert pop up is displayed");		         
		        WebElement Rename_button = driver.findElement(By.xpath(xpath1));
		        HighlightMe1(Rename_button);
		        Rename_button.click();
		       
		    }
		    else
		    {
		        System.out.println("Rename Alert pop up is not displayed as uploading file is unique"); 
		        return false;
		    }
		}
		catch(Exception e)
		{
			   System.err.println("Error came while waiting for the alert popup. "+e.getMessage());
			}
		 return true;

		}
}

