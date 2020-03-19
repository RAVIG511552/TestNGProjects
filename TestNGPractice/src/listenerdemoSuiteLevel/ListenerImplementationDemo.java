package listenerdemoSuiteLevel;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementationDemo implements ITestListener{
  
@Override
public void onFinish(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext result) {
	System.out.println("Test case started and test case name is: "+result.getName());
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailure(ITestResult result) {
	System.out.println("Test case failed and test case name is: "+result.getName());
	
}

@Override
public void onTestSkipped(ITestResult result) {
	System.out.println("Test case skipped and test case name is: "+result.getName());
	
}

@Override
public void onTestStart(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestSuccess(ITestResult result) {
	System.out.println("Test case success and test case name is: "+result.getName());
	
}
}
