package utilityFiles;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	    private int retryCount = 0;
	    private static final int maxRetryCount = 1; // retry once

	    @Override
	    public boolean retry(ITestResult result) {
	        if (retryCount < maxRetryCount) {
	            retryCount++;
	            return true;   // re-run the test
	        }
	        return false;
	    }
	}


