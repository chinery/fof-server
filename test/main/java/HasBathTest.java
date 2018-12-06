import static org.junit.Assert.*;

import org.junit.Test;

public class HasBathTest {

	private HasBath customHasBath(final String question) {
		return new HasBath() {
			private String injected_question;
			@Override
			protected void init() {
				this.injected_question = question;
			}
			@Override
			protected String getRandomQuestion() {
				return injected_question;
				
			}
		};
	}
	
	@Test
	public void test1() {
		Problem problem1 = customHasBath("BATH");
		assertTrue(problem1.checkAnswer("ANSWER TRUE"));
	}
	
	@Test
	public void test2() {
		Problem problem1 = customHasBath("BATH");
		assertFalse(problem1.checkAnswer("ANSWER FALSE"));
	}
	
	@Test
	public void test3() {
		Problem problem1 = customHasBath("XBATHX");
		assertTrue(problem1.checkAnswer("ANSWER TRUE"));
	}
	
	@Test
	public void test4() {
		Problem problem1 = customHasBath("XYBATH");
		assertTrue(problem1.checkAnswer("ANSWER FALSE"));
	}
	
	@Test
	public void test5() {
		Problem problem1 = customHasBath("XYZBATH");
		assertTrue(problem1.checkAnswer("ANSWER FALSE"));
	}
	
	@Test
	public void test6() {
		Problem problem1 = customHasBath("XYZBATHX");
		assertTrue(problem1.checkAnswer("ANSWER FALSE"));
	}
	
	@Test
	public void test7() {
		Problem problem1 = customHasBath("BATXH");
		assertTrue(problem1.checkAnswer("ANSWER FALSE"));
	}
	
	@Test
	public void test8() {
		Problem problem1 = customHasBath("");
		assertTrue(problem1.checkAnswer("ANSWER FALSE"));
	}
	
	@Test
	public void restOfBadData() {
		Problem problem1 = customHasBath("XBATHX");
		for(String bad : AllProblemTests.BAD_INPUT_DATA) {
			assertFalse(problem1.checkAnswer("ANSWER " + bad));
		}
	}

}
