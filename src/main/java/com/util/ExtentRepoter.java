package com.util;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentRepoter {
	
	public static ExtentReports extent;
	
	public static ExtentReports createReport() {
		
		
		extent= new ExtentReports("/home/hetathakkar29gm/eclipse-workspace/simplilearn-maven/Report/MyFirstReport.html");
		return extent;
	
}
}


