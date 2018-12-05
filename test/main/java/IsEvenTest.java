import static org.junit.Assert.*;

import org.junit.Test;

public class IsEvenTest {

	private IsEven customIsEven(final String question) {
		return new IsEven() {
			private String injected_question;
			@Override
			protected void init() {
				this.injected_question = question;
			}
			@Override
			protected String getQuestion() {
				return injected_question;
				
			}
		};
	}
	
	
	// Normal data tests
	
	@Test
	public void test1() {
		Problem problem1 = customIsEven("50000");
		assertTrue(problem1.checkAnswer("ANSWER TRUE"));
	}
	
	@Test
	public void test2() {
		Problem problem1 = customIsEven("50000");
		assertFalse(problem1.checkAnswer("ANSWER FALSE"));
	}
	
	@Test
	public void test3() {
		Problem problem1 = customIsEven("49999");
		assertFalse(problem1.checkAnswer("ANSWER TRUE"));
	}
	
	@Test
	public void test4() {
		Problem problem1 = customIsEven("49999");
		assertTrue(problem1.checkAnswer("ANSWER FALSE"));
	}
	
	// boundary data tests
	
	@Test
	public void test5() {
		Problem problem1 = customIsEven("1");
		assertFalse(problem1.checkAnswer("ANSWER TRUE"));
	}
	
	@Test
	public void test6() {
		Problem problem1 = customIsEven("1");
		assertTrue(problem1.checkAnswer("ANSWER FALSE"));
	}
	
	@Test
	public void test7() {
		Problem problem1 = customIsEven("100000");
		assertTrue(problem1.checkAnswer("ANSWER TRUE"));
	}
	
	@Test
	public void test8() {
		Problem problem1 = customIsEven("100000");
		assertFalse(problem1.checkAnswer("ANSWER FALSE"));
	}
	
	// bad data tests
	
	@Test
	public void baddata1() {
		Problem problem1 = customIsEven("50000");
		assertFalse(problem1.checkAnswer("ANSWER 100"));
	}
	
	@Test
	public void restOfBadData() {
		Problem problem1 = customIsEven("50000");
		for(String bad : AllProblemTests.BAD_INPUT_DATA) {
			assertFalse(problem1.checkAnswer("ANSWER " + bad));
		}
	}

}
