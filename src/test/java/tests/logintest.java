package tests;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pages.Basepage;
import pages.Homepage;
import pages.Loginpage;
import utilities.MyListener;
import utilities.screenshot;
@Listeners(MyListener.class)

public class logintest extends Basepage {
	WebDriver driver;
	Homepage h;
	Loginpage l;
	ExtentTest t;
	ExtentReports e;
	screenshot s;
	/*ExcelRead e=new ExcelRead();
	@DataProvider
	public Object[][] loginData() throws IOException
	{
		int LastRow=e.getLastRow("C:\\TestData\\datasheet.xls","Sheet1");
		Object[][] mydata=new Object[LastRow+1][2];
		for(int i=0;i<=LastRow;i++)
		{
			mydata[i][0]=e.readExcel("C:\\TestData\\datasheet.xls","Sheet1",  i,0);
			mydata[i][1]=e.readExcel("C:\\TestData\\datasheet.xls","Sheet1", i,1);
		}
		return mydata;
	}*/
	@Test()   //dataProvider="loginData")
	public void testLogin(){//(String u,String p) {
		h.clicklogin();
		l.enterloginDetails("vaidehi.a2000@gmail.com","Harrystyles_01&");//(u,p);
	try {
		l.clicklogout();
		
	}catch(Exception e)

	{
		Assert.fail("logout button is not present");
	}
	
	}
	@BeforeTest()
	public void setup()
	{
		getBrowser();
	   
	    h=new Homepage();
	    l=new Loginpage();
	}  
	
		@AfterTest()
		public void generateReports() throws IOException
		{
			e.flush();
		   Desktop.getDesktop().browse(new File("Report1.html").toURI());
		   
		
		
		
		 ExtentSparkReporter sparkReport=new ExtentSparkReporter("Report1.html");
			e=new ExtentReports();
			e.attachReporter(sparkReport);
			e.getLogSubject();
			e.createTest("pass");
			e.setSystemInfo("OS",System.getProperty("os.name"));
			e.setSystemInfo("JAVA",System.getProperty("java.version"));   
			
			
		}

		
		
		//Method m,ITestResult result
		
		
		
		
		
		
		
		
		
		
		//@AfterTest()
		public void generateTestStatus() throws IOException
		{
		
			   s=new screenshot();
			
		}
		

}

