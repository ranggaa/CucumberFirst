package commonFunctions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class FunctionLibrary {
public static Properties conpro;
public static WebDriver driver;
//method for launching browser
public static WebDriver startBrowser()throws Throwable
{
	conpro = new Properties();
	//load property file
	conpro.load(new FileInputStream("./PropertyFiles/Environment.properties"));
	if(conpro.getProperty("Browser").equalsIgnoreCase("chrome"))
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	else if(conpro.getProperty("Browser").equalsIgnoreCase("firefox"))
	{
		driver = new FirefoxDriver();
	}
	else
	{
		Reporter.log("Browser Value is Not Matching",true);
	}
	return driver;
	
}
//method for launching url
public static void openUrl()
{
	driver.get(conpro.getProperty("Url"));
}
//method for wait for any webelement
public static void waitForElement(String LocatorType,String LocatorValue,String Mywait)
{
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(Mywait)));
if(LocatorType.equalsIgnoreCase("xpath"))
{
	//wait until element is visible
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LocatorValue)));
}
if(LocatorType.equalsIgnoreCase("name"))
{
	//wait until element is visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(LocatorValue)));
}
if(LocatorType.equalsIgnoreCase("id"))
{
	//wait until element is visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(LocatorValue)));
}
}
//method for buttons,links,radiobutton,checkboxes and images
public static void clickAction(String LocatorType,String LocatorValue)
{
	if(LocatorType.equalsIgnoreCase("xpath"))
	{
		driver.findElement(By.xpath(LocatorValue)).click();
	}
	if(LocatorType.equalsIgnoreCase("name"))
	{
		driver.findElement(By.name(LocatorValue)).click();
	}
	if(LocatorType.equalsIgnoreCase("id"))
	{
		driver.findElement(By.id(LocatorValue)).sendKeys(Keys.ENTER);
	}
}
//method for any textbox
public static void typeAction(String LocatorType,String LocatorValue,String TestData)
{
	if(LocatorType.equalsIgnoreCase("xpath"))
	{
		driver.findElement(By.xpath(LocatorValue)).clear();
		driver.findElement(By.xpath(LocatorValue)).sendKeys(TestData);
	}
	if(LocatorType.equalsIgnoreCase("name"))
	{
		driver.findElement(By.name(LocatorValue)).clear();
		driver.findElement(By.name(LocatorValue)).sendKeys(TestData);
	}
	if(LocatorType.equalsIgnoreCase("id"))
	{
		driver.findElement(By.id(LocatorValue)).clear();
		driver.findElement(By.id(LocatorValue)).sendKeys(TestData);
	}
}
//method for validate title
public static void validateTitle(String Expected_Title)
{
	String Actual_Title = driver.getTitle();
	try {
		Assert.assertEquals(Actual_Title, Expected_Title, "Title is Not Matching");
	} catch (AssertionError e) {
		System.out.println(e.getMessage());
	}
}
//method close browser
public static void closeBrowser()
{
	driver.quit();
}
//method for capture supplier number into notepad
public static void captureSup(String LocatorType,String LocatorValue)throws Throwable
{
	String SupplierNum="";
	if(LocatorType.equalsIgnoreCase("xpath"))
	{
		SupplierNum = driver.findElement(By.xpath(LocatorValue)).getAttribute("value");
	}
	if(LocatorType.equalsIgnoreCase("name"))
	{
		SupplierNum = driver.findElement(By.name(LocatorValue)).getAttribute("value");
	}
	if(LocatorType.equalsIgnoreCase("id"))
	{
		SupplierNum = driver.findElement(By.id(LocatorValue)).getAttribute("value");
	}
	//create notepad under CaptureData folder 
	FileWriter fw = new FileWriter("./CaptureData/suppliernumber.txt");
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write(SupplierNum);
	bw.flush();
	bw.close();
	
}
//method for verifying supplier number
public static void supplierTable()throws Throwable
{
	//read supplier number from above note pad
	FileReader fr = new FileReader("./CaptureData/suppliernumber.txt");
	BufferedReader br = new BufferedReader(fr);
	String Exp_Data = br.readLine();
	//click search panel if search textbox not displayed
	if(!driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).isDisplayed())
		//click search panel button if not displayed
		driver.findElement(By.xpath(conpro.getProperty("search-panel"))).click();
	driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).clear();
	driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).sendKeys(Exp_Data);
	driver.findElement(By.xpath(conpro.getProperty("search-button"))).click();
	Thread.sleep(3000);
	String Act_Data = driver.findElement(By.xpath("//table[@class='table ewTable']/tbody/tr[1]/td[6]/div/span/span")).getText();
	Reporter.log(Exp_Data+"==========="+Act_Data,true);
	try {
		Assert.assertEquals(Act_Data, Exp_Data, "Supplier Number is Not Matching");
	} catch (AssertionError e) {
		System.out.println(e.getMessage());
	}
	
}
//method for capture customer number into notepad
public static void captureCus(String LocatorType,String LocatorValue)throws Throwable
{
	String CustomerNum="";
	if(LocatorType.equalsIgnoreCase("xpath"))
	{
		CustomerNum = driver.findElement(By.xpath(LocatorValue)).getAttribute("value");
	}
	if(LocatorType.equalsIgnoreCase("name"))
	{
		CustomerNum = driver.findElement(By.name(LocatorValue)).getAttribute("value");
	}
	if(LocatorType.equalsIgnoreCase("id"))
	{
		CustomerNum = driver.findElement(By.id(LocatorValue)).getAttribute("value");
	}
	//create notepad under CaptureData folder 
	FileWriter fw = new FileWriter("./CaptureData/customernumber.txt");
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write(CustomerNum);
	bw.flush();
	bw.close();
	
}
//method for verifying supplier number
public static void customerTable()throws Throwable
{
	//read supplier number from above note pad
	FileReader fr = new FileReader("./CaptureData/customernumber.txt");
	BufferedReader br = new BufferedReader(fr);
	String Exp_Data = br.readLine();
	//click search panel if search textbox not displayed
	if(!driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).isDisplayed())
		//click search panel button if not displayed
		driver.findElement(By.xpath(conpro.getProperty("search-panel"))).click();
	driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).clear();
	driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).sendKeys(Exp_Data);
	driver.findElement(By.xpath(conpro.getProperty("search-button"))).click();
	Thread.sleep(3000);
	String Act_Data = driver.findElement(By.xpath("//table[@class='table ewTable']/tbody/tr[1]/td[5]/div/span/span")).getText();
	Reporter.log(Exp_Data+"==========="+Act_Data,true);
	try {
		Assert.assertEquals(Act_Data, Exp_Data, "Customer Number is Not Matching");
	} catch (AssertionError e) {
		System.out.println(e.getMessage());
	}
	
}
}









