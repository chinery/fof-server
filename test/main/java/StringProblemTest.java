import static org.junit.Assert.*;

import org.junit.Test;

public class StringProblemTest {

	@Test
	public void test() {
		int min = 4;
		int max = 12;
		String test;
		for(int i = 0; i < 1000; i++) {
			test = StringProblem.randomString(min, max, 2);
			assertTrue(test.length() >= min);
			assertTrue(test.length() <= max);
			assertTrue(test.length() % 2 == 0);
		}
	}

}
