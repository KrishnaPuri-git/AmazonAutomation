package com.solera.mystore.utility.extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	
	public static final ExtentReports extentReports = new ExtentReports();
	public static ExtentReports setExtent() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
        reporter.config().setReportName("Ecommerce Report");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Ecommerce", "Solera");
        extentReports.setSystemInfo("Hemalatha", "C");
        return extentReports;
		
		
	}
	public static void endReport() {
		// TODO Auto-generated method stub
		
	}

}
