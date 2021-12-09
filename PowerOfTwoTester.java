import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PowerOfTwoTester {

	PowerOfTwo test = new PowerOfTwo();
	
	@Test
	void test() {
		
		boolean output = test.isPowerOfTwo(8);
		assertEquals(true, output);		
		
	}
	
	@Test
	void test2() {
				
		boolean output = test.isPowerOfTwo(11);
		assertEquals(false, output);
	}
	
	@Test
	void test3() {
				
		boolean output = test.isPowerOfTwo(50);
		assertEquals(true, output);
	}
}
