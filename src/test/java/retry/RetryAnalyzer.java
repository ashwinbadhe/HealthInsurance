package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer
{
	int initialcount = 0;
	int MAX_RETRY = 2;

	@Override
	public boolean retry(ITestResult result) 
	{
		if(initialcount < MAX_RETRY)
		{
			initialcount++;
			return true;
		}
		return false;
	}
	
}
