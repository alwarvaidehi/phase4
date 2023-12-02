package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Basepage {
	public static WebDriver driver=null;
	public static ExtentReports e;
	public static ExtentTest t;
	
	public static void getBrowser()
	{
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		//t=e.createTest(context.getName());
		
		
	}

}
