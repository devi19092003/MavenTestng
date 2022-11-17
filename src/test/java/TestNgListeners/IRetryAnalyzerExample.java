package TestNgListeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyzerExample implements IRetryAnalyzer {

    public int retryCount = 0;
    public static final int maxCount = 2;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(retryCount<maxCount){
            retryCount++;
            return true;
        }
        return false;
    }


}
