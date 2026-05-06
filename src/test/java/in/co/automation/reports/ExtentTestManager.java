package in.co.automation.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentTestManager implements ITestListener {

    private static ExtentReports extent = ExtentManager.getInstance();
   private static ThreadLocal<ExtentTest> t1 = new ThreadLocal<>();


   public static ExtentTest getTest(){
     return   t1.get();
   }

   @Override
    public void onTestStart(ITestResult result){
      ExtentTest test = extent.createTest(result.getName());
       t1.set(test);
   }

   @Override
   public void onTestSuccess(ITestResult result){
       t1.get().pass("test pass");
   }

    @Override
    public void onTestFailure(ITestResult result){
        t1.get().fail(result.getThrowable());
    }

    @Override
    public void onFinish(ITestContext context){
    extent.flush();
     }

}
