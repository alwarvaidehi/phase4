package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class MyListener implements ITestListener{
	
screenshot s;
ExtentTest t;
ExtentReports e;
	
	public void onTestStart(ITestResult result) {
		
		System.out.println("TestCase is started");
		
	//	s=new screenshot();
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCase is success");
	
			
		}
	

	public void onTestFailure(ITestResult result) {
		System.out.println("TestCase is Failed");
	}


	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCase is Skipped");
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("TestCase is Failedwithinsuccesspercentage");
	}

	
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("TestCase is Failed");
	}


	public void onStart(ITestContext context) {
		System.out.println("TestCase is Started");
	}

	
	public void onFinish(ITestContext context) {
		System.out.println("TestCase is Finished");

	}

}
