package com.bluewhale.generic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.bluewhale.generic.BaseClass;

public class ListenerImplementation extends BaseClass implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		String res = result.getName();
		Reporter.log(res+"has been passed",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String res= result.getName();
//we should concatenate the file name along with the current time 
//to avoid overwriting the same file.
		String timeStamp=LocalDateTime.now().toString().replace(':','-');
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("./screenshots/"+res+timeStamp+".png");
		try {
			FileUtils.copyFile(src, dest);
		}catch(IOException e) {
		
		}
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		String res = result.getName();
		Reporter.log(res+"has been skipped",true);
	}

	@Override
	public void onTestStart(ITestResult result) {
		ITestListener.super.onTestStart(result);
	}

}