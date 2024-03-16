package testNGListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerTypes implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		ITestListener.super.onTestStart(result);
		Reporter.log("Test case started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test case succeed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test case failed due timeout");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ITestListener.super.onTestSkipped(result);
		Reporter.log("Test case skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
		Reporter.log("Test failed but good percentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		ITestListener.super.onTestFailedWithTimeout(result);
		Reporter.log("Test case failed due to timeout");
	}

	@Override
	public void onStart(ITestContext context) {
		ITestListener.super.onStart(context);
		Reporter.log("Test suite started");
	}

	@Override
	public void onFinish(ITestContext context) {
		ITestListener.super.onFinish(context);
		Reporter.log("Test suite completed");
	}
			
}
