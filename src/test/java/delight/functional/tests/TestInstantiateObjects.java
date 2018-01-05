package delight.functional.tests;

import org.junit.Test;

import delight.functional.Success;
import delight.functional.SuccessFail;

public class TestInstantiateObjects {

	@Test
	public void test() throws Exception {
		
		new Success();
		
		SuccessFail.success();
		
		SuccessFail.fail(new Exception("123"));
		
	}
	
}
