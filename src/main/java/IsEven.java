

public class IsEven extends Problem{
	
	public IsEven(){
		super(1, 1, "ISEVEN");
	}

	@Override
	protected String getRandomQuestion() {
		return "" + (rng.nextInt(100000) + 1);
	}

	@Override
	protected String getAnswer(String question) {
		if(Integer.parseInt(question) % 2 == 0) {
			return "TRUE";
		} else {
			return "FALSE";
		}
	}

}