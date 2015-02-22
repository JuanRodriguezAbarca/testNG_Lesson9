package tests;

import org.testng.annotations.Test;

public class ThreaddsTest {
	
	@Test(threadPoolSize=5, invocationCount=30)
	public void checkThreads(){
		System.out.println("Thread: "+Thread.currentThread().getId());
	}

}
