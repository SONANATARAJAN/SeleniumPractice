package in.co.automation.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    public static ExtentReports extent;
    public static  ExtentReports getInstance(){
if (extent == null) {
    ExtentSparkReporter sparkReporter = new ExtentSparkReporter("C:\\Users\\PARITHI\\Music\\test\\SeleniumJava\\output-report\\final-report.html");
    sparkReporter.config().setDocumentTitle("Automation Report Generation");
    sparkReporter.config().setReportName("Automation Report");
    extent = new ExtentReports();
    extent.attachReporter(sparkReporter);
}
        return extent;
    }
}