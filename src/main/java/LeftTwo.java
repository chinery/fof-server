

public class LeftTwo extends StringProblem{
	
	private static String[] greetings = {"HELLO", "HEY", "GDAYMATE"};
	
	public LeftTwo(){
		super(1, 3, "LEFTTWO");
	}

	@Override
	protected String getRandomQuestion() {
		return greetings[rng.nextInt(greetings.length)];
	}

	@Override
	protected String getAnswer(String question) {
		return question.substring(2) + question.substring(0, 2);
	}

}