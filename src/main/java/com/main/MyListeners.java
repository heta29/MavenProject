package com.main;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.util.ExtentRepoter;

public class MyListeners implements ITestListener{
	ExtentReports extent;
	ExtentTest test;
	

	public void onStart(ITestContext context) {
		System.out.println("This is Starting of "+context.getName());
		extent = ExtentRepoter.createReport();
		
		 test =extent.startTest(context.getName());
		
		
		
	}

	/*public void onTestSuccess(ITestResult result) {
		System.out.println("My Test "+result.getName()+" is successful");
		test.log(LogStatus.PASS, result.getName() +"is passed");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("My Test "+result.getName()+" is Fail");
		test.log(LogStatus.FAIL, result.getName() +"is Fail");
		
		
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("My Test "+result.getName()+" is Skipped");
		test.log(LogStatus.SKIP, result.getName() +"is Skipped");
	}

*/	public void onFinish(ITestContext context) {
	
			System.out.println("This is finish");
			extent.endTest(test);
			extent.flush();
	}

	

	

	
	
	
	

}
