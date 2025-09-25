package Utils;

import com.aventstack.extentreports.ExtentTest;
import org.testng.*;

public class TestListener implements ITestListener, IAnnotationTransformer {

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest test = ExtentReportManager.createTest(result.getMethod().getMethodName());
        test.info("Starting Test: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentReportManager.getTest().pass("Test Passed ");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentReportManager.getTest().fail("Test Failed: " + result.getThrowable());
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentReportManager.flush();
    }


}
