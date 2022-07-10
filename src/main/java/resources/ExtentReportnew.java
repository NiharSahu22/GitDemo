package resources;



import com.aventstack.extentreports.ExtentReports;


import com.aventstack.extentreports.reporter.ExtentSparkReporter;




public class ExtentReportnew {
	static ExtentReports extent;

	public static ExtentReports getReportObject(){
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(path);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		htmlReporter.config().setReportName("Web Automation Result");
		htmlReporter.config().setDocumentTitle("Test Results");
		extent.setSystemInfo("Tester", "Nihar Ranjan Sahu");
		
		return extent;
		
	}

}
