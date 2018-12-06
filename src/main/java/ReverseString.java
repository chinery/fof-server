

public class ReverseString extends StringProblem{

	public ReverseString() {
		super(1, 1, "REVERSESTRING");
	}

	@Override
	protected String getRandomQuestion() {
		return StringProblem.randomString(4,12);
	}

	@Override
	protected String getAnswer(String question) {
		return (new StringBuilder(question)).reverse().toString();
	}
	

}
