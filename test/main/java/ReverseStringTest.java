import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	private ReverseString customReverseString(String question) {
		return new ReverseString() {
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
	
	// normal data tests
	
	@Test
	public void test1() {
		Problem problem1 = customReverseString("CODE");
		assertTrue(problem1.checkAnswer("ANSWER EDOC"));
	}

	@Test
	public void test2() {
		Problem problem1 = customReverseString("CODE");
		assertFalse(problem1.checkAnswer("ANSWER CODE"));
	}

	@Test
	public void test3() {
		Problem problem1 = customReverseString("CODE");
		assertFalse(problem1.checkAnswer("ANSWER EDOB"));
	}
	
	@Test
	public void test4() {
		Problem problem1 = customReverseString("CODE");
		assertFalse(problem1.checkAnswer("ANSWER EDOCE"));
	}
	
	@Test
	public void test5() {
		Problem problem1 = customReverseString("CODE");
		assertFalse(problem1.checkAnswer("ANSWER EDO"));
	}
	
	@Test
	public void test6() {
		Problem problem1 = customReverseString("CODE");
		StringBuilder longanswer = new StringBuilder("EDOC");
		for(int i = 0; i < 49; i++) { longanswer.append("EDOC"); }
		assertFalse(problem1.checkAnswer("ANSWER " + longanswer.toString()));
	}
	
	@Test
	public void test7() {
		Problem problem1 = customReverseString("0CD3");
		assertTrue(problem1.checkAnswer("ANSWER 3DC0"));
	}
	
	// bad data tests
	
	@Test
	public void restOfBadData() {
		Problem problem1 = customReverseString("CODE");
		for(String bad : AllProblemTests.BAD_INPUT_DATA) {
			assertFalse(problem1.checkAnswer("ANSWER " + bad));
		}
	}
}
