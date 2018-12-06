
public class Rot13 extends StringProblem {

	public Rot13() {
		super(1, 4, "ROT13");
	}

	@Override
	protected String getRandomQuestion() {
		return StringProblem.randomString(4,12);
	}

	@Override
	protected String getAnswer(String question) {
		StringBuilder sb = new StringBuilder();
		for(char c : question.toCharArray()) {
			if(c >= 'A' && c <= 'Z') {
				int position = c - 'A';
				int rotposition = (position + 13) % 26;
				sb.append((char)(rotposition + 'A'));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
}
