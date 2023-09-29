package TestUtil;

import java.io.IOException;

import TestBase.FreeCrmTestBase;

public class Test_Util extends FreeCrmTestBase{
	
	
	

	public Test_Util() throws IOException {
		super();
	}

		//long PAGE_LOAD_TIMEOUT = 50;
	//	long IMPLICIT_WAIT = 50;
		
		public void frame(String frame) {
			driver.switchTo().frame(frame);
		}
	
}

